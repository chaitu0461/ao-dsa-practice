package sorting;

import java.util.Arrays;

public class  InsertionSort {
    public static void main(String[] args) {
      /*
       * INSERTION SORT:
       *
       * Step 1: Start from the second element; treat the first as sorted.
       *
       * Step 2: Pick the current element as `key`.
       *
       * Step 3: Compare `key` with elements to its left.
       *
       * Step 4: Shift elements greater than `key` one position right.
       *
       * Step 5: Insert `key` into its correct position.
       *
       * Step 6: Repeat until the entire array is sorted.
       */

      int[] nums={89,81,286,1276,0,5};
       for(int unsortedIndex=1;unsortedIndex<nums.length;unsortedIndex++){
         int sortedIndex = unsortedIndex-1;
         int key = nums[unsortedIndex];
         while (sortedIndex>=0 && nums[sortedIndex]>key){
           nums[sortedIndex+1]=nums[sortedIndex];
           sortedIndex--;
         }
         nums[sortedIndex+1]=key;

       }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
