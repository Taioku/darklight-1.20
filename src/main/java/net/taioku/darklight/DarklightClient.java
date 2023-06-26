package net.taioku.darklight;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.impl.blockrenderlayer.BlockRenderLayerMapImpl;
import net.fabricmc.fabric.impl.client.rendering.BlockEntityRendererRegistryImpl;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.entity.DisplayEntityRenderer;
import net.minecraft.util.Identifier;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.block.entity.ModBlockEntities;
import net.taioku.darklight.block.entity.client.JarBlockRenderer;
import net.taioku.darklight.block.entity.client.MortarBlockRenderer;
import net.taioku.darklight.block.entity.client.PillarBlockRenderer;
import net.taioku.darklight.block.entity.client.ResearchTableBlockRenderer;
import net.taioku.darklight.fluid.ModFluids;
import net.taioku.darklight.networking.ModPackets;
import net.taioku.darklight.screen.ModScreenHandlers;
import net.taioku.darklight.screen.mortar.MortarScreen;

public class DarklightClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		registerRenderers();

		HandledScreens.register(ModScreenHandlers.MORTAR_SCREEN_HANDLER, MortarScreen::new);
	}

	private static void registerRenderers() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHINE_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHINE_SAPLING, RenderLayer.getCutout());

		BlockEntityRendererFactories.register(ModBlockEntities.MORTAR_ENTITY, MortarBlockRenderer::new);
		BlockEntityRendererFactories.register(ModBlockEntities.RESEARCH_TABLE_ENTITY, ResearchTableBlockRenderer::new);
		BlockEntityRendererFactories.register(ModBlockEntities.JAR_ENTITY, JarBlockRenderer::new);

		BlockEntityRendererFactories.register(ModBlockEntities.PILLAR_ENTITY, PillarBlockRenderer::new);

		FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SHINE_WATER, ModFluids.FLOWING_SHINE_WATER,
				new SimpleFluidRenderHandler(
						new Identifier("minecraft:block/water_still"),
						new Identifier("minecraft:block/water_flow"),
						0xA1D3C7FF
				));

		BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
				ModFluids.STILL_SHINE_WATER, ModFluids.FLOWING_SHINE_WATER);
	}
}