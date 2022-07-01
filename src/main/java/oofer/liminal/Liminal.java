package oofer.liminal;

import net.fabricmc.api.ModInitializer;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Liminal implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogManager().getLogger("modid");

    @Override
    public void onInitialize() {
        LOGGER.info("Hello fabric world!");
    }
}
                                                                                      