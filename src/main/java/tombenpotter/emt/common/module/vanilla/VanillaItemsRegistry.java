package tombenpotter.emt.common.module.vanilla;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import tombenpotter.emt.ModInformation;
import tombenpotter.emt.common.module.vanilla.items.ItemCraftingComponent;
import tombenpotter.emt.common.module.vanilla.items.tools.ItemVanillaChainsaw;
import tombenpotter.emt.common.module.vanilla.items.tools.ItemVanillaDrill;
import tombenpotter.emt.common.module.vanilla.items.tools.ItemVanillaOmnitool;

public class VanillaItemsRegistry {

    public static Item woodenDrill;
    public static Item stoneDrill;
    public static Item ironDrill;
    public static Item goldenDrill;
    public static Item diamondDrill;
    public static Item copperDrill;
    public static Item tinDrill;
    public static Item leadDrill;
    public static Item bronzeDrill;

    public static Item woodenChainsaw;
    public static Item stoneChainsaw;
    public static Item ironChainsaw;
    public static Item goldenChainsaw;
    public static Item diamondChainsaw;
    public static Item copperChainsaw;
    public static Item tinChainsaw;
    public static Item leadChainsaw;
    public static Item bronzeChainsaw;

    public static Item ironOmnitool;
    public static Item goldenOmnitool;
    public static Item diamondOmnitool;
    public static Item copperOmnitool;
    public static Item tinOmnitool;
    public static Item leadOmnitool;
    public static Item bronzeOmnitool;

    public static Item craftingComponent;

    public static Item.ToolMaterial copperMaterial = EnumHelper.addToolMaterial("copperToolMaterial", 2, 300, 6.0F, 2.0F, 14);
    public static Item.ToolMaterial tinMaterial = EnumHelper.addToolMaterial("tinToolMatierial", 2, 200, 8.0F, 4F, 18);
    public static Item.ToolMaterial leadMaterial = EnumHelper.addToolMaterial("leadToolMaterial", 2, 250, 7.0F, 3F, 15);
    public static Item.ToolMaterial bronzeMaterial = EnumHelper.addToolMaterial("bronzeToolMaterial", 2, 350, 7.0F, 3.0F, 16);

