package recursion.backtrack;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllSubSetsOfLengthK {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        int length=2;
        generateKLengthSubSets(nums,length,0,new ArrayList<Integer>(),ans);
       System.out.println(ans);
    }

    private static void generateKLengthSubSets(int[] nums, int legth,int index, ArrayList<Integer> curAns, List<List<Integer>> ans) {
        if(curAns.size()==legth) {
            ans.add(new ArrayList<>(curAns));
            return;
        }
        if(index>=nums.length){
            return;
        }
        generateKLengthSubSets(nums,legth,index+1,curAns,ans);
        curAns.add(nums[index] );
        generateKLengthSubSets(nums,legth,index+1,curAns,ans);
        curAns.removeLast();



    }
}
