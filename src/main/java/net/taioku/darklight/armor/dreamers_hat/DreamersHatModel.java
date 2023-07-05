package net.taioku.darklight.armor.dreamers_hat;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.item.custom.DreamersHatItem;
import software.bernie.geckolib.model.GeoModel;

public class DreamersHatModel extends GeoModel<DreamersHatItem> {
    @Override
    public Identifier getModelResource(DreamersHatItem animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/dreamers_hat.geo.json");
    }

    @Override
    public Identifier getTextureResource(DreamersHatItem animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/armor/dreamers_hat.png");
    }

    @Override
    public Identifier getAnimationResource(DreamersHatItem animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/dreamers_hat.animation.json");
    }
}
