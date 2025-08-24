package net.mcreator.cointoroqualtas.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RawastralItem extends Item {
	public RawastralItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(20).saturationModifier(0f).alwaysEdible().build()).usingConvertsTo(Items.RAW_IRON));
	}
}