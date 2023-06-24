package net.taioku.darklight.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.taioku.darklight.block.entity.ResearchTableEntity;
import org.jetbrains.annotations.Nullable;

public class ResearchTable extends Table {
    public ResearchTable(Settings settings) {
        super(settings.strength(2.0f));
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ResearchTableEntity(pos, state);
    }
}
