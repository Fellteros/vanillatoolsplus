package net.fellter.vanillatoolsplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fellter.vanillatoolsplus.item.ModItems;
import net.fellter.vanillatoolsplus.item.ToolRecipes;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        //oak
        ToolRecipes.createAxeRecipe(ModItems.OAK_WOOD_AXE, (Blocks.OAK_WOOD)).offerTo(exporter);
        ToolRecipes.createShovelRecipe(ModItems.OAK_WOOD_SHOVEL, (Blocks.OAK_WOOD)).offerTo(exporter);
        ToolRecipes.createSwordRecipe(ModItems.OAK_WOOD_SWORD, (Blocks.OAK_WOOD)).offerTo(exporter);
        ToolRecipes.createPickaxeRecipe(ModItems.OAK_WOOD_PICKAXE, (Blocks.OAK_WOOD)).offerTo(exporter);
        ToolRecipes.createHoeRecipe(ModItems.OAK_WOOD_HOE, (Blocks.OAK_WOOD)).offerTo(exporter);
        //str oak
        ToolRecipes.createAxeRecipe(ModItems.STR_OAK_WOOD_AXE, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
        ToolRecipes.createShovelRecipe(ModItems.STR_OAK_WOOD_SHOVEL, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
        ToolRecipes.createSwordRecipe(ModItems.STR_OAK_WOOD_SWORD, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
        ToolRecipes.createPickaxeRecipe(ModItems.STR_OAK_WOOD_PICKAXE, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
        ToolRecipes.createHoeRecipe(ModItems.STR_OAK_WOOD_HOE, (Blocks.STRIPPED_OAK_WOOD)).offerTo(exporter);
        //spruce
        ToolRecipes.createAxeRecipe(ModItems.SPRUCE_WOOD_AXE, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
        ToolRecipes.createShovelRecipe(ModItems.SPRUCE_WOOD_SHOVEL, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
        ToolRecipes.createSwordRecipe(ModItems.SPRUCE_WOOD_SWORD, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
        ToolRecipes.createPickaxeRecipe(ModItems.SPRUCE_WOOD_PICKAXE, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
        ToolRecipes.createHoeRecipe(ModItems.SPRUCE_WOOD_HOE, (Blocks.SPRUCE_WOOD)).offerTo(exporter);
        //str spruce
        ToolRecipes.createAxeRecipe(ModItems.STR_SPRUCE_WOOD_AXE, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
        ToolRecipes.createShovelRecipe(ModItems.STR_SPRUCE_WOOD_SHOVEL, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
        ToolRecipes.createSwordRecipe(ModItems.STR_SPRUCE_WOOD_SWORD, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
        ToolRecipes.createPickaxeRecipe(ModItems.STR_SPRUCE_WOOD_PICKAXE, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
        ToolRecipes.createHoeRecipe(ModItems.STR_SPRUCE_WOOD_HOE, (Blocks.STRIPPED_SPRUCE_WOOD)).offerTo(exporter);
        //birch
        ToolRecipes.createAxeRecipe(ModItems.BIRCH_WOOD_AXE, (Blocks.BIRCH_WOOD)).offerTo(exporter);
        ToolRecipes.createShovelRecipe(ModItems.BIRCH_WOOD_SHOVEL, (Blocks.BIRCH_WOOD)).offerTo(exporter);
        ToolRecipes.createSwordRecipe(ModItems.BIRCH_WOOD_SWORD, (Blocks.BIRCH_WOOD)).offerTo(exporter);
        ToolRecipes.createPickaxeRecipe(ModItems.BIRCH_WOOD_PICKAXE, (Blocks.BIRCH_WOOD)).offerTo(exporter);
        ToolRecipes.createHoeRecipe(ModItems.BIRCH_WOOD_HOE, (Blocks.BIRCH_WOOD)).offerTo(exporter);
        //str birch
        ToolRecipes.createAxeRecipe(ModItems.STR_BIRCH_WOOD_AXE, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
        ToolRecipes.createShovelRecipe(ModItems.STR_BIRCH_WOOD_SHOVEL, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
        ToolRecipes.createSwordRecipe(ModItems.STR_BIRCH_WOOD_SWORD, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
        ToolRecipes.createPickaxeRecipe(ModItems.STR_BIRCH_WOOD_PICKAXE, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);
        ToolRecipes.createHoeRecipe(ModItems.STR_BIRCH_WOOD_HOE, (Blocks.STRIPPED_BIRCH_WOOD)).offerTo(exporter);




    }





}

