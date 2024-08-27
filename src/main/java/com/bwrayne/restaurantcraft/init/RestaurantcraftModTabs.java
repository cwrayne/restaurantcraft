
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.bwrayne.restaurantcraft.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.bwrayne.restaurantcraft.RestaurantcraftMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class RestaurantcraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RestaurantcraftMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RESTAURANT_CRAFT = REGISTRY.register("restaurant_craft",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.restaurantcraft.restaurant_craft")).icon(() -> new ItemStack(RestaurantcraftModItems.FRENCH_FRIES.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RestaurantcraftModItems.FRENCH_FRIES.get());
				tabData.accept(RestaurantcraftModItems.CHICKEN_NUGGETS.get());
				tabData.accept(RestaurantcraftModItems.BIG_MAC.get());
				tabData.accept(RestaurantcraftModItems.CHEESEBURGER.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(RestaurantcraftModItems.FRENCH_FRIES.get());
			tabData.accept(RestaurantcraftModItems.CHICKEN_NUGGETS.get());
			tabData.accept(RestaurantcraftModItems.BIG_MAC.get());
			tabData.accept(RestaurantcraftModItems.CHEESEBURGER.get());
		}
	}
}
