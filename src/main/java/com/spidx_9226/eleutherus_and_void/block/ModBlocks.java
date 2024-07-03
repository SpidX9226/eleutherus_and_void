package com.spidx_9226.eleutherus_and_void.block;

import com.spidx_9226.eleutherus_and_void.EleutherusAndVoid;
import com.spidx_9226.eleutherus_and_void.Item.ModItems;
import com.spidx_9226.eleutherus_and_void.block.custom.*;
import com.spidx_9226.eleutherus_and_void.fluid.PortalFluidBlock;
import com.spidx_9226.eleutherus_and_void.util.ModWoodTypes;
import com.spidx_9226.eleutherus_and_void.worldgen.ModConfiguredFeature;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Optional;
import java.util.function.Supplier;

public class ModBlocks extends Blocks{
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EleutherusAndVoid.MOD_ID);

    // ORES
    public static final RegistryObject<Block> ELEUTHERUS_ORE = registerBlock("eleutherus_ore",
            () -> new DropExperienceBlock(UniformInt.of(7, 9), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE).sound(SoundType.STONE).lightLevel(value ->{
                return 7;
            })));

    public static final RegistryObject<Block> OBSIDIAN_DUST = registerBlock("obsidian_dust",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_SOIL).sound(SoundType.SAND).lightLevel(value ->{
                return 7;
            })));

    public static final RegistryObject<Block> RANDOM_ORE = registerBlock("random_ore",
            () -> new DropExperienceBlock(UniformInt.of(14, 18), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE).sound(SoundType.STONE).lightLevel(value ->{
                return 5;
            })));
    public static final RegistryObject<Block> DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore",
            () -> new DropExperienceBlock(UniformInt.of(7, 8), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_DIAMOND_ORE).sound(SoundType.STONE)));

    // ELEUTHERUS BLOCKS
    public static final RegistryObject<Block> ELEUTHERUS_BLOCK = registerBlock("eleutherus_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).sound(SoundType.AMETHYST).lightLevel(value -> {
                return 7;
            }).mapColor(MapColor.COLOR_PURPLE)));

    public static final RegistryObject<Block> ELEUTHERUS_LANTERN = registerBlock("eleutherus_lantern",
            () -> new LanternBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_LANTERN).lightLevel(value -> {
                return 14;
            }).mapColor(MapColor.COLOR_PURPLE).noOcclusion()));

    public static final RegistryObject<Block> ELEUTHERUS_ROSE = registerBlock("eleutherus_rose",
            () -> new EleutherusRoseBlock(MobEffects.GLOWING, 8,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY).sound(SoundType.AMETHYST).noOcclusion().lightLevel(value -> {
                        return 5;
                    }).noOcclusion().mapColor(MapColor.COLOR_PURPLE)));

    public static final RegistryObject<Block> POTTED_ELEUTHERUS_ROSE = BLOCKS.register("potted_eleutherus_rose",
            () -> new FlowerPotBlock(null, ModBlocks.ELEUTHERUS_ROSE,
                    BlockBehaviour.Properties.ofFullCopy(Blocks.POTTED_POPPY).sound(SoundType.AMETHYST).noOcclusion().lightLevel(value -> {
                        return 5;
                    }).noOcclusion().mapColor(MapColor.COLOR_PURPLE)));

    public static final RegistryObject<Block> ELEUTHERUS_MAGMA = registerBlock("eleutherus_magma",
            () -> new EleutherusMagmaBlock(
                    BlockBehaviour.Properties.ofFullCopy(Blocks.MAGMA_BLOCK).lightLevel(value -> {
                        return 5;
                    }).noOcclusion().mapColor(MapColor.COLOR_PURPLE)));

    // VOID BLOCKS
    public static final RegistryObject<Block> VOID_PETALS = registerBlock("void_petals",
            () -> new VoidPetalsBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_PETALS).mapColor(MapColor.COLOR_PURPLE)));

    public static final RegistryObject<Block> VOID_DEBRIS = registerBlock("void_debris",
            () -> new VoidDebrisBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANCIENT_DEBRIS).lightLevel(value ->{
                return 3;
            }).mapColor(MapColor.COLOR_BLACK)));

    public static final RegistryObject<Block> VOID_BLOCK = registerBlock("void_block",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).lightLevel(value ->{
                return 3;
            }).mapColor(MapColor.COLOR_BLACK)));

    public static final RegistryObject<Block> FLOWERING_VOID_LEAVES = registerBlock("flowering_void_leaves",
            () -> new FloweringVoidLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES).noOcclusion().lightLevel(value ->{
                return 7;
            }).mapColor(MapColor.COLOR_PURPLE)));

    public static final RegistryObject<Block> RAW_VOID_BLOCK = registerBlock("raw_void_block",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.COLOR_BLACK)));

    public static final RegistryObject<Block> VOID_NYLIUM = registerBlock("void_nylium",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).mapColor(MapColor.COLOR_BLACK).sound(SoundType.NYLIUM)));

    public static final RegistryObject<Block> ELEUTHERUS_RASPBERRY_BUSH = BLOCKS.register("eleutherus_raspberry_bush",
            () -> new EleutherusRaspberryCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SWEET_BERRY_BUSH).mapColor(MapColor.COLOR_BLACK)));

    public static final RegistryObject<Block> VOID_LEAVES = registerBlock("void_leaves",
            () -> new VoidLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES).noOcclusion().mapColor(MapColor.COLOR_BLACK)));

    public static final RegistryObject<Block> VOID_LOG = registerBlock("void_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LOG)));
    public static final RegistryObject<Block> VOID_WOOD = registerBlock("void_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WOOD)));
    public static final RegistryObject<Block> STRIPPED_VOID_LOG = registerBlock("stripped_void_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_CHERRY_LOG)));
    public static final RegistryObject<Block> STRIPPED_VOID_WOOD = registerBlock("stripped_void_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_CHERRY_WOOD)));

    public static final RegistryObject<Block> VOID_PLANKS = registerBlock("void_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> VOID_STAIRS = registerBlock("void_stairs",
            () -> new StairBlock(ModBlocks.VOID_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> VOID_SLAB = registerBlock("void_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SLAB)));
    public static final RegistryObject<Block> VOID_BUTTON = registerBlock("void_button",
            () -> new ButtonBlock(BlockSetType.CHERRY, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_BUTTON)));
    public static final RegistryObject<Block> VOID_PRESSURE_PLATE = registerBlock("void_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PRESSURE_PLATE)));
    public static final RegistryObject<Block> VOID_FENCE = registerBlock("void_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_FENCE)));
    public static final RegistryObject<Block> VOID_FENCE_GATE = registerBlock("void_fence_gate",
            () -> new FenceGateBlock(WoodType.CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_FENCE_GATE)));
    public static final RegistryObject<Block> VOID_DOOR = registerBlock("void_door",
            () -> new DoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_DOOR)));
    public static final RegistryObject<Block> VOID_TRAPDOOR = registerBlock("void_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.CHERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_TRAPDOOR)));

    public static final RegistryObject<Block> VOID_SIGN = BLOCKS.register("void_sign",
            () -> new ModStandingSignBlock(ModWoodTypes.VOID, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SIGN)));
    public static final RegistryObject<Block> VOID_WALL_SIGN = BLOCKS.register("void_wall_sign",
            () -> new ModWallSignBlock(ModWoodTypes.VOID, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WALL_SIGN)));
    public static final RegistryObject<Block> VOID_HANGING_SIGN = BLOCKS.register("void_hanging_sign",
            () -> new ModHangingSignBlock(ModWoodTypes.VOID, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_HANGING_SIGN)));
    public static final RegistryObject<Block> VOID_WALL_HANGING_SIGN = BLOCKS.register("void_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(ModWoodTypes.VOID, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WALL_HANGING_SIGN)));

    // VOID SAND BLOCKS
    public static final RegistryObject<Block> VOID_SAND = registerBlock("void_sand",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SAND)));
    public static final RegistryObject<Block> VOID_SANDSTONE = registerBlock("void_sandstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE)));

    public static final RegistryObject<Block> SMOOTH_VOID_SANDSTONE = registerBlock("smooth_void_sandstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_SANDSTONE)));
    public static final RegistryObject<Block> CUT_VOID_SANDSTONE = registerBlock("cut_void_sandstone",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE)));

    public static final RegistryObject<Block> VOID_SANDSTONE_STAIRS = registerBlock("void_sandstone_stairs",
            () -> new StairBlock(ModBlocks.VOID_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE_STAIRS)));
    public static final RegistryObject<Block> VOID_SANDSTONE_SLAB = registerBlock("void_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE_SLAB)));
    public static final RegistryObject<Block> VOID_SANDSTONE_WALL = registerBlock("void_sandstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE_WALL)));

    public static final RegistryObject<Block> SMOOTHS_VOID_SANDSTONE_STAIRS = registerBlock("smooth_void_sandstone_stairs",
            () -> new StairBlock(ModBlocks.SMOOTH_VOID_SANDSTONE.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_SANDSTONE_STAIRS)));
    public static final RegistryObject<Block> SMOOTHS_VOID_SANDSTONE_SLAB = registerBlock("smooth_void_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_SANDSTONE_SLAB)));
    public static final RegistryObject<Block> CUT_VOID_SANDSTONE_SLAB = registerBlock("cut_void_sandstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CUT_SANDSTONE_SLAB)));

    // BLOCKS FOR FOREST OF OBLIVION
    public static final RegistryObject<Block> SPRUCE_OF_OBLIVION_LEAVES = registerBlock("spruce_of_oblivion_leaves",
            () -> new SpruceOfOblivionLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LEAVES).noOcclusion().lightLevel(value ->{
                return 7;
            })));

    public static final RegistryObject<Block> SPRUCE_OF_OBLIVION_LEAVES_2 = registerBlock("spruce_of_oblivion_leaves_2",
            () -> new SpruceOfOblivionLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_LEAVES).noOcclusion().lightLevel(value ->{
                return 7;
            })));

    public static final RegistryObject<Block> ROOTS_OF_OBLIVION = registerBlock("roots_of_oblivion",
            () -> new RootsOfOblivion(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS).lightLevel(value ->{
                return 3;
            })));

    public static final RegistryObject<Block> COBBLESTONE_OF_OBLIVION = registerBlock("cobblestone_of_oblivion",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE).noOcclusion().lightLevel(value ->{
                return 5;
            })));

    public static final RegistryObject<Block> FURNACE_OF_OBLIVION = registerBlock("furnace_of_oblivion",
            () -> new FurnaceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.FURNACE).lightLevel(value ->{
                return 5;
            })));

    // ELEUTHERUS NATURE BLOCKS
    public static final RegistryObject<Block> ELEUTHERUS_NYLIUM = registerBlock("eleutherus_nylium",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.END_STONE).lightLevel(value -> {
                return 5;
            }).mapColor(MapColor.COLOR_PURPLE).sound(SoundType.NYLIUM)));

    public static final RegistryObject<Block> ELEUTHERUS_WART_BLOCK = registerBlock("eleutherus_wart_block",
            () -> new CryingObsidianBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_WART_BLOCK).lightLevel(value -> {
                return 5;
            }).mapColor(MapColor.COLOR_PURPLE)));

    public static final RegistryObject<Block> ELEUTHERUS_LOG = registerBlock("eleutherus_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_STEM).lightLevel(value -> {
                return 5;
            }).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> ELEUTHERUS_WOOD = registerBlock("eleutherus_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WOOD).lightLevel(value -> {
                return 5;
            }).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> STRIPPED_ELEUTHERUS_LOG = registerBlock("stripped_eleutherus_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_WARPED_STEM).lightLevel(value -> {
                return 5;
            }).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> STRIPPED_ELEUTHERUS_WOOD = registerBlock("stripped_eleutherus_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_CHERRY_WOOD).lightLevel(value -> {
                return 5;
            }).mapColor(MapColor.COLOR_PURPLE)));

    public static final RegistryObject<Block> ELEUTHERUS_PLANKS = registerBlock("eleutherus_planks",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).lightLevel(value -> {
                return 5;
            })));
    public static final RegistryObject<Block> ELEUTHERUS_STAIRS = registerBlock("eleutherus_stairs",
            () -> new StairBlock(ModBlocks.ELEUTHERUS_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).lightLevel(value -> {
                return 5;
            })));
    public static final RegistryObject<Block> ELEUTHERUS_SLAB = registerBlock("eleutherus_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_SLAB).lightLevel(value -> {
                return 5;
            })));
    public static final RegistryObject<Block> ELEUTHERUS_BUTTON = registerBlock("eleutherus_button",
            () -> new ButtonBlock(BlockSetType.WARPED, 10, BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_BUTTON).lightLevel(value -> {
                return 5;
            })));
    public static final RegistryObject<Block> ELEUTHERUS_PRESSURE_PLATE = registerBlock("eleutherus_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.WARPED, BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PRESSURE_PLATE).sound(SoundType.AMETHYST).lightLevel(value -> {
                return 5;
            })));
    public static final RegistryObject<Block> ELEUTHERUS_FENCE = registerBlock("eleutherus_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).sound(SoundType.AMETHYST).lightLevel(value -> {
                return 5;
            })));
    public static final RegistryObject<Block> ELEUTHERUS_FENCE_GATE = registerBlock("eleutherus_fence_gate",
            () -> new FenceGateBlock(WoodType.WARPED, BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).sound(SoundType.AMETHYST).lightLevel(value -> {
                return 5;
            })));
    public static final RegistryObject<Block> ELEUTHERUS_DOOR = registerBlock("eleutherus_door",
            () -> new DoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).sound(SoundType.AMETHYST).noOcclusion().lightLevel(value -> {
                return 5;
            })));
    public static final RegistryObject<Block> ELEUTHERUS_TRAPDOOR = registerBlock("eleutherus_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.WARPED, BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK).sound(SoundType.AMETHYST).noOcclusion().lightLevel(value -> {
                return 5;
            })));

    public static final RegistryObject<Block> ELEUTHERUS_SIGN = BLOCKS.register("eleutherus_sign",
            () -> new ModStandingSignBlock(ModWoodTypes.ELEUTHERUS, BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_SIGN).lightLevel(value -> {
                return 5;
            })));
    public static final RegistryObject<Block> ELEUTHERUS_WALL_SIGN = BLOCKS.register("eleutherus_wall_sign",
            () -> new ModWallSignBlock(ModWoodTypes.ELEUTHERUS, BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_WALL_SIGN).lightLevel(value -> {
                return 5;
            })));
    public static final RegistryObject<Block> ELEUTHERUS_HANGING_SIGN = BLOCKS.register("eleutherus_hanging_sign",
            () -> new ModHangingSignBlock(ModWoodTypes.ELEUTHERUS, BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_HANGING_SIGN).lightLevel(value -> {
                return 5;
            })));
    public static final RegistryObject<Block> ELEUTHERUS_WALL_HANGING_SIGN = BLOCKS.register("eleutherus_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(ModWoodTypes.ELEUTHERUS, BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_WALL_HANGING_SIGN).lightLevel(value -> {
                return 5;
            })));

    // SAPLING
