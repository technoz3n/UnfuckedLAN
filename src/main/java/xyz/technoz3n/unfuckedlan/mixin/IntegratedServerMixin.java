package xyz.technoz3n.unfuckedlan.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.client.server.IntegratedServer;
import net.minecraft.server.MinecraftServer;

@Mixin(IntegratedServer.class)
public class IntegratedServerMixin {
    @Inject(method = "initServer", at = @At("HEAD"))
    private void forceOfflineMode(CallbackInfoReturnable<Boolean> cir) {
        MinecraftServer server = (MinecraftServer) (Object) this;
        IntegratedServer integratedServer = (IntegratedServer) (Object) this;
		integratedServer.setUsesAuthentication(false);
        xyz.technoz3n.unfuckedlan.UnfuckedLAN.LOGGER.info("Forced integrated server online-mode to FALSE.");
    }
}