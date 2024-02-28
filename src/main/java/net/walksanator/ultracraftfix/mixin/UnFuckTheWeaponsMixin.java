package net.walksanator.ultracraftfix.mixin;

import absolutelyaya.ultracraft.item.AbstractWeaponItem;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.walksanator.ultracraftfix.Ultracraftcrashfix;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractWeaponItem.class)
public class UnFuckTheWeaponsMixin {

	/**
	 * @author walksanator
	 * @reason because this crashes when called on physical server so we must unfuck it
	 */
	@Overwrite()
	public boolean isItemBarVisible(ItemStack stack) {
		Ultracraftcrashfix.LOGGER.info("Just prevented a crash!");
		return false;
	}

}