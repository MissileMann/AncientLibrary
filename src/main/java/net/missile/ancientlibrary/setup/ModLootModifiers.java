package net.missile.ancientlibrary.setup;

import com.mojang.serialization.Codec;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.missile.ancientlibrary.AncientLibraryMod;

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MOD = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, AncientLibraryMod.MODID);
    public static final RegistryObject<Codec<AncientLibraryLootMod>> ROLL_LOOT_TABLE = LOOT_MOD.register("roll_loot_table", AncientLibraryLootMod.CODEC);
}
