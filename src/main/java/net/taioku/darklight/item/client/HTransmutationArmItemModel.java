package net.taioku.darklight.item.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.item.custom.HTransmutationArmItem;
import software.bernie.geckolib.model.GeoModel;

public class HTransmutationArmItemModel extends GeoModel<HTransmutationArmItem> {
    @Override
    public Identifier getModelResource(HTransmutationArmItem animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/h_transmutation_arm.geo.json");
    }

    @Override
    public Identifier getTextureResource(HTransmutationArmItem animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/h_transmutation_arm.png");
    }

    @Override
    public Identifier getAnimationResource(HTransmutationArmItem animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/h_transmutation_arm.animation.json");
    }
}
