/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.girvomod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.girvomod.item.VakutoShardItem;
import net.mcreator.girvomod.item.SupernovaIngotItem;
import net.mcreator.girvomod.item.SupernovaArmorItem;
import net.mcreator.girvomod.item.PulsidioShardItem;
import net.mcreator.girvomod.item.NovaItem;
import net.mcreator.girvomod.item.KiriteSwordItem;
import net.mcreator.girvomod.item.KiriteShardItem;
import net.mcreator.girvomod.item.KiriteAxeItem;
import net.mcreator.girvomod.GirvoModMod;

import java.util.function.Function;

public class GirvoModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(GirvoModMod.MODID);
	public static final DeferredItem<Item> NOVA = register("nova", NovaItem::new);
	public static final DeferredItem<Item> ARKANIDON = block(GirvoModModBlocks.ARKANIDON, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> REACTIDO = block(GirvoModModBlocks.REACTIDO);
	public static final DeferredItem<Item> CORTNIO = block(GirvoModModBlocks.CORTNIO);
	public static final DeferredItem<Item> RATMIO = block(GirvoModModBlocks.RATMIO);
	public static final DeferredItem<Item> PAUTINO = block(GirvoModModBlocks.PAUTINO);
	public static final DeferredItem<Item> KRADEL = block(GirvoModModBlocks.KRADEL, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> EUDENTA = block(GirvoModModBlocks.EUDENTA);
	public static final DeferredItem<Item> SUPERNOVA_INGOT = register("supernova_ingot", SupernovaIngotItem::new);
	public static final DeferredItem<Item> SUPERNOVA_ORE = block(GirvoModModBlocks.SUPERNOVA_ORE);
	public static final DeferredItem<Item> SUPERNOVA_BLOCK = block(GirvoModModBlocks.SUPERNOVA_BLOCK);
	public static final DeferredItem<Item> SUPERNOVA_ARMOR_HELMET = register("supernova_armor_helmet", SupernovaArmorItem.Helmet::new);
	public static final DeferredItem<Item> SUPERNOVA_ARMOR_CHESTPLATE = register("supernova_armor_chestplate", SupernovaArmorItem.Chestplate::new);
	public static final DeferredItem<Item> SUPERNOVA_ARMOR_LEGGINGS = register("supernova_armor_leggings", SupernovaArmorItem.Leggings::new);
	public static final DeferredItem<Item> SUPERNOVA_ARMOR_BOOTS = register("supernova_armor_boots", SupernovaArmorItem.Boots::new);
	public static final DeferredItem<Item> VAKUTO_SHARD = register("vakuto_shard", VakutoShardItem::new);
	public static final DeferredItem<Item> VAKUTO = block(GirvoModModBlocks.VAKUTO);
	public static final DeferredItem<Item> PULSIDIO = block(GirvoModModBlocks.PULSIDIO);
	public static final DeferredItem<Item> PULSIDIO_SHARD = register("pulsidio_shard", PulsidioShardItem::new);
	public static final DeferredItem<Item> KIRITA = block(GirvoModModBlocks.KIRITA);
	public static final DeferredItem<Item> KIRITE_SHARD = register("kirite_shard", KiriteShardItem::new);
	public static final DeferredItem<Item> KIRITE_AXE = register("kirite_axe", KiriteAxeItem::new);
	public static final DeferredItem<Item> KIRITE_SWORD = register("kirite_sword", KiriteSwordItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}