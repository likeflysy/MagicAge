package com.magicage.com.item;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemLoader {
    public static Item Ruby = new ItemRuby();

    public ItemLoader(FMLPreInitializationEvent event)
    {
        register(Ruby, "ruby");
    }

    private void register(Item item, String name)
    {
        Ruby = new Item().setRegistryName("Ruby");
    }


        @SubscribeEvent
        public static void registerItems (RegistryEvent.Register < Item > event)
        {
            event.getRegistry().register(new ItemRuby());
        }

}
