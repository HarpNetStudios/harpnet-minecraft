package com.harpnetstudios.harpnet.Main;

import com.harpnetstudios.harpnet.Block.BlockDict;
import com.harpnetstudios.harpnet.Item.ItemDict;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingDict {
	public static void mainRegistry(){
		addCraftingRec();
		addFurnaceRec();
	}
	public static void addCraftingRec(){
		//Shaped
		GameRegistry.addRecipe(new ItemStack(ItemDict.enragedScarlet, 1), new Object []{"GDG","DSD","GDG",'G',Blocks.glass_pane,'D',new ItemStack(Items.dye, 1, 1),'S',ItemDict.scarlet});
		GameRegistry.addRecipe(new ItemStack(BlockDict.scarlet_cake, 1), new Object[]{"Y","X",'X',Items.cake,'Y',ItemDict.scarlet});
		GameRegistry.addRecipe(new ItemStack(ItemDict.harpnetSword), new Object[]{"ZXZ","ZXZ","ZYZ",'X',Blocks.glass,'Y',Items.stick,'Z',ItemDict.scarlet});
        GameRegistry.addRecipe(new ItemStack(ItemDict.harpnetSwordCharged), new Object[]{"XY",'X',ItemDict.enragedScarlet,'Y',ItemDict.harpnetSword});
        //GameRegistry.addRecipe(new ItemStack(ItemDict.harpnetSwordCharged), new Object[]{"XY",'X',ItemDict.enragedScarlet,'Y',ItemDict.harpnetSwordCharged});
		//GameRegistry.addRecipe(new ItemStack(MBlock.ComGold, 1), new Object[]{"XXX","XXX","XXX",'X',Blocks.gold_block});
		//GameRegistry.addRecipe(new ItemStack(MBlock.ComGold, 1), new Object[]{"XXX","XXX","XXX",'X',MItem.gIngot});
		//GameRegistry.addRecipe(new ItemStack(MItem.gStick, 1), new Object[]{"XXX","XYX","XXX",'X',MItem.gIngot, 'Y',Items.stick});
		//GameRegistry.addRecipe(new ItemStack(MItem.gHelm), new Object[]{"XXX","X X",'X',MItem.gIngot});
		//GameRegistry.addRecipe(new ItemStack(MItem.gTorso), new Object[]{"X X", "XXX", "XXX",'X',MItem.gIngot});
		//GameRegistry.addRecipe(new ItemStack(MItem.gPants), new Object[]{"XXX", "X X", "X X",'X',MItem.gIngot});
		//GameRegistry.addRecipe(new ItemStack(MItem.gBoots), new Object[]{"X X", "X X", 'X',MItem.gIngot});
		//GameRegistry.addRecipe(new ItemStack(MItem.gDoorGold), new Object[]{"XX","XX","XX",'X',MBlock.ComGold});
		//GameRegistry.addRecipe(new ItemStack(MBlock.gBrick), new Object[]{"XX","XX",'X',MItem.gIngot});
		//GameRegistry.addRecipe(new ItemStack(MBlock.gTrapDoor), new Object[]{"XXX","XXX",'X',MItem.gIngot});
		//GameRegistry.addRecipe(new ItemStack(MItem.gSuperPick), new Object[]{"XXX"," Y "," Y ",'X',MItem.gIngot,'Y',MItem.gStick});
		//GameRegistry.addRecipe(new ItemStack(MItem.gSuperSword), new Object[]{" X "," X "," Y ",'X',MItem.gIngot,'Y',MItem.gStick});
		//GameRegistry.addRecipe(new ItemStack(MItem.gSuperAxe), new Object[]{"XX ","XY "," Y ",'X',MItem.gIngot,'Y',MItem.gStick});
		//GameRegistry.addRecipe(new ItemStack(MItem.gSuperSpade), new Object[]{" X "," Y "," Y ",'X',MItem.gIngot,'Y',MItem.gStick});
		//GameRegistry.addRecipe(new ItemStack(MItem.gSuperHoe), new Object[]{"XX "," Y "," Y ",'X',MItem.gIngot,'Y',MItem.gStick});
		//Shapeless
		//GameRegistry.addShapelessRecipe(new ItemStack(MItem.gIngot, 9), new ItemStack(MBlock.ComGold, 1));
	}
	public static void addFurnaceRec(){
		//GameRegistry.addSmelting(Blocks.gold_block, new ItemStack(MItem.gIngot, 1), 20.0F);
		//GameRegistry.addSmelting(MBlock.ComGold, new ItemStack(MBlock.BlueRedstoneBlock, 1), 20.0F);
		//GameRegistry.addSmelting(MItem.gHelm, new ItemStack(MItem.gOHelm, 1), 0.0F);
		//GameRegistry.addSmelting(MItem.gTorso, new ItemStack(MItem.gOTorso, 1), 0.0F);
		//GameRegistry.addSmelting(MItem.gPants, new ItemStack(MItem.gOPants, 1), 0.0F);
		//GameRegistry.addSmelting(MItem.gBoots, new ItemStack(MItem.gOBoots, 1), 0.0F);
	}
}
