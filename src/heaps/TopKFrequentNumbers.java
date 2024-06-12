package heaps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TopKFrequentNumbers {
    public static void main(String[] args) {
        int[] nums={1,1,1,3,2,2,4};
       Map<Integer,Long> freqCount= Arrays.stream(nums).boxed().collect(Collectors.groupingBy(e->e,Collectors.counting()));
        PriorityQueue<Map.Entry<Integer,Long>> pq= new PriorityQueue<>(Comparator.comparingLong(Map.Entry::getValue));
       for(Map.Entry<Integer,Long> entry:freqCount.entrySet()){
           pq.add(entry);
           if(pq.size()>2)
               pq.poll();
       }
       while (!pq.isEmpty()){
           System.out.println(pq.poll().getKey());
       }
    }

}
