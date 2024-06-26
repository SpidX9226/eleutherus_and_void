package com.spidx_9226.eleutherus_and_void;

import com.mojang.logging.LogUtils;
import com.spidx_9226.eleutherus_and_void.Item.CreativeModTabs;
import com.spidx_9226.eleutherus_and_void.Item.ModItems;
import com.spidx_9226.eleutherus_and_void.block.ModBlocks;
import com.spidx_9226.eleutherus_and_void.block.entity.ModBlockEntities;
import com.spidx_9226.eleutherus_and_void.effect.ModEffects;
import com.spidx_9226.eleutherus_and_void.fluid.ModFluidTypes;
import com.spidx_9226.eleutherus_and_void.fluid.ModFluids;
import com.spidx_9226.eleutherus_and_void.particle.ModParticles;
import com.spidx_9226.eleutherus_and_void.util.ModWoodTypes;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(EleutherusAndVoid.MOD_ID)
public class EleutherusAndVoid {
    public static final String MOD_ID = "eleutherus_and_void";
    private static final Logger LOGGER = LogUtils.getLogger();

    public EleutherusAndVoid() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

        ModItems.register(modEventBus);

        ModBlocks.register(modEventBus);
        CreativeModTabs.register(modEventBus);
        ModEffects.register(modEventBus);
        ModParticles.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.ELEUTHERUS_ROSE.getId(), ModBlocks.POTTED_ELEUTHERUS_ROSE);
        });
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        LOGGER.info("HELLO from server starting");
    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            Sheets.addWoodType(ModWoodTypes.VOID);
            Sheets.addWoodType(ModWoodTypes.ELEUTHERUS);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ELEUTHERUS_ROSE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_ELEUTHERUS_ROSE.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ELEUTHERUS_LANTERN.get(), RenderType.cutout());
        }
    }
}
