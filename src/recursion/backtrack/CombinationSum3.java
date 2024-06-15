package recursion.backtrack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CombinationSum3 {
    public static void main(String[] args) {
        List<List<Integer>> ans= new ArrayList<>();
        int[] nums= IntStream.rangeClosed(1,7).toArray();
        int target=7;
        int size=3;
        generateCombosWithSumEqualsNAndSizeEqualsK(nums,target,0,size,new ArrayList<>(),ans);
        System.out.println(ans);

    }
    private static void generateCombosWithSumEqualsNAndSizeEqualsK(int[] nums, int target, int start,int size, ArrayList<Integer> curAns, List<List<Integer>> ans) {
        if(target==0 && curAns.size()==size ){
            ans.add(new ArrayList<>(curAns));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=start;i<nums.length;i++){

            if( curAns.size()<=size && target-nums[i]>=0){
                curAns.add(nums[i] );
                generateCombosWithSumEqualsNAndSizeEqualsK(nums,target-nums[i],i+1,size,curAns,ans);
                curAns.removeLast();
            }
        }
    }

}
