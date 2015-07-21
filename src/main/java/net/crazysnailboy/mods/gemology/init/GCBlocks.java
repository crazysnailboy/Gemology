package net.crazysnailboy.mods.gemology.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.crazysnailboy.mods.gemology.GemologyMod;
import net.crazysnailboy.mods.gemology.block.BlockGem;
import net.crazysnailboy.mods.gemology.block.BlockGemOre;
import net.crazysnailboy.mods.gemology.item.ItemBlockGem;
import net.crazysnailboy.mods.gemology.item.ItemBlockGemOre;

public class GCBlocks
{
	
	
	public static final Block blockGem = new BlockGem();
	public static final Block blockGemOre = new BlockGemOre();
	
	public static void initBlocks()
	{
		blockGem.setHardness(3.0F).setResistance(1.5F).setUnlocalizedName("gem_block").setCreativeTab(CreativeTabs.tabBlock);
		blockGemOre.setHardness(3.5F).setResistance(1.5F).setUnlocalizedName("gem_ore").setCreativeTab(CreativeTabs.tabBlock);
	}
	
	public static void registerBlocks()
	{
		registerBlocks(blockGem, ItemBlockGem.class, BlockGem.EnumType.values());
		registerBlocks(blockGemOre, ItemBlockGemOre.class, BlockGem.EnumType.values());
	}
	
	public static void registerModels() 
	{
		registerModels(blockGem, BlockGem.EnumType.values());
		registerModels(blockGemOre, BlockGem.EnumType.values());
	}


	private static void registerBlocks(Block block, Class<? extends ItemBlock> itemclass, Enum[] variants)
	{	
		GameRegistry.registerBlock(block, itemclass, block.getUnlocalizedName().substring(5));

		Item item = Item.getItemFromBlock(block);
		for (int i = 0; i < variants.length ; i++) 
		{
			int meta = variants[i].ordinal();
			String unLocalizedName = GemologyMod.MOD_ID + ":" + new ItemStack(item, 1, meta).getUnlocalizedName().substring(5);
			ModelBakery.addVariantName(item, unLocalizedName);
		}
	}

	private static void registerModels(Block block, Enum[] variants)
	{
		Item item = Item.getItemFromBlock(block);
		for (int i = 0; i < variants.length ; i++) 
		{
			int meta = variants[i].ordinal();
			String unLocalizedName = GemologyMod.MOD_ID + ":" + new ItemStack(item, 1, meta).getUnlocalizedName().substring(5);
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(unLocalizedName, "inventory"));
		}		
	}

}