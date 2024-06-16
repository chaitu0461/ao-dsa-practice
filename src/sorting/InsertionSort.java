package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums={89,81,286,1276};
       for(int i=0;i< nums.length;i++){
           int j=i;
           while (j>0 && nums[j-1]>nums[j]){
               int temp=nums[j];
               nums[j]=nums[j-1];
               nums[j-1]=temp;
               j--;
           }
       }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
