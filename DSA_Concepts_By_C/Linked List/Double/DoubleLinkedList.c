#include <stdio.h>
#include <stdlib.h>
#include "DoubleLinkedList.h"

node list = NULL;

void main(){
    list = insertAtEnd(list,10);
    list = insertAtEnd(list,20);
    list = insertAtEnd(list,30);
    list = insertAtEnd(list,40);
    list = insertAtFirst(list,25);
    list = insertAtPos(list,25, 3);
    traverse(list);
}