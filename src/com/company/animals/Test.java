package com.company.animals;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main (String [] args)    {
        new Test().go();

        ArrayList<Dog> dogs = new ArrayList<Dog>();
        List<Animals> anomals1 = new ArrayList<Animals>();
        List<Dog> doglist = dogs;
    }

    public void go()    {
        Animals[] animals = {new Dog(), new Cat(), new Dog()};
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
        takeAnimals(animals);
        //takeAnimals(dogs);
    }

    public void takeAnimals (Animals[] animals) {
        for (Animals a : animals)   {
            a.eat();
        }
        animals[0] = new Cat();
    }
}
