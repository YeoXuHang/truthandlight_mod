package com.mos.truthandlight.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class TruthAndLightModPlacedFeatures {

    public static final Holder<PlacedFeature> AMBER_ORE_PLACED = PlacementUtils.register("citrine_ore_placed",
            TruthAndLightModConfiguredFeatures.AMBER_ORE, TruthAndLightModOrePlacement.commonOrePlacement(7, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

}
