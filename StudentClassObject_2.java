/*
    Aim :
        Demonstrating creation of java classes, objects, constructors, declaration and initialization
        of variables.
    Program :
        Create a Java class called Student with the following details as variables within it.
        USN
        Name
        Branch
        Phone
        Write a Java program to create n Student objects and print the USN, Name, Branch, and Phone
        of these objects with suitable headings.
    
    OUTPUT :
        Enter no. of student objects to create : 2
        Enter student usn : 123
        Enter student name : Asdfg
        Enter student branch : CS
        Enter student phone : 1234567890
        
        Student USN is : 123
        Student Name is : Asdfg
        Student Branch is : CS
        Student Phone number : 1234567890
        
        Enter student usn : 321
        Enter student name : Hjkl
        Enter student branch : AIML
        Enter student phone : 0987654321
        
        Student USN is : 321
        Student Name is : Hjkl
        Student Branch is : AIML
        Student Phone number : 0987654321
*/

import java.util.Scanner;

public class StudentClassObject_2
{
    public StudentClassObject_2(String stuUSN, String stuName, String stuBranch, String stuPhone)
    {
        System.out.println("Student USN is : " + stuUSN);
        System.out.println("Student Name is : " + stuName);
        System.out.println("Student Branch is : " + stuBranch);
        System.out.println("Student Phone number : " + stuPhone);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of student objects to create : ");
        int numberOfStudents = sc.nextInt();
        for (int i = 1 ; i <= numberOfStudents ; i++)
        {
            System.out.print("Enter student usn : ");
            String usn = sc.next();
            System.out.print("Enter student name : ");
            String name = sc.next();
            System.out.print("Enter student branch : ");
            String branch = sc.next();
            System.out.print("Enter student phone : ");
            String phone = sc.next();
            System.out.println();
            new StudentClassObject_2(usn, name, branch, phone);
            System.out.println();
        }
        sc.close();
    }
}