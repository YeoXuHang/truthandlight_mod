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

    public static final RegistryObject<Item> CHROMIUM = ITEMS.register("chromium" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEMS)));

    public static final RegistryObject<Item> RAW_CHROMIUM = ITEMS.register("raw_chromium" ,
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEMS)));

  public static final RegistryObject<Item> SKY_LIGHT_GEM = ITEMS.register("sky_light_gem" ,
          () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEMS)));

  public static final RegistryObject<Item> RAW_SKY_LIGHT = ITEMS.register("raw_sky_light" ,
          () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEMS)));

  public static final RegistryObject<Item> CHROMIUM_FRAGMENTS = ITEMS.register("chromium_fragments" ,
          () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEMS)));

  public static final RegistryObject<Item> SKY_LIGHT_FRAGMENTS = ITEMS.register("sky_light_fragments" ,
          () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEMS)));

  public static final RegistryObject<Item> CHROMIUM_SWORD = ITEMS.register("chromium_sword" ,
          () -> new SwordItem(ModTiers.CHROMIUM,9, 0.5f,
                  new Item.Properties().tab(ModCreativeModeTab.WEAPONSANDTOOLS)));

  public static final RegistryObject<Item> CHROMIUM_pickaxe = ITEMS.register("chromium_pickaxe" ,
          () -> new PickaxeItem(ModTiers.CHROMIUM,2, 0.5f,
                  new Item.Properties().tab(ModCreativeModeTab.WEAPONSANDTOOLS)));

  public static final RegistryObject<Item> CHROMIUM_SHOVEL = ITEMS.register("chromium_shovel" ,
          () -> new ShovelItem(ModTiers.CHROMIUM,2, 0.5f,
                  new Item.Properties().tab(ModCreativeModeTab.WEAPONSANDTOOLS)));

  public static final RegistryObject<Item> CHROMIUM_AXE = ITEMS.register("chromium_axe" ,
          () -> new AxeItem(ModTiers.CHROMIUM,10, 0.5f,
                  new Item.Properties().tab(ModCreativeModeTab.WEAPONSANDTOOLS)));

  public static final RegistryObject<Item> CHROMIUM_HOE = ITEMS.register("chromium_hoe" ,
          () -> new HoeItem(ModTiers.CHROMIUM,1, 0.5f,
                  new Item.Properties().tab(ModCreativeModeTab.WEAPONSANDTOOLS)));

  public static final RegistryObject<Item> CHROMIUM_HELMET = ITEMS.register("chromium_helmet",
          () -> new ArmorItem(ModArmorMaterials.CHROMIUM, EquipmentSlot.HEAD,
                  new Item.Properties().tab(ModCreativeModeTab.ARMOR)));

  public static final RegistryObject<Item> CHROMIUM_CHESTPLATE = ITEMS.register("chromium_chestplate",
          () -> new ArmorItem(ModArmorMaterials.CHROMIUM, EquipmentSlot.CHEST,
                  new Item.Properties().tab(ModCreativeModeTab.ARMOR)));

  public static final RegistryObject<Item> CHROMIUM_LEGGINGS = ITEMS.register("chromium_leggings",
          () -> new ArmorItem(ModArmorMaterials.CHROMIUM, EquipmentSlot.LEGS,
                  new Item.Properties().tab(ModCreativeModeTab.ARMOR)));

  public static final RegistryObject<Item> CHROMIUM_BOOTS = ITEMS.register("chromium_boots",
          () -> new ArmorItem(ModArmorMaterials.CHROMIUM, EquipmentSlot.FEET,
                  new Item.Properties().tab(ModCreativeModeTab.ARMOR)));
  
  public static final RegistryObject<Item> SKY_LIGHT_SWORD = ITEMS.register("sky_light_sword" ,
          () -> new SwordItem(ModTiers.SKY_LIGHT,9, 0.5f,
                  new Item.Properties().tab(ModCreativeModeTab.WEAPONSANDTOOLS)));

  public static final RegistryObject<Item> SKY_LIGHT_PICKAXE = ITEMS.register("sky_light_pickaxe" ,
          () -> new PickaxeItem(ModTiers.SKY_LIGHT,2, 0.5f,
                  new Item.Properties().tab(ModCreativeModeTab.WEAPONSANDTOOLS)));

  public static final RegistryObject<Item> SKY_LIGHT_SHOVEL = ITEMS.register("sky_light_shovel" ,
          () -> new ShovelItem(ModTiersSKY_LIGHT,2, 0.5f,
                  new Item.Properties().tab(ModCreativeModeTab.WEAPONSANDTOOLS)));

  public static final RegistryObject<Item> SKY_LIGHT_AXE = ITEMS.register("sky_light_axe" ,
          () -> new AxeItem(ModTiers.SKY_LIGHT,10, 0.5f,
                  new Item.Properties().tab(ModCreativeModeTab.WEAPONSANDTOOLS)));

  public static final RegistryObject<Item> SKY_LIGHT_HOE = ITEMS.register("sky_light_hoe" ,
          () -> new HoeItem(ModTiers.SKY_LIGHT,1, 0.5f,
                  new Item.Properties().tab(ModCreativeModeTab.WEAPONSANDTOOLS)));
  
   public static final RegistryObject<Item> SKY_LIGHT_HELMET = ITEMS.register("sky_light_helmet",
          () -> new ArmorItem(ModArmorMaterials.SKY_LIGHT, EquipmentSlot.HEAD,
                  new Item.Properties().tab(ModCreativeModeTab.ARMOR)));

  public static final RegistryObject<Item> SKY_LIGHT_CHESTPLATE = ITEMS.register("sky_light_chestplate",
          () -> new ArmorItem(ModArmorMaterials.SKY_LIGHT, EquipmentSlot.CHEST,
                  new Item.Properties().tab(ModCreativeModeTab.ARMOR)));

  public static final RegistryObject<Item> SKY_LIGHT_LEGGINGS = ITEMS.register("sky_light_leggings",
          () -> new ArmorItem(ModArmorMaterials.SKY_LIGHT, EquipmentSlot.LEGS,
                  new Item.Properties().tab(ModCreativeModeTab.ARMOR)));

  public static final RegistryObject<Item> SKY_LIGHT_BOOTS = ITEMS.register("sky_light_boots",
          () -> new ArmorItem(ModArmorMaterials.SKY_LIGHT, EquipmentSlot.FEET,
                  new Item.Properties().tab(ModCreativeModeTab.ARMOR)));

  public static final RegistryObject<Item> CHROMIUM_BOW = ITEMS.register("chromium_bow",
          () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.WEAPONSANDTOOLS).durability(2000)));
  
  public static final RegistryObject<Item> SKY_LIGHT_BOW = ITEMS.register("sky_light_bow",
          () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.WEAPONSANDTOOLS).durability(500)));

  public static final RegistryObject<Item> DARKNESS_GEM = ITEMS.register("darkness_gem" ,
          () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ITEMS)));

  
  public static final RegistryObject<Item> DARK_SWORD = ITEMS.register("dark_sword" ,
          () -> new SwordItem(ModTiers.DARKNESS,31, 0.5f,
                  new Item.Properties().tab(ModCreativeModeTab.WEAPONSANDTOOLS)));

  public static final RegistryObject<Item> DARK_PICKAXE = ITEMS.register("dark_pickaxe" ,
          () -> new PickaxeItem(ModTiers.DARKNESS,2, 0.5f,
                  new Item.Properties().tab(ModCreativeModeTab.WEAPONSANDTOOLS)));

  public static final RegistryObject<Item> DARK_HELMET = ITEMS.register("dark_helmet",
          () -> new ArmorItem(ModArmorMaterials.DARKNESS, EquipmentSlot.HEAD,
                  new Item.Properties().tab(ModCreativeModeTab.ARMOR)));

  public static final RegistryObject<Item> DARK_CHESTPLATE = ITEMS.register("dark_chestplate",
          () -> new ArmorItem(ModArmorMaterials.DARKNESS, EquipmentSlot.CHEST,
                  new Item.Properties().tab(ModCreativeModeTab.ARMOR)));

  public static final RegistryObject<Item> DARK_LEGGINGS = ITEMS.register("dark_leggings",
          () -> new ArmorItem(ModArmorMaterials.DARKNESS, EquipmentSlot.LEGS,
                  new Item.Properties().tab(ModCreativeModeTab.ARMOR)));

  public static final RegistryObject<Item> DARK_BOOTS = ITEMS.register("dark_boots",
          () -> new ArmorItem(ModArmorMaterials.DARKNESS, EquipmentSlot.FEET,
                  new Item.Properties().tab(ModCreativeModeTab.ARMOR)));

  
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

