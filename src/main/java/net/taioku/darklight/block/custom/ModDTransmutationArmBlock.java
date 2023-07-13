package net.taioku.darklight.block.custom;

import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.taioku.darklight.block.entity.tile.DTransmutationArmBlockEntity;
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
