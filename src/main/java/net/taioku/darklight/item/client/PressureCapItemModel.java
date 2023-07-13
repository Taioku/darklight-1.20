package net.taioku.darklight.item.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.item.custom.PressureCapItem;
import software.bernie.geckolib.model.GeoModel;

public class PressureCapItemModel extends GeoModel<PressureCapItem> {
    @Override
    public Identifier getModelResource(PressureCapItem animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/pressure_cap.geo.json");
    }

    @Override
    public Identifier getTextureResource(PressureCapItem animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/pressure_cap.png");
    }

    @Override
    public Identifier getAnimationResource(PressureCapItem animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/pressure_cap.animation.json");
    }
}
