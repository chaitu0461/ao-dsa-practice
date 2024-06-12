package arrays.medium;

import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        integerList.addAll(Arrays.asList(1,3,2));
        int breakPoint=-1;
        for(int i=integerList.size()-2;i>=0;i--){
            if(integerList.get(i)<integerList.get(i+1)) {
                breakPoint = i;
                break;
            }
        }
        if(breakPoint==-1){
            Collections.reverse(integerList);
            integerList.stream().forEach(System.out::println);
            return;
        }
      Object[] nums=  integerList.toArray();
        for(int i=nums.length-1;i>breakPoint;i--){
            if((int)nums[breakPoint]<(int)nums[i]){
                int temp=(int)nums[breakPoint];
                nums[breakPoint]=nums[i];
                nums[i]=temp;
                break;
            }
        }
        int low=breakPoint+1;
        int high=nums.length-1;
        while (low<high){
            int temp=(int)nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            high--;
            low++;
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
