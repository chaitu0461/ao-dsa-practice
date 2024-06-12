package linkedlist.medium;

import linkedlist.create_delete_insert.CustomLinkedList;

public class ReverseLinkedList {
    private static void  reverse(CustomLinkedList cll){
        if(cll.head==null || cll.head.next==null) // either 0 or 1 element
            return;
        CustomLinkedList.Node prevNode=cll.head;
        CustomLinkedList.Node curNode=cll.head.next;
        while (curNode!=null){
            CustomLinkedList.Node temp=curNode.next;
            curNode.next=prevNode;
           if(prevNode==cll.head)
             prevNode.next=null;
            prevNode=curNode;
            curNode=temp;

        }
        cll.head=prevNode;
    }
    public static CustomLinkedList.Node reverseandGiveReference(CustomLinkedList cll){
        reverse(cll);
        return cll.head;

    }

    public static void main(String[] args) {
        CustomLinkedList customLinkedList= new CustomLinkedList();
        customLinkedList.insertAtEnd(1);
        customLinkedList.insertAtEnd(2);
        customLinkedList.insertAtEnd(3);
        reverse(customLinkedList);
        customLinkedList.printList();
    }
}
