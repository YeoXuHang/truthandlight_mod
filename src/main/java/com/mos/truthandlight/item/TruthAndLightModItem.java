package com.mos.truthandlight.item;

import com.mos.truthandlight.TruthAndLightMod;
import com.mos.truthandlight.block.TruthAndLightModBlock;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class TruthAndLightModItem {
  public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TruthAndLightMod.MOD_ID);

    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(TruthAndLightModCreativeTab.TruthAndLightModCreativeTab)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

