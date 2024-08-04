package net.fellter.vanillatoolsplus.item;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.Objects;
import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {


    //materials
    OAK_WOOD(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 79, 2.4f, 0.0f, 14, () -> Ingredient.ofItems(Blocks.OAK_WOOD)),
    STR_OAK_WOOD(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 79, 2.4f, 0.0f, 14, () -> Ingredient.ofItems(Blocks.STRIPPED_OAK_WOOD)),
    SPRUCE_WOOD(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 79, 2.4f, 0.0f, 14, () -> Ingredient.ofItems(Blocks.SPRUCE_WOOD)),
    STR_SPRUCE_WOOD(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 79, 2.4f, 0.0f, 14, () -> Ingredient.ofItems(Blocks.STRIPPED_SPRUCE_WOOD)),
    BIRCH_WOOD(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 79, 2.4f, 0.0f, 14, () -> Ingredient.ofItems(Blocks.BIRCH_WOOD)),
    STR_BIRCH_WOOD(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 79, 2.4f, 0.0f, 14, () -> Ingredient.ofItems(Blocks.STRIPPED_BIRCH_WOOD));



    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(final TagKey<Block> inverseTag, final int itemDurability, final float miningSpeed, final float attackDamage, final int enchantability, final Supplier<Ingredient> repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        Objects.requireNonNull(repairIngredient);
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }




    @Override
    public int getDurability() {
            return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
