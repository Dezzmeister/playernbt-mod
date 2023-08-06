package com.dezzmeister.playernbt;

import com.dezzmeister.playernbt.command.RegisterCommandsEventListener;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("playernbt")
public class PlayerNBTMod
{
    public PlayerNBTMod() {
        MinecraftForge.EVENT_BUS.register(new RegisterCommandsEventListener());
    }
}
