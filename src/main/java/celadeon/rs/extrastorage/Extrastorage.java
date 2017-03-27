package celadeon.rs.extrastorage;

import celadeon.rs.extrastorage.proxy.CommonProxy;
import celadeon.rs.extrastorage.tab.CreativeTabExtrastorage;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Extrastorage.MODID, version = Extrastorage.VERSION, name = Extrastorage.NAME)
public class Extrastorage
{
    public static final String MODID = "rs.extrastorage";
    public static final String VERSION = "1.0";
    public static final String NAME = "Extrastorage";

    @SidedProxy(clientSide = "celadeon.rs.extrastorage.proxy.ClientProxy", serverSide = "celadeon.rs.extrastorage.proxy.CommonProxy")
    public static CommonProxy proxy;
    @Mod.Instance
    public static Extrastorage instance;
    public static CreativeTabExtrastorage tabExtrastorage;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        tabExtrastorage = new CreativeTabExtrastorage(CreativeTabs.getNextID(), "tabExtrastorage");
        proxy.preInit(event);
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
