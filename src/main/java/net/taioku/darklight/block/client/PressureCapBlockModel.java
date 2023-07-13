package net.taioku.darklight.block.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.entity.tile.PressureCapBlockEntity;
import software.bernie.geckolib.model.GeoModel;

public class PressureCapBlockModel extends GeoModel<PressureCapBlockEntity> {
    @Override
    public Identifier getModelResource(PressureCapBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/pressure_cap.geo.json");
    }

    @Override
    public Identifier getTextureResource(PressureCapBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/pressure_cap.png");
    }

    @Override
    public Identifier getAnimationResource(PressureCapBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/pressure_cap.animation.json");
    }
}
