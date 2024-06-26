package com.spidx_9226.eleutherus_and_void.worldgen;

import com.spidx_9226.eleutherus_and_void.EleutherusAndVoid;
import com.spidx_9226.eleutherus_and_void.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeature {

    public static final ResourceKey<PlacedFeature> ELEUTHERUS_ORE_PLACED_KEY = registerKey("eleutherus_ore_placed");

    public static final ResourceKey<PlacedFeature> VOID_TREE_PLACED_KEY = registerKey("void_tree_placed");
    public static final ResourceKey<PlacedFeature> FLOWERING_VOID_TREE_PLACED_KEY = registerKey("flowering_void_tree_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeature = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ELEUTHERUS_ORE_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeature.ELEUTHERUS_ORE_KEY),
                ModOrePlacement.rareOrePlacement(14,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(64))));

        //register(context, VOID_TREE_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeature.VOID_KEY),
        //        VegetationPlacements.treePlacement(PlacementUtils.countExtra(7, 0.1f, 1),
        //                ModBlocks.VOID_SAPLING.get()));

        register(context, FLOWERING_VOID_TREE_PLACED_KEY, configuredFeature.getOrThrow(ModConfiguredFeature.FLOWERING_VOID_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(7, 0.1f, 1),
                        ModBlocks.FLOWERING_VOID_SAPLING.get()));

    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(EleutherusAndVoid.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
