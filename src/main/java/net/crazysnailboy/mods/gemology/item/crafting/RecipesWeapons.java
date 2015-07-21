package net.crazysnailboy.mods.gemology.item.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.crazysnailboy.mods.gemology.init.GCItems;

public class RecipesWeapons {

    public static void addRecipes()
    {
    	// gemscraft weapons
    	addWeaponRecipes(GCItems.amethyst, GCItems.amethyst_sword);
    	addWeaponRecipes(GCItems.blackdiamond, GCItems.blackdiamond_sword);
    	addWeaponRecipes(Items.emerald, GCItems.emerald_sword);
    	addWeaponRecipes(GCItems.pyrite, GCItems.pyrite_sword);
    	addWeaponRecipes(GCItems.ruby, GCItems.ruby_sword);
    	addWeaponRecipes(GCItems.sapphire, GCItems.sapphire_sword);
    	addWeaponRecipes(GCItems.topaz, GCItems.topaz_sword);
    	
    	// shiny things weapons
    	addWeaponRecipes(GCItems.clinohumite, GCItems.clinohumite_sword);
    	addWeaponRecipes(GCItems.goshenite, GCItems.goshenite_sword);
    	addWeaponRecipes(GCItems.heliodor, GCItems.heliodor_sword);
    	addWeaponRecipes(GCItems.morganite, GCItems.morganite_sword);
    	addWeaponRecipes(GCItems.onyx, GCItems.onyx_sword);
    	addWeaponRecipes(GCItems.turquoise, GCItems.turquoise_sword);
    }
    
    private static void addWeaponRecipes(Item itemMaterial, Item itemSword)
    {
        Item itemStick = (itemMaterial == GCItems.blackdiamond ? GCItems.diamond_stick : Items.stick);
        
        GameRegistry.addRecipe(new ItemStack(itemSword), new Object[] { "X", "X", "#", '#', itemStick, 'X', itemMaterial });
    }

}
