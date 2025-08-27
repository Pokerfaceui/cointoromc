/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cointoroqualtas.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.cointoroqualtas.client.model.Modeltoeas;
import net.mcreator.cointoroqualtas.client.model.Modelsentinel;
import net.mcreator.cointoroqualtas.client.model.Modelchesteys;
import net.mcreator.cointoroqualtas.client.model.Modelbikakce;
import net.mcreator.cointoroqualtas.client.model.Modelaaaaaaaaaa;
import net.mcreator.cointoroqualtas.client.model.ModelCustomModel;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CointoroQualtasModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(Modeltoeas.LAYER_LOCATION, Modeltoeas::createBodyLayer);
		event.registerLayerDefinition(Modelbikakce.LAYER_LOCATION, Modelbikakce::createBodyLayer);
		event.registerLayerDefinition(Modelaaaaaaaaaa.LAYER_LOCATION, Modelaaaaaaaaaa::createBodyLayer);
		event.registerLayerDefinition(Modelsentinel.LAYER_LOCATION, Modelsentinel::createBodyLayer);
		event.registerLayerDefinition(Modelchesteys.LAYER_LOCATION, Modelchesteys::createBodyLayer);
	}
}