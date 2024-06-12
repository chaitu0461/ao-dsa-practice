package stacks.problems;

import java.util.Stack;

public class RemoveConsecutiveSubSequenceOptimal {
    public static void main(String[] args) {
        int[] sequence={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        Stack<Integer> integerStack= new Stack<>();

        for (int i=0;i< sequence.length;i++){

            if(!integerStack.isEmpty() && integerStack.peek()==sequence[i]) { //last element is same as current element
                if (i== sequence.length-1|| sequence[i+1] != integerStack.peek()){//there can be sequenc like 4,4,4..
                    // we need to reove all 4 s
                    integerStack.pop();
                }
            }
            else
                integerStack.push(sequence[i]);
        }
        integerStack.forEach(System.out::println);
    }
}
