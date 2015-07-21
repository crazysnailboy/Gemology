package net.crazysnailboy.mods.gemology.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.crazysnailboy.mods.gemology.GemologyMod;
import net.crazysnailboy.mods.gemology.common.config.GCConfiguration;
import net.crazysnailboy.mods.gemology.item.ItemGem;
import net.crazysnailboy.mods.gemology.item.ItemGemArmor;
import net.crazysnailboy.mods.gemology.item.ItemGemAxe;
import net.crazysnailboy.mods.gemology.item.ItemGemHoe;
import net.crazysnailboy.mods.gemology.item.ItemGemPickaxe;
import net.crazysnailboy.mods.gemology.item.ItemGemSpade;
import net.crazysnailboy.mods.gemology.item.ItemGemSword;

public class GCItems
{
	// GEMS
	public static final Item amethyst = new Item();
	public static final Item blackdiamond = new Item();
	public static final Item clinohumite = new Item();
	public static final Item goshenite = new Item();
	public static final Item heliodor = new Item();
	public static final Item morganite = new Item();
	public static final Item onyx = new Item();
	public static final Item pyrite = new Item();
	public static final Item ruby = new Item();
	public static final Item sapphire = new Item();
	public static final Item topaz = new Item();
	public static final Item turquoise = new Item();

	
	// TOOLS AND WEAPONS
	// amethyst
	public static final Item amethyst_axe = new ItemGemAxe(ItemGem.ToolMaterial.AMETHYST);
	public static final Item amethyst_hoe = new ItemGemHoe(ItemGem.ToolMaterial.AMETHYST);
	public static final Item amethyst_pickaxe = new ItemGemPickaxe(ItemGem.ToolMaterial.AMETHYST);
	public static final Item amethyst_shovel = new ItemGemSpade(ItemGem.ToolMaterial.AMETHYST);
	public static final Item amethyst_sword = new ItemGemSword(ItemGem.ToolMaterial.AMETHYST);
	// black diamond
	public static final Item blackdiamond_axe = new ItemGemAxe(ItemGem.ToolMaterial.BLACKDIAMOND);
	public static final Item blackdiamond_hoe = new ItemGemHoe(ItemGem.ToolMaterial.BLACKDIAMOND);
	public static final Item blackdiamond_pickaxe = new ItemGemPickaxe(ItemGem.ToolMaterial.BLACKDIAMOND);
	public static final Item blackdiamond_shovel = new ItemGemSpade(ItemGem.ToolMaterial.BLACKDIAMOND);
	public static final Item blackdiamond_sword = new ItemGemSword(ItemGem.ToolMaterial.BLACKDIAMOND);
	// clinohumite
	public static final Item clinohumite_axe = new ItemGemAxe(ItemGem.ToolMaterial.CLINOHUMITE);
	public static final Item clinohumite_hoe = new ItemGemHoe(ItemGem.ToolMaterial.CLINOHUMITE);
	public static final Item clinohumite_pickaxe = new ItemGemPickaxe(ItemGem.ToolMaterial.CLINOHUMITE);
	public static final Item clinohumite_shovel = new ItemGemSpade(ItemGem.ToolMaterial.CLINOHUMITE);
	public static final Item clinohumite_sword = new ItemGemSword(ItemGem.ToolMaterial.CLINOHUMITE);
	// emerald 
	public static final Item emerald_axe = new ItemGemAxe(ItemGem.ToolMaterial.EMERALD);
	public static final Item emerald_hoe = new ItemGemHoe(ItemGem.ToolMaterial.EMERALD);
	public static final Item emerald_pickaxe = new ItemGemPickaxe(ItemGem.ToolMaterial.EMERALD);
	public static final Item emerald_shovel = new ItemGemSpade(ItemGem.ToolMaterial.EMERALD);
	public static final Item emerald_sword = new ItemGemSword(ItemGem.ToolMaterial.EMERALD);
	// goshenite
	public static final Item goshenite_axe = new ItemGemAxe(ItemGem.ToolMaterial.GOSHENITE);
	public static final Item goshenite_hoe = new ItemGemHoe(ItemGem.ToolMaterial.GOSHENITE);
	public static final Item goshenite_pickaxe = new ItemGemPickaxe(ItemGem.ToolMaterial.GOSHENITE);
	public static final Item goshenite_shovel = new ItemGemSpade(ItemGem.ToolMaterial.GOSHENITE);
	public static final Item goshenite_sword = new ItemGemSword(ItemGem.ToolMaterial.GOSHENITE);
	// heliodor
	public static final Item heliodor_axe = new ItemGemAxe(ItemGem.ToolMaterial.HELIODOR);
	public static final Item heliodor_hoe = new ItemGemHoe(ItemGem.ToolMaterial.HELIODOR);
	public static final Item heliodor_pickaxe = new ItemGemPickaxe(ItemGem.ToolMaterial.HELIODOR);
	public static final Item heliodor_shovel = new ItemGemSpade(ItemGem.ToolMaterial.HELIODOR);
	public static final Item heliodor_sword = new ItemGemSword(ItemGem.ToolMaterial.HELIODOR);
	// morganite
	public static final Item morganite_axe = new ItemGemAxe(ItemGem.ToolMaterial.MORGANITE);
	public static final Item morganite_hoe = new ItemGemHoe(ItemGem.ToolMaterial.MORGANITE);
	public static final Item morganite_pickaxe = new ItemGemPickaxe(ItemGem.ToolMaterial.MORGANITE);
	public static final Item morganite_shovel = new ItemGemSpade(ItemGem.ToolMaterial.MORGANITE);
	public static final Item morganite_sword = new ItemGemSword(ItemGem.ToolMaterial.MORGANITE);
	// onyx
	public static final Item onyx_axe = new ItemGemAxe(ItemGem.ToolMaterial.ONYX);
	public static final Item onyx_hoe = new ItemGemHoe(ItemGem.ToolMaterial.ONYX);
	public static final Item onyx_pickaxe = new ItemGemPickaxe(ItemGem.ToolMaterial.ONYX);
	public static final Item onyx_shovel = new ItemGemSpade(ItemGem.ToolMaterial.ONYX);
	public static final Item onyx_sword = new ItemGemSword(ItemGem.ToolMaterial.ONYX);
	// pyrite
	public static final Item pyrite_axe = new ItemGemAxe(ItemGem.ToolMaterial.PYRITE);
	public static final Item pyrite_hoe = new ItemGemHoe(ItemGem.ToolMaterial.PYRITE);
	public static final Item pyrite_pickaxe = new ItemGemPickaxe(ItemGem.ToolMaterial.PYRITE);
	public static final Item pyrite_shovel = new ItemGemSpade(ItemGem.ToolMaterial.PYRITE);
	public static final Item pyrite_sword = new ItemGemSword(ItemGem.ToolMaterial.PYRITE);
	// ruby
	public static final Item ruby_axe = new ItemGemAxe(ItemGem.ToolMaterial.RUBY);
	public static final Item ruby_hoe = new ItemGemHoe(ItemGem.ToolMaterial.RUBY);
	public static final Item ruby_pickaxe = new ItemGemPickaxe(ItemGem.ToolMaterial.RUBY);
	public static final Item ruby_shovel = new ItemGemSpade(ItemGem.ToolMaterial.RUBY);
	public static final Item ruby_sword = new ItemGemSword(ItemGem.ToolMaterial.RUBY);
	// sapphire
	public static final Item sapphire_axe = new ItemGemAxe(ItemGem.ToolMaterial.SAPPHIRE);
	public static final Item sapphire_hoe = new ItemGemHoe(ItemGem.ToolMaterial.SAPPHIRE);
	public static final Item sapphire_pickaxe = new ItemGemPickaxe(ItemGem.ToolMaterial.SAPPHIRE);
	public static final Item sapphire_shovel = new ItemGemSpade(ItemGem.ToolMaterial.SAPPHIRE);
	public static final Item sapphire_sword = new ItemGemSword(ItemGem.ToolMaterial.SAPPHIRE);
	// topaz
	public static final Item topaz_axe = new ItemGemAxe(ItemGem.ToolMaterial.TOPAZ);
	public static final Item topaz_hoe = new ItemGemHoe(ItemGem.ToolMaterial.TOPAZ);
	public static final Item topaz_pickaxe = new ItemGemPickaxe(ItemGem.ToolMaterial.TOPAZ);
	public static final Item topaz_shovel = new ItemGemSpade(ItemGem.ToolMaterial.TOPAZ);
	public static final Item topaz_sword = new ItemGemSword(ItemGem.ToolMaterial.TOPAZ);
	// turquoise
	public static final Item turquoise_axe = new ItemGemAxe(ItemGem.ToolMaterial.TURQUOISE);
	public static final Item turquoise_hoe = new ItemGemHoe(ItemGem.ToolMaterial.TURQUOISE);
	public static final Item turquoise_pickaxe = new ItemGemPickaxe(ItemGem.ToolMaterial.TURQUOISE);
	public static final Item turquoise_shovel = new ItemGemSpade(ItemGem.ToolMaterial.TURQUOISE);
	public static final Item turquoise_sword = new ItemGemSword(ItemGem.ToolMaterial.TURQUOISE);
		
