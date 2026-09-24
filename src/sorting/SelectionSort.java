package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums={89,81,286,1276};
      // smallestNumberIndex represents the position where the next
      // smallest element should be placed.
        for(int smallestNumberIndex=0;smallestNumberIndex<nums.length-1;smallestNumberIndex++){
            int minIndexInUnsortedArray=smallestNumberIndex;
            for(int unsortedIndex=smallestNumberIndex+1;unsortedIndex<nums.length;unsortedIndex++){
                if(nums[minIndexInUnsortedArray]>nums[unsortedIndex])
                    minIndexInUnsortedArray=unsortedIndex;

            }
            if(nums[minIndexInUnsortedArray]<nums[smallestNumberIndex]){
                int temp=nums[smallestNumberIndex];
                nums[smallestNumberIndex]=nums[minIndexInUnsortedArray];
                nums[minIndexInUnsortedArray]=temp;
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
