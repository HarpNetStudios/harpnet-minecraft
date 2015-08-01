package com.harpnetstudios.harpnet.Tabs;

import net.minecraft.creativetab.CreativeTabs;

public class TabDict {
	public static CreativeTabs tabHarpNet;
	
	public static void initializeTabs(){
		tabHarpNet = new TabHarpNet("harpnetTab");
	}
}
