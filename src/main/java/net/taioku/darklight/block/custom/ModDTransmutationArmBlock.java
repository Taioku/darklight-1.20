package net.taioku.darklight.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.taioku.darklight.block.entity.entities.DTransmutationArmBlockEntity;
import net.taioku.darklight.block.entity.entities.HTransmutationArmBlockEntity;
import org.jetbrains.annotations.Nullable;

public class ModDTransmutationArmBlock extends ModArmBlock {
    public ModDTransmutationArmBlock(Settings settings) {
        super(settings
                .nonOpaque());
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new DTransmutationArmBlockEntity(pos, state);
    }
}
