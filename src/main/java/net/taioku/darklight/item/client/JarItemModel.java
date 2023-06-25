package net.taioku.darklight.item.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.item.custom.JarItem;
import net.taioku.darklight.item.custom.PillarItem;
import software.bernie.geckolib.model.GeoModel;

public class JarItemModel extends GeoModel<JarItem> {
    @Override
    public Identifier getModelResource(JarItem animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/jar.geo.json");
    }

    @Override
    public Identifier getTextureResource(JarItem animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/jar.png");
    }

    @Override
    public Identifier getAnimationResource(JarItem animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/jar.animation.json");
    }
}
