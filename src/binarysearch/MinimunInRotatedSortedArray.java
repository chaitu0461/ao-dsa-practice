package binarysearch;

public class MinimunInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums={3,4,5,1,2}; //9,10,11,12
       int minElement= findMinInRotatedSortedArray(nums,false);
       System.out.println(minElement);
    }

    public static int findMinInRotatedSortedArray(int[] nums,boolean returnMinIndex) {
        int minValue=Integer.MAX_VALUE;
        int minIndex=-1;
        int low=0;
        int high=nums.length-1;

        while (low<=high){ // left half is sorted
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                int temp=minValue;
                minValue=Math.min(minValue,nums[low]);
                if(minValue<temp){
                    minIndex=low;
                }
                low=mid+1; //eliminate left half
            }
            else { //right part is sorted
                int temp=minValue;
                minValue=Math.min(minValue,nums[mid]);
                if(minValue<temp){
                    minIndex=mid;
                }
                high=mid-1; //eliminate right half
            }
        }
       return returnMinIndex?minIndex:minValue;
    }

}
