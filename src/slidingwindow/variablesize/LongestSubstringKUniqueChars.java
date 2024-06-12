package slidingwindow.variablesize;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKUniqueChars {
    public static void main(String[] args) {
        String question="aaabbbccccdef";
        int windowSize=3;
        int start=0;
        int end=0;
        int maxLength=Integer.MIN_VALUE;
        Map<Character,Integer> charFreqMap=new HashMap<>();
        while (end<question.length()){
            char currentChar=question.charAt(end);
            charFreqMap.put(currentChar,charFreqMap.getOrDefault(currentChar,0)+1);
            if(charFreqMap.size()==windowSize)
                maxLength=Math.max(maxLength,end-start+1);
            else if (charFreqMap.size()>windowSize) {
                while (charFreqMap.size()>windowSize){
                    charFreqMap.put(currentChar,charFreqMap.get(currentChar)-1);
                    if(charFreqMap.get(currentChar)==0)
                        charFreqMap.remove(currentChar);
                    start++;
                }

            }
            end++;
        }
        System.out.println(maxLength);
    }
}
