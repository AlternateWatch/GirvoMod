/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.girvomod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.girvomod.entity.NovaProyectileEntity;
import net.mcreator.girvomod.GirvoModMod;

public class GirvoModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, GirvoModMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<NovaProyectileEntity>> NOVA_PROYECTILE = register("nova_proyectile",
			EntityType.Builder.<NovaProyectileEntity>of(NovaProyectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(GirvoModMod.MODID, registryname))));
	}
}