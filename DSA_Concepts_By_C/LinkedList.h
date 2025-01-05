#ifndef LINKEDLIST_H
#define LINKEDLIST_H

#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node* next;
};

#define node struct node*

node createNode(int key){
    node head = malloc(sizeof(node));
    head -> data = key;
    head -> next = NULL;
    return head;
}

void traverse(node head){
    node temp = head;
    printf("Linked List: ");
    while(temp != NULL){
        printf("%d ", temp -> data);
        temp = temp -> next;
    }
    printf("\n");
    return;
}

node insertAtFirst(node head, int key){
    if(head == NULL){
        return createNode(key);
    }
    node temp = createNode(key);
    temp -> next = head;
    return temp;
}

node insertAtEnd(node head, int key){
    node temp = head;
    while(temp->next != NULL){
        temp = temp->next;
    }
    temp -> next = createNode(key);
    return head;
}

node insertAtPos(node head, int key, int pos){
    int i=0;
    node temp = head;
    while(i < pos-1 && temp -> next != NULL){
        temp = temp -> next;
        i++;
    }
    node element = createNode(key);
    element = temp -> next;
    temp -> next = element;
    return head;
}

node deleteAtFirst(node head){
    node temp = head;
    temp = temp -> next;
    free(head);
    return temp;
}

node deleteAtEnd(node head){
    node temp = head;
    while(temp -> next -> next != NULL)
        temp = temp -> next;
    free(temp->next);
    temp->next = NULL;
    return head;
}

node deleteAtPos(node head, int pos){
    int i = 0;
    node temp = head;
    while(temp ->next != NULL && i < pos-1){
        temp = temp -> next;
        i++;
    }
    node temp2 = temp -> next;
    temp -> next = temp2 -> next;
    free(temp2);
    return head;
}


#endif