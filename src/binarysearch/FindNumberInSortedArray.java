package binarysearch;

public class FindNumberInSortedArray {
    public static void main(String[] args) {
        int[] nums={5,7,9,11,13};
        int target=11;
        int low=0;
        int high=nums.length-1;
        while (low<high){
            int mid=(low+high)/2;
            if(nums[mid]==target) {
                System.out.println("target found");
                return;
            }
            if(nums[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        System.out.println("target not found");
    }
}
