package net.taioku.darklight.world;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.WeightedList;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.CherryFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.CherryTrunkPlacer;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.block.ModBlocks;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> SHINE_KEY = registerKey("shine");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        register(context, SHINE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.SHINE_LOG),
                new CherryTrunkPlacer(4, 1, 0, ConstantIntProvider.create(3),
                        UniformIntProvider.create(2, 4), UniformIntProvider.create(-4, -3), UniformIntProvider.create(-1, 0)),
                BlockStateProvider.of(ModBlocks.SHINE_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(0), ConstantIntProvider.create(5),
                        0.25F, 0.25F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Darklight.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
