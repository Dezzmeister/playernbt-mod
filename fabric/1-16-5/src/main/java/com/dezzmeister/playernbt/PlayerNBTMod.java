package com.dezzmeister.playernbt;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dezzmeister.playernbt.command.impl.data.DataCommand;

public class PlayerNBTMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LogManager.getLogger("playernbt");
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> DataCommand.register(dispatcher));
		LOGGER.info("Registered new /data command");
	}
}