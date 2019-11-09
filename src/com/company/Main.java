package com.company;

public class Main {
    public static void main (String [] args ) {
        Student s = new Student();
        Student s2 = new Student( "ivanov", 12, 20.58  );
        System.out.println( s2.getName());
        s2.setName("petrov");
        System.out.println(s2.getName());
        Student s3 = new Student(25);


        int [] index = new int [4];
        index [0] = 1;
        index [1] = 3;
        index [2] = 0;
        index [3] = 2;
        String [] islands = new String[4];
        islands [0] = "Бермуды";
        islands [1] = "Фиджы";
        islands [2] = "Азорские острова";
        islands [3] = "Косумель";
        int y = 0;
        int ref;
        while (y < 4) {
            ref = index [y];
            System.out.print("острова = ");
            System.out.println(islands [ref]);
            y = y + 1;
        }
    }




}
