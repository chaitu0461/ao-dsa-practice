package arrays.hard;
/*
* If we go by bruteforce , it would take n square compleixty
* So we remember max and min product at every element
* Why min? because if the total product is negative and next number is also negative , it will become max
* */
public class MaxProductSubArray {
  static void main(String[] args) {
    MaxProductSubArray maxProductSubArray = new MaxProductSubArray();
    int[] nums = {1,-2,3};
    int maxProduct = maxProductSubArray.maxProduct(nums);
    System.out.println("Max product:"+maxProduct);

  }
  public int maxProduct(int[] nums) {
    int ans = nums[0];
    int curMaxProduct=nums[0];
    int curMinProduct=nums[0];

    for(int i=1;i<nums.length;i++){
      int cur=nums[i];

      /*Why this swap?
      Suppose curMax is 6 and CurMin is  -12
      the next number is -2
      if we skip the swap ,  we miss the 24, we get wrong answer
      * */
      if(cur<0){
        int temp = curMaxProduct;
         curMaxProduct =  curMinProduct;
         curMinProduct =temp;
      }

      curMaxProduct = Math.max(cur,cur*curMaxProduct);
      curMinProduct = Math.min(cur,cur*curMinProduct);
      ans = Math.max(ans,curMaxProduct);
    }
    return ans;

  }
}
