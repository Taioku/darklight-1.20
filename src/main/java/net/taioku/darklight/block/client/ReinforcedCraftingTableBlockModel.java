package net.taioku.darklight.block.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.custom.ModReinforcedCraftingTableBlock;
import net.taioku.darklight.block.entity.tile.ReinforcedCraftingTableBlockEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;

public class ReinforcedCraftingTableBlockModel extends GeoModel<ReinforcedCraftingTableBlockEntity> {
    @Override
    public Identifier getModelResource(ReinforcedCraftingTableBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/reinforced_crafting_table.geo.json");
    }

    @Override
    public Identifier getTextureResource(ReinforcedCraftingTableBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/reinforced_crafting_table.png");
    }

    @Override
    public Identifier getAnimationResource(ReinforcedCraftingTableBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/reinforced_crafting_table.animation.json");
    }
}