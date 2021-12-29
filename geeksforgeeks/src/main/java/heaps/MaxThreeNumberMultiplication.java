package heaps;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MaxThreeNumberMultiplication {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int[] out = new int[A.length];
        out[0]=-1;
        out[1]=-1;
        heap.add(A[0]);
        heap.add(A[1]);
        for(int i=2;i<A.length;i++){
            heap.add(A[i]);
            int sum=1;
            int max=heap.poll();
            int sec_max=heap.poll();
            int th_max = heap.poll();
                sum = max*sec_max*th_max;
            out[i]=sum;
            heap.add(max);
            heap.add(sec_max);
            heap.add(th_max);
        }
        for(int i=0;i<out.length;i++)
            System.out.print(out[i] + " ");
    }
}
