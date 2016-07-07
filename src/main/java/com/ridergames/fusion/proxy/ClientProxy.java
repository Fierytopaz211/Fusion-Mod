package com.ridergames.fusion.proxy;

import com.ridergames.fusion.init.FusionItems;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		FusionItems.registerRenders();
	}

}
