package net.taioku.darklight.world.dimension;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.taioku.darklight.Darklight;

public class ModDimensions {
    public static final RegistryKey<DimensionOptions> DIMENSION_KEY = RegistryKey.of(RegistryKeys.DIMENSION,
            new Identifier(Darklight.MOD_ID, "darklight"));

    public static RegistryKey<World> DAKRLIGHT_KEY = RegistryKey.of(RegistryKeys.WORLD,
            DIMENSION_KEY.getValue());

    public static final RegistryKey<DimensionType> DARKLIGHT_TYPE_KEY = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            new Identifier(Darklight.MOD_ID, "darklight_type"));

    public static void register() {
        Darklight.LOGGER.info("Registering Mod Dimensions for " + Darklight.MOD_ID);
    }
}
