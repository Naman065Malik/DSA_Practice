#include <stdio.h>
#include "LinkedList.h"

node linkedList = NULL;

int main(){
    int n,size,choice,pos,temp;

    printf("Linked List Operations\n\n");

    do{
        printf("1. Traverse\n");
        printf("2. Insertion At First\n");
        printf("3. Insertion At Last\n");
        printf("4. Insertion At Specific Position\n");
        printf("5. Deletion At First\n");
        printf("6. Deletion At Last\n");
        printf("7. Deletion At Specific Position\n");
        printf("0. Exit Program");
        printf("\nPlease Enter Your Choice:");
        scanf("%d", &choice);

        switch(choice){
            case 1: 
                traverse(linkedList);
                break;
            case 2:
                printf("Please Enter The Number You Want to Insert:");
                scanf("%d", &temp);
                linkedList = insertAtFirst(linkedList,temp);
                break;
            case 3:
                printf("Please Enter The Number You Want to Insert:");
                scanf("%d", &temp);
                linkedList = insertAtEnd(linkedList, temp);
                break;
            case 4:
                printf("Please Enter The Number You Want to Insert:");
                scanf("%d", &temp);
                printf("Please Enter The Position:");
                scanf("%d", &pos);
                linkedList = insertAtPos(linkedList, temp, pos);
                break;
            case 5:
                printf("Deleting First Number...\n");
                linkedList = deleteAtFirst(linkedList);
                break;
            case 6:
                printf("Deleting Last Number...\n");
                linkedList = deleteAtEnd(linkedList);
                break;
            case 7:
                printf("Please Enter the Position you want to Delete:");
                scanf("%d", &pos);
                linkedList = deleteAtPos(linkedList,pos);
                break;
            case 0:
                break;
            default:
                printf("Please Enter Correct Choice\n");
        }
    }while(choice != 0);
    return 0;
}