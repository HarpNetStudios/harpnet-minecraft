package com.harpnetstudios.harpnet.Tabs;

import com.harpnetstudios.harpnet.Item.ItemDict;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabHarpNet extends CreativeTabs {
	
	public TabHarpNet(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return ItemDict.harpnetLogo;
	}

}
