package com.spidx_9226.eleutherus_and_void.particle;

import com.spidx_9226.eleutherus_and_void.EleutherusAndVoid;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES,
                    EleutherusAndVoid.MOD_ID);

    public static final RegistryObject<SimpleParticleType> VOID_LEAVES_PARTICLES =
            PARTICLE_TYPES.register("void_leaves_particles", () -> new SimpleParticleType(true));
    public static final RegistryObject<SimpleParticleType> FLOWERING_VOID_LEAVES_PARTICLES =
            PARTICLE_TYPES.register("flowering_void_leaves_particles", () -> new SimpleParticleType(true));
    public static final RegistryObject<SimpleParticleType> VOID_ALBINO_PARTICLES =
            PARTICLE_TYPES.register("void_albino_particles", () -> new SimpleParticleType(true));

    public static void register(IEventBus eventBus){
        PARTICLE_TYPES.register(eventBus);
    }
}