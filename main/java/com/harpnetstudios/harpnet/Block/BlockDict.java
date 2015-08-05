package com.harpnetstudios.harpnet.Block;

import com.harpnetstudios.harpnet.Block.Types.*;
import com.harpnetstudios.harpnet.Item.ItemDict;
import com.harpnetstudios.harpnet.Res.Strings;
import com.harpnetstudios.harpnet.Tabs.TabDict;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;

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
	public static Block harpnet_plank;
	public static Block harpnet_table;
	
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
		scarlet_ore = new Ore(ItemDict.scarlet, true).setBlockName("scarlet_ore").setStepSound(Block.soundTypeStone).setBlockTextureName(Strings.MODID + ":scarlet_ore").setHardness(4.0F).setLightLevel(0.25F).setResistance(-1F);
		scarlet_cake = new Cake(BlockDict.scarlet_cake).setHardness(0.5F).setStepSound(Block.soundTypeCloth).setBlockName("scarlet_cake").setBlockTextureName(Strings.MODID + ":scarlet_cake");
		harpnet_plank = new Plank().setCreativeTab(TabDict.tabHarpNet).setHardness(1.0F).setStepSound(Block.soundTypeWood).setBlockName("harpnet_plank").setBlockTextureName(Strings.MODID + ":planks_harpnet");
		harpnet_table = new Crafting(true).setCreativeTab(TabDict.tabHarpNet).setHardness(1.0F).setStepSound(Block.soundTypeWood).setBlockName("harpnet_table").setBlockTextureName(Strings.MODID + ":harpnet_table");
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
		GameRegistry.registerBlock(harpnet_plank, harpnet_plank.getUnlocalizedName());
		GameRegistry.registerBlock(harpnet_table, harpnet_table.getUnlocalizedName());
	}
}