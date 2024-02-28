package net.walksanator.ultracraftfix;

import com.bawnorton.mixinsquared.api.MixinCanceller;

import java.util.List;
import java.util.Objects;

public class ReturnNormalInventoryTick implements MixinCanceller {
    @Override
    public boolean shouldCancel(List<String> targetClassNames, String mixinClassName) {
        if (Objects.equals(mixinClassName, "absolutelyaya.ultracraft.mixin.PlayerInventoryMixin")) {
            Ultracraftcrashfix.LOGGER.info("disabling PlayerInventoryMixin of ultracraft");
        }
        return Objects.equals(mixinClassName, "absolutelyaya.ultracraft.mixin.PlayerInventoryMixin");
    }
}
