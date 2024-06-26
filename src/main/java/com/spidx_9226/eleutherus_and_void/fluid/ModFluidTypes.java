package com.spidx_9226.eleutherus_and_void.fluid;

import com.spidx_9226.eleutherus_and_void.EleutherusAndVoid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, EleutherusAndVoid.MOD_ID);
    public static final RegistryObject<FluidType> PORTAL_FLUID_TYPE = REGISTRY.register("example_fluid", PortalFluidType::new);

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}
