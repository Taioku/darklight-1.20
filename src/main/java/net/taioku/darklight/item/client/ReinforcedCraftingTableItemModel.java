package net.taioku.darklight.item.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.client.ReinforcedCraftingTableBlockModel;
import net.taioku.darklight.item.custom.ReinforcedCraftingTableItem;
import software.bernie.geckolib.model.GeoModel;

public class ReinforcedCraftingTableItemModel extends GeoModel<ReinforcedCraftingTableItem> {
    @Override
    public Identifier getModelResource(ReinforcedCraftingTableItem animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/reinforced_crafting_table.geo.json");
    }

    @Override
    public Identifier getTextureResource(ReinforcedCraftingTableItem animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/reinforced_crafting_table.png");
    }

    @Override
    public Identifier getAnimationResource(ReinforcedCraftingTableItem animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/reinforced_crafting_table.animation.json");
    }
}
