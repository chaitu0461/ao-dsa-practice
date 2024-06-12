package stacks.problems;

import java.util.Stack;

public class MinStackBetterApproach {
 private static class  Minstack{
    private final Stack<Integer> elementsStack=new Stack<>();
  private final Stack<Integer> helperStack=new Stack<>(); // this maintains the min element for every elemnt of element stack
     public void push(int i){
         elementsStack.push(i);
         if(helperStack.isEmpty())
             helperStack.push(i);
         else {
             if(i<helperStack.peek())
                 helperStack.push(i);
             else
                 helperStack.push(helperStack.peek());
         }
     }
     public int pop(){
         helperStack.pop();
         return elementsStack.pop();
     }
     public int getMinimum(){
         return helperStack.peek();
     }
 }


    public static void main(String[] args) {

        Minstack minstack= new Minstack();
        minstack.push(1);
        minstack.push(2);
        minstack.push(3);
        System.out.println(minstack.getMinimum()); //expected 1
        minstack.pop();
        System.out.println(minstack.getMinimum()); //expected 1
        minstack.push(0);
        System.out.println(minstack.getMinimum()); //expected 0
        minstack.push(-1);
        System.out.println(minstack.getMinimum()); //expected -1









    }
}
