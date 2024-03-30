package net.walksanator.ucfix.mixin;

import absolutelyaya.ultracraft.item.AbstractWeaponItem;
import net.minecraft.item.ItemStack;
import net.walksanator.ucfix.UltracraftCrashFix;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractWeaponItem.class)
public class UnFuckTheWeaponsMixin {

	/**
	 * @author walksanator
	 * @reason because this crashes when called on physical server so we must unfuck it
	 */
	@Inject(at = @At("HEAD"), method = "isItemBarVisible", cancellable = true, remap = false)
	public void isItemBarVisible(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
		UltracraftCrashFix.LOGGER.info("Just prevented a crash!");
		cir.setReturnValue(false);
	}
}