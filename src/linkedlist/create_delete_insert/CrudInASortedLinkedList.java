package linkedlist.create_delete_insert;

public class CrudInASortedLinkedList {
    public static void insertInSortedList(CustomLinkedList cll,int val){
        CustomLinkedList.Node currentNode=cll.head;
        if(currentNode==null){
            cll.head= new CustomLinkedList.Node(val);
            return;
        }
        CustomLinkedList.Node prevNode=null;
        while (currentNode!=null && currentNode.val<val){
            prevNode=currentNode;
            currentNode=currentNode.next;
        }
        if(currentNode==null){
            prevNode.next=new CustomLinkedList.Node(val);
        }
        else {
            CustomLinkedList.Node temp=currentNode;
            CustomLinkedList.Node newNode= new CustomLinkedList.Node(val);
            newNode.next=temp;
            prevNode.next=newNode;
        }

    }
    public static void removeDuplicates(CustomLinkedList cll){
        CustomLinkedList.Node curNode=cll.head;
        while (curNode!=null && curNode.next!=null){
            if(curNode.next.val==curNode.val)
                curNode.next=curNode.next.next;
            else
                curNode=curNode.next;
        }
    }
    public static void main(String[] args) {
        CustomLinkedList cll=new CustomLinkedList();
        cll.insertAtEnd(1);
        cll.insertAtEnd(2);
        cll.insertAtEnd(3);
        cll.insertAtEnd(3);
        cll.insertAtEnd(3);
        cll.insertAtEnd(5);

        insertInSortedList(cll,7);
        cll.printList();
        removeDuplicates(cll);
        System.out.println("==after removing duplicates==");
        cll.printList();

    }
}
