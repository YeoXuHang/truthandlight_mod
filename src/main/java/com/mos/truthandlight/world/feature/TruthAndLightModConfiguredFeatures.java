package com.mos.truthandlight.world.feature;

import com.mos.truthandlight.block.TruthAndLightModBlock;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;

import java.util.List;

public class TruthAndLightModConfiguredFeatures {
    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_AMBER_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, TruthAndLightModBlock.CHROMIUM_ORE.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> AMBER_ORE = FeatureUtils.register("citrine_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_AMBER_ORES, 9));

}