//    public static final RegistryObject<Block> VOID_SAPLING = registerBlock("void_sapling",
//            () -> new ModSaplingBlock(new TreeGrower("void", Optional.empty(), Optional.of(ModConfiguredFeatures.VOID_KEY), Optional.empty()),
//                    BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SAPLING).mapColor(MapColor.COLOR_BLACK), () -> ModBlocks.VOID_NYLIUM.get()));
//
    public static final RegistryObject<Block> FLOWERING_VOID_SAPLING = registerBlock("flowering_void_sapling",
            () -> new ModSaplingBlock(new TreeGrower("flowering_void", Optional.empty(), Optional.of(ModConfiguredFeature.FLOWERING_VOID_KEY), Optional.empty()),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SAPLING).sound(SoundType.AMETHYST).lightLevel(value -> {
                        return 5;
                    }).mapColor(MapColor.COLOR_PURPLE), () -> ModBlocks.VOID_NYLIUM.get()));
//
//    public static final RegistryObject<Block> ELEUTHERUS_FUNGUS = registerBlock("eleutherus_fungus",
//            () -> new ModSaplingBlock(new TreeGrower("eleutherus", Optional.empty(), Optional.of(ModConfiguredFeatures.ELEUTHERUS_KEY), Optional.empty()),
//                    BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_SAPLING).sound(SoundType.AMETHYST).lightLevel(value -> {
//                        return 4;
//                    }).mapColor(MapColor.COLOR_PURPLE), ModBlocks.ELEUTHERUS_NYLIUM));

    public static final RegistryObject<Block> PORTAL_FLUID = registerBlock("portal_fluid", PortalFluidBlock::new);

    public static final RegistryObject<Block> MARBLE = registerBlock("marble",
            ()-> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
