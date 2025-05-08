package net.missile.ancientlibrary.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.missile.ancientlibrary.Config;

public class AncientLibraryBlock extends Block {

    public AncientLibraryBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public float getEnchantPowerBonus(BlockState state, LevelReader level, BlockPos pos) {
        return (float) Config.bookshelfPower;
    }
}
