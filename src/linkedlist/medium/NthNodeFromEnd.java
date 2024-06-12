package linkedlist.medium;

import linkedlist.Util;
import linkedlist.create_delete_insert.CustomLinkedList;

public class NthNodeFromEnd {
    public static void  findNthNodeFromEnd(CustomLinkedList cll,int nodeNumber){
        CustomLinkedList.Node ptr1=cll.head;
        CustomLinkedList.Node ptr2=cll.head;
       int count=0;
       while (count<nodeNumber){
           count++;
           ptr1=ptr1.next;
       }
       while (ptr1!=null){
           ptr1=ptr1.next;
           ptr2=ptr2.next;
       }
       System.out.println(ptr2.val);
    }
    public static void main(String[] args) {
        CustomLinkedList cll=new CustomLinkedList();
        Util.insertAtEnd(cll,5);
        findNthNodeFromEnd(cll,3);
    }
}
