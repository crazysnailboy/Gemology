package net.crazysnailboy.mods.gemology.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.crazysnailboy.mods.gemology.block.BlockGem;


public class ItemBlockGemOre extends ItemBlock
{

	public ItemBlockGemOre(Block block)
	{
		super(block);
		this.setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int metadata)
	{
		return metadata;
	}

	public String getUnlocalizedName(ItemStack stack)
	{
		BlockGem.EnumType variant = BlockGem.EnumType.byMetadata(stack.getMetadata());
		return "tile." + variant.toString() + "_ore";
	}
}
