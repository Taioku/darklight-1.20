package net.taioku.darklight.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.enums.TreaterPart;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldEvents;
import net.taioku.darklight.block.entity.tile.MortarBlockEntity;
import net.taioku.darklight.block.entity.tile.SteamTreaterBlockEntity;
import org.jetbrains.annotations.Nullable;

public class ModSteamTreaterBlock extends BlockWithEntity {
    public static final EnumProperty<TreaterPart> PART = EnumProperty.of("part", TreaterPart.class);
    public static final DirectionProperty HORIZONTAL_FACING = Properties.HORIZONTAL_FACING;
    
    public ModSteamTreaterBlock(Settings settings) {
        super(settings
                .nonOpaque());
        setDefaultState(getDefaultState()
                .with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(PART, HORIZONTAL_FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if (state.get(PART).equals(TreaterPart.TOP)) {
            return VoxelShapes.cuboid(0, 0, 0, 1, 0.5, 1);
        }
        return VoxelShapes.fullCube();
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        TreaterPart treaterPart = state.get(PART);
        if (direction.getAxis() == Direction.Axis.Y && treaterPart == TreaterPart.BOTTOM == (direction == Direction.UP)) {
            if (neighborState.isOf(this) && neighborState.get(PART) != treaterPart) {
                return state.with(HORIZONTAL_FACING, neighborState.get(HORIZONTAL_FACING));
            }
            return Blocks.AIR.getDefaultState();
        }
        if (treaterPart == TreaterPart.BOTTOM && direction == Direction.DOWN && !state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        World world = ctx.getWorld();
        if (blockPos.getY() < world.getTopY() - 1 && world.getBlockState(blockPos.up()).canReplace(ctx)) {
            return (this.getDefaultState()
                    .with(HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite()))
                    .with(PART, TreaterPart.BOTTOM);
        }
        return null;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof MortarBlockEntity) {
                ItemScatterer.spawn(world, pos, (MortarBlockEntity)blockEntity);
                world.updateComparators(pos, this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        if (!world.isClient) {
            world.setBlockState(pos.up(), state.with(PART, TreaterPart.MIDDLE), Block.NOTIFY_ALL);
            world.setBlockState(pos.up(2), state.with(PART, TreaterPart.TOP), Block.NOTIFY_ALL);
            world.updateNeighbors(pos, Blocks.AIR);
            state.updateNeighbors(world, pos, Block.NOTIFY_ALL);
        }
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        BlockPos blockPos;
        BlockState blockState;
        TreaterPart treaterPart = state.get(PART);
        if (treaterPart == TreaterPart.TOP && (blockState = world.getBlockState(blockPos = pos.down())).isOf(state.getBlock()) && blockState.get(PART) == TreaterPart.MIDDLE
                && (blockState = world.getBlockState (blockPos = pos.down(2))).isOf(state.getBlock()) && blockState.get(PART) == TreaterPart.BOTTOM) {
            BlockState blockState2 = blockState.getFluidState().isOf(Fluids.WATER) ? Blocks.WATER.getDefaultState() : Blocks.AIR.getDefaultState();
            world.setBlockState(blockPos, blockState2, Block.NOTIFY_ALL | Block.SKIP_DROPS);
            world.syncWorldEvent(player, WorldEvents.BLOCK_BROKEN, blockPos, Block.getRawIdFromState(blockState));
        }
        super.onBreak(world, pos, state, player);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SteamTreaterBlockEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
