package com.example.exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {

        float heightLusajo, weightLusajo, bmiLusajo;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This program wil calculate your BMI.");
        System.out.println("Please enter your height in cm:");
        heightLusajo = Float.parseFloat(br.readLine())/100;
        System.out.println("Now enter your weight:");
        weightLusajo = Float.parseFloat(br.readLine());

        bmiLusajo = (float)(weightLusajo/(Math.pow(heightLusajo,2)));
        System.out.printf("Your BMI IS: " + "%2.2f, \n", bmiLusajo);

        if(bmiLusajo<16){
            System.out.println("You're starving");
        }else if ((bmiLusajo>=16)&&(bmiLusajo<16.99)){
            System.out.println("You're emaciated");
        }else if ((bmiLusajo>=17)&&(bmiLusajo<18.49)){
            System.out.println("You're underweight");
        }else if ((bmiLusajo>=18.50)&&(bmiLusajo<22.99)){
            System.out.println("You're in the low range of normal");
        }else if ((bmiLusajo>=23)&&(bmiLusajo<24.99)){
            System.out.println("You're in the high range of normal");
        }else if ((bmiLusajo>=25)&&(bmiLusajo<27.49)){
            System.out.println("You're pre-obese");
        }else if ((bmiLusajo>=27.50)&&(bmiLusajo<29.99)){
            System.out.println("You're overweight");
        }else if ((bmiLusajo>=30)&&(bmiLusajo<34.9)){
            System.out.println("You have a 1st degree obesity");
        }else if ((bmiLusajo>=35)&&(bmiLusajo<39.9)){
            System.out.println("You have a 2nd degree obesity");
        }else if (bmiLusajo>=40){
            System.out.println("You have a 3rd degree obesity");
        }
    }
}