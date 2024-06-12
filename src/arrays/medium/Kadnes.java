package arrays.medium;

public class Kadnes {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int start=-1;
        int ansStart=-1;
        int ansEnd=-1;
        int maxSum=Integer.MIN_VALUE;
        int curSum=0;
        for(int i=0;i<arr.length;i++){
            if(curSum==0){
                start=i;

            }
            curSum+=arr[i];
            if(curSum<0) {
                curSum = 0;
            }
            if(curSum>maxSum){
                maxSum=Math.max(curSum,maxSum);
                ansStart=start;
                ansEnd=i;
            }


        }
/*
        for(int i:arr){
            curSum+=i;
            if(curSum<0) {
                curSum = 0;
                start=i;
            }
            if(curSum>maxSum){
                maxSum=Math.max(curSum,maxSum);
                ansStart=start;
                ansEnd=i;
            }
        }
*/
        System.out.println(maxSum);
        for (int i=ansStart;i<=ansEnd;i++){
            System.out.println("subArray element::"+arr[i]);
        }
    }
}
