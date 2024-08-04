package net.fellter.vanillatoolsplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fellter.vanillatoolsplus.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.OAK_WOOD_AXE)
                .add(ModItems.STR_OAK_WOOD_AXE)
                .add(ModItems.SPRUCE_WOOD_AXE)
                .add(ModItems.STR_SPRUCE_WOOD_AXE)
                .add(ModItems.BIRCH_WOOD_AXE)
                .add(ModItems.STR_BIRCH_WOOD_AXE);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.OAK_WOOD_PICKAXE)
                .add(ModItems.STR_OAK_WOOD_PICKAXE)
                .add(ModItems.SPRUCE_WOOD_PICKAXE)
                .add(ModItems.STR_SPRUCE_WOOD_PICKAXE)
                .add(ModItems.BIRCH_WOOD_PICKAXE)
                .add(ModItems.STR_BIRCH_WOOD_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.OAK_WOOD_SWORD)
                .add(ModItems.STR_OAK_WOOD_SWORD)
                .add(ModItems.SPRUCE_WOOD_SWORD)
                .add(ModItems.STR_SPRUCE_WOOD_SWORD)
                .add(ModItems.BIRCH_WOOD_SWORD)
                .add(ModItems.STR_BIRCH_WOOD_SWORD);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.OAK_WOOD_SHOVEL)
                .add(ModItems.STR_OAK_WOOD_SHOVEL)
                .add(ModItems.SPRUCE_WOOD_SHOVEL)
                .add(ModItems.STR_SPRUCE_WOOD_SHOVEL)
                .add(ModItems.BIRCH_WOOD_SHOVEL)
                .add(ModItems.STR_BIRCH_WOOD_SHOVEL);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.OAK_WOOD_HOE)
                .add(ModItems.STR_OAK_WOOD_HOE)
                .add(ModItems.SPRUCE_WOOD_HOE)
                .add(ModItems.STR_SPRUCE_WOOD_HOE)
                .add(ModItems.BIRCH_WOOD_HOE)
                .add(ModItems.STR_BIRCH_WOOD_HOE);

    }
}
