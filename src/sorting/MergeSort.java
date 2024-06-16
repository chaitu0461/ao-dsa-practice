package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    private static  void mergeSort(int[] nums, int low, int high){
        if(low>=high)
            return;
        int mid=(high+low)/2;
        mergeSort(nums,low,mid);
        mergeSort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }

    private static void merge(int[] nums, int low, int mid, int high) {
        int leftpartIndex=low;
        int rightPartIndex=mid+1;
        List<Integer> sortedList=new ArrayList<>();
        while (leftpartIndex<=mid && rightPartIndex<=high){
            if(nums[leftpartIndex]<=nums[rightPartIndex]){
                sortedList.add(nums[leftpartIndex]);
                leftpartIndex++;
            }
            else {
                sortedList.add(nums[rightPartIndex]);
                rightPartIndex++;
            }
        }
        while (leftpartIndex<=mid){
            sortedList.add(nums[leftpartIndex]);
            leftpartIndex++;
        }
        while (rightPartIndex<=high){
            sortedList.add(nums[rightPartIndex]);
            rightPartIndex++;
        }
        for(int i=low;i<=high;i++){
            nums[i]=sortedList.get(i-low);
        }
    }

    public static void main(String[] args) {
              int[] nums={89,81,286,1276};
              mergeSort(nums,0,nums.length-1);
              Arrays.stream(nums).forEach(System.out::println);


    }
}
