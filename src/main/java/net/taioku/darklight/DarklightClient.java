package net.taioku.darklight;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.minecraft.util.Identifier;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.block.entity.ModBlockEntities;
import net.taioku.darklight.block.client.*;
import net.taioku.darklight.fluid.ModFluids;
import net.taioku.darklight.screen.ModScreenHandlers;
import net.taioku.darklight.screen.InfusionTable.InfusionTableScreen;
import net.taioku.darklight.screen.mortar.MortarScreen;

public class DarklightClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		HandledScreens.register(ModScreenHandlers.MORTAR_SCREEN_HANDLER, MortarScreen::new);
		HandledScreens.register(ModScreenHandlers.INFUSION_TABLE, InfusionTableScreen::new);

		FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_SHINE_WATER, ModFluids.FLOWING_SHINE_WATER,
				new SimpleFluidRenderHandler(
						new Identifier("minecraft:block/water_still"),
						new Identifier("minecraft:block/water_flow"),
						0xA1D3C7FF
				));

		BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
				ModFluids.STILL_SHINE_WATER, ModFluids.FLOWING_SHINE_WATER);

		registerRenderers();
	}

	private static void registerRenderers() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHINE_LEAVES, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHINE_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHINE_GRASS, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHINE_TALL_GRASS, RenderLayer.getCutout());

		BlockEntityRendererFactories.register(ModBlockEntities.MORTAR_ENTITY, MortarBlockRenderer::new);
		BlockEntityRendererFactories.register(ModBlockEntities.RESEARCH_TABLE_ENTITY, ResearchTableBlockRenderer::new);
		BlockEntityRendererFactories.register(ModBlockEntities.JAR_ENTITY, JarBlockRenderer::new);
		BlockEntityRendererFactories.register(ModBlockEntities.PILLAR_ENTITY, PillarBlockRenderer::new);
		BlockEntityRendererFactories.register(ModBlockEntities.H_TRANSMUTATION_ARM_ENTITY, HTransmutationArmBlockRenderer::new);
		BlockEntityRendererFactories.register(ModBlockEntities.D_TRANSMUTATION_ARM_ENTITY, DTransmutationArmBlockRenderer::new);
		BlockEntityRendererFactories.register(ModBlockEntities.INFUSION_TABLE, InfusionTableBlockRenderer::new);
	}
}