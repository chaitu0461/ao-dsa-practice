package heaps;

import java.util.PriorityQueue;

public class MininmumCostOfRopes {
    public static void main(String[] args) {
        int[] ropeLengths={4,3,2,6};
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        int cost=0;
        for(int ropeLength:ropeLengths){
            pq.add(ropeLength);
        }
        while (pq.size()>=2){ //combine until there are 2 or more ropes
            int first= pq.poll();
           int second=pq.poll();
           int combined=first+second;
           cost=cost+combined;
           System.out.println("curCost.."+combined);
            pq.add(combined);
        }
//coming here, we will have 1 element in pq. But it is single element and hence we should not add it cost
        System.out.println(cost);
    }
}