	// ARMOUR
	// amethyst
	public static final Item amethyst_helmet = new ItemGemArmor(ItemGemArmor.ArmorMaterial.AMETHYST, 0, 0);
	public static final Item amethyst_chestplate = new ItemGemArmor(ItemGemArmor.ArmorMaterial.AMETHYST, 0, 1); 
	public static final Item amethyst_leggings = new ItemGemArmor(ItemGemArmor.ArmorMaterial.AMETHYST, 0, 2);
	public static final Item amethyst_boots = new ItemGemArmor(ItemGemArmor.ArmorMaterial.AMETHYST, 0, 3);
	// black diamond
	public static final Item blackdiamond_helmet = new ItemGemArmor(ItemGemArmor.ArmorMaterial.BLACKDIAMOND, 0, 0);
	public static final Item blackdiamond_chestplate = new ItemGemArmor(ItemGemArmor.ArmorMaterial.BLACKDIAMOND, 0, 1); 
	public static final Item blackdiamond_leggings = new ItemGemArmor(ItemGemArmor.ArmorMaterial.BLACKDIAMOND, 0, 2);
	public static final Item blackdiamond_boots = new ItemGemArmor(ItemGemArmor.ArmorMaterial.BLACKDIAMOND, 0, 3);
	// clinohumite
	public static final Item clinohumite_helmet = new ItemGemArmor(ItemGemArmor.ArmorMaterial.CLINOHUMITE, 0, 0);
	public static final Item clinohumite_chestplate = new ItemGemArmor(ItemGemArmor.ArmorMaterial.CLINOHUMITE, 0, 1); 
	public static final Item clinohumite_leggings = new ItemGemArmor(ItemGemArmor.ArmorMaterial.CLINOHUMITE, 0, 2);
	public static final Item clinohumite_boots = new ItemGemArmor(ItemGemArmor.ArmorMaterial.CLINOHUMITE, 0, 3);
	// emerald
	public static final Item emerald_helmet = new ItemGemArmor(ItemGemArmor.ArmorMaterial.EMERALD, 0, 0);
	public static final Item emerald_chestplate = new ItemGemArmor(ItemGemArmor.ArmorMaterial.EMERALD, 0, 1); 
	public static final Item emerald_leggings = new ItemGemArmor(ItemGemArmor.ArmorMaterial.EMERALD, 0, 2);
	public static final Item emerald_boots = new ItemGemArmor(ItemGemArmor.ArmorMaterial.EMERALD, 0, 3);
	// goshenite
	public static final Item goshenite_helmet = new ItemGemArmor(ItemGemArmor.ArmorMaterial.GOSHENITE, 0, 0);
	public static final Item goshenite_chestplate = new ItemGemArmor(ItemGemArmor.ArmorMaterial.GOSHENITE, 0, 1); 
	public static final Item goshenite_leggings = new ItemGemArmor(ItemGemArmor.ArmorMaterial.GOSHENITE, 0, 2);
	public static final Item goshenite_boots = new ItemGemArmor(ItemGemArmor.ArmorMaterial.GOSHENITE, 0, 3);
	// heliodor
	public static final Item heliodor_helmet = new ItemGemArmor(ItemGemArmor.ArmorMaterial.HELIODOR, 0, 0);
	public static final Item heliodor_chestplate = new ItemGemArmor(ItemGemArmor.ArmorMaterial.HELIODOR, 0, 1); 
	public static final Item heliodor_leggings = new ItemGemArmor(ItemGemArmor.ArmorMaterial.HELIODOR, 0, 2);
	public static final Item heliodor_boots = new ItemGemArmor(ItemGemArmor.ArmorMaterial.HELIODOR, 0, 3);
	// morganite
	public static final Item morganite_helmet = new ItemGemArmor(ItemGemArmor.ArmorMaterial.MORGANITE, 0, 0);
	public static final Item morganite_chestplate = new ItemGemArmor(ItemGemArmor.ArmorMaterial.MORGANITE, 0, 1); 
	public static final Item morganite_leggings = new ItemGemArmor(ItemGemArmor.ArmorMaterial.MORGANITE, 0, 2);
	public static final Item morganite_boots = new ItemGemArmor(ItemGemArmor.ArmorMaterial.MORGANITE, 0, 3);
	// onyx
	public static final Item onyx_helmet = new ItemGemArmor(ItemGemArmor.ArmorMaterial.ONYX, 0, 0);
	public static final Item onyx_chestplate = new ItemGemArmor(ItemGemArmor.ArmorMaterial.ONYX, 0, 1); 
	public static final Item onyx_leggings = new ItemGemArmor(ItemGemArmor.ArmorMaterial.ONYX, 0, 2);
	public static final Item onyx_boots = new ItemGemArmor(ItemGemArmor.ArmorMaterial.ONYX, 0, 3);
	// pyrite
	public static final Item pyrite_helmet = new ItemGemArmor(ItemGemArmor.ArmorMaterial.PYRITE, 0, 0);
	public static final Item pyrite_chestplate = new ItemGemArmor(ItemGemArmor.ArmorMaterial.PYRITE, 0, 1); 
	public static final Item pyrite_leggings = new ItemGemArmor(ItemGemArmor.ArmorMaterial.PYRITE, 0, 2);
	public static final Item pyrite_boots = new ItemGemArmor(ItemGemArmor.ArmorMaterial.PYRITE, 0, 3);
	// ruby
	public static final Item ruby_helmet = new ItemGemArmor(ItemGemArmor.ArmorMaterial.RUBY, 0, 0);
	public static final Item ruby_chestplate = new ItemGemArmor(ItemGemArmor.ArmorMaterial.RUBY, 0, 1); 
	public static final Item ruby_leggings = new ItemGemArmor(ItemGemArmor.ArmorMaterial.RUBY, 0, 2);
	public static final Item ruby_boots = new ItemGemArmor(ItemGemArmor.ArmorMaterial.RUBY, 0, 3);
	// sapphire
	public static final Item sapphire_helmet = new ItemGemArmor(ItemGemArmor.ArmorMaterial.SAPPHIRE, 0, 0);
	public static final Item sapphire_chestplate = new ItemGemArmor(ItemGemArmor.ArmorMaterial.SAPPHIRE, 0, 1); 
	public static final Item sapphire_leggings = new ItemGemArmor(ItemGemArmor.ArmorMaterial.SAPPHIRE, 0, 2);
	public static final Item sapphire_boots = new ItemGemArmor(ItemGemArmor.ArmorMaterial.SAPPHIRE, 0, 3);
	// topaz
	public static final Item topaz_helmet = new ItemGemArmor(ItemGemArmor.ArmorMaterial.TOPAZ, 0, 0);
	public static final Item topaz_chestplate = new ItemGemArmor(ItemGemArmor.ArmorMaterial.TOPAZ, 0, 1); 
	public static final Item topaz_leggings = new ItemGemArmor(ItemGemArmor.ArmorMaterial.TOPAZ, 0, 2);
	public static final Item topaz_boots = new ItemGemArmor(ItemGemArmor.ArmorMaterial.TOPAZ, 0, 3);
	// turquoise
	public static final Item turquoise_helmet = new ItemGemArmor(ItemGemArmor.ArmorMaterial.TURQUOISE, 0, 0);
	public static final Item turquoise_chestplate = new ItemGemArmor(ItemGemArmor.ArmorMaterial.TURQUOISE, 0, 1); 
	public static final Item turquoise_leggings = new ItemGemArmor(ItemGemArmor.ArmorMaterial.TURQUOISE, 0, 2);
	public static final Item turquoise_boots = new ItemGemArmor(ItemGemArmor.ArmorMaterial.TURQUOISE, 0, 3);

