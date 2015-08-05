package com.harpnetstudios.harpnet.Main;

import com.harpnetstudios.harpnet.Block.BlockDict;
import com.harpnetstudios.harpnet.Entity.EntityDict;
import com.harpnetstudios.harpnet.Item.ItemDict;
import com.harpnetstudios.harpnet.Res.Strings;
import com.harpnetstudios.harpnet.Tabs.TabDict;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Strings.MODID, name = Strings.NAME, version = Strings.VERSION)
public class MainRegistry {

	@Mod.Instance(Strings.MODID)
	public static MainRegistry instance;

	@SidedProxy(clientSide = Strings.CLIENTSIDE, serverSide = Strings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		TabDict.initializeTabs();
		ItemDict.mainRegistry();
		BlockDict.mainRegistry();
		CraftingDict.mainRegistry();
		EntityDict.mainRegistry();
		proxy.registerRenderInfo();
	}
	
	@EventHandler
	public static void Load(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
		
	}
}