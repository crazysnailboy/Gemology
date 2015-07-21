package net.crazysnailboy.mods.gemology.item.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.crazysnailboy.mods.gemology.init.GCItems;

public class RecipesArmor {

    public static void addRecipes()
    {
    	// gemscraft armour
    	addArmorRecipes(GCItems.amethyst, GCItems.amethyst_helmet, GCItems.amethyst_chestplate, GCItems.amethyst_leggings, GCItems.amethyst_boots);
    	addArmorRecipes(GCItems.blackdiamond, GCItems.blackdiamond_helmet, GCItems.blackdiamond_chestplate, GCItems.blackdiamond_leggings, GCItems.blackdiamond_boots);
    	addArmorRecipes(Items.emerald, GCItems.emerald_helmet, GCItems.emerald_chestplate, GCItems.emerald_leggings, GCItems.emerald_boots);
    	addArmorRecipes(GCItems.ruby, GCItems.ruby_helmet, GCItems.ruby_chestplate, GCItems.ruby_leggings, GCItems.ruby_boots);
    	addArmorRecipes(GCItems.sapphire, GCItems.sapphire_helmet, GCItems.sapphire_chestplate, GCItems.sapphire_leggings, GCItems.sapphire_boots);
    	addArmorRecipes(GCItems.topaz, GCItems.topaz_helmet, GCItems.topaz_chestplate, GCItems.topaz_leggings, GCItems.topaz_boots);
    	
    	// shiny things armour
    	addArmorRecipes(GCItems.clinohumite, GCItems.clinohumite_helmet, GCItems.clinohumite_chestplate, GCItems.clinohumite_leggings, GCItems.clinohumite_boots);
    	addArmorRecipes(GCItems.goshenite, GCItems.goshenite_helmet, GCItems.goshenite_chestplate, GCItems.goshenite_leggings, GCItems.goshenite_boots);
    	addArmorRecipes(GCItems.heliodor, GCItems.heliodor_helmet, GCItems.heliodor_chestplate, GCItems.heliodor_leggings, GCItems.heliodor_boots);
    	addArmorRecipes(GCItems.morganite, GCItems.morganite_helmet, GCItems.morganite_chestplate, GCItems.morganite_leggings, GCItems.morganite_boots);
    	addArmorRecipes(GCItems.onyx, GCItems.onyx_helmet, GCItems.onyx_chestplate, GCItems.onyx_leggings, GCItems.onyx_boots);
    	addArmorRecipes(GCItems.turquoise, GCItems.turquoise_helmet, GCItems.turquoise_chestplate, GCItems.turquoise_leggings, GCItems.turquoise_boots);
    }

    
    private static void addArmorRecipes(Item itemMaterial, Item itemHelmet, Item itemChestplate, Item itemLeggings, Item itemBoots)
    {    
        GameRegistry.addRecipe(new ItemStack(itemHelmet), new Object[] { "XXX", "X X", 'X', itemMaterial });
        GameRegistry.addRecipe(new ItemStack(itemChestplate), new Object[] { "X X", "XXX", "XXX", 'X', itemMaterial });
        GameRegistry.addRecipe(new ItemStack(itemLeggings), new Object[] { "XXX", "X X", "X X", 'X', itemMaterial });
        GameRegistry.addRecipe(new ItemStack(itemBoots), new Object[] { "X X", "X X", 'X', itemMaterial });
    }
    
}
