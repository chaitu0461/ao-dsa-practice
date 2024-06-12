package linkedlist.medium;

import linkedlist.Util;
import linkedlist.create_delete_insert.CustomLinkedList;

public class RotateLinkedList {
    public static void main(String[] args) {
        CustomLinkedList cll=new CustomLinkedList();
        Util.insertAtEnd(cll,5);
        rotateByPlaces(cll,2);
        cll.printList();
    }

    private static void rotateByPlaces(CustomLinkedList cll, int k) {
        CustomLinkedList.Node curPointer=cll.head;
        if(curPointer==null || curPointer.next==null|| k==0)
            return;
        while (curPointer.next!=null){
            curPointer=curPointer.next;
        }
        curPointer.next=cll.head; //at this stage curPointer represents last node of cll
        k=k% cll.size;
        int extraDistance=cll.size-k;
        curPointer=cll.head;
        int count=0;
        while (count<extraDistance-1){
            curPointer=curPointer.next;
            count++;
        }
        cll.head=curPointer.next;
        curPointer.next=null;
    }
}