    public static void registerItems() {
        craftingComponent = new ItemCraftingComponent().setUnlocalizedName(ModInformation.modid + ".material");
        GameRegistry.registerItem(craftingComponent, "craftingComponents");

        woodenDrill = new ItemVanillaDrill(Item.ToolMaterial.WOOD, 75, ":drill_wood", new ItemStack(Item.getItemFromBlock(Blocks.planks))).setUnlocalizedName(ModInformation.modid + ".drill.wood");
        GameRegistry.registerItem(woodenDrill, "woodenDrill");
        stoneDrill = new ItemVanillaDrill(Item.ToolMaterial.STONE, 165, ":drill_stone", new ItemStack(Item.getItemFromBlock(Blocks.cobblestone))).setUnlocalizedName(ModInformation.modid + ".drill.stone");
        GameRegistry.registerItem(stoneDrill, "stoneDrill");
        ironDrill = new ItemVanillaDrill(Item.ToolMaterial.IRON, 400, ":drill_iron", new ItemStack(Items.iron_ingot)).setUnlocalizedName(ModInformation.modid + ".drill.iron");
        GameRegistry.registerItem(ironDrill, "ironDrill");
        goldenDrill = new ItemVanillaDrill(Item.ToolMaterial.GOLD, 55, ":drill_gold", new ItemStack(Items.gold_ingot)).setUnlocalizedName(ModInformation.modid + ".drill.gold");
        GameRegistry.registerItem(goldenDrill, "goldenDrill");
        diamondDrill = new ItemVanillaDrill(Item.ToolMaterial.EMERALD, 2015, ":drill_diamond", new ItemStack(Items.diamond)).setUnlocalizedName(ModInformation.modid + ".drill.diamond");
        GameRegistry.registerItem(diamondDrill, "diamondDrill");
        copperDrill = new ItemVanillaDrill(copperMaterial, 450, ":drill_copper", OreDictionary.getOres("ingotCopper").get(0)).setUnlocalizedName(ModInformation.modid + ".drill.copper");
        GameRegistry.registerItem(copperDrill, "copperDrill");
        tinDrill = new ItemVanillaDrill(tinMaterial, 350, ":drill_tin", OreDictionary.getOres("ingotTin").get(0)).setUnlocalizedName(ModInformation.modid + ".drill.tin");
        GameRegistry.registerItem(tinDrill, "tinDrill");
        leadDrill = new ItemVanillaDrill(leadMaterial, 400, ":drill_lead", OreDictionary.getOres("ingotLead").get(0)).setUnlocalizedName(ModInformation.modid + ".drill.lead");
        GameRegistry.registerItem(leadDrill, "leadDrill");
        bronzeDrill = new ItemVanillaDrill(bronzeMaterial, 650, ":drill_bronze", OreDictionary.getOres("ingotBronze").get(0)).setUnlocalizedName(ModInformation.modid + ".drill.bronze");
        GameRegistry.registerItem(bronzeDrill, "bronzeDrill");

        woodenChainsaw = new ItemVanillaChainsaw(Item.ToolMaterial.WOOD, 75, ":woodenChainsaw", Item.getItemFromBlock(Blocks.planks)).setUnlocalizedName(ModInformation.modid + ".chainsaw.wood");
        GameRegistry.registerItem(woodenChainsaw, "woodenChainsaw");
        stoneChainsaw = new ItemVanillaChainsaw(Item.ToolMaterial.STONE, 165, ":stoneChainsaw", Item.getItemFromBlock(Blocks.cobblestone)).setUnlocalizedName(ModInformation.modid + ".chainsaw.stone");
        GameRegistry.registerItem(stoneChainsaw, "stoneChainsaw");
        ironChainsaw = new ItemVanillaChainsaw(Item.ToolMaterial.IRON, 315, ":ironChainsaw", Items.iron_ingot, 3F).setUnlocalizedName(ModInformation.modid + ".chainsaw.iron");
        GameRegistry.registerItem(ironChainsaw, "ironChainsaw");
        goldenChainsaw = new ItemVanillaChainsaw(Item.ToolMaterial.GOLD, 55, ":goldenChainsaw", Items.gold_ingot).setUnlocalizedName(ModInformation.modid + ".chainsaw.gold");
        GameRegistry.registerItem(goldenChainsaw, "goldenChainsaw");
        diamondChainsaw = new ItemVanillaChainsaw(Item.ToolMaterial.EMERALD, 2015, ":diamondChainsaw", Items.diamond, 6F).setUnlocalizedName(ModInformation.modid + ".chainsaw.diamond");
        GameRegistry.registerItem(diamondChainsaw, "diamondChainsaw");

        ironOmnitool = new ItemVanillaOmnitool(Item.ToolMaterial.IRON, 500, ":ironOmnitool", Items.iron_ingot).setUnlocalizedName(ModInformation.modid + ".omnitool.iron");
        GameRegistry.registerItem(ironOmnitool, "ironOmnitool");
        goldenOmnitool = new ItemVanillaOmnitool(Item.ToolMaterial.GOLD, 100, ":goldenOmnitool", Items.gold_ingot).setUnlocalizedName(ModInformation.modid + ".omnitool.gold");
        GameRegistry.registerItem(goldenOmnitool, "goldenOmnitool");
        diamondOmnitool = new ItemVanillaOmnitool(Item.ToolMaterial.EMERALD, 3900, ":diamondOmnitool", Items.diamond).setUnlocalizedName(ModInformation.modid + ".omnitool.diamond");
        GameRegistry.registerItem(diamondOmnitool, "diamondOmnitool");
    }
}