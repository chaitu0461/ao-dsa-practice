package linkedlist;

import linkedlist.create_delete_insert.CustomLinkedList;

public class Util {
    public static CustomLinkedList insertAtEnd(CustomLinkedList cll,int numberOfElements){
        for(int i=1;i<=numberOfElements;i++){
            cll.insertAtEnd(i);
        }
        return cll;
    }
}
