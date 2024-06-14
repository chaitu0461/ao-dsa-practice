package recursion.basic;

public class FirstIndexOfOccurence {
    public static void main(String[] args) {
        int[]nums={928,26782,72,2,2,72};
        int firstIndex=findFirstOccurence(nums,76,0);
        System.out.println(firstIndex);

    }

    private static int findFirstOccurence(int[] nums, int target,int index)
    {
        if(index==nums.length)
            return -1;
        if(nums[index]==target)
            return index;
       return findFirstOccurence(nums,target,index+1);
    }
}
