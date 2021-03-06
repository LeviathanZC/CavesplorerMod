package com.company.cavesplorer.items.mendeleevs_table;

import com.company.cavesplorer.Cavesplorer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Chemical_Element extends Item {

    private int number;
    private String group;

    public Chemical_Element(String name) {
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setMaxStackSize(16);
        this.setCreativeTab(Cavesplorer.CHEMICAL_ELEMENTS);
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }


    public void setGroup(String number) {
        this.group = number;
    }

    public String getGroup() {
        return this.group;
    }

}
