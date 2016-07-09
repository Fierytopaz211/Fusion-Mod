package com.ridergames.fusion;

public class Reference {
	
	public static final String MODID = "fusion_mod";
	public static final String NAME = "Rider Game's Fusion Mod";
	public static final String VERSION = "Alpha 0.0.1";
	
	public static final String CLIENT_PROXY_CLASS = "com.ridergames.fusion.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.ridergames.fusion.proxy.ServerProxy";
	
	public static final String ACCEPTED_VERSION = "[1.9.4]";
	
	public static enum FusionItems{
		INFUSED_ROD("infused_rod","ItemInfusedRod"),
		MTN("mtn","ItemMTN");
		
		private String unlocalizedName, registryName;
		
		FusionItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName(){
			return unlocalizedName;
		}
		
		public String getRegistryName(){
			return registryName;
		}
		
	}

}
