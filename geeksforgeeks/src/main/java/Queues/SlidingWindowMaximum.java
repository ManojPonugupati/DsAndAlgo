package Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        //int[] A = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] A={10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int B = 2;
        int[] out = new int[A.length - B + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int i=0;
        for (i = 0; i < B; i++) {
            while (!dq.isEmpty() && A[dq.getLast()] <= A[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(;i<A.length;i++){
            out[i-B]=A[dq.getFirst()];
            if(!dq.isEmpty() && dq.getFirst() <=i-B)
                dq.removeFirst();
            while(!dq.isEmpty() && A[i] >= A[dq.getLast()]) {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        out[i-B]=A[dq.peekFirst()];
        for(int j=0;j<out.length;j++){
            System.out.println(out[j] +" ");
        }
    }
}
