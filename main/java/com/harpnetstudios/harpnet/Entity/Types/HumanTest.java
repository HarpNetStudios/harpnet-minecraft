package com.harpnetstudios.harpnet.Entity.Types;

import com.harpnetstudios.harpnet.Item.ItemDict;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class HumanTest extends EntityMob{
    public HumanTest(World world) {
        super(world);

        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(2, new EntityAIAvoidEntity(this, EntityLiving.class, 8.0F, 0.6D, 0.6D));
        this.tasks.addTask(3, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(4, new EntityAIMoveIndoors(this));
        this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));

    }

    protected Item getDropItem() {
        return ItemDict.scarlet;
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.46D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0D);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(-1.0D);

    }

    public boolean isAIEnabled()
    {
        return true;
    }
}
