package stacks.implementation;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQs {
    public static void main(String[] args) {
        LocalStack l=new LocalStack();
        l.push(1);
        l.push(2);
        l.push(3);
        System.out.println(l.pop());
        System.out.println(l.pop());
        l.push(4);
        System.out.println(l.pop());
        System.out.println(l.pop());
        System.out.println(l.pop());






    }

    private static class LocalStack{
        Queue<Integer> queue1 =new LinkedList<>();
        Queue<Integer> queue2=new LinkedList<>();

        private void push(int i){
            queue1.add(i);

        }
        private int pop(){
            if(queue1.isEmpty())
                return -1;
            while (queue1.size()>1){
                queue2.add(queue1.remove());
            }
            int element= queue1.remove();
            Queue<Integer> temQ=queue1;
            queue1=queue2;
            queue2=temQ;
            return element;
        }
    }
}
