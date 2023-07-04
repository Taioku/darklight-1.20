package net.taioku.darklight.item.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.item.custom.KaleidoscopeItem;
import software.bernie.geckolib.model.GeoModel;

public class KaleidoscopeItemModel extends GeoModel<KaleidoscopeItem> {
    @Override
    public Identifier getModelResource(KaleidoscopeItem animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/kaleidoscope.geo.json");
    }

    @Override
    public Identifier getTextureResource(KaleidoscopeItem animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/item/kaleidoscope.png");
    }

    @Override
    public Identifier getAnimationResource(KaleidoscopeItem animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/kaleidoscope.animation.json");
    }
}
