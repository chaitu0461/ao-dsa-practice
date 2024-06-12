package linkedlist.medium;

import linkedlist.Util;
import linkedlist.create_delete_insert.CustomLinkedList;

public class MiddleOfList {
   public static CustomLinkedList.Node findMiddle(CustomLinkedList cll){
       if(cll.head==null) {
           System.out.println("Empty list");
           return null;
       }
       if(cll.head.next==null) {
           System.out.println(cll.head.val);
           return cll.head;
       }
       CustomLinkedList.Node fastPtr=cll.head;
       CustomLinkedList.Node slowPtr=cll.head;
       while (fastPtr!=null && fastPtr.next!=null ){
           fastPtr=fastPtr.next.next;
           slowPtr=slowPtr.next;
       }
       System.out.println(slowPtr.val);
       return slowPtr;

   }
    public static void main(String[] args) {
        CustomLinkedList cll= new CustomLinkedList();
        Util.insertAtEnd(cll,2);
        findMiddle(cll);
    }
}
