package net.taioku.darklight;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.taioku.darklight.block.entity.ModBlockEntities;
import net.taioku.darklight.block.entity.client.MortarBlockRenderer;

public class DarklightClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockEntityRendererFactories.register(ModBlockEntities.MORTAR, MortarBlockRenderer::new);
	}
}