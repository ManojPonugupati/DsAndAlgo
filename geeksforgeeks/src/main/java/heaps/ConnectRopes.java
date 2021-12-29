package heaps;

import java.util.PriorityQueue;

public class ConnectRopes {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<A.length;i++){
            minHeap.add(A[i]);
        }
        int sum=0;
        int total = 0;
        while (minHeap.size()>1){
            sum = minHeap.poll() + minHeap.poll();
            minHeap.add(sum);
            total +=sum;
        }
        System.out.println(total);
    }
}
