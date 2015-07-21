package net.crazysnailboy.mods.gemology.integration;

import net.crazysnailboy.mods.gemology.common.config.GCConfiguration;
import net.crazysnailboy.mods.gemology.init.GCItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class IndustrialCraftIntegration
{
//	public static Item topazDust, amethystDust;
//	public static boolean pluginLoaded;
//	
//	public static void initPlugin()
//	{
//		try 
//		{
//			Class.forName("ic2.core.item.ItemScrapbox").getMethod("addDrop", ItemStack.class, float.class).invoke(null, new ItemStack(GCItems.blackDiamond, 1, 0), 0.1F);
//			pluginLoaded = true;
//		}
//		catch(Exception e) { pluginLoaded = false; }
//		
//		if (pluginLoaded) postInit();
//		
//	}
//	
//	public static void postInit()
//	{
//		System.out.println("[GemsCraft] IndustrialCraft module loaded!");
//		
//		topazDust = new ItemGemDust(GCConfiguration.dustTopazID - 256).setUnlocalizedName("topazDust");
//		amethystDust = new ItemGemDust(GCConfiguration.dustAmethystID - 256).setUnlocalizedName("amethystDust");
//		MultiLanguageRegistry.addObjectNames(topazDust, "Topaz Dust", "Topasstaub");
//		MultiLanguageRegistry.addObjectNames(amethystDust, "Amethyst Dust", "Amethyststaub");
//		
//		try
//		{
//			Class.forName("ic2.api.Ic2Recipes").getMethod("addMaceratorRecipe", ItemStack.class, ItemStack.class).invoke(null, new ItemStack(GCConfiguration.itemAmethystID, 1, 0), new ItemStack(GCConfiguration.dustAmethystID, 1, 0));
//			Class.forName("ic2.api.Ic2Recipes").getMethod("addMaceratorRecipe", ItemStack.class, ItemStack.class).invoke(null, new ItemStack(GCConfiguration.itemTopazID, 1, 0), new ItemStack(GCConfiguration.dustTopazID, 1, 0));
//
//			Class.forName("ic2.api.Ic2Recipes").getMethod("addMatterAmplifier", ItemStack.class, int.class).invoke(null, new ItemStack(GCConfiguration.itemTopazID, 1, 0), 10000);
//			Class.forName("ic2.api.Ic2Recipes").getMethod("addMatterAmplifier", ItemStack.class, int.class).invoke(null, new ItemStack(GCConfiguration.itemAmethystID, 1, 0), 15000);
//			Class.forName("ic2.api.Ic2Recipes").getMethod("addMatterAmplifier", ItemStack.class, int.class).invoke(null, new ItemStack(GCConfiguration.itemSapphireID, 1, 0), 20000);
//			Class.forName("ic2.api.Ic2Recipes").getMethod("addMatterAmplifier", ItemStack.class, int.class).invoke(null, new ItemStack(GCConfiguration.itemEmeraldID, 1, 0), 30000);
//			Class.forName("ic2.api.Ic2Recipes").getMethod("addMatterAmplifier", ItemStack.class, int.class).invoke(null, new ItemStack(GCConfiguration.itemRubyID, 1, 0), 40000);
//		}
//		catch(Exception e) {}
//	}
}
