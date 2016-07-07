package com.ridergames.fusion.init;

import com.ridergames.fusion.Reference;
import com.ridergames.fusion.items.ItemInfusedRod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FusionItems {
	
	public static Item infused_rod;
	
	public static void init(){
		infused_rod = new ItemInfusedRod();
	}
	
	public static void register(){
		GameRegistry.register(infused_rod);
	}
	
	public static void registerRenders(){
		registerRender(infused_rod);
	}
	
	private static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
