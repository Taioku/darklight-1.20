package net.taioku.darklight.block.entity.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.entity.entities.JarBlockEntity;
import software.bernie.geckolib.model.GeoModel;

public class JarBlockModel extends GeoModel<JarBlockEntity> {
    @Override
    public Identifier getModelResource(JarBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/jar.geo.json");
    }

    @Override
    public Identifier getTextureResource(JarBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/jar.png");
    }

    @Override
    public Identifier getAnimationResource(JarBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/jar.animation.json");
    }
}
