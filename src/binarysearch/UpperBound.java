package binarysearch;

public class UpperBound {
    public static void main(String[] args) {
        int[] nums={10,24,45,65,79};
        int target=24;
        int high=nums.length-1;
        int low=0;
        int ans=-1;
        while (low<=high){
            int mid=(high+low)/2;
            if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            } else  {
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
