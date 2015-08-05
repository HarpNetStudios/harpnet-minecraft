package com.harpnetstudios.harpnet.Item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import com.harpnetstudios.harpnet.Tabs.TabDict;
import com.harpnetstudios.harpnet.Res.Strings;

public class ItemDict {
	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
	
	public static ToolMaterial ChargedScarlet = EnumHelper.addToolMaterial("Charged Scarlet", 3, ToolMaterial.EMERALD.getMaxUses()/2, 20.0F, 512.0F, 255);
	//public static ArmorMaterial OCArmor = EnumHelper.addArmorMaterial("Oxydized Compressed Gold", 69, new int[]{5,5,5,5}, 35);
	
	//public static Item gStick;
	//public static Item gIngot;
	public static Item scarlet;
	public static Item enragedScarlet;
	public static Item harpnetLogo;
    public static Item harpnetSword;
    public static Item harpnetSwordCharged;

	public static void initializeItem(){
		scarlet = new Item().setUnlocalizedName("scarlet").setCreativeTab(TabDict.tabHarpNet).setTextureName(Strings.MODID + ":scarlet");
		enragedScarlet = new Item().setUnlocalizedName("enragedScarlet").setCreativeTab(TabDict.tabHarpNet).setTextureName(Strings.MODID + ":eScarlet");
        harpnetLogo = new Item().setUnlocalizedName("harpnetLogo").setCreativeTab(null).setTextureName(Strings.MODID + ":hn");
        harpnetSword = new ItemSword(ToolMaterial.EMERALD).setUnlocalizedName("harpnetSword").setCreativeTab(TabDict.tabHarpNet).setTextureName(Strings.MODID + ":harpnet_sword");
		harpnetSwordCharged = new ItemSword(ChargedScarlet).setUnlocalizedName("harpnetSwordCharged").setCreativeTab(TabDict.tabHarpNet).setTextureName(Strings.MODID + ":harpnet_sword_charged");
		//gStick = new Item().setUnlocalizedName("gStick").setCreativeTab(MCreativeTabs.tabGold).setTextureName(RefStrings.MODID + ":gold_stick");
		//gIngot = new ItemFood(2,0.6F,false).setUnlocalizedName("gIngot").setCreativeTab(MCreativeTabs.tabGold).setTextureName(RefStrings.MODID + ":super_gold_ingot");
	}
	public static void registerItem(){
		GameRegistry.registerItem(scarlet, scarlet.getUnlocalizedName());
		GameRegistry.registerItem(enragedScarlet, enragedScarlet.getUnlocalizedName());
        GameRegistry.registerItem(harpnetLogo, harpnetLogo.getUnlocalizedName());
        GameRegistry.registerItem(harpnetSword, harpnetSword.getUnlocalizedName());
		GameRegistry.registerItem(harpnetSwordCharged, harpnetSwordCharged.getUnlocalizedName());
		//GameRegistry.registerItem(gStick, gStick.getUnlocalizedName());
		//GameRegistry.registerItem(gIngot, gIngot.getUnlocalizedName());
	}
}