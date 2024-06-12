package linkedlist.medium;

import linkedlist.Util;
import linkedlist.create_delete_insert.CustomLinkedList;

public class DetectAndRemoveLoop {
    public static void main(String[] args) {
        CustomLinkedList cll=new CustomLinkedList();
        Util.insertAtEnd(cll,3);
        detectLoop(cll);
    }

    private static void detectLoop(CustomLinkedList cll) {
        CustomLinkedList.Node fastPtr=cll.head;
        CustomLinkedList.Node slowPtr=cll.head;
        while (fastPtr!=null && fastPtr.next!=null){
            fastPtr=fastPtr.next.next;
            slowPtr=slowPtr.next;
            if(fastPtr==slowPtr){
                System.out.println("loop detected");
                detectStartOfLoop(slowPtr,cll,true);
                return;
            }

        }
        System.out.println("No loop");
    }

    private static void detectStartOfLoop(CustomLinkedList.Node slowPtr, CustomLinkedList cll, boolean removeLoop) {
        CustomLinkedList.Node temp=cll.head;
        while (slowPtr!=temp){
            slowPtr=slowPtr.next;
            temp=temp.next;

        }
            System.out.println("starting point of loop.."+slowPtr.val);
        if (removeLoop){
            slowPtr.next=null;
        }

    }
}
