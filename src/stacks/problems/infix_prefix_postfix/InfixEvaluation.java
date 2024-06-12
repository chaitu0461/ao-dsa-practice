package stacks.problems.infix_prefix_postfix;

import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        String expression="(9+5)*4/3";
        Stack<Integer> operandStack=new Stack<>();
        Stack<Character> operatorStack=new Stack<>();
        for(char ch:expression.toCharArray()){
            int asciiValue=(int) ch;
            if(asciiValue>=48 && asciiValue<=57){
                operandStack.push(asciiValue-48);
            } else if ( operatorStack.isEmpty() || ch=='(' || operatorStack.peek()=='(' ) {
                operatorStack.push(ch);
            }
            else if (ch==')') {
                while (operatorStack.peek()!='('){
                    //work
                    int value2= operandStack.pop();
                    int value1= operandStack.pop();
                    char operand=operatorStack.pop();
                    int result;
                    if(operand=='+')
                        result=value2+value1;
                    else if (operand=='-') {
                        result=value1-value2;
                    } else if (operand=='/') {
                        result=value1/value2;

                    }
                    else
                        result=value1*value2;
                    operandStack.push(result);
                }
                operatorStack.pop();

            }
            else {
                if(ch=='+' || ch=='-'){
                    //work
                    int value2= operandStack.pop();
                    int value1= operandStack.pop();
                    char operand=operatorStack.pop();
                    int result;
                    if(operand=='+')
                        result=value2+value1;
                    else if (operand=='-') {
                        result=value1-value2;
                    } else if (operand=='/') {
                        result=value1/value2;

                    }
                    else
                        result=value1*value2;
                    operandStack.push(result);
                    operatorStack.push(ch);

                }
                else if (ch=='*' || ch=='/') {
                    if(operatorStack.peek()=='+'|| operatorStack.peek()=='-')
                        operatorStack.push(ch);
                    else {
                        //work
                        int value2= operandStack.pop();
                        int value1= operandStack.pop();
                        char operand=operatorStack.pop();
                        int result;
                         if (operand=='/') {
                            result=value1/value2;
                        }
                        else
                            result=value1*value2;
                        operandStack.push(result);
                        operatorStack.push(ch);

                    }
                }
            }
        }
        while (operandStack.size()>1){
            //work
            int value2=operandStack.pop();
            int value1=operandStack.pop();
            char  operator=operatorStack.pop();
            int result;
            if(operator=='+')
                result=value1+value2;
            else if (operator=='-') {
                result=value1-value2;
            } else if (operator=='*') {
                result=value1*value2;
            }
            else
                result=value1/value2;
            operandStack.push(result);

        }

        System.out.println(operandStack.peek());
        int numericResult=(9+5)*4/3;
        System.out.println("numeric result::"+numericResult);
    }
}
