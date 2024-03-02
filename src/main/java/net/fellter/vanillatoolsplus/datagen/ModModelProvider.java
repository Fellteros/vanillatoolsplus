package net.fellter.vanillatoolsplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.fellter.vanillatoolsplus.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.VTP_TITLE, Models.GENERATED);

        itemModelGenerator.register(ModItems.OAK_WOOD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OAK_WOOD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OAK_WOOD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OAK_WOOD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OAK_WOOD_HOE, Models.HANDHELD);
    }
}
