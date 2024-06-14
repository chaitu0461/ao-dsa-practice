package recursion.basic;

import java.util.ArrayList;
import java.util.List;

public class PrintSubSequences {
    public static void main(String[] args) {
            printSubSequence("abc","",0);
    }

    private static void printSubSequence(String question, String ans, int index) {
        if(index==question.length()) {
            System.out.println(ans);
            return;
        }



        printSubSequence(question,ans,index+1);
        printSubSequence(question,ans+question.charAt(index),index+1);

    }
}
