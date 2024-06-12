package stacks.problems.infix_prefix_postfix;

import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) {
        String expression="-9/*+5346";
        Stack<Integer> numberStack=new Stack<>();

        for(int i=expression.length()-1;i>=0;i--){
            char ch=expression.charAt(i);
            if(Character.isDigit(ch))
                numberStack.push((int)ch-48);
            else {
                int result;
                int value1=numberStack.pop();
                int value2=numberStack.pop();
                if(ch=='*')
                    result=value1*value2;
                else if (ch=='/') {
                    result=value1/value2;
                } else if (ch=='+') {
                    result=value1+value2;
                }
                else
                    result=value1-value2;
                numberStack.push(result);
            }
        }
        System.out.println(numberStack.peek());
    }
}
