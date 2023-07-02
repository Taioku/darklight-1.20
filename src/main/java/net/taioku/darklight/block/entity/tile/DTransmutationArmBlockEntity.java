package net.taioku.darklight.block.entity.tile;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.util.math.BlockPos;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.entity.ModBlockEntities;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

public class DTransmutationArmBlockEntity extends BlockEntity implements GeoBlockEntity {
    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
    private boolean hasAnimationFinished;

    public DTransmutationArmBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.D_TRANSMUTATION_ARM_ENTITY, pos, state);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this,"d_transmutation_arm_controller",0, this::predicate));
    }

    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        tAnimationState.getController().setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.PLAY_ONCE));
        hasAnimationFinished = tAnimationState.getController().hasAnimationFinished();
        //Darklight.LOGGER.info("\n" + animState);
        if (!hasAnimationFinished) {
            //Darklight.LOGGER.info("\ncont");
            return PlayState.CONTINUE;
        }
        return PlayState.STOP;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        nbt.putBoolean("animState", hasAnimationFinished); // el estado de la animacion no se guarda.
        Darklight.LOGGER.info("\n\nwriteNbt" + "\n" + nbt.getBoolean("animState"));
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        nbt.getBoolean("animState");
        Darklight.LOGGER.info("\n\nreadNbt" + "\n" + nbt.getBoolean("animState"));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}
