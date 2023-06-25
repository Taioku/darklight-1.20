package net.taioku.darklight.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.TallPlantBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;
import net.taioku.darklight.block.ModBlocks;

public class ShineTallPlantBlock extends TallPlantBlock {
    public ShineTallPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(ModBlocks.SHINE_GRASS_BLOCK);
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos blockPos = pos.down();
        return this.canPlantOnTop(world.getBlockState(blockPos), world, blockPos);
    }
}
