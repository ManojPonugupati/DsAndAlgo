package greedy;

import java.util.Collections;
import java.util.PriorityQueue;

public class TheShipCompany {
    public static void main(String[] args) {
        int A= 10;
        int B= 5;
        int min_A=A;
        int max_A=A;
        int max=0,min=0;
        int[] C ={10, 3, 3, 1, 2};
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<B;i++){
            maxHeap.add(C[i]);
            minHeap.add(C[i]);
        }
        while(max_A > 0) {
            int x = maxHeap.poll();
            max+=x;
            --max_A;
            maxHeap.add(--x);

        }
        while(min_A > 0) {
            int x = minHeap.poll();
            min+=x;
            if(--x>0)
             minHeap.add(x);
            --min_A;

        }
        System.out.println("max and min are : " + max + " " + min);
    }
}
