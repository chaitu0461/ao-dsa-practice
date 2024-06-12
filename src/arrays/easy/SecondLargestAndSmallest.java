package arrays.easy;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] nums={5,8,1,4,0};
        secondLargest(nums);
    }
    private static void secondLargest(int[] arr){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>largest){
                secondLargest=largest;
                largest=i;
            } else if (i>secondLargest && i<=largest) {
                secondLargest=i;

            }
        }
        System.out.println("Largest.."+largest+" second largest.."+secondLargest);
    }
}
