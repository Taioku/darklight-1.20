package net.taioku.darklight.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.taioku.darklight.block.entity.AnimatedBlockEntity;
import org.jetbrains.annotations.Nullable;


public class MortarBlock extends BlockWithEntity {

    public MortarBlock(Settings settings) {
        super(settings
                .strength(2.0f)
                .nonOpaque());
        setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.SOUTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(Properties.HORIZONTAL_FACING);
        switch (direction) {
            case NORTH:
                return Block.createCuboidShape(1.5f, 0.0f, 0.0f, 15.0f, 5.0f, 16.0f);
            case SOUTH:
                return Block.createCuboidShape(1.5f, 0.0f, 0.0f, 15.0f, 5.0f, 16.0f);
            case EAST:
                return Block.createCuboidShape(1.5f, 0.0f, 0.0f, 15.0f, 5.0f, 16.0f);
            case WEST:
                return Block.createCuboidShape(1.5f, 0.0f, 0.0f, 15.0f, 5.0f, 16.0f);
            default:
                return VoxelShapes.fullCube();
        }
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(Properties.HORIZONTAL_FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new AnimatedBlockEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState blockState) {
        return BlockRenderType.MODEL;
    }
}
