package com.example.exercise3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task3 {
    public static void main(String[] args) throws IOException {

        double a,b,c,delta,x1,x2;
        char rootsNumber = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("This program calculates the roots of a quadratic equation");
        System.out.println("Enter the value a: ");
        a = Double.parseDouble(br.readLine());

        if(a==0){
            System.out.println("The value of a must not be equal to zero.");
        }else{
            System.out.println("Enter the value b: ");
            b = Double.parseDouble(br.readLine());
            System.out.println("And now the value c: ");
            c = Double.parseDouble(br.readLine());

            delta = pow(b,2) - 4*a*c;

            if(delta<0) rootsNumber = 0;
            if(delta==0) rootsNumber = 1;
            if (delta>0) rootsNumber = 2;

            switch (rootsNumber){
                case 0:
                    System.out.println("There are no real roots");
                    break;
                case 1:{
                    x1 = -b/(2*a);
                    System.out.printf("a = " + "%4.2f \n",a);
                    System.out.printf("b = " + "%4.2f \n",b);
                    System.out.printf("c = " + "%4.2f \n",c);
                    System.out.print("This equation has a double root and it is: ");
                    System.out.printf("%4.2f, \n",x1);
                }break;
                case 2:{
                    x1 = (-b+sqrt(delta))/(2*a);
                    x2 = (-b-sqrt(delta))/(2*a);
                    System.out.printf("a = " + "%4.2f \n",a);
                    System.out.printf("b = " + "%4.2f \n",b);
                    System.out.printf("c = " + "%4.2f \n",c);
                    System.out.print("x1 = ");
                    System.out.printf("%4.2f \n",x1);
                    System.out.print("x2 = ");
                    System.out.printf("%4.2f \n",x2);
                }break;
            }
        }
    }
}
