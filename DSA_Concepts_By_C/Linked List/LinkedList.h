#ifndef LINKEDLIST_H
#define LINKEDLIST_H

#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node* next;
};

#define node struct node*

node createNode(int element){
    node newnode = malloc(sizeof(node));
    newnode -> data = element;
    newnode -> next = NULL;
    return newnode;
}

void traverse(node head){
    node temp = head;
    printf("Linked List: ");
    while(temp != NULL){
        printf("%d ", temp -> data);
        temp = temp -> next;
    }
    printf("\n\n");
}

node insertAtFirst(node head, int element){
    node newNode = createNode(element);
    newNode -> next = head;
    head = newNode;
    return head;
}

node insertAtEnd(node head, int element){
    node newNode = createNode(element);
    if(head == NULL){
        return newNode;
    }
    node temp = head;
    while(temp -> next != NULL)
        temp = temp-> next;
    temp-> next = newNode;
    return head;
}

node insertAtPos(node head, int element, int pos){
    node newNode = createNode(element);
    node temp = head;
    if(pos == 1){
        newNode -> next = head;
        return newNode;
    }
    for(int i = 1; i < pos-1; i++){
        if(temp == NULL){
            printf("Position Out of Bound\n");
            free(newNode);
            return head;
        }
        temp = temp -> next;
    }
    newNode -> next = temp -> next;
    temp -> next = newNode;
    return head;
}

node deleteAtFirst(node head){
    node temp = head;
    head = head -> next;
    free(temp);
    return head;
}

node deleteAtEnd(node head){
    node temp = head;
    while(temp -> next -> next != NULL)
        temp = temp-> next;
    
    free(temp->next);
    temp->next = NULL;
    return head;
}

node deleteAtPos(node head,int pos){
    node temp = head;
    if(pos == 1){
        head = head -> next;
        free(temp);
        return head;
    }
    for(int i = 1; i< pos-1; i++){
        if(temp == NULL){
            printf("Position Out of Bound\n");
            return head;
        }
        temp = temp->next;
    }
    node temp2 = temp -> next;
    temp -> next = temp -> next -> next;
    return head;
}


#endif