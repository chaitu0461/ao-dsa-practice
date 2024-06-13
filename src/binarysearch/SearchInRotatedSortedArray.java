package binarysearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={4,5,1,2,3};
        int target=4;
        int numberIndex=searchInRotatedArray(nums,target);
        System.out.println(numberIndex);
    }

    private static int searchInRotatedArray(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target)
                return mid;
            //identify the sorted half
            if(nums[mid]<=nums[high]){ //right half is sorted
                if(target>=nums[mid] && target<=nums[high]){
                    low=mid+1;
                }
                else {  // if target is not present in sorted right half, eliminate it
                    high=mid-1;
                }
            }
            else {//left half is sorted
                if(target>=nums[low] && target<=nums[mid]){
                    high=mid-1;
                }
                else { //if target is not present in sorted left half, eliminate it
                    low=mid+1;
                }
            }
        }
        return -1;
    }
}
