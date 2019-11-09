package com.company.task4;

public class Toaster extends Appliance {

    private String name;

    public Toaster(String n)    {
        //super(n);
        name = n;
    }

    public boolean turnOn(int level) {
        return false;

    }

    public boolean turnOna (double a) {
        //super.turnOn();
        System.out.println("Toaster");
        return true;
    }



}
