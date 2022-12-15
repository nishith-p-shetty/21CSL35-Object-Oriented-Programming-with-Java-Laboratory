/*
    QUESTION :
        Design, Develop and Implement a menu driven Program in C for the following Array operations
            a. Inserting an Element (ELEM) at a given valid Position (POS)
            b. Deleting an Element at a given valid Position POS)
            c. Display of Array Elements
            d. Exit.
        Support the program with functions for each of the above operations.

    OUTPUT :

        MENU - 1:Create, 2:Display, 3:Insert at Position, 4:Delete at Position 5:Exit
        Enter any Option : 1
        Enter the number of elements : 5
        Enter 5 elements : 1 3 4 5 6
        
        MENU - 1:Create, 2:Display, 3:Insert at Position, 4:Delete at Position 5:Exit
        Enter any Option : 2
        Contents of array :
        1
        3
        4
        5
        6
        
        MENU - 1:Create, 2:Display, 3:Insert at Position, 4:Delete at Position 5:Exit
        Enter any Option : 3
        Enter item to insert : 2
        Enter the position : 1
        
        MENU - 1:Create, 2:Display, 3:Insert at Position, 4:Delete at Position 5:Exit
        Enter any Option : 2
        Contents of array :
        1
        2
        3
        4
        5
        6
        
        MENU - 1:Create, 2:Display, 3:Insert at Position, 4:Delete at Position 5:Exit
        Enter any Option : 4
        Enter element position to delete : 1
        Item Deleted 2
        
        MENU - 1:Create, 2:Display, 3:Insert at Position, 4:Delete at Position 5:Exit
        Enter any Option : 2
        Contents of array :
        1
        3
        4
        5
        6
        
        MENU - 1:Create, 2:Display, 3:Insert at Position, 4:Delete at Position 5:Exit
        Enter any Option : 5
        TERMIINATING!!
*/
#include <stdio.h>
#include <stdlib.h>

#define pf printf
#define sf scanf

int insert_at_pos(int item, int a[], int n, int pos)
{
    int i;
    if (pos > n || pos < 0)
    {
        pf("Invalid Position.");
    }
    for (i = n - 1 ; i >= pos - 1 ; i--)
    {
        a[i+1] = a[i];
    }
    a[pos] = item;
    return (n+1);
}

int delete_at_pos(int a[], int n, int pos)
{
    int i;
    if (pos >= n || pos < 0)
    {
        pf("Invalid Position.");
        return n;
    }
    pf("Item Deleted %d\n", a[pos]);
    for (i = pos +1 ; i < n ; i++)
    {
        a[i-1] = a[i];
    }
    return (n-1);
}

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
    int a[10], choice, n, item, pos;
    for ( ; ; )
    {
        pf("\nMENU - 1:Create, 2:Display, 3:Insert at Position, 4:Delete at Position 5:Exit\n");
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
                    pf("Enter item to insert : ");
                    sf("%d", &item);
                    pf("Enter the position : ");
                    sf("%d", &pos);
                    n = insert_at_pos(item, a, n, pos);
                    break;
            
            case 4 :
                    pf("Enter element position to delete : ");
                    sf("%d", &pos);
                    n = delete_at_pos(a, n, pos);
                    break;

            case 5 :
                    pf("TERMIINATING!!\n");
                    exit(0);
                    break;

            default :
                    pf("Invalid Option.");
                    break;
        }
    }
    return 0;
}