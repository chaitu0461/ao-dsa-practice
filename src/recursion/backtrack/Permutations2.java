package recursion.backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Permutations2 {
    public static void main(String[] args) {
        int[]  nums={1,2,3};
        List<List<Integer>> ans= new ArrayList<>();
        Map<Integer,Long> freqMap= Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        generatePermutations(nums,0,new ArrayList<Integer>(),ans,freqMap);
        System.out.println(ans);

    }

    private static void generatePermutations(int[] nums, int start, ArrayList<Integer> curAns, List<List<Integer>> ans, Map<Integer, Long> freqMap) {
        if(curAns.size()== nums.length) {
            ans.add(new ArrayList<>(curAns));
            return;
        }
        for(int i=0;i< nums.length;i++){

            if(freqMap.get(nums[i])>0) {
                curAns.add(nums[i]);
                freqMap.put(nums[i],freqMap.get(nums[i])-1 );
                generatePermutations(nums, i + 1, curAns, ans, freqMap);
                curAns.removeLast();
                freqMap.put(nums[i],freqMap.get(nums[i])+1 );

            }
        }
    }

}
