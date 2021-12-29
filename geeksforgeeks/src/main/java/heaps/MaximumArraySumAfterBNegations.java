package heaps;

import java.util.PriorityQueue;

public class MaximumArraySumAfterBNegations {
    public static void main(String[] args) {
        int[] A = {24,-68,-29,-9,84};
        int B = 4;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<A.length;i++)
          minHeap.add(A[i]);
        for(int i=0;i<B;i++){
            int min = minHeap.poll();
            minHeap.add(-min);
        }
        int sum=0;
        while(minHeap.size()>0){
            sum +=minHeap.poll();
        }
        System.out.println(sum);
    }
}
