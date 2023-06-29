package net.taioku.darklight.item.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.item.custom.DTransmutationArmItem;
import software.bernie.geckolib.model.GeoModel;

public class DTransmutationArmItemModel extends GeoModel<DTransmutationArmItem> {
    @Override
    public Identifier getModelResource(DTransmutationArmItem animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/d_transmutation_arm.geo.json");
    }

    @Override
    public Identifier getTextureResource(DTransmutationArmItem animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/d_transmutation_arm.png");
    }

    @Override
    public Identifier getAnimationResource(DTransmutationArmItem animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/d_transmutation_arm.animation.json");
    }
}
