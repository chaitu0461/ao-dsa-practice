package binarysearch.on_answers;

import java.util.Arrays;
import java.util.stream.IntStream;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] bananaPiles={25, 12, 8, 14, 19};
        int timeLimit=5;
        int minimumRate=findMinimumRate(bananaPiles,timeLimit);
        System.out.println(minimumRate);
    }

    private static int findMinimumRate(int[] bananaPiles, int timeLimit) {
        int maxRate= Arrays.stream(bananaPiles).max().getAsInt();
        int[] possibleRateRanges= IntStream.rangeClosed(1,maxRate).toArray();
        int low=0;
        int high=possibleRateRanges.length-1;
        int minRate=Integer.MAX_VALUE;
        while (low<=high){
            int mid=(low+high)/2;
            int timeTaken=timeTakenforCurRate(possibleRateRanges[mid], bananaPiles);
            if(timeTaken<=timeLimit) {
                minRate=Math.min(minRate,possibleRateRanges[mid]);
                high = mid - 1;
            }
            else
                low=mid+1;
        }
        return minRate;
    }

    private static int timeTakenforCurRate(int curRate, int[] bananaPiles) {
        int totalTime=0;
        for(int pile:bananaPiles){
            totalTime+= (int) Math.ceil((double)pile/(double)curRate );
        }
        return totalTime;
    }
}
