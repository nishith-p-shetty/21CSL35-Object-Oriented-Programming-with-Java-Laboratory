/*
    Aim :
        Introduce File operations in java.
    Program :
        Write a java program that reads a file name from the user, displays information about
        whether the file exists, whether the file is readable, or writable, the type of file and
        the length of the file in bytes.
    
    OUTPUT :
        a
*/

import java.util.Scanner;
import java.io.File;

public class FileOperations_11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String fname = sc.next();
        File f1 = new File(fname);
        System.out.println("File Name: " + f1.getName());
        f1.setWritable(false);
        System.out.println(f1.exists() ? "File exists" : "File does not exist");
        System.out.println(f1.canWrite() ? "File is writeable" : "File is not writeable");
        System.out.println(f1.canRead() ? "File is readable" : "File is not readable");
        String fileName = f1.toString();
        int index = fileName.lastIndexOf('.');
        if (index > 0)
        {
            String type = fileName.substring(index + 1);
            System.out.println("File type is " + type);
        }
        else
        {
            System.out.println("File doesn't have type");
        }
        System.out.println("File size: " + f1.length() + " Bytes");
        sc.close();
    }
}