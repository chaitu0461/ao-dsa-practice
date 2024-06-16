package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
       for(int sortedIndex= nums.length-1;sortedIndex>=0;sortedIndex--){
           boolean swapped=false;

           for(int unsortedIndex=0;unsortedIndex<=sortedIndex-1;unsortedIndex++){
               if(  nums[unsortedIndex]>nums[unsortedIndex+1]){
                   int temp=nums[unsortedIndex];
                   nums[unsortedIndex]=nums[unsortedIndex+1];
                   nums[unsortedIndex+1]=temp;
                   swapped=true;
               }
           }
           if(!swapped)
               break;
       }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