	// MISC
	public static final Item diamond_stick = new Item();
	
	
	public static void initializeItems()
	{
		// GEMS
		amethyst.setUnlocalizedName("amethyst").setCreativeTab(CreativeTabs.tabMaterials);
		blackdiamond.setUnlocalizedName("blackdiamond").setCreativeTab(CreativeTabs.tabMaterials);
		clinohumite.setUnlocalizedName("clinohumite").setCreativeTab(CreativeTabs.tabMaterials);
		heliodor.setUnlocalizedName("heliodor").setCreativeTab(CreativeTabs.tabMaterials);
		goshenite.setUnlocalizedName("goshenite").setCreativeTab(CreativeTabs.tabMaterials);
		morganite.setUnlocalizedName("morganite").setCreativeTab(CreativeTabs.tabMaterials);
		onyx.setUnlocalizedName("onyx").setCreativeTab(CreativeTabs.tabMaterials);
		pyrite.setUnlocalizedName("pyrite").setCreativeTab(CreativeTabs.tabMaterials);
		ruby.setUnlocalizedName("ruby").setCreativeTab(CreativeTabs.tabMaterials);
		sapphire.setUnlocalizedName("sapphire").setCreativeTab(CreativeTabs.tabMaterials);
		topaz.setUnlocalizedName("topaz").setCreativeTab(CreativeTabs.tabMaterials);
		turquoise.setUnlocalizedName("turquoise").setCreativeTab(CreativeTabs.tabMaterials);

		// TOOLS AND WEAPONS
		// amethyst
		amethyst_axe.setUnlocalizedName("amethyst_axe").setCreativeTab(CreativeTabs.tabTools);
		amethyst_hoe.setUnlocalizedName("amethyst_hoe").setCreativeTab(CreativeTabs.tabTools);
		amethyst_pickaxe.setUnlocalizedName("amethyst_pickaxe").setCreativeTab(CreativeTabs.tabTools);
		amethyst_shovel.setUnlocalizedName("amethyst_shovel").setCreativeTab(CreativeTabs.tabTools);
		amethyst_sword.setUnlocalizedName("amethyst_sword").setCreativeTab(CreativeTabs.tabCombat);
		// black diamond
		blackdiamond_axe.setUnlocalizedName("blackdiamond_axe").setCreativeTab(CreativeTabs.tabTools);
		blackdiamond_hoe.setUnlocalizedName("blackdiamond_hoe").setCreativeTab(CreativeTabs.tabTools);
		blackdiamond_pickaxe.setUnlocalizedName("blackdiamond_pickaxe").setCreativeTab(CreativeTabs.tabTools);
		blackdiamond_shovel.setUnlocalizedName("blackdiamond_shovel").setCreativeTab(CreativeTabs.tabTools);
		blackdiamond_sword.setUnlocalizedName("blackdiamond_sword").setCreativeTab(CreativeTabs.tabCombat);
		// clinohumite
		clinohumite_axe.setUnlocalizedName("clinohumite_axe").setCreativeTab(CreativeTabs.tabTools);
		clinohumite_hoe.setUnlocalizedName("clinohumite_hoe").setCreativeTab(CreativeTabs.tabTools);
		clinohumite_pickaxe.setUnlocalizedName("clinohumite_pickaxe").setCreativeTab(CreativeTabs.tabTools);
		clinohumite_shovel.setUnlocalizedName("clinohumite_shovel").setCreativeTab(CreativeTabs.tabTools);
		clinohumite_sword.setUnlocalizedName("clinohumite_sword").setCreativeTab(CreativeTabs.tabCombat);
		// emerald
		emerald_axe.setUnlocalizedName("emerald_axe").setCreativeTab(CreativeTabs.tabTools);
		emerald_hoe.setUnlocalizedName("emerald_hoe").setCreativeTab(CreativeTabs.tabTools);
		emerald_pickaxe.setUnlocalizedName("emerald_pickaxe").setCreativeTab(CreativeTabs.tabTools);
		emerald_shovel.setUnlocalizedName("emerald_shovel").setCreativeTab(CreativeTabs.tabTools);
		emerald_sword.setUnlocalizedName("emerald_sword").setCreativeTab(CreativeTabs.tabCombat);
		// goshenite
		goshenite_axe.setUnlocalizedName("goshenite_axe").setCreativeTab(CreativeTabs.tabTools);
		goshenite_hoe.setUnlocalizedName("goshenite_hoe").setCreativeTab(CreativeTabs.tabTools);
		goshenite_pickaxe.setUnlocalizedName("goshenite_pickaxe").setCreativeTab(CreativeTabs.tabTools);
		goshenite_shovel.setUnlocalizedName("goshenite_shovel").setCreativeTab(CreativeTabs.tabTools);
		goshenite_sword.setUnlocalizedName("goshenite_sword").setCreativeTab(CreativeTabs.tabCombat);
		// heliodor
		heliodor_axe.setUnlocalizedName("heliodor_axe").setCreativeTab(CreativeTabs.tabTools);
		heliodor_hoe.setUnlocalizedName("heliodor_hoe").setCreativeTab(CreativeTabs.tabTools);
		heliodor_pickaxe.setUnlocalizedName("heliodor_pickaxe").setCreativeTab(CreativeTabs.tabTools);
		heliodor_shovel.setUnlocalizedName("heliodor_shovel").setCreativeTab(CreativeTabs.tabTools);
		heliodor_sword.setUnlocalizedName("heliodor_sword").setCreativeTab(CreativeTabs.tabCombat);
		// morganite
		morganite_axe.setUnlocalizedName("morganite_axe").setCreativeTab(CreativeTabs.tabTools);
		morganite_hoe.setUnlocalizedName("morganite_hoe").setCreativeTab(CreativeTabs.tabTools);
		morganite_pickaxe.setUnlocalizedName("morganite_pickaxe").setCreativeTab(CreativeTabs.tabTools);
		morganite_shovel.setUnlocalizedName("morganite_shovel").setCreativeTab(CreativeTabs.tabTools);
		morganite_sword.setUnlocalizedName("morganite_sword").setCreativeTab(CreativeTabs.tabCombat);
		// onyx
		onyx_axe.setUnlocalizedName("onyx_axe").setCreativeTab(CreativeTabs.tabTools);
		onyx_hoe.setUnlocalizedName("onyx_hoe").setCreativeTab(CreativeTabs.tabTools);
		onyx_pickaxe.setUnlocalizedName("onyx_pickaxe").setCreativeTab(CreativeTabs.tabTools);
		onyx_shovel.setUnlocalizedName("onyx_shovel").setCreativeTab(CreativeTabs.tabTools);
		onyx_sword.setUnlocalizedName("onyx_sword").setCreativeTab(CreativeTabs.tabCombat);
		// pyrite
		pyrite_axe.setUnlocalizedName("pyrite_axe").setCreativeTab(CreativeTabs.tabTools);
		pyrite_hoe.setUnlocalizedName("pyrite_hoe").setCreativeTab(CreativeTabs.tabTools);
		pyrite_pickaxe.setUnlocalizedName("pyrite_pickaxe").setCreativeTab(CreativeTabs.tabTools);
		pyrite_shovel.setUnlocalizedName("pyrite_shovel").setCreativeTab(CreativeTabs.tabTools);
		pyrite_sword.setUnlocalizedName("pyrite_sword").setCreativeTab(CreativeTabs.tabCombat);
		// ruby
		ruby_axe.setUnlocalizedName("ruby_axe").setCreativeTab(CreativeTabs.tabTools);
		ruby_hoe.setUnlocalizedName("ruby_hoe").setCreativeTab(CreativeTabs.tabTools);
		ruby_pickaxe.setUnlocalizedName("ruby_pickaxe").setCreativeTab(CreativeTabs.tabTools);
		ruby_shovel.setUnlocalizedName("ruby_shovel").setCreativeTab(CreativeTabs.tabTools);
		ruby_sword.setUnlocalizedName("ruby_sword").setCreativeTab(CreativeTabs.tabCombat);
		// sapphire
		sapphire_axe.setUnlocalizedName("sapphire_axe").setCreativeTab(CreativeTabs.tabTools);
		sapphire_hoe.setUnlocalizedName("sapphire_hoe").setCreativeTab(CreativeTabs.tabTools);
		sapphire_pickaxe.setUnlocalizedName("sapphire_pickaxe").setCreativeTab(CreativeTabs.tabTools);
		sapphire_shovel.setUnlocalizedName("sapphire_shovel").setCreativeTab(CreativeTabs.tabTools);
		sapphire_sword.setUnlocalizedName("sapphire_sword").setCreativeTab(CreativeTabs.tabCombat);
		// topaz
		topaz_axe.setUnlocalizedName("topaz_axe").setCreativeTab(CreativeTabs.tabTools);
		topaz_hoe.setUnlocalizedName("topaz_hoe").setCreativeTab(CreativeTabs.tabTools);
		topaz_pickaxe.setUnlocalizedName("topaz_pickaxe").setCreativeTab(CreativeTabs.tabTools);
		topaz_shovel.setUnlocalizedName("topaz_shovel").setCreativeTab(CreativeTabs.tabTools);
		topaz_sword.setUnlocalizedName("topaz_sword").setCreativeTab(CreativeTabs.tabCombat);
		// turquoise
		turquoise_axe.setUnlocalizedName("turquoise_axe").setCreativeTab(CreativeTabs.tabTools);
		turquoise_hoe.setUnlocalizedName("turquoise_hoe").setCreativeTab(CreativeTabs.tabTools);
		turquoise_pickaxe.setUnlocalizedName("turquoise_pickaxe").setCreativeTab(CreativeTabs.tabTools);
		turquoise_shovel.setUnlocalizedName("turquoise_shovel").setCreativeTab(CreativeTabs.tabTools);
		turquoise_sword.setUnlocalizedName("turquoise_sword").setCreativeTab(CreativeTabs.tabCombat);
		
		// ARMOUR
		// amethyst
		amethyst_helmet.setUnlocalizedName("amethyst_helmet").setCreativeTab(CreativeTabs.tabCombat);
		amethyst_chestplate.setUnlocalizedName("amethyst_chestplate").setCreativeTab(CreativeTabs.tabCombat);
		amethyst_leggings.setUnlocalizedName("amethyst_leggings").setCreativeTab(CreativeTabs.tabCombat);
		amethyst_boots.setUnlocalizedName("amethyst_boots").setCreativeTab(CreativeTabs.tabCombat);
		// black diamond
		blackdiamond_helmet.setUnlocalizedName("blackdiamond_helmet").setCreativeTab(CreativeTabs.tabCombat);
		blackdiamond_chestplate.setUnlocalizedName("blackdiamond_chestplate").setCreativeTab(CreativeTabs.tabCombat);
		blackdiamond_leggings.setUnlocalizedName("blackdiamond_leggings").setCreativeTab(CreativeTabs.tabCombat);
		blackdiamond_boots.setUnlocalizedName("blackdiamond_boots").setCreativeTab(CreativeTabs.tabCombat);
		// clinohumite
		clinohumite_helmet.setUnlocalizedName("clinohumite_helmet").setCreativeTab(CreativeTabs.tabCombat);
		clinohumite_chestplate.setUnlocalizedName("clinohumite_chestplate").setCreativeTab(CreativeTabs.tabCombat);
		clinohumite_leggings.setUnlocalizedName("clinohumite_leggings").setCreativeTab(CreativeTabs.tabCombat);
		clinohumite_boots.setUnlocalizedName("clinohumite_boots").setCreativeTab(CreativeTabs.tabCombat);
		// emerald
		emerald_helmet.setUnlocalizedName("emerald_helmet").setCreativeTab(CreativeTabs.tabCombat);
		emerald_chestplate.setUnlocalizedName("emerald_chestplate").setCreativeTab(CreativeTabs.tabCombat);
		emerald_leggings.setUnlocalizedName("emerald_leggings").setCreativeTab(CreativeTabs.tabCombat);
		emerald_boots.setUnlocalizedName("emerald_boots").setCreativeTab(CreativeTabs.tabCombat);
		// goshenite
		goshenite_helmet.setUnlocalizedName("goshenite_helmet").setCreativeTab(CreativeTabs.tabCombat);
		goshenite_chestplate.setUnlocalizedName("goshenite_chestplate").setCreativeTab(CreativeTabs.tabCombat);
		goshenite_leggings.setUnlocalizedName("goshenite_leggings").setCreativeTab(CreativeTabs.tabCombat);
		goshenite_boots.setUnlocalizedName("goshenite_boots").setCreativeTab(CreativeTabs.tabCombat);
		// heliodor
		heliodor_helmet.setUnlocalizedName("heliodor_helmet").setCreativeTab(CreativeTabs.tabCombat);
		heliodor_chestplate.setUnlocalizedName("heliodor_chestplate").setCreativeTab(CreativeTabs.tabCombat);
		heliodor_leggings.setUnlocalizedName("heliodor_leggings").setCreativeTab(CreativeTabs.tabCombat);
		heliodor_boots.setUnlocalizedName("heliodor_boots").setCreativeTab(CreativeTabs.tabCombat);
		// morganite
		morganite_helmet.setUnlocalizedName("morganite_helmet").setCreativeTab(CreativeTabs.tabCombat);
		morganite_chestplate.setUnlocalizedName("morganite_chestplate").setCreativeTab(CreativeTabs.tabCombat);
		morganite_leggings.setUnlocalizedName("morganite_leggings").setCreativeTab(CreativeTabs.tabCombat);
		morganite_boots.setUnlocalizedName("morganite_boots").setCreativeTab(CreativeTabs.tabCombat);
		// onyx
		onyx_helmet.setUnlocalizedName("onyx_helmet").setCreativeTab(CreativeTabs.tabCombat);
		onyx_chestplate.setUnlocalizedName("onyx_chestplate").setCreativeTab(CreativeTabs.tabCombat);
		onyx_leggings.setUnlocalizedName("onyx_leggings").setCreativeTab(CreativeTabs.tabCombat);
		onyx_boots.setUnlocalizedName("onyx_boots").setCreativeTab(CreativeTabs.tabCombat);
		// pyrite
		pyrite_helmet.setUnlocalizedName("pyrite_helmet").setCreativeTab(CreativeTabs.tabCombat);
		pyrite_chestplate.setUnlocalizedName("pyrite_chestplate").setCreativeTab(CreativeTabs.tabCombat);
		pyrite_leggings.setUnlocalizedName("pyrite_leggings").setCreativeTab(CreativeTabs.tabCombat);
		pyrite_boots.setUnlocalizedName("pyrite_boots").setCreativeTab(CreativeTabs.tabCombat);
		// ruby
		ruby_helmet.setUnlocalizedName("ruby_helmet").setCreativeTab(CreativeTabs.tabCombat);
		ruby_chestplate.setUnlocalizedName("ruby_chestplate").setCreativeTab(CreativeTabs.tabCombat);
		ruby_leggings.setUnlocalizedName("ruby_leggings").setCreativeTab(CreativeTabs.tabCombat);
		ruby_boots.setUnlocalizedName("ruby_boots").setCreativeTab(CreativeTabs.tabCombat);
		// sapphire
		sapphire_helmet.setUnlocalizedName("sapphire_helmet").setCreativeTab(CreativeTabs.tabCombat);
		sapphire_chestplate.setUnlocalizedName("sapphire_chestplate").setCreativeTab(CreativeTabs.tabCombat);
		sapphire_leggings.setUnlocalizedName("sapphire_leggings").setCreativeTab(CreativeTabs.tabCombat);
		sapphire_boots.setUnlocalizedName("sapphire_boots").setCreativeTab(CreativeTabs.tabCombat);
		// topaz
		topaz_helmet.setUnlocalizedName("topaz_helmet").setCreativeTab(CreativeTabs.tabCombat);
		topaz_chestplate.setUnlocalizedName("topaz_chestplate").setCreativeTab(CreativeTabs.tabCombat);
		topaz_leggings.setUnlocalizedName("topaz_leggings").setCreativeTab(CreativeTabs.tabCombat);
		topaz_boots.setUnlocalizedName("topaz_boots").setCreativeTab(CreativeTabs.tabCombat);
		// turquoise
		turquoise_helmet.setUnlocalizedName("turquoise_helmet").setCreativeTab(CreativeTabs.tabCombat);
		turquoise_chestplate.setUnlocalizedName("turquoise_chestplate").setCreativeTab(CreativeTabs.tabCombat);
		turquoise_leggings.setUnlocalizedName("turquoise_leggings").setCreativeTab(CreativeTabs.tabCombat);
		turquoise_boots.setUnlocalizedName("turquoise_boots").setCreativeTab(CreativeTabs.tabCombat);

		// MISC
		diamond_stick.setUnlocalizedName("diamond_stick").setCreativeTab(CreativeTabs.tabMaterials);
	
	}


