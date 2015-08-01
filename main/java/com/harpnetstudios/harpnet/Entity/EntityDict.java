package com.harpnetstudios.harpnet.Entity;

import com.harpnetstudios.harpnet.Entity.Types.HumanTest;
import com.harpnetstudios.harpnet.Main.MainRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;

import java.util.Random;

public class EntityDict {
    public static void mainRegistry() {
        entityList();
    }

    public static void addHostile(Class entityClass, String name) {
        int entityId = EntityRegistry.findGlobalUniqueEntityId();
        long x = name.hashCode();
        Random random = new Random(x);
        int mainColor = random.nextInt() * 16777215;
        int subColor = random.nextInt() * 16777215;

        EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
        EntityRegistry.addSpawn(entityClass, 50, 2, 4, EnumCreatureType.monster);
        EntityRegistry.registerModEntity(entityClass, name, entityId, MainRegistry.instance, 64, 1, true);
        EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, mainColor, subColor));
    }

    public static void entityList() {
        addHostile(HumanTest.class, "HumanTest");
    }
}
