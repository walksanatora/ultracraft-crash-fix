package net.walksanator.ucfix.mixin;

import absolutelyaya.ultracraft.client.UltracraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(UltracraftClient.class)
public class SupporterNeutererClient {
    @Inject(at = @At("HEAD"), method = "isSupporter", cancellable = true, remap = false)
    private static void neuter(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "refreshSupporter", cancellable = true, remap = false)
    private static void neuterThisOneToo(CallbackInfo ci) {
        ci.cancel();
    }
}
