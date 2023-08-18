package net.frogybot.shopexperience.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.frogybot.shopexperience.ShopExperience;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SHOP_EXPERIENCE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ShopExperience.MOD_ID, "marketcoin"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.marketcoin"))
                    .icon(() -> new ItemStack(ModItems.MARKETCOIN)).entries((displayContext, entries) -> {
                    entries.add(ModItems.MARKETCOIN);

                    }).build());
    public static void registerItemGroups(){

        ShopExperience.LOGGER.info("Registering Item Groups for " + ShopExperience.MOD_ID);
    }
}
