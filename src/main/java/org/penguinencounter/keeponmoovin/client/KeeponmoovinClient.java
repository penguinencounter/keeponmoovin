package org.penguinencounter.keeponmoovin.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public class KeeponmoovinClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("keeponmoovin");

    @Override
    public void onInitializeClient() {
        LOGGER.warn("keeponmoovin is installed. here be dragons!");
        LOGGER.warn("things may break and it's not my fault");
    }
}
