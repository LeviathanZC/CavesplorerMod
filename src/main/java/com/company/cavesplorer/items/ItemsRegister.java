package com.company.cavesplorer.items;

import com.company.cavesplorer.items.mendeleevs_table.Chemical_Element;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemsRegister {

    public static Item CHEMICAL_ELEMENT = new Chemical_Element("chemical_element");

    public static void register() {
        setRegister(CHEMICAL_ELEMENT);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
        setRender(CHEMICAL_ELEMENT);
    }

    public static void setRegister(Item item) {

        ForgeRegistries.ITEMS.register(item);

    }

    @SideOnly(Side.CLIENT)
    public static void setRender(Item item) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

    }


}
