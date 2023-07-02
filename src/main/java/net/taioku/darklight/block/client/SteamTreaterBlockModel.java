package net.taioku.darklight.block.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.entity.tile.SteamTreaterBlockEntity;
import software.bernie.geckolib.model.GeoModel;

public class SteamTreaterBlockModel extends GeoModel<SteamTreaterBlockEntity> {
    @Override
    public Identifier getModelResource(SteamTreaterBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/steam_treater.geo.json");
    }

    @Override
    public Identifier getTextureResource(SteamTreaterBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/steam_treater.png");

    }

    @Override
    public Identifier getAnimationResource(SteamTreaterBlockEntity animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/steam_treater.animation.json");

    }
}
