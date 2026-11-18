package arrays.hard;

public class ReversePairs {

  /*The logic is same is Count Inversions
  We just count the number of reverser pairs during merge
  Why we count during merge? because two parts are already sorted
  * */
  static void main(String[] args) {
    ReversePairs reversePairs = new ReversePairs();
    int[] nums = {5,4,4,3,3};
    int countOfReversePairs = reversePairs.reversePairs(nums);
    System.out.println("Count:"+countOfReversePairs);
  }

  public   int reversePairs(int[] nums) {

    return mergeSort(nums,0,nums.length-1);

  }

  private  int mergeSort(int[] nums, int low, int high) {
    if(low>=high)
      return 0;
    int count=0;
    int mid = low+(high-low)/2;
    count+=mergeSort(nums,low,mid);
    count+=mergeSort(nums,mid+1,high);
    count+=merge(nums,low,mid,high);
    return count;
  }

  private  int merge(int[] nums, int low, int mid, int high) {
    int count = 0;
    count+=countReversePairs(nums,low,mid,high);
    int[] temp = new int[high-low+1];
    int tempIndex= 0;
    int leftStart=low;
    int rightStart = mid+1;

    while (leftStart<=mid && rightStart<= high){
      if(nums[leftStart]>=nums[rightStart]){
        temp[tempIndex++]=nums[rightStart++];
      }
      else {
        temp[tempIndex++]=nums[leftStart++];
      }
    }
    while (leftStart<=mid){
      temp[tempIndex++]=nums[leftStart];
      leftStart++;
    }

    while (rightStart<=high){
      temp[tempIndex++]=nums[rightStart];
      rightStart++;
    }
    for(int i = 0; i<temp.length;i++){
      nums[low+i] = temp[i];
    }
    return count;

  }

  private static int countReversePairs(int[] nums, int low, int mid, int high) {

     int count =0;
     int rightStart=mid+1;
    for(int i=low;i<=mid;i++){
      int curRightIndex = mid+1;

      // to prevent overflow  we convert to long
      while (curRightIndex<=high && (long)nums[i]>2L*nums[curRightIndex]){
        curRightIndex++;
      }
      // suppose it breaks at first element only , the answer is zero
      // if we write curRightIndex - rightStart+1, this is wrong answer
      count+=curRightIndex - rightStart;
    }

    return count;
  }
}
