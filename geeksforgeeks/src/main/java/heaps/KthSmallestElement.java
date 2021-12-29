package heaps;

import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[][] A = {
                {5, 9, 11},
                {9,11,13},
                {10,12,15},
                {13,14,16},
                {16,20,21}
        };
        int B=12;
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                minHeap.add(A[i][j]);
            }
        }
        int out = 0;
        for(int i=0;i<B;i++){
            out = minHeap.poll();
        }
        System.out.println("Output is : " + out);
    }
}
