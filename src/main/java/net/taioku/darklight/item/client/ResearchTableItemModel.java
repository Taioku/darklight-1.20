package net.taioku.darklight.item.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.item.custom.ResearchTable;
import software.bernie.geckolib.model.GeoModel;

public class ResearchTableItemModel extends GeoModel<ResearchTable> {
    @Override
    public Identifier getModelResource(ResearchTable animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/research_table.geo.json");
    }

    @Override
    public Identifier getTextureResource(ResearchTable animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/research_table.png");
    }

    @Override
    public Identifier getAnimationResource(ResearchTable animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/research_table.animation.json");
    }
}
