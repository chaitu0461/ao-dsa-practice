package stacks.problems.nearest_smaller_greater_left_right;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallerElementToRight {
    public static void main(String[] args) {
        int[] elements={1,5,3,2,1,6,3,4};
        int[] ans = getNextSmallerElements(elements);
        Arrays.stream(ans).forEach(System.out::println);
    }

    public static int[] getNextSmallerElements(int[] elements) {
        int[] ans= new int[elements.length];
        ans[ans.length-1]=-1;
        Stack<Integer> integerStack=new Stack<>();
        integerStack.push(elements[ans.length-1]);
        for(int i = elements.length-2; i>= 0; i--){
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
    public static int[] getNextSmallerElementsIndexes(int[] elements) {
        int[] ans= new int[elements.length];
        ans[ans.length-1]=-1;
        Stack<Integer> integerStack=new Stack<>();
        integerStack.push(ans.length-1);
        for(int i = elements.length-2; i>= 0; i--){
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
