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

void insertAtFirst(int arr[], int * n, int key){
    *n += 1;
    for(int i = (*n)-1; i > 0; i--)
        arr[i] = arr[i-1];

    arr[0] = key;
    return;
}

void insertAtEnd(int arr[], int * n, int key){
    arr[*n] = key;
    *n += 1;
    return;
}

void insertAtPos(int arr[], int* n, int key, int pos){
    *n += 1;
    for(int i = (*n)-1; i > pos; i--)
        arr[i] = arr[i-1];

    arr[pos-1] = key;
    return;
}

void deleteAtFirst(int arr[], int* n){
    for(int i = 0; i < *n - 1; i++ )
        arr[i] = arr[i+1];

    *n -= 1;

    return;
}

void deleteAtEnd(int arr[], int* n){
    *n -= 1;
    return;
}

void deleteAtPos(int arr[], int* n, int pos){
    for(int i = pos-1; i < *n; i++)
        arr[i] = arr[i+1];


    *n -= 1;
    return;
}


