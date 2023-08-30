package me.xakeplusplus.emanshriekremover;

import net.minecraft.client.audio.SoundCategory;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(name = "EndermanShriekRemover", modid = "emanshriekremover")
public class EmanShriekRemover {

    @Mod.EventHandler
    public void init (FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void playSound (PlaySoundEvent event) {
        if (event.name == "mob.endermen.death") {
            event.setCanceled(true);
        }
    }
}
