package net.crazysnailboy.mods.gemology.common.config;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

public class GCConfiguration 
{
	
	// ore generation
	public static boolean generateAmethyst;
	public static boolean generateBlackDiamond;
	public static boolean generateClinohumite;
	public static boolean generateGoshenite;
	public static boolean generateHeliodor;
	public static boolean generateMorganite;
	public static boolean generateOnyx;
	public static boolean generatePyrite;
	public static boolean generateRuby;
	public static boolean generateSapphire;
	public static boolean generateTopaz;
	public static boolean generateTurquoise;
	public static boolean generateInOtherDimensions;
	
	// ore generation options 
	public static int amethystVeinsPerChunk;
	public static int amethystBlocksPerVein;
	public static int amethystOreHeight;
	
	public static int blackDiamondVeinsPerChunk;
	public static int blackDiamondBlocksPerVein;
	public static int blackDiamondOreHeight;

	public static int clinohumiteVeinsPerChunk;
	public static int clinohumiteBlocksPerVein;
	public static int clinohumitetOreHeight;

	public static int goshemiteVeinsPerChunk;
	public static int goshemiteBlocksPerVein;
	public static int goshemiteOreHeight;

	public static int heliodorVeinsPerChunk;
	public static int heliodorBlocksPerVein;
	public static int heliodorOreHeight;

	public static int morganiteVeinsPerChunk;
	public static int morganiteBlocksPerVein;
	public static int morganiteOreHeight;

	public static int onyxVeinsPerChunk;
	public static int onyxBlocksPerVein;
	public static int onyxOreHeight;

	public static int pyriteVeinsPerChunk;
	public static int pyriteBlocksPerVein;
	public static int pyriteOreHeight;

	public static int rubyVeinsPerChunk;
	public static int rubyBlocksPerVein;
	public static int rubyOreHeight;

	public static int sapphireVeinsPerChunk;
	public static int sapphireBlocksPerVein;
	public static int sapphireOreHeight;

	public static int topazVeinsPerChunk;
	public static int topazBlocksPerVein;
	public static int topazOreHeight;
	
	public static int turquoiseVeinsPerChunk;
	public static int turquoiseBlocksPerVein;
	public static int turquoiseOreHeight;

	
	// tools, weapons and armour
	public static boolean amethystToolsWeapons;
	public static boolean amethystArmor;
	
	public static boolean blackDiamondToolsWeapons;
	public static boolean blackDiamondArmor;

	public static boolean clinohumiteToolsWeapons;
	public static boolean clinohumiteArmor;

	public static boolean emeraldToolsWeapons;
	public static boolean emeraldArmor;

	public static boolean goshemiteToolsWeapons;
	public static boolean goshemiteArmor;

	public static boolean heliodorToolsWeapons;
	public static boolean heliodorArmor;

	public static boolean morganiteToolsWeapons;
	public static boolean morganiteArmor;

	public static boolean onyxToolsWeapons;
	public static boolean onyxArmor;

	public static boolean pyriteToolsWeapons;
	public static boolean pyriteArmor;

	public static boolean rubyToolsWeapons;
	public static boolean rubyArmor;

	public static boolean sapphireToolsWeapons;
	public static boolean sapphireArmor;

	public static boolean topazToolsWeapons;
	public static boolean topazArmor;
	
