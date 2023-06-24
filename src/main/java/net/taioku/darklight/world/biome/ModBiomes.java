package net.taioku.darklight.world.biome;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.taioku.darklight.Darklight;

public class ModBiomes {
    public static final RegistryKey<Biome> ASH = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(Darklight.MOD_ID, "ash"));
    public static final RegistryKey<Biome> BLIND = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(Darklight.MOD_ID, "blind"));
    public static final RegistryKey<Biome> BLAD = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(Darklight.MOD_ID, "blad"));
    public static final RegistryKey<Biome> CORRUPT = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(Darklight.MOD_ID, "corrupt"));
    public static final RegistryKey<Biome> DARK = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(Darklight.MOD_ID, "dark"));
    public static final RegistryKey<Biome> EXELS = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(Darklight.MOD_ID, "exels"));
    public static final RegistryKey<Biome> LIGHT = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(Darklight.MOD_ID, "light"));
    public static final RegistryKey<Biome> NIX = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(Darklight.MOD_ID, "nix"));
    public static final RegistryKey<Biome> PEBBLE = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(Darklight.MOD_ID, "pebble"));
    public static final RegistryKey<Biome> SHADE = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(Darklight.MOD_ID, "shade"));
}
