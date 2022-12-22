/*
    Aim :
        Introduce the concept of Abstraction, packages.
    Program :
        Develop a java application to implement currency converter (Dollar to INR, EURO to
        INR, Yen to INR and vice versa), distance converter (meter to KM, miles to KM and vice versa),
        time converter (hours to minutes, seconds and vice versa) using packages.
    
    OUTPUT :
            1.) Following are the choices :
                Enter 1 : Currency
                Enter 2 : Distance
                Enter 3 : Time
                Choose from the above option : 2
                Following are the choices :
                Enter 1 : Kilo Meter(Km)
                Enter 2 : Meter (m)
                Enter 3 : Mile (M)
                Choose from the above option : 1
                Enter the value in Kilo Meter : 1
                1.0 Kilo Meter = 1000 Meter
                1.0 Kilo Meter = 0.62 Mile

            2.) Following are the choices :
                Enter 1 : Currency
                Enter 2 : Distance
                Enter 3 : Time
                Choose from the above option : 1
                Following are the choices :
                Enter 1 : Rupee
                Enter 2 : Dollar
                Enter 3 : Euro
                Enter 4 : Yen
                Choose from the above option : 1
                Enter the Rupee amount you want to convert : 70 
                70.0 Rupee = 1 Dollar
                70.0 Rupee = 0.88 Euro
                70.0 Rupee = 111.11 Yen

            3.) Following are the choices :
                Enter 1 : Currency
                Enter 2 : Distance
                Enter 3 : Time
                Choose from the above option : 3
                Following are the choices :
                Enter 1 : Hours
                Enter 2 : Minutes
                Enter 3 : Seconds
                Choose from the above option : 1
                Enter the value in Hours : 1
                1.0 Hours = 60 Minutes
                1.0 Hours = 3600 Seconds
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyDistanceTimeConverter_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double amount, value, timeValue, rupee, dollar, euro, yen, km, m,  M, hours, minutes, seconds;
        int choice, selection;
        DecimalFormat f = new DecimalFormat("##.##");
        System.out.println("Following are the choices :");
        System.out.println("Enter 1 : Currency");
        System.out.println("Enter 2 : Distance");
        System.out.println("Enter 3 : Time");
        System.out.print("Choose from the above option : ");
        selection = sc.nextInt();
        switch (selection)
        {
            case 1 :
                    System.out.println("Following are the choices :");
                    System.out.println("Enter 1 : Rupee");
                    System.out.println("Enter 2 : Dollar");
                    System.out.println("Enter 3 : Euro");
                    System.out.println("Enter 4 : Yen");
                    System.out.print("Choose from the above option : ");
                    choice = sc.nextInt();
                    switch (choice)
                    {
                        case 1 :
                                System.out.print("Enter the Rupee amount you want to convert : ");
                                amount = sc.nextFloat();
                                dollar = amount / 70;
                                System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");
                                euro = amount / 80;
                                System.out.println(amount + " Rupee = " + f.format(euro) + " Euro");
                                yen = amount / 0.63;
                                System.out.println(amount + " Rupee = " + f.format(yen) + " Yen");
                                break;
                        case 2 :
                                System.out.print("Enter the Dollar amount you want to convert : ");
                                amount = sc.nextFloat();
                                rupee = amount * 70;
                                System.out.println(amount + " Dollar = " + f.format(rupee) + " Rupee");
                                euro = amount * 0.87;
                                System.out.println(amount + " Dollar = " + f.format(euro) + " Euro");
                                yen = amount / 111.087;
                                System.out.println(amount + " Dollar = " + f.format(yen) + " Yen");
                                break;
                        case 3 :
                                System.out.print("Enter the Euro amount you want to convert : ");
                                amount = sc.nextFloat();
                                rupee = amount * 80;
                                System.out.println(amount + " Euro = " + f.format(rupee) + " Rupee");
                                dollar = amount * 1.14;
                                System.out.println(amount + " Euro = " + f.format(dollar) + " Dollar");
                                yen = amount * 127.32;
                                System.out.println(amount + " Euro = " + f.format(yen) + " Yen");
                                break;
                        case 4 :
                                System.out.print("Enter the Yen amount you want to convert : ");
                                amount = sc.nextFloat();
                                rupee = amount * 0.63;
                                System.out.println(amount + " Yen = " + f.format(rupee) + " Rupee");
                                dollar = amount * 0.008;
                                System.out.println(amount + " Yen = " + f.format(dollar) + " Dollor");
                                euro = amount * 0.007;
                                System.out.println(amount + " Yen = " + f.format(euro) + " Euro");
                                break;
                        default :
                                System.out.println("Invalid Input!");
                                break;
                            }
                    break;
            case 2 :
                    System.out.println("Following are the choices :");
                    System.out.println("Enter 1 : Kilo Meter(Km)");
                    System.out.println("Enter 2 : Meter (m)");
                    System.out.println("Enter 3 : Mile (M)");
                    System.out.print("Choose from the above option : ");
                    choice = sc.nextInt();
                    switch (choice)
                    {
                        case 1 :
                                System.out.print("Enter the value in Kilo Meter : ");
                                value = sc.nextInt();
                                m = value * 1000;
                                System.out.println(value + " Kilo Meter = " + f.format(m) + " Meter");
                                M = value * 0.6231371;
                                System.out.println(value + " Kilo Meter = " + f.format(M) + " Mile");
                                break;
                        case 2 :
                                System.out.print("Enter the value in Meter : ");
                                value = sc.nextInt();
                                km = value / 1000;
                                System.out.println(value + " Meter = " + f.format(km) + " Kilo Meter");
                                M = value * 0.000621371;
                                System.out.println(value + " Meter = " + f.format(M) + " Mile");
                                break;
                        case 3 :
                                System.out.print("Enter the value in Mile : ");
                                value = sc.nextInt();
                                km = value * 1.60934;
                                System.out.println(value + " Mile = " + f.format(km) + " Kilo Meter");
                                m = value * 1609.34;
                                System.out.println(value + " Mile = " + f.format(m) + " Meter");
                                break;
                        default :
                                System.out.println("Invalid Input!");
                                break;
                            }
                    break;
            case 3 :
                    System.out.println("Following are the choices :");
                    System.out.println("Enter 1 : Hours");
                    System.out.println("Enter 2 : Minutes");
                    System.out.println("Enter 3 : Seconds");
                    System.out.print("Choose from the above option : ");
                    choice = sc.nextInt();
                    switch (choice)
                    {
                        case 1 :
                                System.out.print("Enter the value in Hours : ");
                                timeValue = sc.nextInt();
                                minutes = timeValue * 60;
                                System.out.println(timeValue + " Hours = " + f.format(minutes) + " Minutes");
                                seconds = timeValue * 3600;
                                System.out.println(timeValue + " Hours = " + f.format(seconds) + " Seconds");
                                break;
                        case 2 :
                                System.out.print("Enter the value in Minutes : ");
                                timeValue = sc.nextInt();
                                hours = timeValue / 60;
                                System.out.println(timeValue + " Minutes = " + f.format(hours) + " Hours");
                                seconds = timeValue * 60;
                                System.out.println(timeValue + " Minutes = " + f.format(seconds) + " Seconds");
                                break;
                        case 3 :
                                System.out.print("Enter the value in Seconds : ");
                                timeValue = sc.nextInt();
                                hours = timeValue / 60;
                                System.out.println(timeValue + " Seconds = " + f.format(hours) + " Hours");
                                minutes = timeValue / 3600;
                                System.out.println(timeValue + " Seconds = " + f.format(minutes) + " Minutes");
                                break;
                        default :
                                System.out.println("Invalid Input!");
                                break;
                            }
                    break;
            default :
                    System.out.println("Invalid Input!");
                    break;
        }
        sc.close();
    }
}