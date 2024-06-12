package stacks.problems;

import stacks.problems.nearest_smaller_greater_left_right.NearestSmallerElementToLeft;
import stacks.problems.nearest_smaller_greater_left_right.NearestSmallerElementToRight;

public class MaximumAreaOfHistogram {
    public static void main(String[] args) {
        int[] histogram={2,1,5,6,2,3};
        int[] nearestSmallerElementsToRight= NearestSmallerElementToRight.getNextSmallerElementsIndexes(histogram);
        int[] nearestSmallerElementsToLeft= NearestSmallerElementToLeft.getnextSmallerElementsIndexes(histogram);
        int maxHistogramArea=Integer.MIN_VALUE;
        for(int i=0;i< histogram.length;i++){
            int leftLimit=nearestSmallerElementsToLeft[i]; //cut off
            int rightLimit=nearestSmallerElementsToRight[i];
            int width=rightLimit-leftLimit-1;
            int curHistogramArea=width*histogram[i];
            maxHistogramArea=Math.max(curHistogramArea,maxHistogramArea);

        }
        System.out.println(maxHistogramArea);

    }
}
