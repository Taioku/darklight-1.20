package net.taioku.darklight.entity.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.entity.custom.LightbugEntity;
import software.bernie.geckolib.model.GeoModel;

import static org.apache.commons.lang3.RandomUtils.nextInt;

public class LightbugModel extends GeoModel<LightbugEntity> {
    @Override
    public Identifier getModelResource(LightbugEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/lightbug.geo.json");
    }

    @Override
    public Identifier getTextureResource(LightbugEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/entity/lightbug/g_lightbug.png");
    }

    @Override
    public Identifier getAnimationResource(LightbugEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/lightbug.animation.json");
    }
}
