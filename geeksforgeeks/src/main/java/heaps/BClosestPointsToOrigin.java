package heaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class BClosestPointsToOrigin {
    public static void main(String[] args) {
      int[][] A = {{26, 41},{40, 47},{47, 7},{50, 34},{18, 28}};
      int B=5;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a,b)-> (a[0]*a[0]+a[1]*a[1]-(b[0]*b[0]+b[1]*b[1]))
        );
        for(int i=0;i<A.length;i++){
            minHeap.add(A[i]);
        }
        int[][] out = new int[B][2];
        for(int i=0;i<B;i++)
            out[i]=minHeap.poll();

        for(int i=0;i<B;i++) {
            System.out.println(out[i][0] + " " + out[i][1]);
        }
    }
    }

