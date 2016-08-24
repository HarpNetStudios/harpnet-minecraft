package com.harpnetstudios.harpnet.Block.Types;

import com.harpnetstudios.harpnet.Tabs.TabDict;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EffectBlock extends Block{
    private int effectId;
	private int duration;
	private int amplifier;

	public EffectBlock(int id, int duration, int amplifier){
        super(Material.iron);
        this.effectId = id;
        this.duration = duration*200;
        this.amplifier = amplifier;
        this.setLightLevel(1.0F);
        this.setHardness(1.5F);
        this.setCreativeTab(TabDict.tabHarpNet);
        this.setResistance(10.0F);
    }

	public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_) {
        PotionEffect blockEffect = new PotionEffect(this.effectId, this.duration, this.amplifier);
     }
}
