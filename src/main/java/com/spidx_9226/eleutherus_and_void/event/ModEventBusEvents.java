package com.spidx_9226.eleutherus_and_void.event;

import com.spidx_9226.eleutherus_and_void.EleutherusAndVoid;
import com.spidx_9226.eleutherus_and_void.particle.LeafParticle;
import com.spidx_9226.eleutherus_and_void.particle.ModParticles;
import com.spidx_9226.eleutherus_and_void.particle.VoidAlbinoParticles;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EleutherusAndVoid.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerParticleFactory(final RegisterParticleProvidersEvent event){
        Minecraft.getInstance().particleEngine.register(ModParticles.VOID_LEAVES_PARTICLES.get(),
                LeafParticle.Provider::new);
        Minecraft.getInstance().particleEngine.register(ModParticles.VOID_ALBINO_PARTICLES.get(),
                VoidAlbinoParticles.Provider::new);
        Minecraft.getInstance().particleEngine.register(ModParticles.FLOWERING_VOID_LEAVES_PARTICLES.get(),
                LeafParticle.Provider::new);
    }
}
