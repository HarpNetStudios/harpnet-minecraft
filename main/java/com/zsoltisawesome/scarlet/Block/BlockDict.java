package com.zsoltisawesome.scarlet.Block;

import com.zsoltisawesome.scarlet.Block.Types.*;
import com.zsoltisawesome.scarlet.Item.ItemDict;
import com.zsoltisawesome.scarlet.Res.Strings;
import com.zsoltisawesome.scarlet.Tabs.TabDict;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCake;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockDict {
	public static void mainRegistry(){
		initializeBlock();
		registerBlock();
	}
	//public static Block ComGold;
	//public static Block KentBlock;
	//public static Block GoldDoor;
	//public static Block BlueRedstoneBlock;
	//public static Block GoldButton;
	//public static Block gRail;
	//public static Block gLadder;
	//public static Block gBrick;
	//public static Block gTrapDoor;
	public static Block scarlet_ore;
	public static Block scarlet_cake;
	
	public static void initializeBlock(){
		//ComGold = new GOBlock(Material.iron).setBlockName("ComGold").setCreativeTab(MCreativeTabs.tabGold).setBlockTextureName(RefStrings.MODID + ":compressed_gold_block").setHardness(7.0F);
		//KentBlock = new GOBlock(Material.iron).setBlockName("KentBlock").setCreativeTab(MCreativeTabs.tabGold).setBlockTextureName(RefStrings.MODID + ":kent_block").setLightLevel(1.0F);
		//GoldDoor = new GOBlockDoor(Material.iron).setHardness(5.0F).setStepSound(Block.soundTypeMetal).setBlockName("gDoor").setBlockTextureName(RefStrings.MODID + ":door_gold");
		//BlueRedstoneBlock = new GORedstoneBlock().setBlockName("BlueRedstoneBlock").setCreativeTab(MCreativeTabs.tabGold).setBlockTextureName(RefStrings.MODID + ":blue_redstone_block").setHardness(5.0F);
		//GoldButton = new GOButtonGold().setBlockName("GoldButton").setCreativeTab(MCreativeTabs.tabGold).setHardness(3.0F);
		//gRail = new GORail().setBlockName("gRail").setCreativeTab(MCreativeTabs.tabGold).setBlockTextureName(RefStrings.MODID + ":rail_cgold").setHardness(0F);
		//gLadder = new GOLadder().setBlockName("gLadder").setCreativeTab(MCreativeTabs.tabGold).setBlockTextureName(RefStrings.MODID + ":gold_ladder").setHardness(2.0F);
		//gBrick = new GOBlock(Material.iron).setBlockName("gBrick").setCreativeTab(MCreativeTabs.tabGold).setBlockTextureName(RefStrings.MODID + ":gold_brick").setHardness(2.0F);
		//gTrapDoor = new GOTrapDoor(Material.iron).setBlockName("gTrapDoor").setCreativeTab(MCreativeTabs.tabGold).setBlockTextureName(RefStrings.MODID + ":gold_trapdoor").setHardness(3.0F);
		scarlet_ore = new Ore(ItemDict.scarlet, true).setBlockName("scarlet_ore").setBlockTextureName(Strings.MODID + ":scarlet_ore").setHardness(4.0F).setLightLevel(0.25F).setResistance(-1F);
		scarlet_cake = new Cake().setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("scarlet_cake").setBlockTextureName(Strings.MODID + ":scarlet_cake");
	}
	public static void registerBlock(){
		//GameRegistry.registerBlock(ComGold, ComGold.getUnlocalizedName());
		//GameRegistry.registerBlock(KentBlock, KentBlock.getUnlocalizedName());
		//GameRegistry.registerBlock(GoldDoor, GoldDoor.getUnlocalizedName());
		//GameRegistry.registerBlock(BlueRedstoneBlock, BlueRedstoneBlock.getUnlocalizedName());
		//GameRegistry.registerBlock(GoldButton, GoldButton.getUnlocalizedName());
		//GameRegistry.registerBlock(gRail, gRail.getUnlocalizedName());
		//GameRegistry.registerBlock(gLadder, gLadder.getUnlocalizedName());
		//GameRegistry.registerBlock(gBrick, gBrick.getUnlocalizedName());
		//GameRegistry.registerBlock(gTrapDoor, gTrapDoor.getUnlocalizedName());
		GameRegistry.registerBlock(scarlet_ore, scarlet_ore.getUnlocalizedName());
		GameRegistry.registerBlock(scarlet_cake, scarlet_cake.getUnlocalizedName());
	}
}
