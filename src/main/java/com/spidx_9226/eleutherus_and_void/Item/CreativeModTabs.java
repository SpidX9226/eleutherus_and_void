package com.spidx_9226.eleutherus_and_void.Item;

import com.spidx_9226.eleutherus_and_void.EleutherusAndVoid;
import com.spidx_9226.eleutherus_and_void.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EleutherusAndVoid.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ELEUTHERUS_AND_VOID_TAB = CREATIVE_MOD_TABS.register("eleutherus_and_void_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ELEUTHERUS.get())).title(Component.literal("Eleutherus and void"))
                    .displayItems((pParameters, pOutput) ->{
                        // void
                        pOutput.accept(ModItems.ELEUTHERUS_AND_VOID_MUSIC_DISK.get());
                        pOutput.accept(ModBlocks.VOID_DEBRIS.get());
                        pOutput.accept(ModBlocks.MARBLE.get());
                        pOutput.accept(ModItems.RAW_VOID.get());
                        pOutput.accept(ModItems.VOID_FLAMBERGE.get());
                        pOutput.accept(ModItems.VOID_INGOT.get());
                        pOutput.accept(ModBlocks.VOID_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_VOID_BLOCK.get());
                        pOutput.accept(ModBlocks.VOID_PETALS.get());
                        pOutput.accept(ModItems.ELEUTHERUS_RASPBERRY.get());

                        pOutput.accept(ModBlocks.RANDOM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get());
                        // eleutherus
                        pOutput.accept(ModBlocks.ELEUTHERUS_ORE.get());
                        pOutput.accept(ModItems.ELEUTHERUS.get());
                        pOutput.accept(ModItems.ELEUTHERUS_DUST.get());
                        pOutput.accept(ModBlocks.ELEUTHERUS_BLOCK.get());
                        pOutput.accept(ModItems.ELEUTHERUS_UPGRADE_SMITHING_TEMPLATE.get());
                        pOutput.accept(ModItems.ELEUTHERUS_PIE.get());
                        pOutput.accept(ModItems.ELEUTHERUS_MANGO.get());
                        pOutput.accept(ModItems.ELEUTHERUS_SWORD.get());
                        pOutput.accept(ModItems.ELEUTHERUS_PICKAXE.get());
                        pOutput.accept(ModItems.ELEUTHERUS_AXE.get());
                        pOutput.accept(ModItems.ELEUTHERUS_SHOVEL.get());
                        pOutput.accept(ModItems.ELEUTHERUS_HOE.get());

                        pOutput.accept(ModItems.ELEUTHERUS_FLAMBERGE.get());

                        pOutput.accept(ModItems.ELEUTHERUS_HELMET.get());
                        pOutput.accept(ModItems.ELEUTHERUS_CHESTPLATE.get());
                        pOutput.accept(ModItems.ELEUTHERUS_LEGGINGS.get());
                        pOutput.accept(ModItems.ELEUTHERUS_BOOTS.get());

                        pOutput.accept(ModBlocks.ELEUTHERUS_NYLIUM.get());
                        pOutput.accept(ModBlocks.ELEUTHERUS_WART_BLOCK.get());
                        pOutput.accept(ModBlocks.ELEUTHERUS_LOG.get());
                        pOutput.accept(ModBlocks.ELEUTHERUS_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_ELEUTHERUS_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_ELEUTHERUS_WOOD.get());
                        pOutput.accept(ModBlocks.ELEUTHERUS_PLANKS.get());
                        pOutput.accept(ModBlocks.ELEUTHERUS_STAIRS.get());
                        pOutput.accept(ModBlocks.ELEUTHERUS_SLAB.get());
                        pOutput.accept(ModBlocks.ELEUTHERUS_BUTTON.get());
                        pOutput.accept(ModBlocks.ELEUTHERUS_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.ELEUTHERUS_FENCE.get());
                        pOutput.accept(ModBlocks.ELEUTHERUS_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.ELEUTHERUS_DOOR.get());
                        pOutput.accept(ModBlocks.ELEUTHERUS_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.ELEUTHERUS_TRAPDOOR.get());

                        pOutput.accept(ModItems.ELEUTHERUS_SIGN.get());
                        pOutput.accept(ModItems.ELEUTHERUS_HANGING_SIGN.get());

                        pOutput.accept(ModBlocks.ELEUTHERUS_LANTERN.get());
                        pOutput.accept(ModBlocks.OBSIDIAN_DUST.get());
                        pOutput.accept(ModBlocks.ELEUTHERUS_MAGMA.get());
                        pOutput.accept(ModItems.PORTAL_FLUID_BUCKET.get());

                        // flowering & void
                        pOutput.accept(ModBlocks.ELEUTHERUS_ROSE.get());
                        pOutput.accept(ModBlocks.FLOWERING_VOID_LEAVES.get());
                        pOutput.accept(ModBlocks.VOID_LEAVES.get());
                        pOutput.accept(ModBlocks.VOID_NYLIUM.get());
                        pOutput.accept(ModBlocks.VOID_LOG.get());
                        pOutput.accept(ModBlocks.VOID_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_VOID_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_VOID_WOOD.get());

                        pOutput.accept(ModBlocks.VOID_PLANKS.get());
                        pOutput.accept(ModBlocks.VOID_STAIRS.get());
                        pOutput.accept(ModBlocks.VOID_SLAB.get());
                        pOutput.accept(ModBlocks.VOID_BUTTON.get());
                        pOutput.accept(ModBlocks.VOID_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.VOID_FENCE.get());
                        pOutput.accept(ModBlocks.VOID_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.VOID_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.VOID_DOOR.get());
                        pOutput.accept(ModBlocks.VOID_TRAPDOOR.get());
                        pOutput.accept(ModItems.VOID_SIGN.get());
                        pOutput.accept(ModItems.VOID_HANGING_SIGN.get());

                        pOutput.accept(ModBlocks.VOID_SAND.get());
                        pOutput.accept(ModBlocks.VOID_SANDSTONE.get());
                        pOutput.accept(ModBlocks.SMOOTH_VOID_SANDSTONE.get());
                        pOutput.accept(ModBlocks.CUT_VOID_SANDSTONE.get());
                        pOutput.accept(ModBlocks.VOID_SANDSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.VOID_SANDSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.VOID_SANDSTONE_WALL.get());
                        pOutput.accept(ModBlocks.SMOOTHS_VOID_SANDSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.SMOOTHS_VOID_SANDSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.CUT_VOID_SANDSTONE_SLAB.get());

                        pOutput.accept(ModBlocks.FLOWERING_VOID_SAPLING.get());

                        // forest of oblivion
                        pOutput.accept(ModBlocks.SPRUCE_OF_OBLIVION_LEAVES.get());
                        pOutput.accept(ModBlocks.SPRUCE_OF_OBLIVION_LEAVES_2.get());
                        pOutput.accept(ModBlocks.ROOTS_OF_OBLIVION.get());
                        pOutput.accept(ModBlocks.COBBLESTONE_OF_OBLIVION.get());
                        pOutput.accept(ModBlocks.FURNACE_OF_OBLIVION.get());

                        pOutput.accept(ModItems.COPPER_DUST.get());
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
