#ifndef DOUBLE_LINKEDLIST_H
#define DOUBLE_LINKEDLIST_H

#include <stdio.h>
#include <stdlib.h>

struct node{
    struct node* pre;
    int data;
    struct node* next;
};

#define node struct node *

node createNode(int element){
    node newNode = malloc(sizeof(node));
    newNode -> pre = NULL;
    newNode -> next = NULL;
    newNode -> data = element;
    return newNode;
}

void traverse(node head){
    node temp = head;
    printf("Linked List: ");
    do{
        printf("%d ", temp->data);
        temp = temp -> next;
    }while(temp -> next != NULL);
    printf("%d ", temp->data);
    printf("\nRevered Linked List: ");
    do{
        printf("%d ", temp -> data);
        temp = temp-> pre;
    }while(temp -> pre != NULL);
    printf("%d ", temp->data);
    printf("\n");
}

node insertAtFirst(node head, int element){
    node newNode = createNode(element);
    newNode -> next = head;
    if(head != NULL){
        head -> pre = newNode;
    }
    return newNode;
}

node insertAtEnd(node head, int element){
    node newNode = createNode(element);
    if(head == NULL)
        return newNode;
    node temp = head;
    while(temp -> next != NULL)
        temp = temp -> next;
    temp -> next = newNode;
    newNode->pre= temp;
    return head;
}

node insertAtPos(node head, int element,int pos){
    node newNode = createNode(element);
    if(pos == 1){
        newNode-> next = head;
        if(head != NULL){
            head -> pre = newNode;
        }
        return newNode;
    }
    node temp = head;
    for(int i = 1; i<pos-1; i++){
        if(temp == NULL){
            printf("Position Out of Bound\n");
            free(newNode);
            return head;
        }
        temp = temp -> next;
    }
    newNode-> next = temp -> next;
    newNode->pre = temp;
    if(temp -> next != NULL){
        temp -> next -> pre = newNode;
    }
    temp -> next = newNode;
    return head;
}

#endif