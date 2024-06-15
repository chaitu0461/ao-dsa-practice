package recursion.backtrack;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        List<List<Integer>> ans= new ArrayList<>();
        int[] nums={1,1,2,2,3};
        int target=6;
        generateCombosWithNoDuplicates(nums,target,0,new ArrayList<Integer>(),ans);
        System.out.println(ans);
    }

    private static void generateCombosWithNoDuplicates(int[] nums, int target,int start, ArrayList<Integer> curAns, List<List<Integer>> ans) {
        if(target==0){
            ans.add(new ArrayList<>(curAns));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(i> start && nums[i]==nums[i-1]){
                continue;
            }
            if(target-nums[i]>=0){
                curAns.add(nums[i] );
                generateCombosWithNoDuplicates(nums,target-nums[i],i+1,curAns,ans);
                curAns.removeLast();
            }
        }
    }
}
