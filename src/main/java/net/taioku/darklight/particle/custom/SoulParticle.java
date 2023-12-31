package net.taioku.darklight.particle.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.math.ColorHelper;
import net.minecraft.util.math.MathHelper;

public class SoulParticle extends SpriteBillboardParticle {
    private final SpriteProvider spriteProvider;

    protected SoulParticle(ClientWorld world, double x, double y, double z, double xVel, double yVel, double zVel, SpriteProvider spriteProvider) {
        super(world, x, y, z, xVel, yVel, zVel);

        this.spriteProvider = spriteProvider;
        this.scale = 0.2f;
        this.setAlpha(1.0f);
        this.maxAge = 60;
        this.setSpriteForAge(spriteProvider);
        this.collidesWithWorld = true;
        this.velocityX = xVel;
        this.velocityY = yVel;
        this.velocityZ = zVel;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public int getBrightness(float tint) {
        return 255;
    }

    @Override
    public void tick() {
        super.tick();
        if (this.age++ >= this.maxAge || this.scale <= 0 || this.alpha <= 0) { //Despawns the particle if the age has reached the max age, or if the scale is 0, or if the alpha is 0
            this.markDead(); //Despawns the particle
        } else {
            if(this.age <= this.maxAge) {
                this.scale -= 0.02f; //Slowly decreases the particle's size
                this.alpha -= 0.02f; //Slowly fades away
            }
            this.setSpriteForAge(this.spriteProvider); //Animates the particle if needed
            this.move(this.velocityX, this.velocityY, this.velocityZ);
        }
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        //The factory used in a particle's registry
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double x, double y, double z, double velX, double velY, double velZ) {
            return new SoulParticle(clientWorld, x, y, z, velX, velY, velZ, this.spriteProvider);
        }
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }
}
