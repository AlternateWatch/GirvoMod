/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.girvomod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.girvomod.GirvoModMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class GirvoModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GirvoModMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(GirvoModModItems.NOVA.get());
			tabData.accept(GirvoModModItems.SUPERNOVA_INGOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(GirvoModModBlocks.ARKANIDON.get().asItem());
			tabData.accept(GirvoModModBlocks.CORTNIO.get().asItem());
			tabData.accept(GirvoModModBlocks.PAUTINO.get().asItem());
			tabData.accept(GirvoModModBlocks.KRADEL.get().asItem());
			tabData.accept(GirvoModModBlocks.EUDENTA.get().asItem());
			tabData.accept(GirvoModModBlocks.SUPERNOVA_ORE.get().asItem());
			tabData.accept(GirvoModModBlocks.SUPERNOVA_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(GirvoModModBlocks.REACTIDO.get().asItem());
			tabData.accept(GirvoModModBlocks.RATMIO.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(GirvoModModItems.SUPERNOVA_ARMOR_HELMET.get());
			tabData.accept(GirvoModModItems.SUPERNOVA_ARMOR_CHESTPLATE.get());
			tabData.accept(GirvoModModItems.SUPERNOVA_ARMOR_LEGGINGS.get());
			tabData.accept(GirvoModModItems.SUPERNOVA_ARMOR_BOOTS.get());
		}
	}
}