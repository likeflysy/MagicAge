package com.magicage.com;

import com.magicage.com.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = magicage.MODID, name = magicage.NAME , version = magicage.VERSION , acceptedMinecraftVersions = "1.12.2")
public class magicage {
    public static final String MODID = "magicage" ;
    public static final String NAME = "Magic Age" ;
    public static final String VERSION = "1.0.0" ;

    @Instance(magicage.MODID)
    public static magicage instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }

    @SidedProxy(clientSide = "com.magicage.com.client.ClientProxy",
    serverSide = "com.magicage.com.common.CommonProxy")
    public static CommonProxy proxy;
}

