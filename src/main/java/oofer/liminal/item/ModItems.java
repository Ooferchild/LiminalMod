package oofer.liminal.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import oofer.liminal.Liminal;


public class ModItems {

    public static final Item CASHEW_WATER = registerItem("cashew_water",
            new Item(new FabricItemSettings().group(ModItemGroup.COMMON)));

    public static final Item NEON_WATER = registerItem("neon_water",
            new Item(new FabricItemSettings().group(ModItemGroup.COMMON)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Liminal.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Liminal.LOGGER.debug("Registering Mod Items for " + Liminal.MOD_ID);
    }
}
