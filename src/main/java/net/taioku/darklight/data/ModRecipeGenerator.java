package net.taioku.darklight.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.taioku.darklight.block.ModBlocks;
import net.taioku.darklight.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_THUN_ORE), RecipeCategory.MISC, ModItems.RAW_THUN,
                3f, 300, "thun");
        offerSmelting(exporter, List.of(ModBlocks.THUN_ORE), RecipeCategory.MISC, ModItems.RAW_THUN,
                3f, 300, "thun");
        offerSmelting(exporter, List.of(ModItems.RAW_THUN), RecipeCategory.MISC, ModItems.THUN_INGOT,
                3f, 300, "thun");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUN_HELMET)
                .pattern("TTT")
                .pattern("T T")
                .pattern("   ")
                .input('T', ModItems.THUN_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUN_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUN_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUN_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUN_CHESTPLATE)
                .pattern("T T")
                .pattern("TTT")
                .pattern("TTT")
                .input('T', ModItems.THUN_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUN_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUN_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUN_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUN_LEGGINGS)
                .pattern("TTT")
                .pattern("T T")
                .pattern("T T")
                .input('T', ModItems.THUN_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUN_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUN_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUN_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUN_BOOTS)
                .pattern("   ")
                .pattern("T T")
                .pattern("T T")
                .input('T', ModItems.THUN_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUN_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUN_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUN_BOOTS)));

    }
}
