package com.spidx_9226.eleutherus_and_void.worldgen.tree;

import com.spidx_9226.eleutherus_and_void.worldgen.ModConfiguredFeature;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrower {
    public TreeGrower floweringVoidTreeGrower = new TreeGrower("flowering_void", Optional.empty(), Optional.of(ModConfiguredFeature.FLOWERING_VOID_KEY), Optional.empty());
}
