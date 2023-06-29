package net.taioku.darklight.block.entity.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.entity.entities.HTransmutationArmBlockEntity;
import software.bernie.geckolib.model.GeoModel;

public class HTransmutationArmBlockModel extends GeoModel<HTransmutationArmBlockEntity> {
    @Override
    public Identifier getModelResource(HTransmutationArmBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/h_transmutation_arm.geo.json");
    }

    @Override
    public Identifier getTextureResource(HTransmutationArmBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/h_transmutation_arm.png");
    }

    @Override
    public Identifier getAnimationResource(HTransmutationArmBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/h_transmutation_arm.animation.json");
    }
}
