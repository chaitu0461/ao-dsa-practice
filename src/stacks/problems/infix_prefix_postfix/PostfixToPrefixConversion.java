package stacks.problems.infix_prefix_postfix;

import java.util.Stack;

public class PostfixToPrefixConversion {
    public static void main(String[] args) {
        String expression="953+4*6/-";
        Stack<String> numberStack=new Stack<>();
        for(int i=0;i<expression.length();i++){
            char ch=expression.charAt(i);
            if(Character.isDigit(ch))
                numberStack.push(""+ch);
            else {
                String value2=numberStack.pop();
                String value1=numberStack.pop();
                String result=ch+value1+value2;
                numberStack.push(result);
            }
        }
        System.out.println(numberStack.peek());
    }
}