	public static boolean turquoiseToolsWeapons;
	public static boolean turquoiseArmor;
	
	
	// misc options
	public static boolean enableBlackDiamondAltar;
	public static boolean enableBlackDiamondSpecialAbilities;
	//public static boolean increaseDiamondOreHarvestLvl;
	
	
	public static void loadConfig(Configuration config)
	{
		config.load();

		// ore generation
		String categoryOreGeneration = "Ore Generation";
		
		generateAmethyst = config.get(categoryOreGeneration, "Generate Amethyst Ore", true).getBoolean(true);
		generateBlackDiamond = config.get(categoryOreGeneration, "Generate Black Diamond Ore", true).getBoolean(true);
		generateClinohumite = config.get(categoryOreGeneration, "Generate Clinohumite Ore", true).getBoolean(true);
		generateGoshenite = config.get(categoryOreGeneration, "Generate Goshenite Ore", true).getBoolean(true);
		generateHeliodor = config.get(categoryOreGeneration, "Generate Heliodor Ore", true).getBoolean(true);
		generateMorganite = config.get(categoryOreGeneration, "Generate Morganite Ore", true).getBoolean(true);
		generateOnyx = config.get(categoryOreGeneration, "Generate Onyx Ore", true).getBoolean(true);
		generatePyrite = config.get(categoryOreGeneration, "Generate Pyrite Ore", true).getBoolean(true);
		generateRuby = config.get(categoryOreGeneration, "Generate Ruby Ore", true).getBoolean(true);
		generateSapphire = config.get(categoryOreGeneration, "Generate Sapphire Ore", true).getBoolean(true);
		generateTopaz = config.get(categoryOreGeneration, "Generate Topaz Ore", true).getBoolean(true);
		generateTurquoise = config.get(categoryOreGeneration, "Generate Turquoise Ore", true).getBoolean(true);
		
		generateInOtherDimensions = config.get(categoryOreGeneration, "Generate Gems in Mod Dimensions", true).getBoolean(true);
		

		// ore generation options
		String categoryOreGenerationOptions = "Ore Generation Options";
		
		amethystVeinsPerChunk = config.get(categoryOreGenerationOptions, "Amethyst Veins per Chunk", 2).getInt();
		amethystBlocksPerVein = config.get(categoryOreGenerationOptions, "Amethyst max. Blocks per Vein", 8).getInt();
		amethystOreHeight = config.get(categoryOreGenerationOptions, "Amethyst max. Generation Height", 25).getInt();
		
		blackDiamondVeinsPerChunk = config.get(categoryOreGenerationOptions, "Black Diamond Veins per Chunk", 1).getInt();
		blackDiamondBlocksPerVein = config.get(categoryOreGenerationOptions, "Black Diamond max. Blocks per Vein", 1).getInt();
		blackDiamondOreHeight = config.get(categoryOreGenerationOptions, "Black Diamond max. Generation Height", 25).getInt();
		
		clinohumiteVeinsPerChunk = config.get(categoryOreGenerationOptions, "Clinohumite Veins per Chunk", 4).getInt();
		clinohumiteBlocksPerVein = config.get(categoryOreGenerationOptions, "Clinohumite max. Blocks per Vein", 8).getInt();
		clinohumitetOreHeight = config.get(categoryOreGenerationOptions, "Clinohumite max. Generation Height", 28).getInt();

		goshemiteVeinsPerChunk = config.get(categoryOreGenerationOptions, "Goshemite Veins per Chunk", 4).getInt();
		goshemiteBlocksPerVein = config.get(categoryOreGenerationOptions, "Goshemite max. Blocks per Vein", 8).getInt();
		goshemiteOreHeight = config.get(categoryOreGenerationOptions, "Goshemite max. Generation Height", 28).getInt();

		heliodorVeinsPerChunk = config.get(categoryOreGenerationOptions, "Heliodor Veins per Chunk", 4).getInt();
		heliodorBlocksPerVein = config.get(categoryOreGenerationOptions, "Heliodor max. Blocks per Vein", 8).getInt();
		heliodorOreHeight = config.get(categoryOreGenerationOptions, "Heliodor max. Generation Height", 28).getInt();

		morganiteVeinsPerChunk = config.get(categoryOreGenerationOptions, "Morganite Veins per Chunk", 4).getInt();
		morganiteBlocksPerVein = config.get(categoryOreGenerationOptions, "Morganite max. Blocks per Vein", 8).getInt();
		morganiteOreHeight = config.get(categoryOreGenerationOptions, "Morganite max. Generation Height", 28).getInt();

		onyxVeinsPerChunk = config.get(categoryOreGenerationOptions, "Onyx Veins per Chunk", 4).getInt();
		onyxBlocksPerVein = config.get(categoryOreGenerationOptions, "Onyx max. Blocks per Vein", 8).getInt();
		onyxOreHeight = config.get(categoryOreGenerationOptions, "Onyx max. Generation Height", 28).getInt();
		
		pyriteVeinsPerChunk = config.get(categoryOreGenerationOptions, "Pyrite Veins per Chunk", 4).getInt();
		pyriteBlocksPerVein = config.get(categoryOreGenerationOptions, "Pyrite max. Blocks per Vein", 8).getInt();
		pyriteOreHeight = config.get(categoryOreGenerationOptions, "Pyrite max. Generation Height", 50).getInt();

		rubyVeinsPerChunk = config.get(categoryOreGenerationOptions, "Ruby Veins per Chunk", 1).getInt();
		rubyBlocksPerVein = config.get(categoryOreGenerationOptions, "Ruby max. Blocks per Vein", 8).getInt();
		rubyOreHeight = config.get(categoryOreGenerationOptions, "Ruby max. Generation Height", 16).getInt();
		
		sapphireVeinsPerChunk = config.get(categoryOreGenerationOptions, "Sapphire Veins per Chunk", 2).getInt();
		sapphireBlocksPerVein = config.get(categoryOreGenerationOptions, "Sapphire max. Blocks per Vein", 8).getInt();
		sapphireOreHeight = config.get(categoryOreGenerationOptions, "Sapphire max. Generation Height", 20).getInt();

		topazVeinsPerChunk = config.get(categoryOreGenerationOptions, "Topaz Veins per Chunk", 2).getInt();
		topazBlocksPerVein = config.get(categoryOreGenerationOptions, "Topaz max. Blocks per Vein", 8).getInt();
		topazOreHeight = config.get(categoryOreGenerationOptions, "Topaz max. Generation Height", 22).getInt();
		
		turquoiseVeinsPerChunk = config.get(categoryOreGenerationOptions, "Turquoise Veins per Chunk", 2).getInt();
		turquoiseBlocksPerVein = config.get(categoryOreGenerationOptions, "Turquoise max. Blocks per Vein", 8).getInt();
		turquoiseOreHeight = config.get(categoryOreGenerationOptions, "Turquoise max. Generation Height", 22).getInt();


		// tools, weapons and armour options
		String categoryToolsWeaponsArmorOptions = "Tools, Weapons and Armor Options";

		amethystToolsWeapons = config.getBoolean("amethystToolsWeapons", categoryToolsWeaponsArmorOptions, true, "Enable Amethyst Tools and Weapons");
		amethystArmor = config.getBoolean("amethystArmor", categoryToolsWeaponsArmorOptions, true, "Enable Amethyst Armor");
		blackDiamondToolsWeapons = config.getBoolean("blackDiamondToolsWeapons", categoryToolsWeaponsArmorOptions, true, "Enable Black Diamond Tools and Weapons");
		blackDiamondArmor = config.getBoolean("blackDiamondArmor", categoryToolsWeaponsArmorOptions, true, "Enable Black Diamond Armor");
		clinohumiteToolsWeapons = config.getBoolean("clinohumiteToolsWeapons", categoryToolsWeaponsArmorOptions, true, "Enable Clinohumite Tools and Weapons");
		clinohumiteArmor = config.getBoolean("clinohumiteArmor", categoryToolsWeaponsArmorOptions, true, "Enable Clinohumite Armor");
		emeraldToolsWeapons = config.getBoolean("emeraldToolsWeapons", categoryToolsWeaponsArmorOptions, true, "Enable Emerald Tools and Weapons");
		emeraldArmor = config.getBoolean("emeraldArmor", categoryToolsWeaponsArmorOptions, true, "Enable Emerald Armor");
		goshemiteToolsWeapons = config.getBoolean("goshemiteToolsWeapons", categoryToolsWeaponsArmorOptions, true, "Enable Goshemite Tools and Weapons");
		goshemiteArmor = config.getBoolean("goshemiteArmor", categoryToolsWeaponsArmorOptions, true, "Enable Goshemite Armor");
		heliodorToolsWeapons = config.getBoolean("heliodorToolsWeapons", categoryToolsWeaponsArmorOptions, true, "Enable Heliodor Tools and Weapons");
		heliodorArmor = config.getBoolean("heliodorArmor", categoryToolsWeaponsArmorOptions, true, "Enable Heliodor Armor");
		morganiteToolsWeapons = config.getBoolean("morganiteToolsWeapons", categoryToolsWeaponsArmorOptions, true, "Enable Morganite Tools and Weapons");
		morganiteArmor = config.getBoolean("morganiteArmor", categoryToolsWeaponsArmorOptions, true, "Enable Morganite Armor");
		onyxToolsWeapons = config.getBoolean("onyxToolsWeapons", categoryToolsWeaponsArmorOptions, true, "Enable Onyx Tools and Weapons");
		onyxArmor = config.getBoolean("onyxArmor", categoryToolsWeaponsArmorOptions, true, "Enable Onyx Armor");
		pyriteToolsWeapons = config.getBoolean("pyriteToolsWeapons", categoryToolsWeaponsArmorOptions, true, "Enable Pyrite Tools and Weapons");
		pyriteArmor = config.getBoolean("pyriteArmor", categoryToolsWeaponsArmorOptions, true, "Enable Pyrite Armor");
		rubyToolsWeapons = config.getBoolean("rubyToolsWeapons", categoryToolsWeaponsArmorOptions, true, "Enable Ruby Tools and Weapons");
		rubyArmor = config.getBoolean("rubyArmor", categoryToolsWeaponsArmorOptions, true, "Enable Ruby Armor");
		sapphireToolsWeapons = config.getBoolean("sapphireToolsWeapons", categoryToolsWeaponsArmorOptions, true, "Enable Sapphire Tools and Weapons");
		sapphireArmor = config.getBoolean("sapphireArmor", categoryToolsWeaponsArmorOptions, true, "Enable Sapphire Armor");
		topazToolsWeapons = config.getBoolean("topazToolsWeapons", categoryToolsWeaponsArmorOptions, true, "Enable Topaz Tools and Weapons");
		topazArmor = config.getBoolean("topazArmor", categoryToolsWeaponsArmorOptions, true, "Enable Topaz Armor");
		turquoiseToolsWeapons = config.getBoolean("turquoiseToolsWeapons", categoryToolsWeaponsArmorOptions, true, "Enable Turquiose Tools and Weapons");
		turquoiseArmor = config.getBoolean("turquoiseArmor", categoryToolsWeaponsArmorOptions, true, "Enable Turquiose Armor");
		
		// miscellaneous options		
		String categoryMiscellaneous = "Miscellaneous";
		enableBlackDiamondAltar = config.getBoolean("enableBlackDiamondAltar", categoryMiscellaneous, false, "Enable Black Diamond Altar");
		enableBlackDiamondSpecialAbilities = config.getBoolean("enableBlackDiamondAltar", categoryMiscellaneous, false, "Enable special abilities for Black Diamond tools and weapons");
		
		//		increaseDiamondOreHarvestLvl = config.get(categoryGeneral, "Diamond Ore harvest level fix", true).getBoolean(true);
		
		
		
		
//		blockGemID = config.get("block", "Gem Block ID", 3600).getInt();
//		blockGemOreID = config.get("block", "Gem Ore ID", 3601).getInt();
//		
//		itemAmethystID = config.get("item", "Amethyst ID", 3656).getInt();
//		itemRubyID = config.get("item", "Ruby ID", 3657).getInt();
//		itemSapphireID = config.get("item", "Sapphire ID", 3658).getInt();
//		itemEmeraldID = config.get("item", "Emerald ID", 3659).getInt();
//		itemTopazID = config.get("item", "Topaz ID", 3660).getInt();
//		itemPyriteID = config.get("item", "Pyrite ID", 3661).getInt();
//		itemBlackDiamondID = config.get("item", "Black Diamond ID", 3662).getInt();
//		itemDiamondStickID = config.get("item", "Diamond Stick ID", 3655).getInt();
//		dustTopazID = config.get("item", "Topaz Dust ID (GregTech)", 3620).getInt();
//		dustAmethystID = config.get("item", "Amethyst Dust ID (GregTech)", 3621).getInt();
//		
//		amethystToolsBaseID = config.get("item", "Amethyst Tools Base ID", 3700).getInt();
//		rubyToolsBaseID = config.get("item", "Ruby Tools Base ID", 3705).getInt();
//		sapphireToolsBaseID = config.get("item", "Sapphire Tools Base ID", 3710).getInt();
//		emeraldToolsBaseID = config.get("item", "Emerald Tools Base ID", 3715).getInt();
//		topazToolsBaseID = config.get("item", "Topaz Tools Base ID", 3720).getInt();
//		pyriteToolsBaseID = config.get("item", "Pyrite Tools Base ID", 3725).getInt();
//		blackDiamondToolsBaseID = config.get("item", "Black Diamond Tools Base ID", 3730).getInt();
//		
//		amethystArmorBaseID = config.get("item", "Amethyst Armor Base ID", 3900).getInt();
//		rubyArmorBaseID = config.get("item", "Ruby Armor Base ID", 3904).getInt();
//		sapphireArmorBaseID = config.get("item", "Sapphire Armor Base ID", 3908).getInt();
//		emeraldArmorBaseID = config.get("item", "Emerald Armor Base ID", 3912).getInt();
//		topazArmorBaseID = config.get("item", "Topaz Armor Base ID", 3916).getInt();
//		blackDiamondArmorBaseID = config.get("item", "Black Diamond Armor Base ID", 3920).getInt();
		


		config.save();
	}
}
