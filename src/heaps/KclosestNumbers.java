package heaps;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KclosestNumbers {
    static class Pair{
        int number;

        public int getAbsoluteDiff() {
            return absoluteDiff;
        }

        int absoluteDiff;

        public Pair(int number, int absoluteDiff) {
            this.absoluteDiff = absoluteDiff;
            this.number = number;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(Comparator.comparingInt(Pair::getAbsoluteDiff).reversed());
        int[] elements={10, 2, 14, 4, 7, 6};
        int x=5;
        int k=3;
        for(int i:elements){
            pq.add(new Pair(i,Math.abs(i-x)));
            if(pq.size()>k)
                pq.poll();
        }
        while (!pq.isEmpty()){
            System.out.println(pq.poll().number);
        }
    }
}
