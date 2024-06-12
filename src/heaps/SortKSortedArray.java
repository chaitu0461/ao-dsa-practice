package heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortKSortedArray {
    public static void main(String[] args) {
        int[] elements={2,3,1,4,6,7,5,8,9};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int pqIndex=0;
        int k=2;
        for(int i=0;i<elements.length;i++){
            pq.add(elements[i]);
            if(pq.size()>k+1){
                elements[pqIndex]=pq.poll();
                pqIndex++;
            }
        }


        while (!pq.isEmpty()){
           elements[pqIndex]=pq.poll();
            pqIndex++;
        }
       Arrays.stream(elements).forEach(System.out::println);
    }
}
