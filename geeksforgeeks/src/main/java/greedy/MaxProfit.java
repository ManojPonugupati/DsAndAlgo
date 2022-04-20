package greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxProfit {
 static class Pair {
      int time;
      int profit;
    public Pair(int time, int profit){
        this.time =time;
        this.profit=profit;
    }
  }

    public static void main(String[] args) {
        Integer[] A = {1, 3, 1, 7, 2, 7, 1, 7, 6, 7, 8, 3, 3, 5, 4, 4, 5};
        Integer[] B = {2, 4, 6, 8, 4, 4, 4, 11, 8, 11, 8, 7, 7, 7, 6, 10, 4};
        Pair[] c = new Pair[A.length];
        int max = -1;
        for(int i=0;i<A.length;i++){
            c[i] = new Pair(A[i],B[i]);
            max = Math.max(max,A[i]);
        }
        int max_profit=0;
        Comparator<Pair> comp = Comparator.comparing(a->a.time);
        comp = comp.thenComparing((a,b)->b.profit-a.profit);
        Arrays.sort(c,comp);
        for(int i=0;i<c.length;i++){
            System.out.println("sorted " + c[i].time + " " + c[i].profit);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int running_time=0;
        for(int i=0;i<c.length;i++){
            if(running_time<max && running_time < c[i].time) {
                    minHeap.add(c[i].profit);
                    max_profit += c[i].profit;
                    System.out.println("Consdered : " + c[i].time + " " + c[i].profit);
                    running_time++;
            } else {
                if(minHeap.peek() < c[i].profit){
                   int poll = minHeap.poll();
                   max_profit -= poll;
                    System.out.println("Ignored : " + poll);
                    System.out.println("Consdered : " + c[i].time + " " + c[i].profit);
                   minHeap.add(c[i].profit);
                   max_profit += c[i].profit;
                }
            }

        }
        System.out.println(max_profit);
    }
}