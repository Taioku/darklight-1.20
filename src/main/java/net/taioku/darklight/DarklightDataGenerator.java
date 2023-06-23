package net.taioku.darklight;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.taioku.darklight.data.ModLootTableGenerator;
import net.taioku.darklight.data.ModModelProvider;
import net.taioku.darklight.data.ModRecipeGenerator;
import net.taioku.darklight.data.ModWorldGenertator;
import net.taioku.darklight.world.ModConfiguredFeatures;

public class DarklightDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModLootTableGenerator::new);
        pack.addProvider(ModRecipeGenerator::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModWorldGenertator::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
    }
}
