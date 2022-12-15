/*
    QUESTION :
        Design, Develop and Implement a menu driven Program in C for the following Array Operations
            a. Creating an Array of N Integer Elements
            b. Display of Array Elements with Suitable Headings
            c. Exit.
        Support the program with functions for each of the above operations.

    OUTPUT :

        MENU - 1:Create, 2:Display, 3:Exit
        Enter any Option : 1
        Enter the number of elements : 5
        Enter 5 elements : 1 2 3 4 5

        MENU - 1:Create, 2:Display, 3:Exit
        Enter any Option : 2
        Contents of array :
        1
        2
        3
        4
        5

        MENU - 1:Create, 2:Display, 3:Exit
        Enter any Option : 3
        TERMIINATING!!
*/
#include <stdio.h>
#include <stdlib.h>

#define pf printf
#define sf scanf

void create_array(int a[], int n)
{
    int i;
    for ( i = 0 ; i < n ; i++)
    {
        sf("%d", &a[i]);
    }
}

void display_arraay(int a[], int n)
{
    int i;
    for (i = 0 ; i < n ; i++)
    {
        pf("%d\n", a[i]);
    }
}

int main()
{
    int a[10], choice, n;
    for ( ; ; )
    {
        pf("\nMENU - 1:Create, 2:Display, 3:Exit\n");
        pf("Enter any Option : ");
        sf("%d", &choice);
        switch (choice)
        {
            case 1 :
                    pf("Enter the number of elements : ");
                    sf("%d", &n);
                    pf("Enter %d elements : ", n);
                    create_array(a, n);
                    break;
            
            case 2 :
                    pf("Contents of array :\n");
                    display_arraay(a, n);
                    break;

            case 3 :
                    pf("TERMIINATING!!\n");
                    exit(0);
                    break;

            default :
                    pf("Invalid Option.\n");
                    break;
        }
    }
    return 0;
}