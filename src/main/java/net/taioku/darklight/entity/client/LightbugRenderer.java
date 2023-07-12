package net.taioku.darklight.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.entity.custom.LightbugEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

import static org.apache.commons.lang3.RandomUtils.nextInt;

public class LightbugRenderer extends GeoEntityRenderer<LightbugEntity> {
    public LightbugRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new LightbugModel());
        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }

    /*
    @Override
    public Identifier getTexture(LightbugEntity animatable) {
        return switch (nextInt(0,4)) {
            case 0 -> new Identifier(Darklight.MOD_ID, "textures/entity/lightbug/r_lightbug.png");
            case 1 -> new Identifier(Darklight.MOD_ID, "textures/entity/lightbug/g_lightbug.png");
            case 2 -> new Identifier(Darklight.MOD_ID, "textures/entity/lightbug/b_lightbug.png");
            case 3 -> new Identifier(Darklight.MOD_ID, "textures/entity/lightbug/y_lightbug.png");
            default -> new Identifier(Darklight.MOD_ID,"textures/entity/lightbug/o_lightbug.png");
        };
    }
    */
}
