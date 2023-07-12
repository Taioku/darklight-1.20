package net.taioku.darklight.particle.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.math.ColorHelper;

import static org.apache.commons.lang3.RandomUtils.nextInt;

public class FearParticle extends SpriteBillboardParticle {
    private final SpriteProvider spriteProvider;

    protected FearParticle(ClientWorld world, double x, double y, double z, double xVel, double yVel, double zVel, SpriteProvider spriteProvider) {
        super(world, x, y, z, xVel, yVel, zVel);

        this.spriteProvider = spriteProvider;
        this.scale = 0.1f;
        this.setAlpha(1.0f);
        this.maxAge = 200;
        this.setSpriteForAge(spriteProvider);
        this.collidesWithWorld = true;
        this.velocityX = xVel;
        this.velocityY = 0.02f;
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
        if (this.age++ >= this.maxAge || this.scale <= 0 || this.alpha <= 0) { // if the age has reached the max age, or if the scale is 0, or if the alpha is 0
            this.markDead(); //Despawns the particle
        } else {
            if (this.age >= this.maxAge / 3) {
                this.scale -= 0.005f; //Slowly decreases the particle's size
            }
            this.move(this.velocityX, this.velocityY, this.velocityZ);
            this.setSpriteForAge(this.spriteProvider); //Animates the particle if needed
        }
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        //The factory used in a particle's registry
        private final SpriteProvider sprites;

        public Factory(SpriteProvider spriteProvider) {
            this.sprites = spriteProvider;
        }

        public Particle createParticle(DefaultParticleType defaultParticleType, ClientWorld clientWorld, double x, double y, double z, double velX, double velY, double velZ) {
            if (nextInt(0, 15) == 0) {
                return new FearParticle(clientWorld, x, y, z, velX, velY, velZ, this.sprites);
            }
            return null;
        }
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_LIT;
    }
}
