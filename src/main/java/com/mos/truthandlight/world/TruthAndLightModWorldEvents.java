package com.mos.truthandlight.world;

import com.mos.truthandlight.TruthAndLightMod;
import com.mos.truthandlight.world.gen.TruthAndLightModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TruthAndLightMod.MOD_ID)
public class TruthAndLightModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        TruthAndLightModOreGeneration.generateOres(event);
    }
}
