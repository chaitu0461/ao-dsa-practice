package arrays.easy;

import java.util.Arrays;

public class RotateArrayByKAlgorithm {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int numberOfRotations=2;
        numberOfRotations=numberOfRotations%nums.length;
        if(numberOfRotations==0) {
            printNums(nums);
            return;
        }
        if(numberOfRotations<0)
            numberOfRotations=numberOfRotations+nums.length;

        reverse(nums,0,numberOfRotations-1);
        reverse(nums,numberOfRotations,nums.length-1);
        reverse(nums,0,nums.length-1);
        printNums(nums);


    }

    private static void reverse(int[] nums, int startIndex, int endIndex) {
        while (startIndex<=endIndex){
            int temp=nums[startIndex];
            nums[startIndex]=nums[endIndex];
            nums[endIndex]=temp;
            startIndex++;
            endIndex--;
        }
    }
    private static void printNums(int[] nums) {
        Arrays.stream(nums).forEach(System.out::println);
    }
}
