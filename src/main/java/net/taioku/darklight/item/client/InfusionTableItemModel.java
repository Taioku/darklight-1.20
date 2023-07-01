package net.taioku.darklight.item.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.item.custom.InfusionTableItem;
import software.bernie.geckolib.model.GeoModel;

public class InfusionTableItemModel extends GeoModel<InfusionTableItem> {
    @Override
    public Identifier getModelResource(InfusionTableItem animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/infusion_table.json");
    }

    @Override
    public Identifier getTextureResource(InfusionTableItem animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/infusion_table.png");
    }

    @Override
    public Identifier getAnimationResource(InfusionTableItem animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/infusion_table.json");
    }
}
