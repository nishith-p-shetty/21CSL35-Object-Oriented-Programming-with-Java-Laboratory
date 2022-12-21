/*
    Aim :
        Introduce concepts of method overloading, constructor overloading, overriding.
    Program :
        Write a java program demonstrating Method overloading.
    
    OUTPUT :
            110
            6.0
            51.0
*/

import java.util.Scanner;

class MethodOverloading
{
    int add(int a, int b)
    {
        return (a + b);
    }
    float add(float a, float b)
    {
        return (a + b);
    }
    double add(int a, double b, double c)
    {
        return (a + b +c);
    }
}

public class MethodOverloading_5A
{
    public static void main(String[] args)
    {
        MethodOverloading mobj = new MethodOverloading();
        System.out.println( mobj.add(50, 60) );
        System.out.println( mobj.add(3.5f, 2.5f) );
        System.out.println( mobj.add(10, 30.5, 10.5) );
    }
}