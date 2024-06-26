package com.spidx_9226.eleutherus_and_void.fluid;

import com.spidx_9226.eleutherus_and_void.EleutherusAndVoid;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, EleutherusAndVoid.MOD_ID);
    public static final RegistryObject<FlowingFluid> PORTAL_FLUID = REGISTRY.register("portal_fluid", PortalFluid.Source::new);
    public static final RegistryObject<FlowingFluid> FLOWING_PORTAL_FLUID = REGISTRY.register("flowing_portal_fluid", PortalFluid.Flowing::new);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientSideHandler {
        @SubscribeEvent
        public static void clientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(PORTAL_FLUID.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(FLOWING_PORTAL_FLUID.get(), RenderType.translucent());
        }
    }

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}
