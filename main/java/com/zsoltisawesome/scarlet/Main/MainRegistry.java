package com.zsoltisawesome.scarlet.Main;

import com.zsoltisawesome.scarlet.Res.Strings;
import com.zsoltisawesome.scarlet.Tabs.TabDict;
import com.zsoltisawesome.scarlet.Block.BlockDict;
import com.zsoltisawesome.scarlet.Item.ItemDict;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Strings.MODID, name = Strings.NAME, version = Strings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = Strings.CLIENTSIDE, serverSide = Strings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		TabDict.initializeTabs();
		ItemDict.mainRegistry();
		BlockDict.mainRegistry();
		CraftingDict.mainRegistry();
		proxy.registerRenderInfo();
	}
	
	@EventHandler
	public static void Load(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
}