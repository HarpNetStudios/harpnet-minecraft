package com.harpnetstudios.harpnet.Block.Types;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class Door extends BlockDoor{

	private Item doorItem;

	protected Door(Material arg0, Item doorItem) {
		super(arg0);
		this.doorItem = doorItem;
	}
	
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
		return this.doorItem;
	}

}
