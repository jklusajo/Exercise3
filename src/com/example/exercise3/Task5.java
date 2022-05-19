package com.example.exercise3;

import java.util.Random;

public class Task5 {
    public static void main(String[] args){

        int size = 10, i = 1;
        int n, min = 101, max = 0;

        System.out.println("This program draws " + size + " integers from 1 to 100");
        System.out.println("and determines the smallest and largest of the selected.");

        Random r = new Random();
        System.out.print("Drawn: ");

        while (i <= size) {
            n = Math.round((r.nextInt(100) + 1));
            System.out.print(n + " , ");

            if (n < min) min = n;
            if (n > max) max = n;

            i++;
        }
        System.out.println("");
        System.out.println("The largest number in the set is: " + min);
        System.out.println("The smallest number in the set is: " + max);
    }
}
