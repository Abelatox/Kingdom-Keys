package wehavecookies56.kk.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import wehavecookies56.kk.lib.IDs;
import wehavecookies56.kk.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AddedBlocks {

    public static Block
    NormalBlox, HardBlox, MetalBlox, PrizeBlox, RarePrizeBlox, BounceBlox, DangerBlox, BlastBlox, Synthesiser;

    public static void preinit(){
        NormalBlox = new BlockNormalBlox(IDs.NBlox, Material.rock); GameRegistry.registerBlock(NormalBlox, Strings.NBlox);
        HardBlox = new BlockHardBlox(IDs.HBlox, Material.rock); GameRegistry.registerBlock(HardBlox, Strings.HBlox);
        MetalBlox = new BlockMetalBlox(IDs.MBlox, Material.iron); GameRegistry.registerBlock(MetalBlox, Strings.MBlox);
        PrizeBlox = new BlockPrizeBlox(IDs.PBlox, Material.sand); GameRegistry.registerBlock(PrizeBlox, Strings.PBlox);
        RarePrizeBlox = new BlockRarePrizeBlox(IDs.RPBlox, Material.sand); GameRegistry.registerBlock(RarePrizeBlox, Strings.RPBlox);
        BounceBlox = new BlockBounceBlox(IDs.BBlox, Material.iron); GameRegistry.registerBlock(BounceBlox, Strings.BBlox);
        DangerBlox = new BlockDangerBlox(IDs.DBlox, Material.iron); GameRegistry.registerBlock(DangerBlox, Strings.DBlox);
        BlastBlox = new BlockBlastBlox(IDs.BLBlox); GameRegistry.registerBlock(BlastBlox, Strings.BLBlox);
        Synthesiser = new BlockSynthesis(IDs.Synthesis, Material.wood); GameRegistry.registerBlock(Synthesiser, Strings.Synthesiser);
    } 
    
    public static void initBlockRecipes(){
    	GameRegistry.addRecipe(new ItemStack(BlastBlox), new Object[]{
        	"NLN",
            "HTH",
            "NHN",
            'N', NormalBlox, 'L', Item.bucketLava , 'H', HardBlox, 'T', Block.tnt  
    });
    }
}