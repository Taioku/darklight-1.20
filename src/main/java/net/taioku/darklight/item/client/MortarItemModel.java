package net.taioku.darklight.item.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.item.custom.MortarItem;
import software.bernie.geckolib.model.GeoModel;

public class MortarItemModel extends GeoModel<MortarItem> {
    @Override
    public Identifier getModelResource(MortarItem animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/mortar.geo.json");
    }

    @Override
    public Identifier getTextureResource(MortarItem animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/mortar.png");
    }

    @Override
    public Identifier getAnimationResource(MortarItem animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/mortar.animation.json");
    }
}
