package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {
    public static void main(String[] args) {
        int[] A = {59, 64, 10, 39};
        int[] out = new int[A.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(A[0]);
        out[0]=A[0];
        for(int i=1;i<A.length;i++){
            if(A[i] > maxHeap.peek()){
                minHeap.add(A[i]);
            } else
                maxHeap.add(A[i]);
            while(minHeap.size()-maxHeap.size() > 0){
                int temp = minHeap.poll();
                maxHeap.add(temp);
            }
            while(maxHeap.size() - minHeap.size() > 1){
                int temp = maxHeap.poll();
                minHeap.add(temp);
            }
            out[i]= maxHeap.peek();
        }
        for(int i=0;i<A.length;i++){
            System.out.println(out[i] + " ");
        }
    }
}
