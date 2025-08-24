/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cointoroqualtas.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.cointoroqualtas.potion.OnfireMobEffect;
import net.mcreator.cointoroqualtas.CointoroQualtasMod;

public class CointoroQualtasModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, CointoroQualtasMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> ONFIRE = REGISTRY.register("onfire", () -> new OnfireMobEffect());
}