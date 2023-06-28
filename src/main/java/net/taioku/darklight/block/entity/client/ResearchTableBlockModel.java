package net.taioku.darklight.block.entity.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.entity.entities.ResearchTableBlockEntity;
import software.bernie.geckolib.model.GeoModel;

public class ResearchTableBlockModel extends GeoModel<ResearchTableBlockEntity> {
    @Override
    public Identifier getModelResource(ResearchTableBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/research_table.geo.json");
    }

    @Override
    public Identifier getTextureResource(ResearchTableBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/research_table.png");
    }

    @Override
    public Identifier getAnimationResource(ResearchTableBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/research_table.animation.json");
    }
}
