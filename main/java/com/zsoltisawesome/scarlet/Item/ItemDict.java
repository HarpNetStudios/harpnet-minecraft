package com.zsoltisawesome.scarlet.Item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;
import com.zsoltisawesome.scarlet.Tabs.TabDict;
import com.zsoltisawesome.scarlet.Res.Strings;

public class ItemDict {
	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	//public static ToolMaterial CGold = EnumHelper.addToolMaterial("Compressed Gold", 3, 9001, 18.0F, 4.5F, 35);
	//public static ArmorMaterial OCArmor = EnumHelper.addArmorMaterial("Oxydized Compressed Gold", 69, new int[]{5,5,5,5}, 35);
	
	//public static Item gStick;
	//public static Item gIngot;
	public static Item scarlet;
	public static Item enragedScarlet;
	
	public static void initializeItem(){
		scarlet = new Item().setUnlocalizedName("scarlet").setCreativeTab(TabDict.tabScarlet).setTextureName(Strings.MODID + ":scarlet");
		enragedScarlet = new Item().setUnlocalizedName("enragedScarlet").setCreativeTab(TabDict.tabScarlet).setTextureName(Strings.MODID + ":eScarlet");
		//gStick = new Item().setUnlocalizedName("gStick").setCreativeTab(MCreativeTabs.tabGold).setTextureName(RefStrings.MODID + ":gold_stick");
		//gIngot = new ItemFood(2,0.6F,false).setUnlocalizedName("gIngot").setCreativeTab(MCreativeTabs.tabGold).setTextureName(RefStrings.MODID + ":super_gold_ingot");
	}
	public static void registerItem(){
		GameRegistry.registerItem(scarlet, scarlet.getUnlocalizedName());
		GameRegistry.registerItem(enragedScarlet, enragedScarlet.getUnlocalizedName());
		//GameRegistry.registerItem(gStick, gStick.getUnlocalizedName());
		//GameRegistry.registerItem(gIngot, gIngot.getUnlocalizedName());
	}
}