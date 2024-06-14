package recursion.basic;

public class LastIndexOfOccurence {
    public static void main(String[] args) {
        int[] nums={83108,182,192,901,901,28};
        int lastIndex=findLast(nums,901,0);
        System.out.println(lastIndex);
    }

    private static int findLast(int[] nums, int target, int curIndex) {
        if(curIndex==nums.length)
            return Integer.MIN_VALUE;
        int lastIndex=Integer.MIN_VALUE;
        if(nums[curIndex]==target){
            lastIndex=curIndex;
        }
        return Math.max(lastIndex,findLast(nums,target,curIndex+1));
    }
}
