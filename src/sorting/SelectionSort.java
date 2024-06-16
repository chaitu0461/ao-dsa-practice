package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums={89,81,286,1276};
        for(int sortedIndex=0;sortedIndex<nums.length-1;sortedIndex++){
            int minIndexInUnsortedArray=sortedIndex;
            for(int unsortedIndex=sortedIndex+1;unsortedIndex<nums.length;unsortedIndex++){
                if(nums[minIndexInUnsortedArray]>nums[unsortedIndex])
                    minIndexInUnsortedArray=unsortedIndex;

            }
            if(nums[minIndexInUnsortedArray]<nums[sortedIndex]){
                int temp=nums[sortedIndex];
                nums[sortedIndex]=nums[minIndexInUnsortedArray];
                nums[minIndexInUnsortedArray]=temp;
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
