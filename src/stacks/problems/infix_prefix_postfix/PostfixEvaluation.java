package stacks.problems.infix_prefix_postfix;

import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String expression="953+4*6/-";
        Stack<Integer> numberStack=new Stack<>();

        for(char ch: expression.toCharArray()){
            if(Character.isDigit(ch))
                numberStack.push((int)ch-48);
            else {
                int result;
                int value2=numberStack.pop();
                int value1=numberStack.pop();
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