	public static void registerItems() 
	{
		// GEMS
		registerItem(amethyst);
		registerItem(blackdiamond);
		registerItem(clinohumite);
		registerItem(goshenite);
		registerItem(heliodor);
		registerItem(morganite);
		registerItem(onyx);
		registerItem(pyrite);
		registerItem(ruby);
		registerItem(sapphire);
		registerItem(topaz);
		registerItem(turquoise);

		// TOOLS AND WEAPONS
		// amethyst
		if (GCConfiguration.amethystToolsWeapons)
		{
			registerItem(amethyst_axe);
			registerItem(amethyst_hoe);
			registerItem(amethyst_pickaxe);
			registerItem(amethyst_shovel);
			registerItem(amethyst_sword);
		}
		// black diamond
		if (GCConfiguration.blackDiamondToolsWeapons)
		{
			registerItem(blackdiamond_axe);
			registerItem(blackdiamond_hoe);
			registerItem(blackdiamond_pickaxe);
			registerItem(blackdiamond_shovel);
			registerItem(blackdiamond_sword);
		}
		// clinohumite
		if (GCConfiguration.clinohumiteToolsWeapons)
		{
			registerItem(clinohumite_axe);
			registerItem(clinohumite_hoe);
			registerItem(clinohumite_pickaxe);
			registerItem(clinohumite_shovel);
			registerItem(clinohumite_sword);
		}
		// emerald
		if (GCConfiguration.emeraldToolsWeapons)
		{
			registerItem(emerald_axe);
			registerItem(emerald_hoe);
			registerItem(emerald_pickaxe);
			registerItem(emerald_shovel);
			registerItem(emerald_sword);
		}
		// goshenite
		if (GCConfiguration.goshemiteToolsWeapons)
		{
			registerItem(goshenite_axe);
			registerItem(goshenite_hoe);
			registerItem(goshenite_pickaxe);
			registerItem(goshenite_shovel);
			registerItem(goshenite_sword);
		}
		// heliodor
		if (GCConfiguration.heliodorToolsWeapons)
		{
			registerItem(heliodor_axe);
			registerItem(heliodor_hoe);
			registerItem(heliodor_pickaxe);
			registerItem(heliodor_shovel);
			registerItem(heliodor_sword);
		}
		// morganite
		if (GCConfiguration.morganiteToolsWeapons)
		{
			registerItem(morganite_axe);
			registerItem(morganite_hoe);
			registerItem(morganite_pickaxe);
			registerItem(morganite_shovel);
			registerItem(morganite_sword);
		}
		// onyx
		if (GCConfiguration.onyxToolsWeapons)
		{
			registerItem(onyx_axe);
			registerItem(onyx_hoe);
			registerItem(onyx_pickaxe);
			registerItem(onyx_shovel);
			registerItem(onyx_sword);
		}
		// pyrite
		if (GCConfiguration.pyriteToolsWeapons)
		{
			registerItem(pyrite_axe);
			registerItem(pyrite_hoe);
			registerItem(pyrite_pickaxe);
			registerItem(pyrite_shovel);
			registerItem(pyrite_sword);
		}
		// ruby
		if (GCConfiguration.rubyToolsWeapons)
		{
			registerItem(ruby_axe);
			registerItem(ruby_hoe);
			registerItem(ruby_pickaxe);
			registerItem(ruby_shovel);
			registerItem(ruby_sword);
		}
		// sapphire
		if (GCConfiguration.sapphireToolsWeapons)
		{
			registerItem(sapphire_axe);
			registerItem(sapphire_hoe);
			registerItem(sapphire_pickaxe);
			registerItem(sapphire_shovel);
			registerItem(sapphire_sword);
		}
		// topaz
		if (GCConfiguration.topazToolsWeapons)
		{
			registerItem(topaz_axe);
			registerItem(topaz_hoe);
			registerItem(topaz_pickaxe);
			registerItem(topaz_shovel);
			registerItem(topaz_sword);
		}
		// turquoise
		if (GCConfiguration.turquoiseToolsWeapons)
		{
			registerItem(turquoise_axe);
			registerItem(turquoise_hoe);
			registerItem(turquoise_pickaxe);
			registerItem(turquoise_shovel);
			registerItem(turquoise_sword);
		}
		
		// ARMOUR
		// amethyst
		if (GCConfiguration.amethystArmor)
		{
			registerItem(amethyst_helmet);
			registerItem(amethyst_chestplate);
			registerItem(amethyst_leggings);
			registerItem(amethyst_boots);
		}
		// black diamond
		if (GCConfiguration.blackDiamondArmor)
		{
			registerItem(blackdiamond_helmet);
			registerItem(blackdiamond_chestplate);
			registerItem(blackdiamond_leggings);
			registerItem(blackdiamond_boots);
		}
		// clinohumite
		if (GCConfiguration.clinohumiteArmor)
		{
			registerItem(clinohumite_helmet);
			registerItem(clinohumite_chestplate);
			registerItem(clinohumite_leggings);
			registerItem(clinohumite_boots);
		}
		// emerald
		if (GCConfiguration.emeraldArmor)
		{
			registerItem(emerald_helmet);
			registerItem(emerald_chestplate);
			registerItem(emerald_leggings);
			registerItem(emerald_boots);
		}
		// goshenite
		if (GCConfiguration.goshemiteArmor)
		{
			registerItem(goshenite_helmet);
			registerItem(goshenite_chestplate);
			registerItem(goshenite_leggings);
			registerItem(goshenite_boots);
		}
		// heliodor
		if (GCConfiguration.heliodorArmor)
		{
			registerItem(heliodor_helmet);
			registerItem(heliodor_chestplate);
			registerItem(heliodor_leggings);
			registerItem(heliodor_boots);
		}
		// morganite
		if (GCConfiguration.morganiteArmor)
		{
			registerItem(morganite_helmet);
			registerItem(morganite_chestplate);
			registerItem(morganite_leggings);
			registerItem(morganite_boots);
		}
		// pyrite
		if (GCConfiguration.pyriteArmor)
		{
			registerItem(pyrite_helmet);
			registerItem(pyrite_chestplate);
			registerItem(pyrite_leggings);
			registerItem(pyrite_boots);
		}
		// onyx
		if (GCConfiguration.onyxArmor)
		{
			registerItem(onyx_helmet);
			registerItem(onyx_chestplate);
			registerItem(onyx_leggings);
			registerItem(onyx_boots);
		}
		// ruby
		if (GCConfiguration.rubyArmor)
		{
			registerItem(ruby_helmet);
			registerItem(ruby_chestplate);
			registerItem(ruby_leggings);
			registerItem(ruby_boots);
		}
		// sapphire
		if (GCConfiguration.sapphireArmor)
		{
			registerItem(sapphire_helmet);
			registerItem(sapphire_chestplate);
			registerItem(sapphire_leggings);
			registerItem(sapphire_boots);
		}
		// topaz
		if (GCConfiguration.topazArmor)
		{
			registerItem(topaz_helmet);
			registerItem(topaz_chestplate);
			registerItem(topaz_leggings);
			registerItem(topaz_boots);
		}
		// turquoise
		if (GCConfiguration.turquoiseArmor)
		{
			registerItem(turquoise_helmet);
			registerItem(turquoise_chestplate);
			registerItem(turquoise_leggings);
			registerItem(turquoise_boots);
		}
		
		// MISC
		registerItem(diamond_stick);
	}

