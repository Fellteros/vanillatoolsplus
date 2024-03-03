package net.fellter.vanillatoolsplus.item;

import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;

public class ToolRecipes {


    public static CraftingRecipeJsonBuilder createAxeRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .input('#', input)
                .input('/', Items.STICK)
                .pattern("##")
                .pattern("#/")
                .pattern(" /");
    }
    public static CraftingRecipeJsonBuilder createShovelRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .input('#', input)
                .input('/', Items.STICK)
                .pattern("#")
                .pattern("/")
                .pattern("/");
    }
    public static CraftingRecipeJsonBuilder createSwordRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .input('#', input)
                .input('/', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("/");
    }
    public static CraftingRecipeJsonBuilder createPickaxeRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .input('#', input)
                .input('/', Items.STICK)
                .pattern("###")
                .pattern(" # ")
                .pattern(" / ");
    }
    public static CraftingRecipeJsonBuilder createHoeRecipe(ItemConvertible output, Ingredient input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .input('#', input)
                .input('/', Items.STICK)
                .pattern("##")
                .pattern(" /")
                .pattern(" /");
    }
}
