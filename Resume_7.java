/*
    Aim :
        Introduction to abstract classes, abstract methods, and Interface in java.
    Program :
        Write a program to generate the resume. Create 2 Java classes Teacher (data: personal
        information, qualification, experience, achievements) and Student (data: personal
        information, result, discipline) which implements the java interface Resume with the method
        biodata().
    
    OUTPUT :
        a
*/

interface Resume
{
    void biodata();
}
class Teacher implements Resume
{
    String name,qualification,achievements;
    float experience;
    public void biodata()
    {
        name = "Imran Ulla Khan";
        qualification = "M.Tech";
        achievements = "Q1 publication";
        experience = 14.8f;
        System.out.println("\tTeacher Resume");
        System.out.println("Name : " + name);
        System.out.println("Qualification : " + qualification);
        System.out.println("Achievements : " + achievements);
        System.out.println("Experience : " + experience);
    }
}

class Student implements Resume
{
    String name, discipline;
    float result;
    public void biodata()
    {
        name = "Rahul Sharma";
        result = 9.8f;
        discipline = "Computer Science and Engineering";
        System.out.println();
        System.out.println("\tStudent Resume");
        System.out.println("Name : " + name);
        System.out.println("Result : " + result + " cgpa");
        System.out.println("Discipline : " + discipline);
    }
}

public class Resume_7
{
    public static void main(String[] args)
    {
        Teacher obj1 = new Teacher();
        obj1.biodata();
        
        Student obj2 = new Student();
        obj2.biodata();
    }
}