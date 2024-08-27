
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.bwrayne.restaurantcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.Item;

import com.bwrayne.restaurantcraft.item.FrenchFriesItem;
import com.bwrayne.restaurantcraft.item.ChickenNuggetsItem;
import com.bwrayne.restaurantcraft.item.CheeseburgerItem;
import com.bwrayne.restaurantcraft.item.BigMacItem;
import com.bwrayne.restaurantcraft.RestaurantcraftMod;

public class RestaurantcraftModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RestaurantcraftMod.MODID);
	public static final DeferredHolder<Item, Item> FRENCH_FRIES = REGISTRY.register("french_fries", FrenchFriesItem::new);
	public static final DeferredHolder<Item, Item> CHICKEN_NUGGETS = REGISTRY.register("chicken_nuggets", ChickenNuggetsItem::new);
	public static final DeferredHolder<Item, Item> BIG_MAC = REGISTRY.register("big_mac", BigMacItem::new);
	public static final DeferredHolder<Item, Item> CHEESEBURGER = REGISTRY.register("cheeseburger", CheeseburgerItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
