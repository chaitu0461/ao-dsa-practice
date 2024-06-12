package stacks.problems.nearest_smaller_greater_left_right;

import java.util.Arrays;
import java.util.Stack;

public class NearestGreaterElementToRight {
    public static void main(String[] args) {
        Stack<Integer> integerStack=new Stack<>();
        int[] elements={1,5,3,2,1,6,3,4};
        int questionLength=elements.length;
        int[] ans=new int[questionLength];
        ans[questionLength-1]=-1;
        integerStack.push(elements[questionLength-1]);
        for(int i= elements.length-2;i>=0;i--){
            while (!integerStack.isEmpty() && integerStack.peek()<elements[i]){
                integerStack.pop();
            }
            if(integerStack.isEmpty())
                ans[i]=-1;
            else
                ans[i]=integerStack.peek();
            integerStack.push(elements[i]);
        }
        Arrays.stream(ans).forEach(System.out::println);
    }
}
