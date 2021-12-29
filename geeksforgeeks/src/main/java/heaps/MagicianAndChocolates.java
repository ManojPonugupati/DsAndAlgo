package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MagicianAndChocolates {
    public static void main(String[] args) {
        int A = 10;
        int[] B= {2147483647, 2000000014, 2147483647};
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<B.length;i++){
            heap.add(B[i]);
        }
        int sum=0;
        int mod =(int) Math.pow(10,9)+7;
        System.out.println(mod);
        for(int i=0;i<A;i++){
           int heapMax =  heap.poll();
            sum = (sum%mod + heapMax%mod)%mod;
            heapMax /=2;
            heap.add(heapMax);
            sum %=mod;
        }
        System.out.println(sum);
    }
}
