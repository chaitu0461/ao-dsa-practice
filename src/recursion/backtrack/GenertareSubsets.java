package recursion.backtrack;

import java.util.ArrayList;
import java.util.List;

public class GenertareSubsets {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> ans= new ArrayList<>();
        generateSubsets(nums,0,new ArrayList<Integer>(),ans);
        System.out.println(ans);
    }

    private static void generateSubsets(int[] nums,int index, ArrayList<Integer> curAns, List<List<Integer>> ans) {
        if(index==nums.length) {
            ans.add(new ArrayList<>(curAns));
            return;
        }

       generateSubsets(nums,index+1,curAns,ans);
        curAns.add(nums[index]);
        generateSubsets(nums,index+1,curAns,ans);
        curAns.removeLast();
    }

}
