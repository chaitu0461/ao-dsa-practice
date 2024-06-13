package binarysearch.on_answers;

import java.util.stream.IntStream;

public class NthRootOfNumber {
    public static int isAnswer(int base,int exponential,int target){
        int ans=1;
        for(int i=1;i<=exponential;i++){
            ans=ans*base;
            if(ans>target)
                return 2;
        }
        if(ans==target)
            return 0;
        return 1;
    }
    public static  int findNthRoot(int exponential,int number ){
        int[] nums=IntStream.rangeClosed(1,number).toArray();
        int low=0;
        int high=nums.length-1;
        int ans=-1;
        while (low<=high){
            int mid=(low+high)/2;
            int index=isAnswer(nums[mid],exponential,number);
            if(index==0)
                return nums[mid];
            else if (index==1) {
                low=mid+1;

            }
            else
                high=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int ans=findNthRoot(3,64);
        if (ans == -1) {
            System.out.println("Does not exist");
        } else {
            System.out.println(ans);
        }

    }
}
