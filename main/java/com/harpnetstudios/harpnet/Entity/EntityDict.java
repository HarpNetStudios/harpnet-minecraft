package com.harpnetstudios.harpnet.Entity;

import com.harpnetstudios.harpnet.Entity.Types.*; //Shut up, I know wildcard imports are bad practice. Don't care.
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
        int mainColor; // Main egg color
        int subColor; // Egg spots color
        if (name == "flandre") {
            mainColor = 16720896; // Scarlet (#FF2400)
            subColor = 16777215; // Pure White (#FFFFFF)
        }else{
            mainColor = random.nextInt() * 16777215;
            subColor = random.nextInt() * 16777215;
        }

        EntityRegistry.registerGlobalEntityID(entityClass, name, entityId);
        EntityRegistry.addSpawn(entityClass, 50, 2, 4, EnumCreatureType.monster);
        EntityRegistry.registerModEntity(entityClass, name, entityId, MainRegistry.instance, 64, 1, true);
        EntityList.entityEggs.put(Integer.valueOf(entityId), new EntityList.EntityEggInfo(entityId, mainColor, subColor));
    }

    public static void entityList() {
        addHostile(HumanTest.class, "HumanTest");
        addHostile(Flandre.class, "flandre");
    }
}
