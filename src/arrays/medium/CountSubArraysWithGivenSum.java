package arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class CountSubArraysWithGivenSum {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int targetSum=3;
        int prefixSum=0;
        int totalCount=0;
        Map<Integer,Integer> sumCountMap= new HashMap<>();
        sumCountMap.put(0,1);
        for(int element:nums){
            prefixSum+=element;
            int remainingSum=prefixSum-targetSum;
            if(sumCountMap.containsKey(remainingSum)){
                totalCount+=sumCountMap.get(remainingSum);
            }
            sumCountMap.put(prefixSum,sumCountMap.getOrDefault(prefixSum,0)+1);
        }
        System.out.print(totalCount);
    }
}
