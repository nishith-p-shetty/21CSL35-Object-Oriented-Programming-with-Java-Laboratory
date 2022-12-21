/*
    Aim :
        Demonstrate the core object-oriented concept of Inheritance, polymorphism
    Program :
        Design a super class called Staff with details as StaffId, Name, Phone, Salary. Extend this
        class by writing three subclasses namely Teaching (domain, publications), Technical (skills),
        and Contract (period). Write a Java program to read and display at least 3 staff objects of
        all three categories.
    
    OUTPUT :
            Enter the details of Teaching Staff : 
            Enter Staff ID : 001
            Enter Name : One
            Enter Phone : 1234567890
            Enter Salary : 100000
            Enter Domain : AIML
            Enter No. of Publications : 4
            
            
            Enter the details of Technical Staff : 
            Enter Staff ID : 002
            Enter Name : Two
            Enter Phone : 0987654321
            Enter Salary : 50000
            Enter Skills : Java Python
            
            
            Enter the details of Contract Staff : 
            Enter Staff ID : 003
            Enter Name : Three
            Enter Phone : 6789012345
            Enter Salary : 60000
            Enter Period : 20
            
            
            The details of the Teaching staff : 
            Staff ID : 001
            Name : One
            Phone : 1234567890
            Salary : 100000.0
            Domain : AIML
            Publications : 4
            
            
            The details of the Technical staff : 
            Staff ID : 002
            Name : Two
            Phone : 987654321
            Salary : 50000.0
            Technical Skills : Java Python
            
            
            The details of the Contract staff : 
            Staff ID : 003
            Name : Three
            Phone : 6789012345
            Salary : 60000.0
            Contract Period : 20
*/

import java.util.Scanner;

class Staff
{
    String staffID, name;
    long phone;
    float salary;
    
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Staff ID : ");
        staffID = sc.next();
        System.out.print("Enter Name : ");
        name = sc.next();
        System.out.print("Enter Phone : ");
        phone = sc.nextLong();
        System.out.print("Enter Salary : ");
        salary = sc.nextFloat();
    }

    public void display()
    {
        System.out.println("Staff ID : " + staffID);
        System.out.println("Name : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("Salary : " + salary);
    }
}

class Teaching extends Staff
{
    String domain;
    int n;
    public void accept()
    {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Domain : ");
        domain = sc.next();
        System.out.print("Enter No. of Publications : ");
        n = sc.nextInt();
        System.out.println("\n");
    }

    public void display()
    {
        super.display();
        System.out.println("Domain : " + domain);
        System.out.println("Publications : " + n);
        System.out.println("\n");
    }
}

class Technical extends Staff
{
    String skill;
    public void accept()
    {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Skills : ");
        skill = sc.nextLine();
        System.out.println("\n");
    }

    public void display()
    {
        super.display();
        System.out.println("Technical Skills : " + skill);
        System.out.println("\n");
    }
}

class Contract extends Staff
{
    int period;
    public void accept()
    {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Period : ");
        period = sc.nextInt();
        System.out.println("\n");
    }

    public void display()
    {
        super.display();
        System.out.println("Contract Period : " + period);
        System.out.println("\n");
    }
}

public class StaffInheritance_4
{
    public static void main(String[] args)
    {
        Teaching teaching = new Teaching();
        System.out.println("Enter the details of Teaching Staff : ");
        teaching.accept();

        Technical technical = new Technical();
        System.out.println("Enter the details of Technical Staff : ");
        technical.accept();

        Contract contract = new Contract();
        System.out.println("Enter the details of Contract Staff : ");
        contract.accept();

        System.out.println("The details of the Teaching staff : ");
        teaching.display();

        System.out.println("The details of the Technical staff : ");
        technical.display();

        System.out.println("The details of the Contract staff : ");
        contract.display();
    }
}