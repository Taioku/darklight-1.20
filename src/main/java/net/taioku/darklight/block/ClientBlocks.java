package net.taioku.darklight.block;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.taioku.darklight.block.client.*;
import net.taioku.darklight.block.entity.ModBlockEntities;

public class ClientBlocks {
    public static void registerRenderers() {
        BlockEntityRendererFactories.register(ModBlockEntities.MORTAR_ENTITY, MortarBlockRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.RESEARCH_TABLE_ENTITY, ResearchTableBlockRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.JAR_ENTITY, JarBlockRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.PILLAR_ENTITY, PillarBlockRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.H_TRANSMUTATION_ARM_ENTITY, HTransmutationArmBlockRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.D_TRANSMUTATION_ARM_ENTITY, DTransmutationArmBlockRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.INFUSION_TABLE_ENTITY, InfusionTableBlockRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.STEAM_TREATER_ENTITY, SteamTreaterBlockRenderer::new);
        BlockEntityRendererFactories.register(ModBlockEntities.PRESSURE_CAP_ENTITY, PressureCapBlockRenderer::new);
    }
}
