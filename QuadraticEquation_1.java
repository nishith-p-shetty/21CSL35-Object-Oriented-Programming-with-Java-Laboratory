/*
    Aim :
        Introduce the java fundamentals, data types, operators in java.
    Program :
        Write a java program that prints all real solutions to the quadratic equation
        ax2+bx+c=0. Read in a, b, c and use the quadratic formula.
    
    OUTPUT :
        1.) Enter the value of a : 1
            Enter the value of b : 1
            Enter the value of c : -1
            The Roots are 0.6180339887498949 and -1.618033988749895

        2.) Enter the value of a : 1
            Enter the value of b : 2
            Enter the value of c : 3
            Roots are not real.

        3.) Enter the value of a : 1
            Enter the value of b : 2
            Enter the value of c : 1
            The Roots is -1.0
*/

import java.util.Scanner;

public class QuadraticEquation_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b : ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c : ");
        double c = sc.nextDouble();
        double d = (b * b) - (4.0 * a * c);
        if (d > 0.0)
        {
            double r1 = (-b + Math.pow(d, 0.5) ) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5) ) / (2.0 * a);
            System.out.println("The Roots are " + r1 + " and " + r2);
        }
        else if (d == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println("The Roots is " + r1);
        }
        else
        {
            System.out.println("Roots are not real.");
        }
        sc.close();
    }
}