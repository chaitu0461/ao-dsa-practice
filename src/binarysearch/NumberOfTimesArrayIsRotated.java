package binarysearch;

public class NumberOfTimesArrayIsRotated {
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2,3};
      int minIndex=  MinimunInRotatedSortedArray.findMinInRotatedSortedArray(nums,true);
      System.out.println(minIndex);
    }
}
