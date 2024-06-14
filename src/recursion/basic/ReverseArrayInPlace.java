package recursion.basic;

import java.util.Arrays;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[]nums={1,2,3};
        nums=reverseArray(nums,0,nums.length-1);
        Arrays.stream(nums).forEach(System.out::println);
    }

    private static int[] reverseArray(int[] nums, int start, int end) {
        if(start==end)
            return nums;
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        return reverseArray(nums,start+1,end-1);
    }
}
