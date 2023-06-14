package net.taioku.darklight.item.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.item.custom.ThunArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class ThunArmorModel extends GeoModel<ThunArmorItem> {
    @Override
    public Identifier getModelResource(ThunArmorItem animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/thun_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(ThunArmorItem animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/armor/thun_armor.png");
    }

    @Override
    public Identifier getAnimationResource(ThunArmorItem animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/thun_armor.animation.json");
    }
}
