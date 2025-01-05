#include <stdio.h>
#include <stdlib.h>
#include "LinkedList.h"

int main(){
    node list = NULL;
    list = insertAtFirst(list,10);
    list = insertAtFirst(list,20);
    list = insertAtFirst(list,30);
    list = insertAtFirst(list,40);
    list = insertAtFirst(list,40);
    list = insertAtFirst(list,50);
    list = insertAtFirst(list,60);
    traverse(list);
    list = deleteAtFirst(list);
    list = deleteAtEnd(list);
    list = deleteAtPos(list,2);
    traverse(list);

    return 0;
}