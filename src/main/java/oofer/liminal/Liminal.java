package oofer.liminal;

import net.fabricmc.api.ModInitializer;
import oofer.liminal.block.ModBlocks;
import oofer.liminal.item.ModItems;
import oofer.liminal.world.dimension.ModDimensions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Liminal implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "liminal";
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModDimensions.register();
    }
}