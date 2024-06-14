package recursion.backtrack;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int target=6;
        List<List<Integer>> answer=new ArrayList<>();
      answer  =getAllCombos(nums,0,target,new ArrayList<Integer>(),answer);
      System.out.println(answer);
    }

    private static List<List<Integer>> getAllCombos(int[] nums,int index, int target, List<Integer> curAns, List<List<Integer>> answer) {
        if(target==0) {
            answer.add(new ArrayList<>(curAns));
            return answer;
        }
        if(target<0 || index==nums.length)
            return answer;
        getAllCombos(nums,index+1,target,curAns,answer);//simply moving to next index
        curAns.add(nums[index]);
        getAllCombos(nums,index,target-nums[index],curAns,answer);
        curAns.removeLast();
        return answer;
    }

}
