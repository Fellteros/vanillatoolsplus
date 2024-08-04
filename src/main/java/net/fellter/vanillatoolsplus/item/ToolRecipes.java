package net.fellter.vanillatoolsplus.item;

import net.minecraft.data.server.recipe.CraftingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import static net.minecraft.data.server.recipe.RecipeProvider.*;

public class ToolRecipes {


    public static CraftingRecipeJsonBuilder createAxeRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .input('#', input)
                .input('/', Items.STICK)
                .pattern("##")
                .pattern("#/")
                .pattern(" /")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createShovelRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .input('#', input)
                .input('/', Items.STICK)
                .pattern("#")
                .pattern("/")
                .pattern("/")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createSwordRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .input('#', input)
                .input('/', Items.STICK)
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createPickaxeRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .input('#', input)
                .input('/', Items.STICK)
                .pattern("###")
                .pattern(" # ")
                .pattern(" / ")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
    public static CraftingRecipeJsonBuilder createHoeRecipe(ItemConvertible output, ItemConvertible input) {
        return ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output)
                .input('#', input)
                .input('/', Items.STICK)
                .pattern("##")
                .pattern(" /")
                .pattern(" /")
                .criterion(hasItem(input), conditionsFromItem(input))
                .showNotification(true);
    }
}
