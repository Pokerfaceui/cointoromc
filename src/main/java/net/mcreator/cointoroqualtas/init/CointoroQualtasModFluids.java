/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cointoroqualtas.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.cointoroqualtas.fluid.AstralinfectionFluid;
import net.mcreator.cointoroqualtas.CointoroQualtasMod;

public class CointoroQualtasModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, CointoroQualtasMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> ASTRALINFECTION = REGISTRY.register("astralinfection", () -> new AstralinfectionFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_ASTRALINFECTION = REGISTRY.register("flowing_astralinfection", () -> new AstralinfectionFluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(ASTRALINFECTION.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ASTRALINFECTION.get(), RenderType.translucent());
		}
	}
}