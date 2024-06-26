package com.spidx_9226.eleutherus_and_void.fluid;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class PortalFluidBlock extends LiquidBlock {
    public PortalFluidBlock() {
        super(ModFluids.PORTAL_FLUID, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.IGNORE).sound(SoundType.EMPTY).replaceable());
    }
}
