package net.taioku.darklight.block.custom;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;
import net.taioku.darklight.block.ModBlocks;

public class ShineFernBlock extends FernBlock {
    public ShineFernBlock(Settings settings) {
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

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        ShineTallPlantBlock shineTallPlantBlock = (ShineTallPlantBlock)(state.isOf(ModBlocks.SHINE_GRASS) ? Blocks.LARGE_FERN : ModBlocks.SHINE_TALL_GRASS);
        if (shineTallPlantBlock.getDefaultState().canPlaceAt(world, pos) && world.isAir(pos.up())) {
            TallPlantBlock.placeAt(world, shineTallPlantBlock.getDefaultState(), pos, 2);
        }
    }

}
