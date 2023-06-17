package net.taioku.darklight.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.taioku.darklight.block.entity.AnimatedBlockEntity;
import org.jetbrains.annotations.Nullable;


public class MortarBlock extends BlockWithEntity {
    public MortarBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.1875, 0.1875, 0.1875, 0.25, 0.3125, 0.4375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.375, 0, 0.4375, 0.5, 0.125, 0.5));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.375, 0, 0.125, 0.5, 0.125, 0.1875));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.25, 0, 0.25, 0.3125, 0.125, 0.375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.5625, 0, 0.25, 0.625, 0.125, 0.375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.0625, 0.1875, 0.5625, 0.125, 0.4375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.1875, 0.0625, 0.5625, 0.3125, 0.125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.125, 0.125, 0.5625, 0.1875, 0.1875));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.5625, 0.1875, 0.125, 0.625, 0.3125, 0.1875));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.25, 0.1875, 0.125, 0.3125, 0.3125, 0.1875));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.25, 0.1875, 0.4375, 0.3125, 0.3125, 0.5));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.5625, 0.1875, 0.4375, 0.625, 0.3125, 0.5));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.125, 0.4375, 0.5625, 0.1875, 0.5));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.1875, 0.5, 0.5625, 0.3125, 0.5625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.5625, 0.125, 0.1875, 0.625, 0.1875, 0.4375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.625, 0.1875, 0.1875, 0.6875, 0.3125, 0.4375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.25, 0.125, 0.1875, 0.3125, 0.1875, 0.4375));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.6875, 0, 0.375, 0.8125, 0.125, 0.75));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0, 0.515625, 0.4375, 0.0625, 0.578125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.11085925878090586, 0, 0.5678259749634509, 0.1733592587809059, 0.0625, 0.6303259749634509));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.39330582617584076, 0, 0.9499842167691146, 0.45580582617584064, 0.0625, 1.0124842167691144));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.6433058261758408, 0, 0.6999842167691146, 0.7058058261758406, 0.0625, 0.7624842167691144));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.6244075557387022, 0, 0.8532674772097474, 0.6869075557387021, 0.0625, 0.9157674772097472));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.11321429740888689, 0, 0.8373077510399817, 0.17571429740888667, 0.0625, 0.8998077510399816));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.375, 0, 0.828125, 0.4375, 0.0625, 0.890625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.25, 0, 0.765625, 0.5, 0.0625, 0.828125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.1875, 0, 0.640625, 0.5625, 0.0625, 0.765625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.25, 0.0625, 0.640625, 0.5, 0.125, 0.765625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.1875, 0, 0.578125, 0.5, 0.0625, 0.640625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.25, 0.0625, 0.578125, 0.4375, 0.125, 0.640625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.0625, 0.765625, 0.4375, 0.125, 0.828125));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.125, 0.640625, 0.4375, 0.1875, 0.765625));
        shape = VoxelShapes.union(shape, VoxelShapes.cuboid(0.3125, 0.1875, 0.640625, 0.375, 0.25, 0.703125));

        return shape;
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
