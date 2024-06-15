package recursion.backtrack;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfNumbersInArray {
    public static void main(String[] args) {
        int[]  nums={1,2,3};
        List<List<Integer>> ans= new ArrayList<>();
        generatePermutations(nums,0,new ArrayList<Integer>(),ans);
        System.out.println(ans);

    }

    private static void generatePermutations(int[] nums,int start, ArrayList<Integer> curAns, List<List<Integer>> ans) {
        if(curAns.size()== nums.length) {
            ans.add(new ArrayList<>(curAns));
            return;
        }
        for(int i=0;i< nums.length;i++){
            if(curAns.contains(nums[i])){
                continue;
            }
            curAns.add(nums[i] );
            generatePermutations(nums,i+1,curAns,ans);
            curAns.removeLast();
        }
    }
}
