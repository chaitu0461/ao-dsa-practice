package arrays.medium;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] nums={1,0,1,2,0,0,2,1,1};
        int mid=0,low=0;
        int high= nums.length-1;
        while (mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            } else if (nums[mid]==2) {
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
            else
                mid++;
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
