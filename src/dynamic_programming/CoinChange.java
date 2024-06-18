package dynamic_programming;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins={2,3};
        int target=5;
        int[][] dp=new int[coins.length][target+1];
        for(int[] nums:dp){
            Arrays.fill(nums,-1);
        }
        int numberofWays= findNumberOfWaysToAchieveTargetMemoization(coins,coins.length-1,target,dp);
        System.out.println(numberofWays);
        System.out.println(findNumberOfWaysToAchieveTargetMatrix(coins,target));
    }

    private static int findNumberOfWaysToAchieveTargetMatrix(int[] coins, int k) {
        int[][] dp=new int[coins.length][k+1];
        for(int target=0;target<=k;target++){
            if(target%coins[0]==0)
                dp[0][target]=1;
            else
                dp[0][target]=0;
        }
        for(int index=1;index<coins.length;index++){
            for(int target=0;target<=k;target++){
                int notTakeCoin= dp[index-1][target] ;
                int takeCoins=0;
                if(target-coins[index]>=0)
                    takeCoins= dp[index][target-coins[index]];
                 dp[index][target]=takeCoins+notTakeCoin;
            }
        }
        return dp[coins.length-1][k];
    }

    private static int findNumberOfWaysToAchieveTargetMemoization(int[] coins, int index, int target, int[][] dp) {
        if(index==0){
            if(target%coins[0]==0)
                return 1;
            else
                return 0;
        }
        if(dp[index][target]!=-1)
            return dp[index][target];
        int notTakeCoin= findNumberOfWaysToAchieveTargetMemoization(coins,index-1,target, dp);
        int takeCoins=0;
        if(target-coins[index]>=0)
            takeCoins= findNumberOfWaysToAchieveTargetMemoization(coins,index,target-coins[index], dp);
        return dp[index][target]=takeCoins+notTakeCoin;
    }
}
