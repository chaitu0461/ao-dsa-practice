package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReArrangeBySign {
    public static void main(String[] args) {
        int[] nums={1, 2, -4, -5, 3, 4,-6,-7,-8};
        List<Integer> negativeList=new ArrayList<>();
        List<Integer> positiveList=new ArrayList<>();
        for(int element:nums){
            if(element<0)
                negativeList.add(element);
            else
                positiveList.add(element);
        }
        if(positiveList.size()>negativeList.size()){
            int i;
            for(i=0;i<negativeList.size();i++){
                nums[2*i]=positiveList.get(i);
                nums[2*i+1]=negativeList.get(i);
            }
            i=2*i;//this is added because we have to advance the i index by twice
            //bcz we have added both positive and negative elements
            for(int k=negativeList.size();k<positiveList.size();k++){
                nums[i]=positiveList.get(k);
                i++;
            }
            Arrays.stream(nums).forEach(System.out::println);
        }
        else {
            int i;
            for(i=0;i<positiveList.size();i++){
                nums[2*i]=positiveList.get(i);
                nums[2*i+1]=negativeList.get(i);
            }
            i=2*i;
            for(int k=positiveList.size();k<negativeList.size();k++){
                nums[i]=negativeList.get(k);
                i++;
            }
            Arrays.stream(nums).forEach(System.out::println);

        }
    }
}
