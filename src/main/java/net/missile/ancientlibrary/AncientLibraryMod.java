package net.missile.ancientlibrary;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.missile.ancientlibrary.setup.AncientLibraryInit;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AncientLibraryMod.MODID)
public class AncientLibraryMod
{
    public static final String MODID = "ancientlibrary";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AncientLibraryMod(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        AncientLibraryInit.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
            event.accept(AncientLibraryInit.ANCIENT_LIBRARY);
    }
}
