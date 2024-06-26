package com.spidx_9226.eleutherus_and_void.fluid;

import com.spidx_9226.eleutherus_and_void.Item.ModItems;
import com.spidx_9226.eleutherus_and_void.block.ModBlocks;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public abstract class PortalFluid extends ForgeFlowingFluid {
    public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> ModFluidTypes.PORTAL_FLUID_TYPE.get(), () -> ModFluids.PORTAL_FLUID.get(), () -> ModFluids.FLOWING_PORTAL_FLUID.get())
            .explosionResistance(100f).levelDecreasePerBlock(2).bucket(() -> ModItems.PORTAL_FLUID_BUCKET.get()).block(() -> (LiquidBlock) ModBlocks.PORTAL_FLUID.get());

    private PortalFluid() {
        super(PROPERTIES);
    }

    @Override
    public ParticleOptions getDripParticle() {
        return ParticleTypes.DRIPPING_OBSIDIAN_TEAR;
    }

    public static class Source extends PortalFluid {
        public int getAmount(FluidState state) {
            return 8;
        }

        public boolean isSource(FluidState state) {
            return true;
        }
    }

    public static class Flowing extends PortalFluid {
        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }

        public boolean isSource(FluidState state) {
            return false;
        }
    }
}
