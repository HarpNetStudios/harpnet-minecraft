package com.harpnetstudios.harpnet.Main;

import com.harpnetstudios.harpnet.Entity.Types.HumanTest;
import com.harpnetstudios.harpnet.Render.RenderHumanoid;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;

public class ClientProxy extends ServerProxy {
	public void registerRenderInfo(){
		RenderingRegistry.registerEntityRenderingHandler(HumanTest.class, new RenderHumanoid(new ModelBiped(), "Human", 0.3F));
	}
	
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
