package net.zeta.caves;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;

import net.minecraft.world.biome.BiomeKeys;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NewCaveTypesInitializerClass implements ModInitializer {

    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "cavesadded";
    public static final String MOD_NAME = "Vanilla Cave Types";

    @Override
    public void onInitialize() {
        log(Level.INFO, "Initializing");
        //TODO: Initializer
        OverworldBiomes.addContinentalBiome(BiomeKeys.LUSH_CAVES, OverworldClimate.TEMPERATE, 2D);
        OverworldBiomes.addContinentalBiome(BiomeKeys.DRIPSTONE_CAVES, OverworldClimate.COOL, 2D);
        log(Level.INFO, "Caves initialized!");

    }

    public static void log(Level level, String message){
        LOGGER.log(level, "["+MOD_NAME+"] " + message);
    }

}