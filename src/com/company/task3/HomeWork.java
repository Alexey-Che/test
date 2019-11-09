package com.company.task3;

public class HomeWork {

    public static void main (String [] args)    {

        int [] massive;
        massive = new int [10];

        for ( int i=0; i < massive.length; i++)     {
            massive[i] = (int) (Math.random() * 10);
        }

        screen(massive);

        int max = 0;
        int min = 0;
        double average = 0;

        for ( int i = 0; i < massive.length; i++)   {

            if (max < massive[i]) {
                max = massive[i];
            }

            if (min > massive[i])   {
                min = massive[i];
            }

            average += massive[i];
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("среднее = " + average/massive.length);

        for(int i = 2; i <= 100; i ++)  {
            boolean isPrime = true;

            for(int j = 2; j < i; j++)  {
                if(i % j == 0)  {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(i);
            }
        }


    }

    public static void screen(int[] abc) {
        for (int i = 0; i < abc.length; i++)    {
            System.out.print(abc[i] + " ");
        }
        System.out.println();

    }


}

