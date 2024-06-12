package slidingwindow.fixedsize;

public class LargestSubArrayOfSizeK {
    public static void main(String[] args) {
        int size=2;
        int[] nums={1,2,3};
        int start=nums[0];
        int end=nums[0];
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        while (end<nums.length){
            curSum+=nums[end];
             if(end-start+1==size) {
                maxSum=Math.max(maxSum,curSum);
                curSum=curSum-nums[start];
                start++;
            }
            end++;

        }
        System.out.println(maxSum);
    }
}
