package net.taioku.darklight.recipe;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.taioku.darklight.Darklight;
import net.taioku.darklight.recipe.mortar.MortarRecipe;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER,
                new Identifier(Darklight.MOD_ID, MortarRecipe.Serializer.ID), MortarRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE,
                new Identifier(Darklight.MOD_ID, MortarRecipe.Type.ID), MortarRecipe.Type.INSTANCE);

    }
}
