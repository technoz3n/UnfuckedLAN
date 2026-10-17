package xyz.technoz3n.unfuckedlan;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UnfuckedLAN implements ModInitializer {
	public static final String MOD_ID = "unfuckedlan";
	public static OnlineModeBool onlineModeOption = new OnlineModeBool(true);
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing FUCK YOU LAN! (UnfuckedLAN)");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
