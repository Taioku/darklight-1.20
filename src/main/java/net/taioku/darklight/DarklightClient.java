package net.taioku.darklight;

import net.fabricmc.api.ClientModInitializer;
import net.taioku.darklight.block.tags.ClientBlockRenderLayers;
import net.taioku.darklight.block.ClientBlocks;
import net.taioku.darklight.entity.ClientEntities;
import net.taioku.darklight.fluid.ClientFluidRegistry;
import net.taioku.darklight.screen.ClientHandledScreens;
import net.taioku.darklight.particle.ClientParticles;

public class DarklightClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ClientBlockRenderLayers.mapLayers();
		ClientBlocks.registerRenderers();
		ClientParticles.registerClientParticles();
		ClientEntities.registerRenderers();
		ClientHandledScreens.registerHandledScreens();
		ClientFluidRegistry.registerFluids();
	}
}