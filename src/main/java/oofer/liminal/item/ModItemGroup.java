package oofer.liminal.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import oofer.liminal.Liminal;
import oofer.liminal.block.ModBlocks;

public class ModItemGroup {

    public static final ItemGroup COMMON = FabricItemGroupBuilder.build(
            new Identifier(Liminal.MOD_ID, "common"), () -> new ItemStack(ModBlocks.WALLPAPER));
}
