package dynamic_programming;

import java.util.Arrays;

public class KnapSack {
    public static void main(String[] args) {
        int [] weights={1,2,4,5};
        int[] values={5,4,8,6};
        int currentBagWeight=5;
        int[][] dp=new int[weights.length][currentBagWeight+1];
        for(int[] weightArr:dp){
            Arrays.fill(weightArr,-1);
        }
       int maxValue= findMaxValueMemoization(weights,values,weights.length-1,currentBagWeight,dp);
       System.out.println(maxValue);
       System.out.println(findMaxValueMatrix(weights,values,currentBagWeight));
    }

    private static int findMaxValueMatrix(int[] weights, int[] values, int currentBagWeight) {
        int[][] dp=new int[weights.length][currentBagWeight+1];
        int curValue=values[0];
        for(int i=0;i<=currentBagWeight;i++){
            if(weights[0]<=i){
                dp[0][i]=curValue;
            }
        }
        for(int index=1;index<dp.length;index++){
            for(int j=0;j<=currentBagWeight;j++){
                int notPick=dp[index-1][j];
                int pick=Integer.MIN_VALUE;
                if(j-weights[index]>=0)
                    pick=values[index]+dp[index-1][j-weights[index]] ;
                dp[index][j]=Math.max(notPick,pick);

            }
        }
return dp[weights.length-1][currentBagWeight];
    }

    private static int findMaxValueMemoization(int[] weights, int[] values, int index, int currentBagWeight, int[][] dp) {
        if(index==0){
            if(weights[0]<=currentBagWeight)
                return values[0];
            return 0;
        }
        if(dp[index][currentBagWeight]!=-1)
            return dp[index][currentBagWeight];
        int notPick=findMaxValueMemoization(weights,values,index-1,currentBagWeight, dp);
        int pick=Integer.MIN_VALUE;
        if(currentBagWeight-weights[index]>=0)
            pick=values[index]+findMaxValueMemoization(weights,values,index-1,currentBagWeight-weights[index], dp);
        return dp[index][currentBagWeight]=Math.max(notPick,pick);
    }
}
