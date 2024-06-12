package arrays.medium;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequenceOptimalApproach {
    public static void main(String[] args) {
        int[] nums={1,10,19,2,5,15,6,76,7,10,32,77,933,9032,78,17,79,99,80};
        Set<Integer> numSet=new HashSet<>();
        Arrays.stream(nums).forEach(numSet::add);
        int longestSequence=1;
        for(int element:numSet){
            if(!numSet.contains(element-1)){
                int count=1;
                int nextElement=element+1;
                while (numSet.contains(nextElement)){
                    count++;
                    nextElement=nextElement+1;
                }
                longestSequence=Math.max(count,longestSequence);

            }
        }
        System.out.println(longestSequence);
    }
}
