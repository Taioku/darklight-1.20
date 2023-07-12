package net.taioku.darklight.entity;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.taioku.darklight.entity.client.LightbugRenderer;

public class ClientEntities {
    public static void registerRenderers() {
        EntityRendererRegistry.register(ModEntities.LIGHTBUG, LightbugRenderer::new);
    }
}
