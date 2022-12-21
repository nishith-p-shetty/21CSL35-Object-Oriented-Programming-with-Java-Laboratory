/*
    Aim :
        Discuss the various Decision-making statements, loop constructs in java
    Program :
        B.Write a program for Arithmetic calculator using switch case menu
    
    OUTPUT :
        1.) Choose an operator +, -, *, / : +
            Enter first number : 2
            Enter second number : 4
            2.0  4.0 = 6.0

        2.) Choose an operator +, -, *, / : *
            Enter first number : 2
            Enter second number : 6
            2.0 * 6.0 = 12.0
*/

import java.util.Scanner;

public class ArithmeticCalculator_3B
{
    public static void main(String[] args)
    {
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose an operator +, -, *, / : ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter first number : ");
        double number1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        double number2 = sc.nextDouble();
        switch (operator)
        {
            case '+' :
                        result = number1 + number2;
                        System.out.println(number1 + "  " + number2 + " = " + result);
                        break;
                        
            case '-' :
                        result = number1 - number2;
                        System.out.println(number1 + " - " + number2 + " = " + result);
                        break;

            case '*' :
                        result = number1 * number2;
                        System.out.println(number1 + " * " + number2 + " = " + result);
                        break;
            
            case '/' :
                        result = number1 / number2;
                        System.out.println(number1 + " / " + number2 + " = " + result);
                        break;
            
            default :
                        System.out.println("Invalid Operator.");
                        break;
        }
        sc.close();
    }
}