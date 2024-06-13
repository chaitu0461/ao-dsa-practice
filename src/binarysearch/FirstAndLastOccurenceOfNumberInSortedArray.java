package binarysearch;

public class FirstAndLastOccurenceOfNumberInSortedArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,5,5,5,6};
        int target=5;
        int low=0;
        int high= nums.length-1;
        int lastOccurenceIndex=-1;
        lastOccurenceIndex = getLastOccurence(low, high, nums, target, lastOccurenceIndex);
       int firstOccurenceIndex=getFirstOccurence(low, high, nums, target, lastOccurenceIndex);

        System.out.println(lastOccurenceIndex+",firstOccurence::"+firstOccurenceIndex);
    }

    public static int getLastOccurence(int low, int high, int[] nums, int target, int ans) {
        while (low <= high) {
            int mid=(low + high)/2;
            if(nums[mid]== target) {
                ans =mid;
                low = mid + 1;
            } else if (nums[mid]< target) {
                low =mid+1;
            } else
                high =mid-1;

        }
        return ans;
    }
    public static int getFirstOccurence(int low, int high, int[] nums, int target, int ans) {
        while (low <= high) {
            int mid=(low + high)/2;
            if(nums[mid]== target) {
                ans =mid;
                high=mid-1;
            } else if (nums[mid]< target) {
                low =mid+1;
            } else
                high =mid-1;

        }
        return ans;
    }

}
