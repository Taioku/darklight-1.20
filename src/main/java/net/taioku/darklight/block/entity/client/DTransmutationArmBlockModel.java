package net.taioku.darklight.block.entity.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.entity.entities.DTransmutationArmBlockEntity;
import software.bernie.geckolib.model.GeoModel;

public class DTransmutationArmBlockModel extends GeoModel<DTransmutationArmBlockEntity> {
    @Override
    public Identifier getModelResource(DTransmutationArmBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/d_transmutation_arm.geo.json");
    }

    @Override
    public Identifier getTextureResource(DTransmutationArmBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/d_transmutation_arm.png");
    }

    @Override
    public Identifier getAnimationResource(DTransmutationArmBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/d_transmutation_arm.animation.json");
    }
}
