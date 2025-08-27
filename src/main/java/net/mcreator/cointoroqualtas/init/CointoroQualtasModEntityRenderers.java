/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cointoroqualtas.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.cointoroqualtas.client.renderer.SentinelRenderer;
import net.mcreator.cointoroqualtas.client.renderer.AtlasRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CointoroQualtasModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CointoroQualtasModEntities.SENTINEL.get(), SentinelRenderer::new);
		event.registerEntityRenderer(CointoroQualtasModEntities.ATLAS.get(), AtlasRenderer::new);
	}
}