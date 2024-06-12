package arrays.medium;

public class LeadersInArray {
    public static void main(String[] args) {
        int nums[]=  {10, 22, 12, 3, 0, 6};
        int curMax=nums[nums.length-1];
        System.out.println(curMax);
        for(int i= nums.length-2;i>=0;i--){
            if(nums[i]>curMax){
                System.out.println(nums[i]);
                curMax=nums[i];
            }

        }

    }
}
