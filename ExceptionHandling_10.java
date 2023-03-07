/*
    Aim :
        Exception handling in java, introduction to throwable class, throw, throws, finally.
    Program :
        Write a Java program to read two integers a and b. Compute a/b and print, when b
        is not zero. Raise an exception when b is equal to zero.
    
    OUTPUT :
        a
*/

import java.util.Scanner;

public class ExceptionHandling_10
{
    int c;
    void div(int a,int b)
    {
        try
        {
            c=a/b;
            System.out.println("Result = "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ExceptionHandling_10 obj = new ExceptionHandling_10();
        System.out.print("Enter the values of a and b : ");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        obj.div(no1,no2);
        sc.close();
    }
}