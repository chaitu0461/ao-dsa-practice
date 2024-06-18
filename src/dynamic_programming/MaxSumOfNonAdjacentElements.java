package dynamic_programming;

import java.util.Arrays;

public class MaxSumOfNonAdjacentElements {
    public static void main(String[] args) {
        int[] elements={2,1};
        int[] dp = new int[elements.length];
        Arrays.fill(dp,-1);
       int maxSum= findMaxSumOfNonAdjElementsMemoization(elements,dp,elements.length-1);
       int maxSumMatrix = findMaxSumOfNonAdjEelementsMatrix(elements);
       System.out.println(maxSumMatrix);

        System.out.println(maxSum);
    }

    private static int findMaxSumOfNonAdjEelementsMatrix(int[] elements) {
        int[] dp=new int[elements.length];
        dp[0]=elements[0];
        for(int index=1;index<elements.length;index++){
            int pick=Integer.MIN_VALUE;
            int notPick;
            if(index-2>=0)
                pick=elements[index]+dp[index-2];//you cannot pick adjacent elements
            notPick=dp[index-1]; //since we have not picked, we can go to adjacent
             dp[index]=Math.max(pick,notPick);
        }
        return dp[dp.length-1];
    }

    private static int findMaxSumOfNonAdjElementsMemoization(int[] elements, int[] dp,int index) {
        if(index==0)
            return elements[0];
        if(dp[index]!=-1)
            return dp[index];
        int pick=Integer.MIN_VALUE;
        int notPick;
        if(index-2>=0)
          pick=elements[index]+findMaxSumOfNonAdjElementsMemoization(elements,dp,index-2);//you cannot pick adjacent elements
        notPick=findMaxSumOfNonAdjElementsMemoization(elements,dp,index-1); //since we have not picked, we can go to adjacent
        return dp[index]=Math.max(pick,notPick);
    }
}
