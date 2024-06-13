package binarysearch;

public class FrequencyCountOfNumberInSortedArray {
    public static void main(String[] args) {
        int[] nums={1,3,3,3,5};
        int target=1;
        countFrequency(nums,target);
    }

    private static void countFrequency(int[] nums, int target) {
        var firstOccurence=FirstAndLastOccurenceOfNumberInSortedArray.getFirstOccurence(0,nums.length-1,nums,target,-1);
        var lastOccurence=FirstAndLastOccurenceOfNumberInSortedArray.getLastOccurence(0,nums.length-1,nums,target,-1);
        if(firstOccurence==-1)
            System.out.println("Number nit present");
        else
            System.out.println(lastOccurence-firstOccurence+1);

    }
}
