package net.crazysnailboy.mods.gemology.item.crafting;

import net.crazysnailboy.mods.gemology.init.GCBlocks;
import net.crazysnailboy.mods.gemology.init.GCItems;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class GCCraftingManager 
{
	public static void addCraftingRecipes()
	{
		RecipesIngots.addRecipes();
		RecipesTools.addRecipes();
		RecipesWeapons.addRecipes();
		RecipesArmor.addRecipes();
		
		
//		GameRegistry.addRecipe(new ItemStack(GCItems.diamondStick, 4), new Object[] { "D", "D", 'D', Item.diamond });
	}

	public static void addOreDictEntries()
	{
		OreDictionary.registerOre("gemAmethyst", GCItems.amethyst);
		OreDictionary.registerOre("gemBlackDiamond", GCItems.blackdiamond);
		OreDictionary.registerOre("gemPyrite", GCItems.pyrite);
		OreDictionary.registerOre("gemRuby", GCItems.ruby);
		OreDictionary.registerOre("gemSapphire", GCItems.sapphire);
		OreDictionary.registerOre("gemTopaz", GCItems.topaz);
		
		OreDictionary.registerOre("gemClinohumite", GCItems.clinohumite);
		OreDictionary.registerOre("gemGoshenite", GCItems.goshenite);
		OreDictionary.registerOre("gemHeliodor", GCItems.heliodor);
		OreDictionary.registerOre("gemMorganite", GCItems.morganite);
		OreDictionary.registerOre("gemOnyx", GCItems.onyx);
		OreDictionary.registerOre("gemTurquoise", GCItems.turquoise);
	}
}