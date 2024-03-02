package net.fellter.vanillatoolsplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fellter.vanillatoolsplus.item.ModItems;
import net.fellter.vanillatoolsplus.item.ModRecipes;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.Ingredient;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }


    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //oak
        ModRecipes.createAxeRecipe(ModItems.OAK_WOOD_AXE, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createShovelRecipe(ModItems.OAK_WOOD_SHOVEL, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createSwordRecipe(ModItems.OAK_WOOD_SWORD, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createPickaxeRecipe(ModItems.OAK_WOOD_PICKAXE, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);
        ModRecipes.createHoeRecipe(ModItems.OAK_WOOD_HOE, Ingredient.ofItems(Blocks.OAK_WOOD))
                .criterion(hasItem(Blocks.OAK_WOOD), conditionsFromItem(Blocks.OAK_WOOD))
                .offerTo(exporter);




    }





}

