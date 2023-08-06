package com.dezzmeister.playernbt.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.dezzmeister.playernbt.command.impl.data.DataCommand;

import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class RegisterCommandsEventListener {
	private static final Logger LOGGER = LogManager.getLogger();

	@SubscribeEvent
	public void receive(final RegisterCommandsEvent event) {
		DataCommand.register(event.getDispatcher());
		LOGGER.info("Registered new /data command (Player NBT Mod)");
	}
}
