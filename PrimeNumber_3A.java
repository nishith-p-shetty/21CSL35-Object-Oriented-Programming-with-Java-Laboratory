/*
    Aim :
        Discuss the various Decision-making statements, loop constructs in java
    Program :
        A. Write a program to check prime number
    
    OUTPUT :
        1.) Enter a number : 1
            1 is a not Prime Number.

        2.) Enter a number : 2
            2 is a Prime Number.

        3.) Enter a number : 3
            3 is a Prime Number.

        4.) Enter a number : 4
            4 is a not Prime Number.
*/

import java.util.Scanner;

public class PrimeNumber_3A
{
    public static boolean isPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(n) ; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");;
        int n = sc.nextInt();
        if ( isPrime(n) )
        {
            System.out.println(n + " is a Prime Number.");
        }
        else
        {
            System.out.println(n + " is a not Prime Number.");
        }
        sc.close();
    }
}