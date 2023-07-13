package net.taioku.darklight.entity.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.entity.custom.SoulEntity;
import software.bernie.geckolib.model.GeoModel;

public class SoulModel extends GeoModel<SoulEntity> {
    @Override
    public Identifier getModelResource(SoulEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/soul.geo.json");
    }

    @Override
    public Identifier getTextureResource(SoulEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/entity/soul.png");
    }

    @Override
    public Identifier getAnimationResource(SoulEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/soul.animation.json");
    }
}
