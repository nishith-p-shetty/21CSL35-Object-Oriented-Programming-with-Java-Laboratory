/*
    Aim :
        Introduce java Collections.
    Program :
        Write a program to perform string operations using ArrayList. Write functions for the following
        a. Append - add at end
        b. Insert – add at particular index
        c. Search 
        d. List all string starts with given letter.
    
    OUTPUT :
                    STRING MANIPULATION
            ***********************************
            1 : Append, 2 : Insert at particular index, 3 : Search
            4 : List strings that starts with letter, 5 : Size
            6 : Remove, 7 : Sort, 8 : Display
            Enter the choice : 1
            Enter the string : abc
            Enter 0 to break or 1 to continue : 1
                    STRING MANIPULATION
            ***********************************
            1 : Append, 2 : Insert at particular index, 3 : Search
            4 : List strings that starts with letter, 5 : Size
            6 : Remove, 7 : Sort, 8 : Display
            Enter the choice : 1
            Enter the string : bcd
            Enter 0 to break or 1 to continue : 1
                    STRING MANIPULATION
            ***********************************
            1 : Append, 2 : Insert at particular index, 3 : Search
            4 : List strings that starts with letter, 5 : Size
            6 : Remove, 7 : Sort, 8 : Display
            Enter the choice : 2
            Enter the string : cde
            Specify the index to insert : 2
            The array list has the following elements : [abc, cde, bcd]
            Enter 0 to break or 1 to continue : 1
                    STRING MANIPULATION
            ***********************************
            1 : Append, 2 : Insert at particular index, 3 : Search
            4 : List strings that starts with letter, 5 : Size
            6 : Remove, 7 : Sort, 8 : Display
            Enter the choice : 5
            Size of the list : 3
            Enter 0 to break or 1 to continue : 1
                    STRING MANIPULATION
            ***********************************
            1 : Append, 2 : Insert at particular index, 3 : Search
            4 : List strings that starts with letter, 5 : Size
            6 : Remove, 7 : Sort, 8 : Display
            Enter the choice : 4
            Enter the character to list string that start with specfied character : c
            cde
            Enter 0 to break or 1 to continue : 1
                    STRING MANIPULATION
            ***********************************
            1 : Append, 2 : Insert at particular index, 3 : Search
            4 : List strings that starts with letter, 5 : Size
            6 : Remove, 7 : Sort, 8 : Display
            Enter the choice : 3
            Enter the string to search : cde
            Index of cde is 1
            Enter 0 to break or 1 to continue : 1
                    STRING MANIPULATION
            ***********************************
            1 : Append, 2 : Insert at particular index, 3 : Search
            4 : List strings that starts with letter, 5 : Size
            6 : Remove, 7 : Sort, 8 : Display
            Enter the choice : 7
            The array list has the following elements : [abc, bcd, cde]
            Enter 0 to break or 1 to continue : 1
                    STRING MANIPULATION
            ***********************************
            1 : Append, 2 : Insert at particular index, 3 : Search
            4 : List strings that starts with letter, 5 : Size
            6 : Remove, 7 : Sort, 8 : Display
            Enter the choice : 6
            Enter the element to remove : cde
            Element removed : cde
            Enter 0 to break or 1 to continue : 1
                    STRING MANIPULATION
            ***********************************
            1 : Append, 2 : Insert at particular index, 3 : Search
            4 : List strings that starts with letter, 5 : Size
            6 : Remove, 7 : Sort, 8 : Display
            Enter the choice : 8
            The array list has the following elements : [abc, bcd]
            Enter 0 to break or 1 to continue : 0
*/

import java.util.*;
import java.io.*;

public class CollectionStringArrayList_9
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> obj = new ArrayList<String>();
        DataInputStream in = new DataInputStream(System.in);
        int c, ch, i, j;
        String str, str1;
        do
        {
            System.out.println("\tSTRING MANIPULATION");;
            System.out.println("***********************************");
            System.out.println("1 : Append, 2 : Insert at particular index, 3 : Search");
            System.out.println("4 : List strings that starts with letter, 5 : Size");
            System.out.println("6 : Remove, 7 : Sort, 8 : Display");
            System.out.print("Enter the choice : ");
            c = Integer.parseInt(in.readLine());
            switch (c)
            {
                case 1 :
                        System.out.print("Enter the string : ");
                        str = in.readLine();
                        obj.add(str);
                        break;

                case 2 :
                        System.out.print("Enter the string : ");
                        str = in.readLine();
                        System.out.print("Specify the index to insert : ");
                        i = Integer.parseInt(in.readLine());
                        obj.add(i-1, str);
                        System.out.println("The array list has the following elements : " + obj);
                        break;

                case 3 :
                        System.out.print("Enter the string to search : ");
                        str = in.readLine();
                        j = obj.indexOf(str);
                        if ( j == -1)
                        {
                            System.out.println("Element not found!");
                        }
                        else
                        {
                            System.out.println("Index of " + str + " is " + j);
                        }
                        break;
                
                case 4 :
                        System.out.print("Enter the character to list string that start with specfied character : ");
                        str = in.readLine();
                        for ( i = 0 ; i < obj.size() ; i++ )
                        {
                            str1 = obj.get(i);
                            if (str1.startsWith(str))
                            {
                                System.out.println(str1);
                            }
                        }
                        break;

                case 5 :
                        System.out.println("Size of the list : " + obj.size());
                        break;

                case 6 :
                        System.out.print("Enter the element to remove : ");
                        str = in.readLine();
                        if (obj.remove(str))
                        {
                            System.out.println("Element removed : " + str);
                        }
                        else
                        {
                            System.out.println("Element not present!");
                        }
                        break;

                case 7 :
                        Collections.sort(obj);
                        System.out.println("The array list has the following elements : " + obj);
                        break;

                case 8 :
                        System.out.println("The array list has the following elements : " + obj);
                        break;
            }
            System.out.print("Enter 0 to break or 1 to continue : ");
            ch = Integer.parseInt(in.readLine());
        }while (ch == 1);
    }
}