package net.taioku.darklight.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.taioku.darklight.block.entity.JarEntity;
import org.jetbrains.annotations.Nullable;

public class ModJarBlock extends BlockWithEntity implements Waterloggable {
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public ModJarBlock(Settings settings) {
        super(settings
                .nonOpaque());
        setDefaultState(getDefaultState()
                .with(WATERLOGGED, false));;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.7625, 0.375, 0.375, 0.825, 0.625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.7625, 0.3125, 0.6875, 0.825, 0.375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.625, 0.7625, 0.375, 0.6875, 0.825, 0.625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.7625, 0.625, 0.6875, 0.825, 0.6875));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.34375, 0.66875, 0.34375, 0.65625, 0.79375, 0.65625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.25, 0.0125, 0.25, 0.75, 0.7, 0.75));
        return shape;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState()
                .with(WATERLOGGED, ctx.getWorld().getFluidState(ctx.getBlockPos()).getFluid() == Fluids.WATER);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new JarEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState blockState) {
        return BlockRenderType.MODEL;
    }
}
