package com.company.cavesplorer.items;

import com.company.cavesplorer.items.mendeleevs_table.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemsRegister {

    public static Item CHEMICAL_ELEMENT_PLATE = new Chemical_Element("chemical_element");
    public static Item HYDROGEN_PLATE = new Hydrogen_Plate("hydrogen_plate", 1, "I_A");
    public static Item HELIUM_PLATE = new Helium_Plate("helium_plate", 2, "VIII_A");
    public static Item LITHIUM_PLATE = new Lithium_Plate("lithium_plate", 3, "I_A");
    public static Item NATRIUM_PLATE = new Natrium_Plate("natrium_plate", 11, "I_A");
    public static Item KALIUM_PLATE = new Kalium_Plate("kalium_plate", 19, "I_A");
    public static Item RUBIDIUM_PLATE = new Rubidium_Plate("rubidium_plate", 37, "I_A");
    public static Item CAESIUM_PLATE = new Caesium_Plate("caesium_plate", 55, "I_A");


    public static void register() {
        setRegister(CHEMICAL_ELEMENT_PLATE);
        setRegister(HYDROGEN_PLATE);
        setRegister(HELIUM_PLATE);
        setRegister(LITHIUM_PLATE);
        setRegister(NATRIUM_PLATE);
        setRegister(KALIUM_PLATE);
        setRegister(RUBIDIUM_PLATE);
        setRegister(CAESIUM_PLATE);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        setRender(CHEMICAL_ELEMENT_PLATE);
        setRender(HYDROGEN_PLATE);
        setRender(HELIUM_PLATE);
        setRender(LITHIUM_PLATE);
        setRender(NATRIUM_PLATE);
        setRender(KALIUM_PLATE);
        setRender(RUBIDIUM_PLATE);
        setRender(CAESIUM_PLATE);
    }

    public static void setRegister(Item item) {

        ForgeRegistries.ITEMS.register(item);

    }

    @SideOnly(Side.CLIENT)
    public static void setRender(Item item) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }


}
