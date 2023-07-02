package net.taioku.darklight.item.client;

import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.item.custom.SteamTreaterItem;
import net.taioku.darklight.item.custom.ThunArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class SteamTreaterItemModel extends GeoModel<SteamTreaterItem> {
    @Override
    public Identifier getModelResource(SteamTreaterItem animatable) {
        return new Identifier(Darklight.MOD_ID, "geo/steam_treater.geo.json");
    }

    @Override
    public Identifier getTextureResource(SteamTreaterItem animatable) {
        return new Identifier(Darklight.MOD_ID, "textures/block/steam_treater.png");
    }

    @Override
    public Identifier getAnimationResource(SteamTreaterItem animatable) {
        return new Identifier(Darklight.MOD_ID, "animations/steam_treater.animation.json");
    }
}
