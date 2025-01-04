#include <stdio.h>
#include "Array.h"

int main(){
    int n,size,choice,pos,temp;
    printf("Please Enter the Max Size of Your Array: ");
    scanf("%d", &size);

    int arr[size];

    do{
        printf("1. Enter Data\n");
        printf("2. Mock Data\n");
        printf("3. Traverse\n");
        printf("4. Insertion At First\n");
        printf("5. Insertion At Last\n");
        printf("6. Insertion At Specific Position\n");
        printf("7. Deletion At First\n");
        printf("8. Deletion At Last\n");
        printf("9. Deletion At Specific Position\n");
        printf("0. Exit Program");
        printf("\nPlease Enter Your Choice:");
        scanf("%d", &choice);

        switch(choice){
            case 1:
                printf("Please Enter The Size of Array:");
                scanf("%d", &n);
                init(arr,n);
                break;
            case 2:
                printf("Please Enter The Size of Array:");
                scanf("%d", &n);
                mock(arr,n);
                break;
            case 3: 
                traverse(arr,n);
                break;
            case 4:
                printf("Please Enter The Number You Want to Insert:");
                scanf("%d", &temp);
                insertAtFirst(arr, &n, temp);
                break;
            case 5:
                printf("Please Enter The Number You Want to Insert:");
                scanf("%d", &temp);
                insertAtEnd(arr, &n, temp);
                break;
            case 6:
                printf("Please Enter The Number You Want to Insert:");
                scanf("%d", &temp);
                printf("Please Enter The Position:");
                scanf("%d", &pos);
                insertAtPos(arr, &n, temp, pos);
                break;
            case 7:
                printf("Deleting First Number...\n");
                deleteAtFirst(arr, &n);
                break;
            case 8:
                printf("Deleting Last Number...\n");
                deleteAtEnd(arr, &n);
                break;
            case 9:
                printf("Please Enter the Position you want to Delete:");
                scanf("%d", &pos);
                deleteAtPos(arr, &n, pos);
                break;
            case 0:
                break;
            default:
                printf("Please Enter Correct Choice\n");
        }
    }while(choice != 0);
    return 0;
}