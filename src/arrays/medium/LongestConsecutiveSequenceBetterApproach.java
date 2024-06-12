package arrays.medium;

import java.util.Arrays;

public class LongestConsecutiveSequenceBetterApproach {
    public static void main(String[] args) {
        int[] nums={1,10,19,2,5,15,6,76,7};
        Arrays.sort(nums);
        int longestSequence=1;
        int cnt=1;
        int previousElement=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-1==previousElement){
                cnt++;
            }
            else{
                cnt=1;

            }
            previousElement=nums[i];

            longestSequence= Math.max(longestSequence,cnt);

        }
System.out.println(longestSequence);
    }
}
