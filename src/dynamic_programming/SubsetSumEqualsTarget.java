package dynamic_programming;

public class SubsetSumEqualsTarget {

    public static void main(String[] args) {
        int[] nums={1,9,1,32,56,34,6};
        int target=59;
        boolean[][] dp =new boolean[nums.length][target+1];
        boolean targetExists= findSubsetSumTargetMemoization(nums,nums.length-1,target,dp);
        System.out.println(targetExists);
       System.out.println(findSubsetSumTargetMatrix(nums,target));
        
    }

    private static boolean findSubsetSumTargetMatrix(int[] nums,int target) {
        boolean[][] dp =new boolean[nums.length][target+1];
        for(int index=0;index<dp.length;index++){
            dp[index][0]=true;
        }
        int curValue=nums[0];
        for(int i=0;i<=target;i++){
            if (curValue == target) {
                dp[0][target] = true;
                break;
            }
        }
       for(int index=1;index<nums.length;index++){
           boolean pick=false;
           if(target-nums[index]>=0){
               pick= findSubsetSumTargetMemoization(nums,index-1,target-nums[index], dp);
           }
           boolean notPick= findSubsetSumTargetMemoization(nums,index-1,target, dp);
            dp[index][target]=pick||notPick;
       }
       return dp[nums.length-1][target];
    }

    private static boolean findSubsetSumTargetMemoization(int[] nums, int index, int target, boolean[][] dp) {
        if(target==0)
            return true;
        if(index==0)
            return nums[index]==target;
        boolean pick=false;
        if(dp[index][target])
            return true;
        if(target-nums[index]>=0){
            pick= findSubsetSumTargetMemoization(nums,index-1,target-nums[index], dp);
        }
        boolean notPick= findSubsetSumTargetMemoization(nums,index-1,target, dp);
        return dp[index][target]=pick||notPick;
    }
}
