package binarysearch;

public class Floor {
    public static void main(String[] args) {
        int[] nums={82,89,94,109};
        int target=83;
        int ans=-1;
        int low=0;
        int high=nums.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<=target){
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        System.out.println(ans);
    }
}
