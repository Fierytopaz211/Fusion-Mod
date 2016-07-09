package com.ridergames.fusion;

import com.ridergames.fusion.init.FusionItems;
import com.ridergames.fusion.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name= Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSION)
public class FusionMain {
	
	@Instance
	public static FusionMain fm;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		System.out.println("Pre Init Online");
		
		FusionItems.init();
		FusionItems.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e){
		System.out.println("Init Online");
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e){
		System.out.println("Post Init Online");
	}

}
