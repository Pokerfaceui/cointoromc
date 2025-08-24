package net.mcreator.cointoroqualtas.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class DragonscalesItem extends Item {
	public DragonscalesItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(-10).saturationModifier(0.3f).alwaysEdible().build()).usingConvertsTo(Items.NETHERITE_HELMET));
	}
}