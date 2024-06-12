package slidingwindow.fixedsize;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfAnagrams {
    public static void main(String[] args) {
        Map<Character,Integer> charFreqMap=new HashMap<>();
        String anagramString="for";
        for(char c:anagramString.toCharArray()){
            charFreqMap.put(c,charFreqMap.getOrDefault(c,0)+1);
        }
        String question="forxxorfxdofr";
        int start=0;
        int end=0;
        int count=0;
        while (end<question.length()){
           char currentChar= question.charAt(end);
            if(charFreqMap.containsKey(currentChar)){
                charFreqMap.put(currentChar,charFreqMap.get(currentChar)-1);
            }
            if(end-start+1==anagramString.length()){
                if(charFreqMap.values().stream().allMatch(i->i==0))
                    count++;
                if(anagramString.contains(Character.toString(currentChar)))
                    charFreqMap.put(currentChar,charFreqMap.getOrDefault(currentChar,0)+1);
                start++;
            }
            end++;
        }
        System.out.println(count);
    }
}
