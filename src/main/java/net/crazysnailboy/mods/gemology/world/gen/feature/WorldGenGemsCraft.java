package net.crazysnailboy.mods.gemology.world.gen.feature;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.crazysnailboy.mods.gemology.block.BlockGem;
import net.crazysnailboy.mods.gemology.block.BlockGemOre;
import net.crazysnailboy.mods.gemology.common.config.GCConfiguration;
import net.crazysnailboy.mods.gemology.init.GCBlocks;

public class WorldGenGemsCraft implements IWorldGenerator
{
	
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		int dimensionId = world.provider.getDimensionId();
		
		if (dimensionId == 0) { genSurface(world, random, chunkX * 16, chunkZ * 16); } else
		if (dimensionId == -1) { genNether(world, random, chunkX * 16, chunkZ * 16); } else
		if (dimensionId == 1) { genEnd(world, random, chunkX * 16, chunkZ * 16); } else
			
		if (GCConfiguration.generateInOtherDimensions)
		{
			genSurface(world, random, chunkX * 16, chunkZ * 16);
			genNether(world, random, chunkX * 16, chunkZ * 16);
			genEnd(world, random, chunkX * 16, chunkZ * 16);
		}
			
	}

	
	
	public void genSurface(World world, Random random, int chunkX, int chunkZ)
	{
		
		if (GCConfiguration.generateAmethyst)
			generateOre(world, random, chunkX, chunkZ, BlockGem.EnumType.AMETHYST, GCConfiguration.amethystVeinsPerChunk, GCConfiguration.amethystBlocksPerVein, GCConfiguration.amethystOreHeight);

		if (GCConfiguration.generateClinohumite)
			generateOre(world, random, chunkX, chunkZ, BlockGem.EnumType.CLINOHUMITE, GCConfiguration.clinohumiteVeinsPerChunk, GCConfiguration.clinohumiteBlocksPerVein, GCConfiguration.clinohumitetOreHeight);

		if (GCConfiguration.generateGoshenite)
			generateOre(world, random, chunkX, chunkZ, BlockGem.EnumType.GOSHENITE, GCConfiguration.goshemiteVeinsPerChunk, GCConfiguration.goshemiteBlocksPerVein, GCConfiguration.goshemiteOreHeight);
			
		if (GCConfiguration.generateHeliodor)
			generateOre(world, random, chunkX, chunkZ, BlockGem.EnumType.HELIODOR, GCConfiguration.heliodorVeinsPerChunk, GCConfiguration.heliodorBlocksPerVein, GCConfiguration.heliodorOreHeight);
			
		if (GCConfiguration.generateMorganite)
			generateOre(world, random, chunkX, chunkZ, BlockGem.EnumType.MORGANITE, GCConfiguration.morganiteVeinsPerChunk, GCConfiguration.morganiteBlocksPerVein, GCConfiguration.morganiteOreHeight);
			
		if (GCConfiguration.generateOnyx)
			generateOre(world, random, chunkX, chunkZ, BlockGem.EnumType.ONYX, GCConfiguration.onyxVeinsPerChunk, GCConfiguration.onyxBlocksPerVein, GCConfiguration.onyxOreHeight);
			
		if (GCConfiguration.generatePyrite)
			generateOre(world, random, chunkX, chunkZ, BlockGem.EnumType.PYRITE, GCConfiguration.pyriteVeinsPerChunk, GCConfiguration.pyriteBlocksPerVein, GCConfiguration.pyriteOreHeight);

		if (GCConfiguration.generateRuby)
			generateOre(world, random, chunkX, chunkZ, BlockGem.EnumType.RUBY, GCConfiguration.rubyVeinsPerChunk, GCConfiguration.rubyBlocksPerVein, GCConfiguration.rubyOreHeight);

		if (GCConfiguration.generateSapphire)
			generateOre(world, random, chunkX, chunkZ, BlockGem.EnumType.SAPPHIRE, GCConfiguration.sapphireVeinsPerChunk, GCConfiguration.sapphireBlocksPerVein, GCConfiguration.sapphireOreHeight);

		if (GCConfiguration.generateTopaz)
			generateOre(world, random, chunkX, chunkZ, BlockGem.EnumType.TOPAZ, GCConfiguration.topazVeinsPerChunk, GCConfiguration.topazBlocksPerVein, GCConfiguration.topazOreHeight);

		if (GCConfiguration.generateTurquoise)
			generateOre(world, random, chunkX, chunkZ, BlockGem.EnumType.TOPAZ, GCConfiguration.turquoiseVeinsPerChunk, GCConfiguration.turquoiseBlocksPerVein, GCConfiguration.turquoiseOreHeight);

	}

	public void genNether(World world, Random random, int chunkX, int chunkZ)
	{
		if (GCConfiguration.generateBlackDiamond)
			generateOre(world, random, chunkX, chunkZ, BlockGem.EnumType.BLACKDIAMOND, GCConfiguration.blackDiamondVeinsPerChunk, GCConfiguration.blackDiamondBlocksPerVein, GCConfiguration.blackDiamondOreHeight);
	}

	public void genEnd(World world, Random random, int chunkX, int chunkZ)
	{
	}
	
	
	
	private void generateOre(World world, Random random, int chunkX, int chunkZ, BlockGem.EnumType oreVariant, int oreVeinsPerChunk, int oreBlocksPerVein, int maxOreHeight)
	{
		IBlockState oreBlock = ((BlockGemOre)GCBlocks.blockGemOre).getDefaultState().withProperty(BlockGem.VARIANT, oreVariant);
		WorldGenMinable worldgen = new WorldGenMinable(oreBlock, oreBlocksPerVein);
		for (int i = 0; i < oreVeinsPerChunk; i++)
		{
			BlockPos pos = new BlockPos(chunkX + random.nextInt(16), random.nextInt(maxOreHeight), chunkZ + random.nextInt(16));
			worldgen.generate(world, random, pos);
		}
	}
	
	
	
}