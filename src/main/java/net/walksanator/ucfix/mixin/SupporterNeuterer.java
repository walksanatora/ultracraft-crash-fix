package net.walksanator.ucfix.mixin;

import absolutelyaya.ultracraft.Ultracraft;
import java.util.UUID;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Ultracraft.class)
public class SupporterNeuterer {
    @Inject(at = @At("HEAD"), method = "checkSupporter", cancellable = true, remap = false)
    private static void neuter(UUID uuid, boolean client, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(true);
    }
}
