/*
    QUESTION :
        Design, Develop and Implement a Program in C for the following Stack Applications
            b. Solving Tower of Hanoi problem with n disks

    OUTPUT :
        Enter number of disc : 3
        
        Move the disc-1 from A to C
        Move the disc-2 from A to B
        Move the disc-1 from C to B
        Move the disc-3 from A to C
        Move the disc-1 from B to A
        Move the disc-2 from B to C
        Move the disc-1 from A to C
        Number of moves : 7
*/
#include <stdio.h>
#include <stdlib.h>

#define pf printf
#define sf scanf

int count = 0;

void TOH(int n , int source, int temp, int destination)
{
    if ( n == 1 )
    {
        pf("\nMove the disc-%d from %c to %c", n , source, destination);
        count++;
        return;
    }
    TOH(n-1, source, destination, temp);
    pf("\nMove the disc-%d from %c to %c", n , source, destination);
    count++;
    TOH(n-1, temp, source, destination);
}

int main()
{
    int n;
    pf("Enter number of disc : ");
    sf("%d",&n);
    TOH(n, 'A', 'B', 'C');
    pf("\nNumber of moves : %d\n", count);
    return 0;
}