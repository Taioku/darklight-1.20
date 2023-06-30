package net.taioku.darklight.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.taioku.darklight.block.entity.tile.ResearchTableBlockEntity;
import org.jetbrains.annotations.Nullable;

public class ModResearchTableBlock extends ModTableBlock {
    public ModResearchTableBlock(Settings settings) {
        super(settings.strength(2.0f));
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ResearchTableBlockEntity(pos, state);
    }
}
