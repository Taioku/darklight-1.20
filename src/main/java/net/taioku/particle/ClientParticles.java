package net.taioku.particle;

import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.taioku.particle.custom.FearParticle;
import net.taioku.particle.custom.SoulParticle;
import net.taioku.particle.custom.SunParticle;

public class ClientParticles {
        public static void registerClientParticles () {
			ParticleFactoryRegistry.getInstance().register(ModParticles.SOUL_PARTICLE, SoulParticle.Factory::new);
			ParticleFactoryRegistry.getInstance().register(ModParticles.FEAR_PARTICLE, FearParticle.Factory::new);
			ParticleFactoryRegistry.getInstance().register(ModParticles.SUN_PARTICLE, SunParticle.Factory::new);
		}
}
