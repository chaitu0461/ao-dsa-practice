package arrays.medium;

public class MooresVoting {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,3,4,4,4,4,4,4};
        int cnt=0;
        int element=nums[0];
        for(int i: nums){
            if(i==element)
                cnt++;
            else if (cnt==0) {
                element=i;
            }
            else
                cnt--;
        }
        System.out.println(element);
    }
}
