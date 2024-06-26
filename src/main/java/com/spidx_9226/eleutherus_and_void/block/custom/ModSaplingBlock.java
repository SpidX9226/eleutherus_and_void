package com.spidx_9226.eleutherus_and_void.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.PlantType;

import java.util.function.Supplier;

public class ModSaplingBlock extends SaplingBlock {
    private Supplier<Block> block;

    public ModSaplingBlock(TreeGrower p_311256_, Properties p_55979_, Supplier<Block> block) {
        super(p_311256_, p_55979_);
        this.block = block;
    }

    @Override
    protected boolean mayPlaceOn(BlockState pState, BlockGetter pLevel, BlockPos pPos) {
        return pState.is(block.get());
    }

    @Override
    public PlantType getPlantType(BlockGetter level, BlockPos pos) {
        return PlantType.get("void");
    }
}
