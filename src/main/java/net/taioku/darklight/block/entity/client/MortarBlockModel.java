package net.taioku.darklight.block.entity.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.entity.entities.MortarBlockEntity;
import software.bernie.geckolib.model.GeoModel;

public class MortarBlockModel extends GeoModel<MortarBlockEntity> {
    @Override
    public Identifier getModelResource(MortarBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/mortar.geo.json");
    }

    @Override
    public Identifier getTextureResource(MortarBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/mortar.png");
    }

    @Override
    public Identifier getAnimationResource(MortarBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/mortar.animation.json");
    }
}
