package com.spidx_9226.eleutherus_and_void.soud;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.JukeboxSong;

public interface ModJukeboxSongs {
    ResourceKey<JukeboxSong> ELEUTHERUS_POEM = create("13");


    private static ResourceKey<JukeboxSong> create(String name) {
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.withDefaultNamespace(name));
    }

    private static void register(BootstrapContext<JukeboxSong> jukeboxSongBootstrapContext, ResourceKey<JukeboxSong> jukeboxSongResourceKey, Holder.Reference<SoundEvent> soundEventReference, int p_343603_, int p_345058_) {
        jukeboxSongBootstrapContext.register(
                jukeboxSongResourceKey, new JukeboxSong(soundEventReference, Component.translatable(Util.makeDescriptionId("jukebox_song", jukeboxSongResourceKey.location())), (float)p_343603_, p_345058_)
        );
    }

    static void bootstrap(BootstrapContext<JukeboxSong> jukeboxSongBootstrapContext) {
        register(jukeboxSongBootstrapContext, ELEUTHERUS_POEM, ModSounds.ELEUTHERUS_POEM, 116, 1);
    }
}
