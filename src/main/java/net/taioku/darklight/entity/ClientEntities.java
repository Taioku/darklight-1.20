package net.taioku.darklight.entity;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.taioku.darklight.entity.client.LightbugRenderer;
import net.taioku.darklight.entity.client.SoulRenderer;

public class ClientEntities {
    public static void registerRenderers() {
        EntityRendererRegistry.register(ModEntities.LIGHTBUG, LightbugRenderer::new);
        EntityRendererRegistry.register(ModEntities.SOUL, SoulRenderer::new);

    }
}
