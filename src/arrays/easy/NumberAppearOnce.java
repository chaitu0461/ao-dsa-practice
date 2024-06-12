package arrays.easy;

public class NumberAppearOnce {
    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        int xorResult=0;
        for(int i:nums){
            xorResult=xorResult^i;
        }
        System.out.println(xorResult);
    }
}
