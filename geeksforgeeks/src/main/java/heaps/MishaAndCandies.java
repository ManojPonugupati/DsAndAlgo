package heaps;

import java.util.PriorityQueue;

public class MishaAndCandies {
    public static void main(String[] args) {
        //int[] A ={3,2,3};
        int[] A = {705};
        int B=895;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<A.length;i++){
            minHeap.add(A[i]);
        }
        int eaten=0;
        int x=0;
        int first_item=0;
        while( minHeap.size() > 0 && !(minHeap.peek() > B)){
            x=minHeap.poll();
            eaten += x/2;
            x=x-x/2;
            if(!(minHeap.size()>0))
                break;
            first_item=minHeap.poll();
            first_item+=x;
            minHeap.add(first_item);
        }
        System.out.println(eaten);
    }
}
