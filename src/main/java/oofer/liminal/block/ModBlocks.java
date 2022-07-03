package oofer.liminal.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import oofer.liminal.Liminal;
import oofer.liminal.item.ModItemGroup;


public class ModBlocks {
    public static final Block WALLPAPER = registerBlock("wallpaper",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(12f).requiresTool()), ModItemGroup.COMMON);
    public static final Block CARPET = registerBlock("carpet",
            new Block(FabricBlockSettings.of(Material.FROGLIGHT).strength(12f).requiresTool()), ModItemGroup.COMMON);
    public static final Block LIGHTS = registerBlock("lights",
            new Block(FabricBlockSettings.of(Material.METAL).strength(12f).requiresTool().luminance(15)), ModItemGroup.COMMON);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Liminal.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(Liminal.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        Liminal.LOGGER.debug("Registering ModBlocks for " + Liminal.MOD_ID);
    }
}
