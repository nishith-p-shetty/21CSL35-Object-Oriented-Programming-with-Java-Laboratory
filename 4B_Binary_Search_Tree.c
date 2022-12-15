/*
    QUESTION :
        Design, Develop and Implement a menu driven Program in C for the following operations on
        Binary Search Tree (BST) of Integers
            a. Create a BST of N Integers
            b. Traverse the BST in Inorder, Preorder and Post Order

    OUTPUT :
        MENU - 1:Insert, 2:Preorder, 3:Inorder, 4:Postorder, 5:Exit
        Enter your choice : 1
        Enter element to insert : 10
        MENU - 1:Insert, 2:Preorder, 3:Inorder, 4:Postorder, 5:Exit
        Enter your choice : 1
        Enter element to insert : 5
        MENU - 1:Insert, 2:Preorder, 3:Inorder, 4:Postorder, 5:Exit
        Enter your choice : 1
        Enter element to insert : 3
        MENU - 1:Insert, 2:Preorder, 3:Inorder, 4:Postorder, 5:Exit
        Enter your choice : 1
        Enter element to insert : 2
        MENU - 1:Insert, 2:Preorder, 3:Inorder, 4:Postorder, 5:Exit
        Enter your choice : 1
        Enter element to insert : 6
        MENU - 1:Insert, 2:Preorder, 3:Inorder, 4:Postorder, 5:Exit
        Enter your choice : 1
        Enter element to insert : 15
        MENU - 1:Insert, 2:Preorder, 3:Inorder, 4:Postorder, 5:Exit
        Enter your choice : 1
        Enter element to insert : 12
        MENU - 1:Insert, 2:Preorder, 3:Inorder, 4:Postorder, 5:Exit
        Enter your choice : 1
        Enter element to insert : 20
        MENU - 1:Insert, 2:Preorder, 3:Inorder, 4:Postorder, 5:Exit
        Enter your choice : 1
        Enter element to insert : 25
        MENU - 1:Insert, 2:Preorder, 3:Inorder, 4:Postorder, 5:Exit
        Enter your choice : 2
        
        Preorder : 10	5	3	2	6	15	12	20	25
        MENU - 1:Insert, 2:Preorder, 3:Inorder, 4:Postorder, 5:Exit
        Enter your choice : 3
        
        Inorder : 2    3	5	6	10	12	15	20	25
        MENU - 1:Insert, 2:Preorder, 3:Inorder, 4:Postorder, 5:Exit
        Enter your choice : 4
        
        Postorder : 2	3	6	5	12	25	20	15	10
        MENU - 1:Insert, 2:Preorder, 3:Inorder, 4:Postorder, 5:Exit
        Enter your choice : 5
*/
#include <stdio.h>
#include <stdlib.h>

#define pf printf
#define sf scanf

struct bt
{
    int info;
    struct bt *ll, *rl;
};
typedef struct bt *NODE;

void preorder(NODE root)
{
    if (root != NULL)
    {
        pf("%d\t", root->info);
        preorder(root->ll);
        preorder(root->rl);
    }
}

void inorder(NODE root)
{
    if (root != NULL)
    {
        inorder(root->ll);
        pf("%d\t", root->info);
        inorder(root->rl);
    }
}

void postorder(NODE root)
{
    if (root != NULL)
    {
        postorder(root->ll);
        postorder(root->rl);
        pf("%d\t", root->info);
    }
}

NODE getnode()
{
    NODE x;
    x = (NODE)malloc(sizeof(struct bt));
    if (x == NULL)
    {
        pf("Malloc Failed!");
        exit(0);
    }
    return x;
}

NODE insertbst(int item, NODE root)
{
    NODE temp, cur, prev;
    temp = getnode();
    temp->info = item;
    temp->ll = temp->rl = NULL;
    if (root == NULL)
    {
        return temp;
    }
    prev = NULL;
    cur = root;
    while (cur != NULL)
    {
        prev = cur;
        cur = ( (item > cur->info) ? cur->rl : cur->ll );
    }
    if (item < prev->info)
    {
        prev->ll = temp;
    }
    else
    {
        prev->rl = temp;
    }
    return root;
}

int main()
{
    NODE root = NULL;
    int choice, item;
    for ( ; ; )
    {
        pf("\nMENU - 1:Insert, 2:Preorder, 3:Inorder, 4:Postorder, 5:Exit\n");
        pf("Enter your choice : ");
        sf("%d", &choice);
        switch (choice)
        {
            case 1 :
                pf("Enter element to insert : ");
                sf("%d", &item);
                root = insertbst(item, root);
                break;

            case 2 :
                pf("\nPreorder : ");
                preorder(root);
                break;

            case 3 :
                pf("\nInorder : ");
                inorder(root);
                break;

            case 4 :
                pf("\nPostorder : ");
                postorder(root);
                break;

            case 5 :
                exit(0);
                break;

            default:
                exit(0);
                break;
        }
    }
    return 0;
}