package net.crazysnailboy.mods.gemology.item.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.crazysnailboy.mods.gemology.init.GCItems;

public class RecipesTools {

    public static void addRecipes()
    {
    	// gemscraft tools
    	addToolRecipes(GCItems.amethyst, GCItems.amethyst_pickaxe, GCItems.amethyst_shovel, GCItems.amethyst_axe, GCItems.amethyst_hoe);
    	addToolRecipes(GCItems.blackdiamond, GCItems.blackdiamond_pickaxe, GCItems.blackdiamond_shovel, GCItems.blackdiamond_axe, GCItems.blackdiamond_hoe);
    	addToolRecipes(Items.emerald, GCItems.emerald_pickaxe, GCItems.emerald_shovel, GCItems.emerald_axe, GCItems.emerald_hoe);
    	addToolRecipes(GCItems.pyrite, GCItems.pyrite_pickaxe, GCItems.pyrite_shovel, GCItems.pyrite_axe, GCItems.pyrite_hoe);
    	addToolRecipes(GCItems.ruby, GCItems.ruby_pickaxe, GCItems.ruby_shovel, GCItems.ruby_axe, GCItems.ruby_hoe);
    	addToolRecipes(GCItems.sapphire, GCItems.sapphire_pickaxe, GCItems.sapphire_shovel, GCItems.sapphire_axe, GCItems.sapphire_hoe);
    	addToolRecipes(GCItems.topaz, GCItems.topaz_pickaxe, GCItems.topaz_shovel, GCItems.topaz_axe, GCItems.topaz_hoe);
    	
    	// shiny things tools
    	addToolRecipes(GCItems.clinohumite, GCItems.clinohumite_pickaxe, GCItems.clinohumite_shovel, GCItems.clinohumite_axe, GCItems.clinohumite_hoe);
    	addToolRecipes(GCItems.goshenite, GCItems.goshenite_pickaxe, GCItems.goshenite_shovel, GCItems.goshenite_axe, GCItems.goshenite_hoe);
    	addToolRecipes(GCItems.heliodor, GCItems.heliodor_pickaxe, GCItems.heliodor_shovel, GCItems.heliodor_axe, GCItems.heliodor_hoe);
    	addToolRecipes(GCItems.morganite, GCItems.morganite_pickaxe, GCItems.morganite_shovel, GCItems.morganite_axe, GCItems.morganite_hoe);
    	addToolRecipes(GCItems.onyx, GCItems.onyx_pickaxe, GCItems.onyx_shovel, GCItems.onyx_axe, GCItems.onyx_hoe);
    	addToolRecipes(GCItems.turquoise, GCItems.turquoise_pickaxe, GCItems.turquoise_shovel, GCItems.turquoise_axe, GCItems.turquoise_hoe);
    }
    
    
    private static void addToolRecipes(Item itemMaterial, Item itemPickaxe, Item itemShovel, Item itemAxe, Item itemHoe)
    {
        Item itemStick = (itemMaterial == GCItems.blackdiamond ? GCItems.diamond_stick : Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(itemPickaxe), new Object[] { "XXX", " # ", " # ", '#', itemStick, 'X', itemMaterial });
        GameRegistry.addRecipe(new ItemStack(itemShovel), new Object[] { "X", "#", "#", '#', itemStick, 'X', itemMaterial });
        GameRegistry.addRecipe(new ItemStack(itemAxe), new Object[] { "XX", "X#", " #", '#', itemStick, 'X', itemMaterial });
        GameRegistry.addRecipe(new ItemStack(itemHoe), new Object[] { "XX", " #", " #", '#', itemStick, 'X', itemMaterial });
    }
    
}
