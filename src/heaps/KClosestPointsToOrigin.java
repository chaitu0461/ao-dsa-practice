package heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    static class Pair{
        int index;

        public int getOriginDist() {
            return originDist;
        }

        int originDist;

        public Pair(int index, int originDist) {
            this.index = index;
            this.originDist = originDist;
        }
    }
    public static void main(String[] args) {
        int[][] points={{3, 3}, {5, -1}, {-2, 4}};
        int k=2;
        PriorityQueue<Pair> pq= new PriorityQueue<>(Comparator.comparingInt(Pair::getOriginDist).reversed());
        for(int i=0;i<points.length;i++){
            pq.add(new Pair(i,(points[i][0]*points[i][0])+(points[i][1]*points[i][1])));
            if(pq.size()>k)
                pq.poll();
        }
        while (!pq.isEmpty()){
            System.out.println(pq.poll().index);
        }
    }
}
