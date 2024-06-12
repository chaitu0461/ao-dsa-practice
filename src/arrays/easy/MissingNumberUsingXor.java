package arrays.easy;

public class MissingNumberUsingXor {
    //did not get answer
    public static void main(String[] args) {
        int[] nums={1,2,3,4,6,7};
        int naturalXor=0;
        int arrayXor=0;
        for(int i=0;i<nums.length;i++){
            naturalXor=naturalXor^(i+1);
            arrayXor=arrayXor^nums[i];
        }
        naturalXor=naturalXor^nums.length;
        int missingNumber=(naturalXor^arrayXor);
        System.out.println(missingNumber);
    }
}
