package dynamic_programming;

import java.util.Arrays;

public class MinimumCoins {
    public static void main(String[] args) {
        int[] denominations={4,9,1};
        int target=10;
        int[][] dp=new int[denominations.length][target+1];
        for (int[] a:dp){
            Arrays.fill(a,-1);
        }
       int minCoins= findMinimumCoinsMemoization(denominations,denominations.length-1,target,dp);
       System.out.println(minCoins);
       System.out.println(findMinimumCoinsMatrix(denominations,target));
    }

    private static int findMinimumCoinsMatrix(int[] denominations, int k) {
        int[][] dp=new int[denominations.length][k+1];
        for(int target=0;target<=k;target++){
            if(target%denominations[0]==0)
                dp[0][target]=target/denominations[0];
            else
                dp[0][target]=(int) 1e9;
        }
        for (int index=1;index<denominations.length;index++){
            for(int target=0;target<=k;target++){
                int notTake=dp[index-1][target];
                int take=(int) 1e9;
                if(target-denominations[index]>=0)
                    take=1+dp[index][target-denominations[index]];
                dp[index][target]=Math.min(notTake,take);

            }
        }
        return dp[denominations.length-1][k];
    }

    private static int findMinimumCoinsMemoization(int[] denominations, int index, int target, int[][] dp) {
        if(index==0){
            if(target%denominations[index]==0)
                return target/denominations[index];
            else
                return (int) 1e9;

        }
        if(dp[index][target]!=-1)
            return dp[index][target];
        int notTake=findMinimumCoinsMemoization(denominations,index-1,target, dp);
        int take=(int) 1e9;
        if(target-denominations[index]>=0)
            take=1+findMinimumCoinsMemoization(denominations,index,target-denominations[index], dp);
        return dp[index][target]=Math.min(notTake,take);
    }
}
