package net.crazysnailboy.mods.gemology.proxy;

import net.crazysnailboy.mods.gemology.init.GCBlocks;
import net.crazysnailboy.mods.gemology.init.GCItems;



public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders()
	{
		GCBlocks.registerModels();
		GCItems.registerModels();
	}

}
