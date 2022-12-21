/*
    Aim :
        Introduce concepts of method overloading, constructor overloading, overriding.
    Program :
        Write a java program demonstrating Constructor overloading.
    
    OUTPUT :
            Printing student information :
            Name : Jhon
            ID : 101
            Contact No. : 9876543210
            College Name : IIT Kanpur
            Passout Year : 2018
*/

import java.util.Scanner;

public class ConstructorOverloading_5B
{
    int id, passOutYear;
    String name, collegeName, contactNo;
    ConstructorOverloading_5B(String contactNo, String collegeName, int passOutYear)
    {
        this.contactNo = contactNo;
        this.collegeName = collegeName;
        this.passOutYear = passOutYear;
    }

    ConstructorOverloading_5B(int id, String name)
    {
        this("9876543210", "IIT Kanpur", 2018);
        this.id = id;
        this.name = name;
    }
    
    public static void main(String[] args)
    {
        ConstructorOverloading_5B s = new ConstructorOverloading_5B(101, "Jhon");
        System.out.println("Printing student information :");
        System.out.println("Name : " + s.name + "\nID : " + s.id + "\nContact No. : " + s.contactNo + "\nCollege Name : " + s.collegeName + "\nPassout Year : " + s.passOutYear);
    }
}