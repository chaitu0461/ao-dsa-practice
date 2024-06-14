package recursion.basic;

public class MaxValueOfArray {
    public static void main(String[] args) {
        int[] nums={8190,89,83,8932};
        int maxValue=findMax(nums,0);
        System.out.println(maxValue);
    }

    private static int findMax(int[] nums, int index) {
        if(index==nums.length)
            return Integer.MIN_VALUE;
        return Math.max(nums[index],findMax(nums,index+1));
    }
}
