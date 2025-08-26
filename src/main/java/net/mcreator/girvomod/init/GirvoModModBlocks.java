/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.girvomod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.girvomod.block.SupernovaOreBlock;
import net.mcreator.girvomod.block.SupernovaBlockBlock;
import net.mcreator.girvomod.block.ReactidoBlock;
import net.mcreator.girvomod.block.RatmioBlock;
import net.mcreator.girvomod.block.PautinoBlock;
import net.mcreator.girvomod.block.KradelBlock;
import net.mcreator.girvomod.block.EudentaBlock;
import net.mcreator.girvomod.block.CortnioBlock;
import net.mcreator.girvomod.block.ArkanidonBlock;
import net.mcreator.girvomod.GirvoModMod;

import java.util.function.Function;

public class GirvoModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(GirvoModMod.MODID);
	public static final DeferredBlock<Block> ARKANIDON = register("arkanidon", ArkanidonBlock::new);
	public static final DeferredBlock<Block> REACTIDO = register("reactido", ReactidoBlock::new);
	public static final DeferredBlock<Block> CORTNIO = register("cortnio", CortnioBlock::new);
	public static final DeferredBlock<Block> RATMIO = register("ratmio", RatmioBlock::new);
	public static final DeferredBlock<Block> PAUTINO = register("pautino", PautinoBlock::new);
	public static final DeferredBlock<Block> KRADEL = register("kradel", KradelBlock::new);
	public static final DeferredBlock<Block> EUDENTA = register("eudenta", EudentaBlock::new);
	public static final DeferredBlock<Block> SUPERNOVA_ORE = register("supernova_ore", SupernovaOreBlock::new);
	public static final DeferredBlock<Block> SUPERNOVA_BLOCK = register("supernova_block", SupernovaBlockBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}