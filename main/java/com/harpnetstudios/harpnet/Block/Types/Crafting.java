package com.harpnetstudios.harpnet.Block.Types;

import net.minecraft.block.BlockWorkbench;

public class Crafting extends BlockWorkbench {
    public Crafting(Boolean slippy) {
        super();
        if (slippy) {
            this.slipperiness = 0.98F;
        }
    }
}
