package net.crazysnailboy.mods.gemology.item.crafting;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.crazysnailboy.mods.gemology.block.BlockGem;
import net.crazysnailboy.mods.gemology.init.GCBlocks;
import net.crazysnailboy.mods.gemology.init.GCItems;

public class RecipesIngots {

	public static void addRecipes()
	{
		// gemscraft items
		addIngotRecipes(BlockGem.EnumType.AMETHYST, GCItems.amethyst);
		addIngotRecipes(BlockGem.EnumType.BLACKDIAMOND, GCItems.blackdiamond);
		addIngotRecipes(BlockGem.EnumType.PYRITE, GCItems.pyrite);
		addIngotRecipes(BlockGem.EnumType.RUBY, GCItems.ruby);
		addIngotRecipes(BlockGem.EnumType.SAPPHIRE, GCItems.sapphire);
		addIngotRecipes(BlockGem.EnumType.TOPAZ, GCItems.topaz);
		
		// shiny things items
		addIngotRecipes(BlockGem.EnumType.CLINOHUMITE, GCItems.clinohumite);
		addIngotRecipes(BlockGem.EnumType.GOSHENITE, GCItems.goshenite);
		addIngotRecipes(BlockGem.EnumType.HELIODOR, GCItems.heliodor);
		addIngotRecipes(BlockGem.EnumType.MORGANITE, GCItems.morganite);
		addIngotRecipes(BlockGem.EnumType.ONYX, GCItems.onyx);
		addIngotRecipes(BlockGem.EnumType.TURQUOISE, GCItems.turquoise);
	}
	
	private static void addIngotRecipes(BlockGem.EnumType variant, Item item)
	{
		ItemStack blockStack = new ItemStack(GCBlocks.blockGem, 1, variant.getMetadata());
		ItemStack itemStack = new ItemStack(item, 9);
		
		GameRegistry.addRecipe(blockStack, new Object[] { "###", "###", "###", '#', itemStack });
		GameRegistry.addRecipe(itemStack, new Object[] { "#", '#', blockStack }); 
	}
	
}
