/*
    Aim :
        Demonstrate creation of threads using Thread class and Runnable interface, multi-threaded
        programming.
    Program :
        Write a Java program that implements a multi-thread application that has three threads.
        First thread generates a random integer for every 1 second; Second thread computes the
        square of the number and prints; third thread will print the value of cube of the number.
    
    OUTPUT :
            Generated number is : 17
            The thread 17 is Odd, and cube of 17 is : 4913
            --------------------------------------------------
            Generated number is : 19
            The thread 19 is Odd, and cube of 19 is : 6859
            --------------------------------------------------
            Generated number is : 11
            The thread 11 is Odd, and cube of 11 is : 1331
            --------------------------------------------------
            Generated number is : 3
            The thread 3 is Odd, and cube of 3 is : 27
            --------------------------------------------------
            Generated number is : 12
            The thread 12 is Even, and square of 12 is : 144
            --------------------------------------------------
            Generated number is : 4
            The thread 4 is Even, and square of 4 is : 16
            --------------------------------------------------
            Generated number is : 0
            The thread 0 is Even, and square of 0 is : 0
            --------------------------------------------------
            Generated number is : 12
            The thread 12 is Even, and square of 12 is : 144
            --------------------------------------------------
            Generated number is : 18
            The thread 18 is Even, and square of 18 is : 324
            --------------------------------------------------
            Generated number is : 4
            The thread 4 is Even, and square of 4 is : 16
            --------------------------------------------------
*/

import java.util.*;
import java.util.random.RandomGenerator;

class EvenNumber implements Runnable
{
    public int a;
    public EvenNumber(int a)
    {
        this.a = a;
    }
    public void run()
    {
        System.out.println("The thread " + a + " is Even, and square of " + a + " is : " + (a * a) );
    }
}

class OddNumber implements Runnable
{
    public int a;
    public OddNumber(int a)
    {
        this.a = a;
    }
    public void run()
    {
        System.out.println("The thread " + a + " is Odd, and cube of " + a + " is : " + (a * a * a) );
    }
}

class RandomNumberGenerator extends Thread
{
    public void run()
    {
        int n = 0; 
        Random random = new Random();
        try
        {
            for (int i = 0 ; i < 10 ; i++)
            {
                n = random.nextInt(20);
                System.out.println("Generated number is : " + n);
                if (n % 2 == 0)
                {
                    Thread thread1 = new Thread( new EvenNumber(n) );
                    thread1.start();
                }
                else
                {
                    Thread thread2 = new Thread( new OddNumber(n) );
                    thread2.start();
                }
                Thread.sleep(1000);
                System.out.println("--------------------------------------------------");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}

public class MultiThreadRandomEvenOdd_8
{
    public static void main(String[] args)
    {
        RandomNumberGenerator rand_num = new RandomNumberGenerator();
        rand_num.start();
    }
}