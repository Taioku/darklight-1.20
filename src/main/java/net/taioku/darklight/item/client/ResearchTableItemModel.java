package net.taioku.darklight.item.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.item.custom.ResearchTableItem;
import software.bernie.geckolib.model.GeoModel;

public class ResearchTableItemModel extends GeoModel<ResearchTableItem> {
    @Override
    public Identifier getModelResource(ResearchTableItem animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/research_table.geo.json");
    }

    @Override
    public Identifier getTextureResource(ResearchTableItem animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/research_table.png");
    }

    @Override
    public Identifier getAnimationResource(ResearchTableItem animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/research_table.animation.json");
    }
}
