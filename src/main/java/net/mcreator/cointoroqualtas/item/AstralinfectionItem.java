package net.mcreator.cointoroqualtas.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.cointoroqualtas.init.CointoroQualtasModFluids;

public class AstralinfectionItem extends BucketItem {
	public AstralinfectionItem(Item.Properties properties) {
		super(CointoroQualtasModFluids.ASTRALINFECTION.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC));
	}
}