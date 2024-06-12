package slidingwindow.fixedsize;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumberInWindowOfSizeK {
    public static void main(String[] args) {
        int[] nums={12,-1,-7,8,-15,30,16,28};
        int windowSize=3;
        int start=0;
        int end=0;
        List<Integer> negativeNumbersInCurrentWindow=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        while (end<nums.length){
            if(nums[end]<0){
                negativeNumbersInCurrentWindow.add(nums[end]);
            }
            if(end-start+1==windowSize){
                if(!negativeNumbersInCurrentWindow.isEmpty())
                    ans.add(negativeNumbersInCurrentWindow.getFirst());
                else
                    ans.add(0);
              if(negativeNumbersInCurrentWindow.contains(nums[start]))
                  negativeNumbersInCurrentWindow.removeFirst();
              start++;
            }
            end++;
        }
        ans.forEach(System.out::println);
    }
}