	public static void registerModels() 
	{
		// GEMS
		registerModel(amethyst);
		registerModel(blackdiamond);
		registerModel(clinohumite);
		registerModel(goshenite);
		registerModel(heliodor);
		registerModel(morganite);
		registerModel(onyx);
		registerModel(pyrite);
		registerModel(ruby);
		registerModel(sapphire);
		registerModel(topaz);
		registerModel(turquoise);
		
		// TOOLS AND WEAPONS
		// amethyst
		if (GCConfiguration.amethystToolsWeapons)
		{
			registerModel(amethyst_axe);
			registerModel(amethyst_hoe);
			registerModel(amethyst_pickaxe);
			registerModel(amethyst_shovel);
			registerModel(amethyst_sword);
		}
		// black diamond
		if (GCConfiguration.blackDiamondToolsWeapons)
		{
			registerModel(blackdiamond_axe);
			registerModel(blackdiamond_hoe);
			registerModel(blackdiamond_pickaxe);
			registerModel(blackdiamond_shovel);
			registerModel(blackdiamond_sword);
		}
		// clinohumite
		if (GCConfiguration.clinohumiteToolsWeapons)
		{
			registerModel(clinohumite_axe);
			registerModel(clinohumite_hoe);
			registerModel(clinohumite_pickaxe);
			registerModel(clinohumite_shovel);
			registerModel(clinohumite_sword);
		}
		// emerald
		if (GCConfiguration.emeraldToolsWeapons)
		{
			registerModel(emerald_axe);
			registerModel(emerald_hoe);
			registerModel(emerald_pickaxe);
			registerModel(emerald_shovel);
			registerModel(emerald_sword);
		}
		// goshenite
		if (GCConfiguration.goshemiteToolsWeapons)
		{
			registerModel(goshenite_axe);
			registerModel(goshenite_hoe);
			registerModel(goshenite_pickaxe);
			registerModel(goshenite_shovel);
			registerModel(goshenite_sword);
		}
		// heliodor
		if (GCConfiguration.heliodorToolsWeapons)
		{
			registerModel(heliodor_axe);
			registerModel(heliodor_hoe);
			registerModel(heliodor_pickaxe);
			registerModel(heliodor_shovel);
			registerModel(heliodor_sword);
		}
		// morganite
		if (GCConfiguration.morganiteToolsWeapons)
		{
			registerModel(morganite_axe);
			registerModel(morganite_hoe);
			registerModel(morganite_pickaxe);
			registerModel(morganite_shovel);
			registerModel(morganite_sword);
		}
		// onyx
		if (GCConfiguration.onyxToolsWeapons)
		{
			registerModel(onyx_axe);
			registerModel(onyx_hoe);
			registerModel(onyx_pickaxe);
			registerModel(onyx_shovel);
			registerModel(onyx_sword);
		}
		// pyrite
		if (GCConfiguration.pyriteToolsWeapons)
		{
			registerModel(pyrite_axe);
			registerModel(pyrite_hoe);
			registerModel(pyrite_pickaxe);
			registerModel(pyrite_shovel);
			registerModel(pyrite_sword);
		}
		// ruby
		if (GCConfiguration.rubyToolsWeapons)
		{
			registerModel(ruby_axe);
			registerModel(ruby_hoe);
			registerModel(ruby_pickaxe);
			registerModel(ruby_shovel);
			registerModel(ruby_sword);
		}
		// sapphire
		if (GCConfiguration.sapphireToolsWeapons)
		{
			registerModel(sapphire_axe);
			registerModel(sapphire_hoe);
			registerModel(sapphire_pickaxe);
			registerModel(sapphire_shovel);
			registerModel(sapphire_sword);
		}
		// topaz
		if (GCConfiguration.topazToolsWeapons)
		{
			registerModel(topaz_axe);
			registerModel(topaz_hoe);
			registerModel(topaz_pickaxe);
			registerModel(topaz_shovel);
			registerModel(topaz_sword);
		}
		// turquoise
		if (GCConfiguration.turquoiseToolsWeapons)
		{
			registerModel(turquoise_axe);
			registerModel(turquoise_hoe);
			registerModel(turquoise_pickaxe);
			registerModel(turquoise_shovel);
			registerModel(turquoise_sword);
		}
		
		// ARMOUR
		// amethyst
		if (GCConfiguration.amethystArmor)
		{
			registerModel(amethyst_helmet);
			registerModel(amethyst_chestplate);
			registerModel(amethyst_leggings);
			registerModel(amethyst_boots);
		}
		// black diamond
		if (GCConfiguration.blackDiamondArmor)
		{
			registerModel(blackdiamond_helmet);
			registerModel(blackdiamond_chestplate);
			registerModel(blackdiamond_leggings);
			registerModel(blackdiamond_boots);
		}
		// clinohumite
		if (GCConfiguration.clinohumiteArmor)
		{
			registerModel(clinohumite_helmet);
			registerModel(clinohumite_chestplate);
			registerModel(clinohumite_leggings);
			registerModel(clinohumite_boots);
		}
		// emerald
		if (GCConfiguration.emeraldArmor)
		{
			registerModel(emerald_helmet);
			registerModel(emerald_chestplate);
			registerModel(emerald_leggings);
			registerModel(emerald_boots);
		}
		// goshenite
		if (GCConfiguration.goshemiteArmor)
		{
			registerModel(goshenite_helmet);
			registerModel(goshenite_chestplate);
			registerModel(goshenite_leggings);
			registerModel(goshenite_boots);
		}
		// heliodor
		if (GCConfiguration.heliodorArmor)
		{
			registerModel(heliodor_helmet);
			registerModel(heliodor_chestplate);
			registerModel(heliodor_leggings);
			registerModel(heliodor_boots);
		}
		// morganite
		if (GCConfiguration.morganiteArmor)
		{
			registerModel(morganite_helmet);
			registerModel(morganite_chestplate);
			registerModel(morganite_leggings);
			registerModel(morganite_boots);
		}
		// pyrite
		if (GCConfiguration.pyriteArmor)
		{
			registerModel(pyrite_helmet);
			registerModel(pyrite_chestplate);
			registerModel(pyrite_leggings);
			registerModel(pyrite_boots);
		}
		// onyx
		if (GCConfiguration.onyxArmor)
		{
			registerModel(onyx_helmet);
			registerModel(onyx_chestplate);
			registerModel(onyx_leggings);
			registerModel(onyx_boots);
		}
		// ruby
		if (GCConfiguration.rubyArmor)
		{
			registerModel(ruby_helmet);
			registerModel(ruby_chestplate);
			registerModel(ruby_leggings);
			registerModel(ruby_boots);
		}
		// sapphire
		if (GCConfiguration.sapphireArmor)
		{
			registerModel(sapphire_helmet);
			registerModel(sapphire_chestplate);
			registerModel(sapphire_leggings);
			registerModel(sapphire_boots);
		}
		// topaz
		if (GCConfiguration.topazArmor)
		{
			registerModel(topaz_helmet);
			registerModel(topaz_chestplate);
			registerModel(topaz_leggings);
			registerModel(topaz_boots);
		}
		// turquoise
		if (GCConfiguration.turquoiseArmor)
		{
			registerModel(turquoise_helmet);
			registerModel(turquoise_chestplate);
			registerModel(turquoise_leggings);
			registerModel(turquoise_boots);
		}
		
		// MISC
		registerModel(diamond_stick);
	}
	
	
	private static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
	
	private static void registerModel(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(GemologyMod.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}