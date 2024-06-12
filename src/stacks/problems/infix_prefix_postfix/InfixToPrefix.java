package stacks.problems.infix_prefix_postfix;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String expression="9-(5+3)*4/6";// -9/*+5346
        Stack<String> operandStack=new Stack<>();
        Stack<Character> operatorStack=new Stack<>();
        for(char ch:expression.toCharArray()){
            int asciiValue=(int) ch;
            if(asciiValue>=48 && asciiValue<=57){
                operandStack.push(""+ch);
            } else if ( operatorStack.isEmpty() || ch=='(' || operatorStack.peek()=='(' ) {
                operatorStack.push(ch);
            }
            else if (ch==')'){
                while (operatorStack.peek()!='('){
                    String value2= operandStack.pop();
                    String value1= operandStack.pop();
                    char operator=operatorStack.pop();
                    String result=operator+value1+value2;
                    operandStack.push(result);

                }
                operatorStack.pop();


            }
            else {
                if(ch=='+' || ch=='-'){
                    //work
                    String value2= operandStack.pop();
                    String value1= operandStack.pop();
                    char operator=operatorStack.pop();
                    String result=operator+value1+value2;
                    operandStack.push(result);
                    operatorStack.push(ch);

                }
                else if (ch=='*' || ch=='/') {
                    if(operatorStack.peek()=='+'|| operatorStack.peek()=='-')
                        operatorStack.push(ch);
                    else {
                        //work
                        String value2= operandStack.pop();
                        String value1= operandStack.pop();
                        char opertaor=operatorStack.pop();
                        String result=opertaor+value1+value2;
                        operandStack.push(result);
                        operatorStack.push(ch);

                    }
                }



            }
        }
        while (operandStack.size()>1){
            //work
            String value2=operandStack.pop();
            String value1=operandStack.pop();
            char  operator=operatorStack.pop();
            String result=operator+value1+value2;
            operandStack.push(result);

        }
        System.out.println(operandStack.peek());

    }
}
