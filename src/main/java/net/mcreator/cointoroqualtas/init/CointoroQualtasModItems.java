/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cointoroqualtas.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cointoroqualtas.item.RawastralItem;
import net.mcreator.cointoroqualtas.item.DragonshedItem;
import net.mcreator.cointoroqualtas.item.DragonscalesItem;
import net.mcreator.cointoroqualtas.item.AstralplanesItem;
import net.mcreator.cointoroqualtas.item.AstralinfectionItem;
import net.mcreator.cointoroqualtas.item.AstralbarItem;
import net.mcreator.cointoroqualtas.item.ArrowstaffItem;
import net.mcreator.cointoroqualtas.CointoroQualtasMod;

import java.util.function.Function;

public class CointoroQualtasModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CointoroQualtasMod.MODID);
	public static final DeferredItem<Item> DRAGONSHED_HELMET = register("dragonshed_helmet", DragonshedItem.Helmet::new);
	public static final DeferredItem<Item> DRAGONSHED_CHESTPLATE = register("dragonshed_chestplate", DragonshedItem.Chestplate::new);
	public static final DeferredItem<Item> DRAGONSHED_LEGGINGS = register("dragonshed_leggings", DragonshedItem.Leggings::new);
	public static final DeferredItem<Item> DRAGONSHED_BOOTS = register("dragonshed_boots", DragonshedItem.Boots::new);
	public static final DeferredItem<Item> ASTRALINFECTION_BUCKET = register("astralinfection_bucket", AstralinfectionItem::new);
	public static final DeferredItem<Item> ASTRALPLANES = register("astralplanes", AstralplanesItem::new);
	public static final DeferredItem<Item> SENTINEL_SPAWN_EGG = register("sentinel_spawn_egg", properties -> new SpawnEggItem(CointoroQualtasModEntities.SENTINEL.get(), properties));
	public static final DeferredItem<Item> ASTRALBAR = register("astralbar", AstralbarItem::new);
	public static final DeferredItem<Item> RAWASTRAL = register("rawastral", RawastralItem::new);
	public static final DeferredItem<Item> DRAGONSCALES = register("dragonscales", DragonscalesItem::new);
	public static final DeferredItem<Item> ASTRALORE = block(CointoroQualtasModBlocks.ASTRALORE, new Item.Properties().rarity(Rarity.EPIC));
	public static final DeferredItem<Item> ATLAS_SPAWN_EGG = register("atlas_spawn_egg", properties -> new SpawnEggItem(CointoroQualtasModEntities.ATLAS.get(), properties));
	public static final DeferredItem<Item> ARROWSTAFF = register("arrowstaff", ArrowstaffItem::new);

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