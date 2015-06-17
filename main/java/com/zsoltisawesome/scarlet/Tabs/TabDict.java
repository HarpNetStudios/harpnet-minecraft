package com.zsoltisawesome.scarlet.Tabs;

import com.zsoltisawesome.scarlet.Item.ItemDict;

import net.minecraft.creativetab.CreativeTabs;

public class TabDict {
	public static CreativeTabs tabScarlet;
	
	public static void initializeTabs(){
		tabScarlet = new TabScarlet("scarletTab");
	}
}
