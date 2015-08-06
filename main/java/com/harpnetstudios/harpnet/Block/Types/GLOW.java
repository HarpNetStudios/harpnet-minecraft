package com.harpnetstudios.harpnet.Block.Types;

import com.harpnetstudios.harpnet.Tabs.TabDict;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GLOW extends Block{
    public GLOW(){
        super(Material.iron);
        this.setLightLevel(1.0F);
        this.setHardness(1.5F);
        this.setCreativeTab(TabDict.tabHarpNet);
        this.setResistance(10.0F);
    }
}
