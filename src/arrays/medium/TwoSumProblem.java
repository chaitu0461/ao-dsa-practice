package arrays.medium;

import java.util.Arrays;

public class TwoSumProblem {
    public static void main(String[] args) {
        int[] nums={1,3,43,2,10};
        int targetSum=50;
        Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;
        while (low<high){
           int curSum= nums[low]+nums[high];
            if(curSum==targetSum) {
                System.out.println(nums[low] + "..." + nums[high]);
                return;
            }
            else if (curSum>targetSum) {
                high--;
            }
            else
                low++;
        }
        System.out.println("no pairs found");
    }
}
