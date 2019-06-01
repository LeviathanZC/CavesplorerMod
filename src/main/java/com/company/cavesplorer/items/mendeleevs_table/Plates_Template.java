package com.company.cavesplorer.items.mendeleevs_table;

public class Plates_Template extends Chemical_Element {

    public Plates_Template(String name, int number, String latin, String group) {
        super(name);
        this.setNumber(number);
        this.setGroup(group);
        this.setLatin_name(latin);
    }

}
