package com.brandonkyle.bk_mod;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = BK_Mod.MODID, version = alpha_1.VERSION)
public class BK_Mod
{
    public static final String MODID = "BK_Mod";
    public static final String VERSION = "alpha_1";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
