package com.zsoltisawesome.scarlet.Tabs;

import com.zsoltisawesome.scarlet.Item.ItemDict;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabScarlet extends CreativeTabs {
	
	public TabScarlet(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return ItemDict.scarlet;
	}

}
