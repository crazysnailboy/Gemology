package net.crazysnailboy.mods.gemology;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.crazysnailboy.mods.gemology.common.config.GCConfiguration;
import net.crazysnailboy.mods.gemology.init.GCBlocks;
import net.crazysnailboy.mods.gemology.init.GCItems;
import net.crazysnailboy.mods.gemology.item.crafting.GCCraftingManager;
import net.crazysnailboy.mods.gemology.proxy.CommonProxy;
import net.crazysnailboy.mods.gemology.util.GCEnums;
import net.crazysnailboy.mods.gemology.world.gen.feature.WorldGenGemsCraft;

@Mod(modid = GemologyMod.MOD_ID, name = GemologyMod.MOD_NAME, version = GemologyMod.MOD_VERSION)
public class GemologyMod
{
	public static final String MOD_ID = "gemology";
	public static final String MOD_NAME = "Gemology";
	public static final String MOD_VERSION = "0.1";
	
	private static final String CLIENT_PROXY_CLASS = "net.crazysnailboy.mods.gemology.proxy.ClientProxy";
	private static final String SERVER_PROXY_CLASS = "net.crazysnailboy.mods.gemology.proxy.CommonProxy";

	@SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{		
		GCConfiguration.loadConfig(new Configuration(event.getSuggestedConfigurationFile()));
		
		GCBlocks.initBlocks();
		GCItems.initializeItems();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
		GCBlocks.registerBlocks();
		GCItems.registerItems();

		
		GCCraftingManager.addCraftingRecipes();
		GCCraftingManager.addOreDictEntries();
		GCEnums.setHarvestLevels();
		
		int modGenerationWeight = 12; // total guess
		GameRegistry.registerWorldGenerator(new WorldGenGemsCraft(), modGenerationWeight);
		
		proxy.registerRenders();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		//IndustrialCraftIntegration.initPlugin();
		//GregTechIntegration.initPlugin();
	}
}