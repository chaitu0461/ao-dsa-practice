package slidingwindow.variablesize;

import java.util.HashMap;
import java.util.Map;
//this is optimal approsch
//https://www.youtube.com/watch?v=Vgo7tvBm8OU refernce video
public class LongestSubStringWithoutRepeatingCharactersUsingMap {
    public static void main(String[] args) {
        String question="aaabbbbbccccdef";
        int start=0;
        int end=0;
        int maxLength=Integer.MIN_VALUE;
        Map<Character,Integer> characterMap=new HashMap<>();
        while (end<question.length()){
            char currentChar=question.charAt(end);
            if(characterMap.containsKey(currentChar) && characterMap.get(currentChar)>=start){
             start=characterMap.get(currentChar)+1;
            }
            characterMap.put(currentChar,end);
            maxLength=Math.max(maxLength,end-start+1);
            end++;
        }
        System.out.println(maxLength);
    }
}
