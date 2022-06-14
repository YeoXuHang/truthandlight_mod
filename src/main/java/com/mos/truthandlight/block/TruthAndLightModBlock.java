package com.mos.truthandlight.block;

import com.mos.truthandlight.TruthAndLightMod;
import com.mos.truthandlight.item.TruthAndLightModCreativeTab;
import com.mos.truthandlight.item.TruthAndLightModItem;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class TruthAndLightModBlock {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TruthAndLightMod.MOD_ID);

    public static final RegistryObject<Block> CHROMIUM_BLOCK = registerBlock("chromium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), TruthAndLightModCreativeTab.TruthAndLightModCreativeTab);

   public static final RegistryObject<Block> RAW_CHROMIUM_BLOCK = registerBlock("raw_chromium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(8f).requiresCorrectToolForDrops()), TruthAndLightModCreativeTab.TruthAndLightModCreativeTab);

   public static final RegistryObject<Block> RAW_SKY_LIGHT_BLOCK = registerBlock("raw_sky_light_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(8f).requiresCorrectToolForDrops()), TruthAndLightModCreativeTab.TruthAndLightModCreativeTab);

    public static final RegistryObject<Block> SKY_LIGHT_BLOCK = registerBlock("sky_light_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f).requiresCorrectToolForDrops()), TruthAndLightModCreativeTab.TruthAndLightModCreativeTab);

 public static final RegistryObject<Block> CHROMIUM_ORE = registerBlock("chromium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), TruthAndLightModCreativeTab.TruthAndLightModCreativeTab);

    public static final RegistryObject<Block> SKY_LIGHT_ORE = registerBlock("sky_light_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), TruthAndLightModCreativeTab.TruthAndLightModCreativeTab);

   public static final RegistryObject<Block> RED_LOG = registerBlock("red_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)),
            ModCreativeModeTab.BLOCKS);

    public static final RegistryObject<Block> RED_WOOD = registerBlock("red_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)),
            ModCreativeModeTab.BLOCKS);

    public static final RegistryObject<Block> STRIPPED_RED_LOG = registerBlock("stripped_red_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)),
            ModCreativeModeTab.BLOCKS);

    public static final RegistryObject<Block> STRIPPED_RED_WOOD = registerBlock("stripped_red_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)),
            ModCreativeModeTab.BLOCKS);

    public static final RegistryObject<Block> PURPLE_SAPPHIRE_BLOCK = registerBlock("purple_sapphire_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.BLOCKS);



    public static final RegistryObject<Block> RED_PLANKS = registerBlock("red_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.BLOCKS);

                public static final RegistryObject<Block> RED_LEAVES = registerBlock("red_leaves",
                        () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                            @Override
                            public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return true;
                            }

                            @Override
                            public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return 60;
                            }

                            @Override
                            public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                                return 30;
                            }
                        }, ModCreativeModeTab.BLOCKS);


                public static final RegistryObject<Block> RED_SAPLING = registerBlock("red_sapling",
                        () -> new SaplingBlock(new RedTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.BLOCKS);




    

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return TruthAndLightModItem.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return TruthAndLightModItem.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
