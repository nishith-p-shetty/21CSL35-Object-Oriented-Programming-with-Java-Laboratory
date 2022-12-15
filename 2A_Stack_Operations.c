/*
    QUESTION :
        Design, Develop and Implement a menu driven Program in C for the following operations on
        STACK of Integers (Array Implementation of Stack with maximum size MAX)
            a. Push an Element on to Stack
            b. Pop an Element from Stack
            c. Demonstrate Overflow and Underflow situations on Stack
            d. Display the status of Stack
            e. Exit
        Support the program with appropriate functions for each of the above operations.

    OUTPUT :
        
        MENU - 1:PUSH, 2:POP, 3:Exit
        Enter any Option : 1
        Enter element to push : 1
        Stack contents are :
        	1
        
        MENU - 1:PUSH, 2:POP, 3:Exit
        Enter any Option : 1
        Enter element to push : 2
        Stack contents are :
        	2
        	1
        
        MENU - 1:PUSH, 2:POP, 3:Exit
        Enter any Option : 1
        Enter element to push : 3
        Stack contents are :
        	3
        	2
        	1
        Stack is FULL!
        
        MENU - 1:PUSH, 2:POP, 3:Exit
        Enter any Option : 1
        Enter element to push : 4
        Stack is OVERFLOWN!
        
        MENU - 1:PUSH, 2:POP, 3:Exit
        Enter any Option : 2
        Popped element is 3
        Stack contents are :
        	2
        	1
        
        MENU - 1:PUSH, 2:POP, 3:Exit
        Enter any Option : 2
        Popped element is 2
        Stack contents are :
        	1
        
        MENU - 1:PUSH, 2:POP, 3:Exit
        Enter any Option : 2
        Popped element is 1
        Stack is EMPTY!
        
        MENU - 1:PUSH, 2:POP, 3:Exit
        Enter any Option : 2
        Stack is UNDERFLOWN!
        
        MENU - 1:PUSH, 2:POP, 3:Exit
        Enter any Option : 3
*/
#include <stdio.h>
#include <stdlib.h>

#define pf printf
#define sf scanf

#define MAX 3

int top = -1 , status;

void push(int stack[], int item)
{
    if ( top == (MAX - 1) )
    {
        status = 0;
    }
    else
    {
        status = 1;
        stack[++top] = item;
    }
}

int pop(int stack[])
{
    int ret;
    if ( top == -1)
    {
        ret = 0;
        status = 0;
    }
    else
    {
        status = 1;
        ret = stack[top--];
    }
    return ret;
}

void display(int stack[])
{
    int i;
    if ( top == -1 )
    {
        pf("Stack is EMPTY!\n");
    }
    else
    {
        pf("Stack contents are :\n");
        for ( i = top ; i >=0 ; i--)
        {
            pf("\t%d\n", stack[i]);
        }
    }
}

int main()
{
    int stack[MAX], item, choice, quit = 0;
    do
    {
        pf("\nMENU - 1:PUSH, 2:POP, 3:Exit\n");
        pf("Enter any Option : ");
        sf("%d", &choice);
        switch (choice)
        {
            case 1 :
                    pf("Enter element to push : ");
                    sf("%d", &item);
                    push(stack, item);
                    if(status)
                    {
                        display(stack);
                        if (top == (MAX - 1))
                        {
                            pf("Stack is FULL!\n");
                        }
                    }
                    else
                    {
                        pf("Stack is OVERFLOWN!\n");
                    }
                    break;
            
            case 2 :
                    item = pop(stack);
                    if(status)
                    {
                        pf("Popped element is %d\n", item);
                        display(stack);
                    }
                    else
                    {
                        pf("Stack is UNDERFLOWN!\n");
                    }
                    break;

            case 3 :
                    quit = 1;
                    break;

            default :
                    pf("Invalid Option.\n");
                    break;
        }
    } while ( !quit );
    return 0;
}