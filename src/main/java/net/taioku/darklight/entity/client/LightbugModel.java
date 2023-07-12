package net.taioku.darklight.entity.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.entity.custom.LightbugEntity;
import software.bernie.geckolib.model.GeoModel;

public class LightbugModel extends GeoModel<LightbugEntity> {
    @Override
    public Identifier getModelResource(LightbugEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/lightbug.geo.json");
    }

    @Override
    public Identifier getTextureResource(LightbugEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/entity/lightbug.png");
    }

    @Override
    public Identifier getAnimationResource(LightbugEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/lightbug.animation.json");
    }
}
