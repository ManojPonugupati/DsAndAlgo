package greedy;

import java.util.PriorityQueue;

public class AssignMiceToHoles {
    public static void main(String[] args) {
        int[] A= {-4, 2, 3};
        int[] B= {0, -2, 4};
        PriorityQueue<Integer> miceHeap = new PriorityQueue<>();
        PriorityQueue<Integer> holeHeap =  new PriorityQueue<>();
        for(int i=0;i<A.length;i++){
            miceHeap.add(A[i]);
            holeHeap.add(B[i]);
        }
        int min = Integer.MIN_VALUE;
        while(miceHeap.size()>0){
            min = Math.max(min,Math.abs(miceHeap.poll()-holeHeap.poll()));
        }
        System.out.println(min);
    }
}
