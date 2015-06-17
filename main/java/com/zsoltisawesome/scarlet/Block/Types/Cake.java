package com.zsoltisawesome.scarlet.Block.Types;

import com.zsoltisawesome.scarlet.Block.BlockDict;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockCake;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class Cake extends BlockCake{
	public Cake() {
		super();
	}
	@SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        return Item.getItemFromBlock(BlockDict.scarlet_cake);
    }
}
