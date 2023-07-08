package net.taioku.particle.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;

public class SunParticle extends SpriteBillboardParticle {
    private final SpriteProvider spriteProvider;

    protected SunParticle(ClientWorld world, double x, double y, double z, double xVel, double yVel, double zVel, SpriteProvider spriteProvider) {
        super(world, x, y, z, xVel, yVel, zVel);

        this.spriteProvider = spriteProvider;
        this.maxAge = 200;
        this.scale = 0.1f;
        this.velocityX = xVel;
        this.velocityY = yVel;
        this.velocityZ = zVel;
        this.x = x;
        this.y = y;
        this.z = z;
        this.collidesWithWorld = true;
        this.alpha = 1.0f;
        this.setSpriteForAge(spriteProvider); //Required
    }

    @Override
    public void tick() {
        super.tick();
        if (this.age++ >= this.maxAge || this.scale <= 0 || this.alpha <= 0) { //Despawns the particle if the age has reached the max age, or if the scale is 0, or if the alpha is 0
            this.markDead(); //Despawns the particle
        } else {
            if(this.age >= this.maxAge / 3) {
                this.scale -= 0.02; //Slowly decreases the particle's size
            }
            this.alpha -= 0.02f; //Slowly fades away
            this.setSpriteForAge(this.spriteProvider); //Animates the particle if needed
            this.move(this.velocityX, this.velocityY, this.velocityZ);
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
            return new SunParticle(clientWorld, x, y, z, velX, velY, velZ, this.sprites);
        }
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }
}
