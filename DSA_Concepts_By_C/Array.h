#include <stdio.h>

void init(int arr[],int n){
    for(int i = 0; i < n; i++){
        printf("Array[%d]:", i);
        scanf("%d", &arr[i]);
    }
    return;
}

void mock(int arr[], int n){
    for(int i=0; i<n; i++)
        arr[i] = (i+10)*i;

    return;
}

void traverse(int arr[], int n){
    printf("Array: ");
    for(int i = 0; i<n; i++)
        printf("%d ", arr[i]);

    printf("\n");
    return;
}
