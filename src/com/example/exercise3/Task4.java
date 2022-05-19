package com.example.exercise3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){

        int evenSum = 0;
        int n = 100;

        for (int i = 1; i <= n; i++){
            if(i % 2 == 0){
                evenSum = evenSum + i;
            }
        }
        System.out.println("The sum of all even numbers from the range 1 to " + n + " is: " + evenSum);
    }
}