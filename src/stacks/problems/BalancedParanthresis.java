package stacks.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParanthresis {
    public static void main(String[] args) {
        String exp="([{]})";
        Stack<Character> charStack=new Stack<>();
        Map<Character,Character> validParanthresisMap=new HashMap<>();
        validParanthresisMap.put('}','{');
        validParanthresisMap.put(']','[');
        validParanthresisMap.put(')','(');
        for(char ch:exp.toCharArray()){
            if(validParanthresisMap.containsValue(ch))
                charStack.push(ch);
            else {
                if(charStack.isEmpty()){
                    System.out.println("extra closing brcket found! not valid..");
                    return;
                }
                if(validParanthresisMap.get(ch)!=charStack.pop()){
                    System.out.println("Invalid matching paranthreis..");
                    return;
                }

            }
        }
        if(!charStack.isEmpty()){
            System.out.println("extra opening bracket found!!..invlaid");
            return;
        }
        System.out.println("valid paranthresis!!");
    }
}
