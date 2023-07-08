package net.taioku.darklight.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;

public class ModParticles {
    public static final DefaultParticleType SOUL_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType FEAR_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType SUN_PARTICLE = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(Darklight.MOD_ID, "soul_particle"), SOUL_PARTICLE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(Darklight.MOD_ID, "fear_particle"), FEAR_PARTICLE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(Darklight.MOD_ID, "sun_particle"), SUN_PARTICLE);
    }
}
