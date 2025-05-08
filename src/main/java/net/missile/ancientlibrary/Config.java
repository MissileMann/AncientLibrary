package net.missile.ancientlibrary;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = AncientLibraryMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config
{
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.IntValue BOOKSHELF_POWER = BUILDER
            .comment("The amount of enchanting power this bookshelf should give. \nIn vanilla, you only need a power of 15 for Level 30 enchantments.\n(Default: 15)")
            .defineInRange("bookshelfPower", 15, 0, Integer.MAX_VALUE);
    static final ForgeConfigSpec SPEC = BUILDER.build();
    public static int bookshelfPower;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
        bookshelfPower = BOOKSHELF_POWER.get();
    }
}
