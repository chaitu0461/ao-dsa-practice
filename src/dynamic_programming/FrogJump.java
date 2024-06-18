package dynamic_programming;

import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int[] energies={30,10,60,10,60,50};
        int dp[] = new int[energies.length+1];
        Arrays.fill(dp,-1);
      int minEnergy=  findMinimumEnergyMemoization(energies,5,dp);
      System.out.println(minEnergy);
      System.out.println(findMinimumEnergyMatrix(energies));

    }

    private static int findMinimumEnergyMemoization(int[] energies, int index, int[] dp) {
        if(index==0)
            return 0;
        if(dp[index]!=-1)
            return dp[index];
        int OneStepEnergy=findMinimumEnergyMemoization(energies,index-1, dp)+Math.abs(energies[index]-energies[index-1]);
        int twoStepEneergy=Integer.MAX_VALUE;
        if(index-2>=0)
          twoStepEneergy=findMinimumEnergyMemoization(energies,index-2, dp)+Math.abs(energies[index]-energies[index-2]);
        return dp[index]=Math.min(twoStepEneergy,OneStepEnergy);
    }
    private static int findMinimumEnergyMatrix(int[] energies) {
       int [] ans=new int[energies.length];
       ans[0]=0;
       for(int i=1;i<energies.length;i++){
           int OneStepEnergy=ans[i-1]+Math.abs(energies[i]-energies[i-1]);
           int twoStepEneergy=Integer.MAX_VALUE;

           if(i-2>=0)
               twoStepEneergy=ans[i-2]+Math.abs(energies[i]-energies[i-2]);
           ans[i]= Math.min(twoStepEneergy,OneStepEnergy);
       }
        return ans[ans.length-1];
    }
}
