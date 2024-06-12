package stacks.problems;

import java.util.Arrays;

public class RemoveConsecutiveSubSequenceNaive {
    public static void main(String[] args) {
        int[] sequence={1,2,2,3,3,3,4,4,4};
        for(int i=0;i< sequence.length;i++){
            int curElement=sequence[i];
            if(curElement==Integer.MIN_VALUE)
                continue;
            int startIndex=i+1;
            while (startIndex< sequence.length && sequence[startIndex]!=Integer.MIN_VALUE){
                if(sequence[startIndex]==curElement) {
                    sequence[startIndex] = Integer.MIN_VALUE;
                }
                startIndex++;
            }
        }
        Arrays.stream(sequence).filter(i->i!=Integer.MIN_VALUE).forEach(System.out::println);
    }
}
