package net.mcreator.cointoroqualtas.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class AstralbarItem extends Item {
	public AstralbarItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(-20).saturationModifier(-5f).alwaysEdible().build()).usingConvertsTo(Items.DRAGON_BREATH));
	}
}