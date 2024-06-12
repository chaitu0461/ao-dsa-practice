package stacks.implementation;

public class StackUsingArray {
    public static void main(String[] args) {
        Stack localStack= new Stack();
        localStack.pop();
        localStack.push(10);
        localStack.push(20);
        localStack.push(30);
        System.out.println(localStack.peek());
        System.out.println(localStack.pop());
        System.out.println(localStack.pop());
        System.out.println(localStack.pop());
        System.out.println(localStack.pop());



    }
    private static  class Stack{
        int[] nums= new int[3];
        int top=-1;
        private void push(int i){
            if(top>= nums.length)
                System.out.println("stack over flow!!");
            top++;
            nums[top]=i;
        }
        private int pop(){
            if(top<0) {
                System.out.println("stack under flow!!");
                return Integer.MIN_VALUE;
            }
            int element=nums[top];
            top--;
            return element;
        }
        private int peek(){
            return nums[top];
        }
    }
}
