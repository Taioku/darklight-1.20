package net.taioku.darklight.block.entity.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.entity.entities.ResearchTableEntity;
import software.bernie.geckolib.model.GeoModel;

public class ResearchTableBlockModel extends GeoModel<ResearchTableEntity> {
    @Override
    public Identifier getModelResource(ResearchTableEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/research_table.geo.json");
    }

    @Override
    public Identifier getTextureResource(ResearchTableEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/research_table.png");
    }

    @Override
    public Identifier getAnimationResource(ResearchTableEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/research_table.animation.json");
    }
}
