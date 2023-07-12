package net.taioku.darklight.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

import java.util.EnumSet;

public class LightbugEntity extends PathAwareEntity implements GeoEntity {
    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    public LightbugEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
        this.moveControl = new LightbugEntity.LightBugMoveControl(this);
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return PathAwareEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_FLYING_SPEED, 0.005f)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 1.0D);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new FlyRandomlyGoal(this));
    }

    @Override
    public boolean hasNoGravity() {
        return true;
    }

    @Override
    protected int computeFallDamage(float fallDistance, float damageMultiplier) {
        return 0;
    }

    @Override
    public int getLimitPerChunk() {
        return 6;
    }

    static class LightBugMoveControl
            extends MoveControl {
        private final LightbugEntity lightBug;
        private int collisionCheckCooldown;

        public LightBugMoveControl(LightbugEntity lightBug) {
            super(lightBug);
            this.lightBug = lightBug;
        }

        @Override
        public void tick() {
            if (this.state != MoveControl.State.MOVE_TO) {
                return;
            }
            if (this.collisionCheckCooldown-- <= 0) {
                this.collisionCheckCooldown += this.lightBug.getRandom().nextInt(1) + 2;
                Vec3d vec3d = new Vec3d(this.targetX - this.lightBug.getX(), this.targetY - this.lightBug.getY(), this.targetZ - this.lightBug.getZ());
                double d = vec3d.length();
                if (this.willCollide(vec3d = vec3d.normalize(), MathHelper.ceil(d))) {
                    this.lightBug.setVelocity(this.lightBug.getVelocity().add(vec3d.multiply(0.005)));
                } else {
                    this.state = MoveControl.State.WAIT;
                }
            }
        }

        private boolean willCollide(Vec3d direction, int steps) {
            Box box = this.lightBug.getBoundingBox();
            for (int i = 1; i < steps; ++i) {
                box = box.offset(direction);
                if (this.lightBug.getWorld().isSpaceEmpty(this.lightBug, box)) continue;
                return false;
            }
            return true;
        }
    }

    static class FlyRandomlyGoal
            extends Goal {
        private final LightbugEntity lightbug;

        public FlyRandomlyGoal(LightbugEntity lightbug) {
            this.lightbug = lightbug;
            this.setControls(EnumSet.of(Goal.Control.MOVE));
        }

        @Override
        public boolean canStart() {
            double f;
            double e;
            MoveControl moveControl = this.lightbug.getMoveControl();
            if (!moveControl.isMoving()) {
                return true;
            }
            double d = moveControl.getTargetX() - this.lightbug.getX();
            double g = d * d + (e = moveControl.getTargetY() - this.lightbug.getY()) * e + (f = moveControl.getTargetZ() - this.lightbug.getZ()) * f;
            return g < 1.0 || g > 1200.0;
        }

        @Override
        public boolean shouldContinue() {
            return false;
        }

        @Override
        public void start() {
            Random random = this.lightbug.getRandom();
            double d = this.lightbug.getX() + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
            double e = this.lightbug.getY() + (double)((random.nextFloat() * 2.0f - 1.0f) * 4.0f);
            double f = this.lightbug.getZ() + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
            this.lightbug.getMoveControl().moveTo(d, e, f, 0.005);
        }
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        tAnimationState.getController().setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}
