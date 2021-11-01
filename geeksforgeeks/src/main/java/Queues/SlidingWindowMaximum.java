package Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] A = {1, 3, -1, -3, 5, 3, 6, 7};
        int B = 3;
        int[] out = new int[A.length - B + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int j=0;
        for (int i = 0; i < A.length; i++) {
            while (!dq.isEmpty() && dq.getLast() <= A[i]) {
                dq.removeLast();
            }
            dq.push(A[i]);
            if(i>=B){
                out[j]=dq.getFirst();

            }

        }
    }
}
