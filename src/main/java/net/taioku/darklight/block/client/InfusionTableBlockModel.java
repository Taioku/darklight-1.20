package net.taioku.darklight.block.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.entity.tile.InfusionTableBlockEntity;
import software.bernie.geckolib.model.GeoModel;

public class InfusionTableBlockModel extends GeoModel<InfusionTableBlockEntity> {
    @Override
    public Identifier getModelResource(InfusionTableBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/infusion_table.json");
    }

    @Override
    public Identifier getTextureResource(InfusionTableBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/infusion_table.png");
    }

    @Override
    public Identifier getAnimationResource(InfusionTableBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/infusion_table.json");
    }
}