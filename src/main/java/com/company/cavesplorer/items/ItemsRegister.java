package com.company.cavesplorer.items;

import com.company.cavesplorer.items.mendeleevs_table.Chemical_Element;
import com.company.cavesplorer.items.mendeleevs_table.Helium_Plate;
import com.company.cavesplorer.items.mendeleevs_table.Hydrogen_Plate;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemsRegister {

    public static Item CHEMICAL_ELEMENT_PLATE = new Chemical_Element("chemical_element");
    public static Item HYDROGEN_PLATE = new Hydrogen_Plate("hydrogen_plate", 1, "HYDROGEN", "I_A");
    public static Item HELIUM_PLATE = new Helium_Plate("helium_plate", 2, "HELIUM", "VIII_A");

    public static void register() {
        setRegister(CHEMICAL_ELEMENT_PLATE);
        setRegister(HYDROGEN_PLATE);
        setRegister(HELIUM_PLATE);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        setRender(CHEMICAL_ELEMENT_PLATE);
        setRender(HYDROGEN_PLATE);
        setRender(HELIUM_PLATE);
    }

    public static void setRegister(Item item) {

        ForgeRegistries.ITEMS.register(item);

    }

    @SideOnly(Side.CLIENT)
    public static void setRender(Item item) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }


}
