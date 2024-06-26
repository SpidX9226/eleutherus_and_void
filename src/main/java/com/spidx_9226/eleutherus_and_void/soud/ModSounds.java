package com.spidx_9226.eleutherus_and_void.soud;

import com.spidx_9226.eleutherus_and_void.EleutherusAndVoid;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, EleutherusAndVoid.MOD_ID);

    public static final Holder.Reference<SoundEvent> ELEUTHERUS_POEM = registerForHolder("eleutherus_poem");

    private static Holder.Reference<SoundEvent> registerForHolder(String p_263391_) {
        return registerForHolder(String.valueOf(ResourceLocation.fromNamespaceAndPath(EleutherusAndVoid.MOD_ID, p_263391_)));
    }

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
