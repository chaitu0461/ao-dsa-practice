package slidingwindow.variablesize;

import java.util.HashSet;
import java.util.Set;
//https://www.youtube.com/watch?v=Vgo7tvBm8OU refernce video
//this is o(2n) better approach
public class LongestSubStringWithoutRepeatingCharactersUsingSet {
    public static void main(String[] args) {
        String question="aaab";
        int start=0;
        int end=0;
        int maxLength=Integer.MIN_VALUE;
        Set<Character> characterSet=new HashSet<>();
        while (end<question.length()){
            char currentChar=question.charAt(end);
            if(characterSet.contains(currentChar)){
                while (start<end && characterSet.contains(currentChar)){
                    characterSet.remove(question.charAt(start));
                    start++;
                }
            }

            characterSet.add(currentChar);
            maxLength=Math.max(maxLength,end-start+1);

            end++;

        }

System.out.println(maxLength);
    }
}
