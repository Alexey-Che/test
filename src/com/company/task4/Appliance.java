package com.company.task4;

public class Appliance {

    private String name;

    public Appliance(String name) {
        this.name = name;
    }

    protected boolean turnOna () {
        System.out.println("Appliance");
        return true;
    }

    public Appliance()  {
        System.out.println("werw");
    }

}
