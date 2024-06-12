package arrays.easy;

import java.util.Arrays;

public class RotateArrayByKNaiveApproach {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        rotateArray(nums,1);
    }

    private static void rotateArray(int[] nums, int numberOfRotations) {
        if(nums.length==0)
            System.out.println("array cannot be rotated since length is 0 or 1 ");
        numberOfRotations=numberOfRotations%nums.length;
        if(numberOfRotations==0) {
            prinnNums(nums);
            return;
        }
        else if (numberOfRotations<0) {
           numberOfRotations=numberOfRotations+nums.length;
        }
        for (int i=1;i<=numberOfRotations;i++){
            rotateOneTime(nums);
        }
        prinnNums(nums);

    }

    private static void rotateOneTime(int[] nums){

        int temp=nums[0];
        for(int i=1;i< nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
    }
    private static void prinnNums(int[] nums) {
        Arrays.stream(nums).forEach(System.out::println);
    }
}
