/*
    QUESTION :
        Design, Develop and Implement a Program in C for the following Stack Applications
            a. Evaluation of Suffix expression with single digit operands and operators: +, -, *, /, %, ^

    OUTPUT :
        Enter postfix expression : 234*+
        Length of the postfix expression : 5
        Value of expression = 14.000000
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

#define pf printf
#define sf scanf

float stack[50], n1, n2, result, final_result;
int i, j, q, top = 0;

void push(float item)
{
    stack[++top] = item;
    return;
}

float pop()
{
    float operand;
    if ( top == 0 )
    {
        pf("Invalid Expression!\n");
        exit(1);
    }
    else
    {
        operand = stack[top--];
        return operand;
    }
}

int main()
{
    char p[50];
    pf("Enter postfix expression : ");
    gets(p);
    j = strlen(p);
    pf("Length of the postfix expression : %d\n", j);
    for (i = 0 ; i < j ; i++)
    {
        if ( (p[i] >= '0') && (p[i] <= '9') )
        {
            push(p[i] - '0');
        }
        else
        {
            n1 = pop();
            n2 = pop();
            switch (p[i])
            {
                case '^' :
                        result = pow(n2, n1);
                        push(result);
                        break;
                
                case '*' :
                        result = n2 * n1;
                        push(result);
                        break;
                
                case '/' :
                        result = n2 / n1;
                        push(result);
                        break;
                
                case '+' :
                        result = n2 + n1;
                        push(result);
                        break;
                
                case '-' :
                        result = n2 - n1;
                        push(result);
                        break;

                default :
                        pf("Invaalid postfix Expression / Operand!\n");
                        exit(1);
                        break;
            }
        }
    }
    final_result = pop();
    pf("Value of expression = %f\n", final_result);
    return 0;
}