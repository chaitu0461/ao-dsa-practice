package stacks.problems.nearest_smaller_greater_left_right;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElementToLeft {
    public static void main(String[] args) {
        int[] elements={1,5,3,2,1,6,3,4};
       int[] ans= getnextSmallerElements(elements);
        Arrays.stream(ans).forEach(System.out::println);
    }

    public static int[] getnextSmallerElements(int[] elements) {
        int[] ans= new int[elements.length];
        ans[0]=-1;
        Stack<Integer> integerStack=new Stack<>();
        integerStack.push(elements[0]);
        for(int i = 1; i< elements.length; i++){
            while (!integerStack.isEmpty() && integerStack.peek()>= elements[i]){
                integerStack.pop();
            }
            if(integerStack.isEmpty())
                ans[i]=-1;
            else
                ans[i]=integerStack.peek();
            integerStack.push(elements[i]);
        }
        return ans;
    }
    public static int[] getnextSmallerElementsIndexes(int[] elements) {
        int[] ans= new int[elements.length];
        ans[0]=-1;
        Stack<Integer> integerStack=new Stack<>();
        integerStack.push(0);
        for(int i = 1; i< elements.length; i++){
            while (!integerStack.isEmpty() && elements[integerStack.peek()]>= elements[i]){
                integerStack.pop();
            }
            if(integerStack.isEmpty())
                ans[i]=-1;
            else
                ans[i]=integerStack.peek();
            integerStack.push(i);
        }
        return ans;
    }


}
