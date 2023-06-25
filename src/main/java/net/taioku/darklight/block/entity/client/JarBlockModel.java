package net.taioku.darklight.block.entity.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.entity.JarEntity;
import net.taioku.darklight.block.entity.PillarEntity;
import software.bernie.geckolib.model.GeoModel;

public class JarBlockModel extends GeoModel<JarEntity> {
    @Override
    public Identifier getModelResource(JarEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/jar.geo.json");
    }

    @Override
    public Identifier getTextureResource(JarEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/jar.png");
    }

    @Override
    public Identifier getAnimationResource(JarEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/jar.animation.json");
    }
}
