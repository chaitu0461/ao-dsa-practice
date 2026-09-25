package arrays.easy;

import java.util.Arrays;

public class RotateArrayByKBruteForceApproach {
  static void main() {
    int[] nums ={1,2,3,4,5,6};
    int rotations= 5;
    int arrayLength= nums.length;
    int effectiveRotations= rotations%arrayLength;
    int[] temp = new int[effectiveRotations];

    for(int i=0;i<effectiveRotations;i++){
      temp[i]=nums[i];
    }
    // shift the remaining elements to right
    for(int i=0;i<arrayLength-effectiveRotations;i++){
      nums[i]=nums[effectiveRotations+i];
    }
    // place the remaining elements in temp at the end
    for(int i=0;i<temp.length;i++){
      nums[arrayLength-effectiveRotations+i]=temp[i];
    }
    Arrays.stream(nums).forEach(System.out::println);
  }
}
