package recursion.basic;

import java.util.ArrayList;
import java.util.List;

public class AllIndexesOfElementInArray {
    public static void main(String[] args) {
        int[]nums={2,928,26782,72,2,2,72};
        List<Integer> allIndexes=findAllIndexes(nums,2,0, new ArrayList<>());
        allIndexes.forEach(System.out::println);
    }

    private static List<Integer> findAllIndexes(int[] nums,int target, int index,List<Integer> ans) {
        if(index==nums.length)
            return ans;
        if(nums[index]==target)
            ans.add(index);
        return findAllIndexes(nums,target,index+1,ans);
    }
}
