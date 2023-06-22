package net.taioku.darklight.world.biome;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.taioku.darklight.Darklight;

public class ModBiomes {
    public static final RegistryKey<Biome> DARK = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(Darklight.MOD_ID, "dark"));
}
