package com.harpnetstudios.harpnet.Entity.Types;

import com.harpnetstudios.harpnet.Item.ItemDict;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Flandre extends EntityMob{
    public Flandre(World world) {
        super(world);
        this.getNavigator().setBreakDoors(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, Entity.class, 1.0D, false));
        this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
        //this.tasks.addTask(4, new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0D, true));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
        this.tasks.addTask(6, new EntityAIMoveThroughVillage(this, 1.0D, false));
        //this.tasks.addTask(7, new EntityAIWander(this, 0.1D));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, Entity.class, 32.0F));
        //this.tasks.addTask(8, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, Entity.class, 0, false));
        this.setCurrentItemOrArmor(0, new ItemStack(Item.getItemFromBlock(Blocks.red_flower)));
        this.addPotionEffect(new PotionEffect(10,-1,3));
    }

    protected Item getDropItem() {
        return ItemDict.enragedScarlet;
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(80.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(400.0D);
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(1.0D);

    }

    public boolean isAIEnabled()
    {
        return true;
    }

    protected void addRandomArmor()
    {
        //this.setCurrentItemOrArmor(0, new ItemStack(Item.getItemFromBlock(Blocks.red_flower)));
    }
}
