package com.example.exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException{

        float firstNumberLusajo, secondNumberLusajo, sum, subtraction, product, quotient;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program calculates the simplest of all calculations.");
        System.out.println("Enter the first number:");
        firstNumberLusajo = Float.parseFloat(br.readLine());
        System.out.println("Enter the second number:");
        secondNumberLusajo = Float.parseFloat(br.readLine());

        sum = firstNumberLusajo + secondNumberLusajo;
        subtraction = firstNumberLusajo - secondNumberLusajo;
        product = firstNumberLusajo * secondNumberLusajo;
        quotient = firstNumberLusajo / secondNumberLusajo;

        System.out.printf("The first number that was entered was: " + "%2.2f", firstNumberLusajo);
        System.out.printf(" and the second number was: " + "%2.2f", secondNumberLusajo);

        System.out.println();

        System.out.printf("Sum is: " + "%2.2f, \n",sum);
        System.out.printf("Difference is: " + "%2.2f, \n",subtraction);
        System.out.printf("Product is: " + "%2.2f, \n",product);
        System.out.printf("Quotient is: " + "%2.2f, \n",quotient);
    }
}