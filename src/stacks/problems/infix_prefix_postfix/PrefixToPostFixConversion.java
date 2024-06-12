package stacks.problems.infix_prefix_postfix;

import java.util.Stack;

public class PrefixToPostFixConversion {
    public static void main(String[] args) {
        String expression="-9/*+5346";
        Stack<String> numberStack=new Stack<>();
        for(int i=expression.length()-1;i>=0;i--){
            char ch=expression.charAt(i);
            if(Character.isDigit(ch))
                numberStack.push(""+ch);
            else {
                String value1=numberStack.pop();
                String value2=numberStack.pop();
               String result=value1+value2+ch;
                numberStack.push(result);
            }
        }
System.out.println(numberStack.peek());
    }
}
