package org.penguinencounter.keeponmoovin.client.mixin;

import net.fabricmc.fabric.impl.networking.client.ClientLoginNetworkAddon;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.Identifier;
import org.penguinencounter.keeponmoovin.client.KeeponmoovinClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientLoginNetworkAddon.class)
public abstract class Ono {
    @Inject(at = @At(value="INVOKE", target = "Lorg/slf4j/Logger;error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", shift = At.Shift.AFTER), method = "handlePacket(ILnet/minecraft/util/Identifier;Lnet/minecraft/network/PacketByteBuf;)Z", cancellable = true)
    private void doNotAbort(int queryId, Identifier channelName, PacketByteBuf originalBuf, CallbackInfoReturnable<Boolean> cir) {
        KeeponmoovinClient.LOGGER.error("continuing anyway...");
        cir.setReturnValue(true);
        cir.cancel();
    }
}
