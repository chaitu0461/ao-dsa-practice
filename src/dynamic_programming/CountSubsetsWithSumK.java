package dynamic_programming;

import java.util.Arrays;

public class CountSubsetsWithSumK {

    public static void main(String[] args) {
        int[] nums={1,1,2};
        int target=5;
        int[][] dp=new int[nums.length][target+1];
        for(int[] elements:dp){
            Arrays.fill(elements,-1);
        }
        int numberOfPairs=findSubsetsWithSumKTargetMemoization(nums,nums.length-1,target,dp);
        System.out.println(numberOfPairs);
        System.out.println(findSubsetsWithSumKMatrix(nums,target));

    }
    private static int findSubsetsWithSumKTargetMemoization(int[] nums, int index, int target, int [][] dp) {
        if(target==0)
            return 1;
        if(index==0)
            return nums[index]==target?1:0;
        if(dp[index][target]!=-1)
            return 1;
        int pick=0;

        if(target-nums[index]>=0){
            pick= findSubsetsWithSumKTargetMemoization(nums,index-1,target-nums[index], dp);
        }
        int notPick= findSubsetsWithSumKTargetMemoization(nums,index-1,target, dp);
        return dp[index][target]=pick+notPick;
    }
    private static int findSubsetsWithSumKMatrix(int[] nums,int target) {
       int[][] dp= new int[nums.length][target+1];
       for(int i=0;i<nums.length;i++){
           dp[i][0]=1;
       }
       int curValue=nums[0];
       for(int i=0;i<=target;i++){
           if(i==curValue) {
               dp[0][i] = 1;
           }
       }
       for(int index=1;index<nums.length;index++){
           for(int j=1;j<=target;j++){
               int pick=0;

               if(j-nums[index]>=0){
                   pick= dp[index-1][j-nums[index]];
               }
               int notPick= dp[index-1][j];
                dp[index][j]=pick+notPick;
           }
       }
        return dp[nums.length-1][target];

    }


}
