package arrays.easy;

import java.util.HashMap;

public class LongestSubArrayWithSumk_HashMap {
    public static void main(String[] args) {
        int[] nums={7,1,6,0};
        int prefixSum=0;
        int maxLength=Integer.MIN_VALUE;
        int targetSum=7;
        HashMap<Integer,Integer> prefixIndexMap=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            if(prefixSum==targetSum)
                maxLength=Math.max(maxLength,i+1);
            if(prefixIndexMap.containsKey(prefixSum-targetSum)){
                maxLength=Math.max(maxLength,i-prefixIndexMap.get(prefixSum-targetSum));
            }
            if(!prefixIndexMap.containsKey(prefixSum))
                prefixIndexMap.put(prefixSum,i);


        }
        System.out.println(maxLength);
    }
}
