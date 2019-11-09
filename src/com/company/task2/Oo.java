package com.company.task2;

public class Oo {

    Integer i = 1;
    int j;

    public static void main (String [] args)    {
        Boolean b0 = new Boolean("true");
        boolean b = b0.booleanValue();



        Math.abs(-5);
        int a = 90;
        a++;
        Oo t = new Oo();
        t.go ();
        t.goo(a);


    }

    public void go ()   {
        j=i;
        System.out.println(j);
        System.out.println(i);
    }

    int x = 12;

    public static void goo (final int x)    {
        System.out.println(x);
    }




}
