package grapeskin.lava_sponge;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class LavaSpongeMod implements ModInitializer {
    public static final LavaSpongeBlock LAVA_SPONGE_BLOCK = new LavaSpongeBlock(FabricBlockSettings.of(Material.SPONGE).strength(0.6F).sounds(BlockSoundGroup.GRASS));
    public static final WetLavaSpongeBlock WET_LAVA_SPONGE_BLOCK = new WetLavaSpongeBlock(FabricBlockSettings.of(Material.SPONGE).strength(0.6F).sounds(BlockSoundGroup.GRASS));

	@Override
	public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("lavasponge", "lava_sponge"), LAVA_SPONGE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lavasponge", "lava_sponge"), new BlockItem(LAVA_SPONGE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier("lavasponge", "wet_lava_sponge"), WET_LAVA_SPONGE_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("lavasponge", "wet_lava_sponge"), new BlockItem(WET_LAVA_SPONGE_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}
}
