package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInASubArray {
    public static void main(String[] args) {
        int A=4;
        int[] B = {1,2,3,4,5,6};
        int N=B.length;
        int[] out = new int[N];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<A;i++) {
            if (minHeap.size() < A) {
                minHeap.add(B[i]);
                out[i] = -1;
            }
        }
        out[A-1] = minHeap.peek();
        for(int i=A;i<N;i++){
            if(minHeap.peek() < B[i]){
                minHeap.remove();
                minHeap.add(B[i]);
            }
            out[i]=minHeap.peek();
        }

        for(int i=0;i<out.length;i++)
            System.out.print(out[i] + " ");
    }
}
