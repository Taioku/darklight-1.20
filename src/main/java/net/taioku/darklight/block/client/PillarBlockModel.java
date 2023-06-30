package net.taioku.darklight.block.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.entity.tile.PillarBlockEntity;
import software.bernie.geckolib.model.GeoModel;

public class PillarBlockModel extends GeoModel<PillarBlockEntity> {
    @Override
    public Identifier getModelResource(PillarBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/pillar.geo.json");
    }

    @Override
    public Identifier getTextureResource(PillarBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/pillar.png");
    }

    @Override
    public Identifier getAnimationResource(PillarBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/pillar.animation.json");
    }
}
