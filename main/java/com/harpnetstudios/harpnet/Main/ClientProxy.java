package com.harpnetstudios.harpnet.Main;

import com.harpnetstudios.harpnet.Entity.Types.*; //Shut up, I know wildcard imports are bad practice. Don't care.
import com.harpnetstudios.harpnet.Model.*;
import com.harpnetstudios.harpnet.Render.RenderHumanoid;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.*;

public class ClientProxy extends ServerProxy {
	public void registerRenderInfo(){
		RenderingRegistry.registerEntityRenderingHandler(HumanTest.class, new RenderHumanoid(new ModelBiped(), "Human", 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(Flandre.class, new RenderHumanoid(new ModelFlandre(), "flandre", 0.3F));
	}
	
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
}
