package slidingwindow.fixedsize;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class MaxOfAllSubArraysOfSizeK {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,4,5,2,3,6};
        Deque<Integer> arrayDeque=new ArrayDeque<>();
        List<Integer> ans= new ArrayList<>();
        int start=0;
        int end=0;
        int windowSize=3;
        while (end<nums.length){
            while (!arrayDeque.isEmpty() && nums[end]>arrayDeque.getLast()){
                arrayDeque.removeLast();
            }
            arrayDeque.addLast(nums[end]);
            if(end-start+1==windowSize){
                ans.add(arrayDeque.getFirst());
                if(arrayDeque.contains(nums[start]))
                    arrayDeque.removeFirst();
                start++;
            }
            end++;
        }
        ans.forEach(System.out::println);
    }
}
