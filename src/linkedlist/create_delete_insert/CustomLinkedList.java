package linkedlist.create_delete_insert;
public class CustomLinkedList{
   public Node head;
   public int size;
    public void insertAtBegin(int val){
        Node newNode=new Node(val);
        size++;
        if(size==1)
            head=newNode;
        else {
            newNode.next=head;
            head=newNode;
        }
    }
    public Node deleteLastNode(){
        Node temp=head;
        if(temp==null || temp.next==null){ //size 0 or 1
            return null;
        }
        else {
            while (temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            return head;
        }
    }
    public int lengthOfLinkedList(){
        Node temp=head;
        if(head==null)
            return 0;
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void insertAtEnd(int val){
        Node newNode=new Node(val);
        Node temp=head;
        if(temp==null) {
            head = newNode;
        }
        else {
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        size++;
    }
    public void printList(){
        Node current=head;
        while (current!=null){
            System.out.println(current.val);
            current=current.next;
        }
    }
    public void deleteValue(int val){

        Node curNode=head;
        Node previousNode=null;
        while (curNode!=null && curNode.val!=val){
            previousNode=curNode;
            curNode=curNode.next;
        }
        if(curNode==null)
            return;
        else
            if(previousNode!=null)
             previousNode.next=curNode.next;
    }
    // this is 1 based positioning
    private void insertAtPosition(int val,int position){
        Node newNextNode=new Node(val);
        if(position==1){
            newNextNode.next=head;
            head=newNextNode;
        }
        else {
            // stop at 1 postion less than the given postion
            Node curNode=head;
            int curPostion=1;
            while (curPostion<position-1){
                curPostion++;
                curNode=curNode.next;
            }
            Node curNextnode=curNode.next;
            curNode.next=newNextNode;
            newNextNode.next=curNextnode;

        }
    }
public static class Node {
   public int val;
    public Node next;
    public Node(int val) {
        this.val = val;
    }
}

    public static void main(String[] args) {
        CustomLinkedList cll=new CustomLinkedList();
        cll.insertAtBegin(1);
        cll.insertAtBegin(2);//2,1
        cll.insertAtEnd(3);//2,1,3
        System.out.println("==printing nodes after adding at begin/end");
        cll.printList();
        cll.deleteLastNode();//2,1
        System.out.println("==printing nodes after deleting at end");
        cll.printList();
        cll.insertAtPosition(3,2);//2,3,1
        System.out.println("==printing nodes after inserting at position(1 based)");
        cll.printList();

    }
}