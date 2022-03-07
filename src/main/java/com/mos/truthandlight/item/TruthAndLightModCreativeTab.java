package com.mos.truthandlight.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TruthAndLightModCreativeTab {
    public static final CreativeModeTab TruthAndLightModCreativeTab = new CreativeModeTab("truthandlight_tab") {
        @Override
       public static final CreativeModeTab ITEMS = new CreativeModeTab("items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHROMIUM.get());
            
       public static final CreativeModeTab BLOCKS = new CreativeModeTab("items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_CHROMIUM.get());
        }
    };
     public static final CreativeModeTab WEAPONSANDTOOLS = new CreativeModeTab("items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHROMIUM_SWORD.get());
        }
    };
     public static final CreativeModeTab  ARMOR = new CreativeModeTab("items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CHROMIUM_HELMET.get());
    };

