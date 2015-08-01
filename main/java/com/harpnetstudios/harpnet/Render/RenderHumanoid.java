package com.harpnetstudios.harpnet.Render;

import com.harpnetstudios.harpnet.Res.Strings;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderHumanoid extends RenderLiving{

    protected ModelBase modelEntity;

    protected ResourceLocation texture = null;

    public RenderHumanoid(ModelBase par1ModelBase, String textureName, float par2) {
        super(par1ModelBase, par2);
        texture = new ResourceLocation(Strings.MODID + ":" + "textures/model/" + textureName + ".png");
        modelEntity = ((ModelBase) mainModel);
    }

    public void render(Entity entity, double x, double y, double z, float u, float v) {
        super.doRender(entity, x, y, z, u, v);
    }

    public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v) {
        render((Entity) entityLiving, x, y, z, u, v);
    }

    public void doRender(Entity entity, double x, double y, double z, float u, float v) {
        render((Entity)entity, x, y, z, u, v);
    }

    protected ResourceLocation getEntityTexture(Entity var1){
        return texture;
    }
}
