package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int [] elements={10,9,8,7,6};
        PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        int k=4;
        for(int i:elements){
            pq.offer(i);
            if(pq.size()>k)
                pq.poll();

        }
        System.out.println(pq.peek());
    }
}
