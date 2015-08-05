package com.harpnetstudios.harpnet.Block.Types;

import com.harpnetstudios.harpnet.Item.ItemDict;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldSettings;

public class Debug extends BlockFalling {
    public Debug() {
        super(); // l'ponge
    }

    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player) {
       //player.displayGUIWorkbench((int)player.getPosition(1.0F).xCoord,(int)player.getPosition(1.0F).yCoord,(int)player.getPosition(1.0F).zCoord);
        player.setHealth(player.getHealth() + 2);
        if (player.isSneaking()) {
            player.setPositionAndRotation(x + 0.5D, y + 1 + 0.5D, z + 0.5D, 0F, 0F);
        }else{
            player.addPotionEffect(new PotionEffect(22, 1000000, 1000000, true));
        }
    }

    public void onEntityWalking(World world, int x, int y, int z, Entity entity) {
        entity.setFire(60);
    }
}
