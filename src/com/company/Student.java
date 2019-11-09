package com.company;

public class Student {
    private String name;
    private int age;
    private double cash;

    public Student() {
        age = 5;
    }

    public Student(String name, int age, double cash) {
        this.name = name;
        this.age = age;
        this.cash = cash;
    }
    public String getName () {
        return name;
    }
    public void setName(String name1) {

        name = name1;
    }
    public Student (int age) {
        name = "Sasha";
        this.age = age;
    }




}
