package arrays.easy;

import java.util.Arrays;

public class MoverZeroesToRight {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int firstZeroIndex=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0) {
                firstZeroIndex = i;
                break;
            }
        }
        if(firstZeroIndex==-1){
            System.out.println("no zero element present..");
            return;
        }
        for(int nonZeroIndex=firstZeroIndex+1;nonZeroIndex<arr.length;nonZeroIndex++){
            if(arr[nonZeroIndex]!=0){
                int temp=arr[nonZeroIndex];
                arr[nonZeroIndex]=arr[firstZeroIndex];
                arr[firstZeroIndex]=temp;
                firstZeroIndex++;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
