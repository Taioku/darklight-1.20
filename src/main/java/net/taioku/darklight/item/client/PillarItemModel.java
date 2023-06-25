package net.taioku.darklight.item.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.item.custom.PillarItem;
import software.bernie.geckolib.model.GeoModel;

public class PillarItemModel extends GeoModel<PillarItem> {
    @Override
    public Identifier getModelResource(PillarItem animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/pillar.geo.json");
    }

    @Override
    public Identifier getTextureResource(PillarItem animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/pillar.png");
    }

    @Override
    public Identifier getAnimationResource(PillarItem animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/pillar.animation.json");
    }
}
