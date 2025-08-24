/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cointoroqualtas.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.cointoroqualtas.CointoroQualtasMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CointoroQualtasModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CointoroQualtasMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(CointoroQualtasModItems.DRAGONSHED_HELMET.get());
			tabData.accept(CointoroQualtasModItems.DRAGONSHED_CHESTPLATE.get());
			tabData.accept(CointoroQualtasModItems.DRAGONSHED_LEGGINGS.get());
			tabData.accept(CointoroQualtasModItems.DRAGONSHED_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CointoroQualtasModItems.ASTRALINFECTION_BUCKET.get());
			tabData.accept(CointoroQualtasModItems.ASTRALPLANES.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(CointoroQualtasModItems.SENTINEL_SPAWN_EGG.get());
		}
	}
}