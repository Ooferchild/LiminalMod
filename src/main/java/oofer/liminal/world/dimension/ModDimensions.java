package oofer.liminal.world.dimension;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import oofer.liminal.Liminal;

public class ModDimensions {
    private static final RegistryKey<World> LEVEL_0_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(Liminal.MOD_ID, "level_0"));
    private static final RegistryKey<DimensionType> LEVEL_0_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, LEVEL_0_DIMENSION_KEY.getValue());

    public static void register() {
        System.out.println("Registering ModDimensions for " + Liminal.MOD_ID);
    }
}
