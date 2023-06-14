package net.taioku.darklight.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryWrapper;
import net.taioku.darklight.Darklight;

import java.util.concurrent.CompletableFuture;

public class ModWorldGenertator extends FabricDynamicRegistryProvider {
    public ModWorldGenertator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
        // Worldgen
    }

    @Override
    public String getName() {
        return Darklight.MOD_ID;
    }
}
