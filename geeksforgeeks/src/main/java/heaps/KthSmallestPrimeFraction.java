package heaps;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestPrimeFraction {
    public static void main(String[] args) {
        int[] A ={1, 719, 983, 9293, 11321, 14447, 16411, 17881, 22079, 28297};
        int B=42;
        int N=A.length;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
                (a,b)->a[0]*b[1]- b[0]*a[1]
        );
        double[] x = new double[N*(N-1)/2];
        int k=0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){

                double val = (double) A[i]/A[j];
                System.out.println("val is : " + val + " " + A[i] + " " + A[j] + " " + (double) A[i]/A[j]);
                x[k]=val;
                k++;
            }
        }
        Arrays.sort(x);
        System.out.println("----------------");
        for(int i=0;i<x.length;i++)
            System.out.println(x[i]);
        System.out.println("Bth Smallest is : " + x[B-1]);
        for(int i=0;i<A.length-1;i++){
            int[] temp = new int[2];
            temp[0]=A[i];
            temp[1]=A[A.length-1];
            minHeap.add(temp);
        }
        int fixTheSize=minHeap.size();
        int cnt=0;
        int[] BthSamll = new int[2];
        for(int i=0;i<A.length-1;i++){
            for(int j=A.length-2;j>=i;j--){
                int[] temp = new int[2];
                temp[0]=A[i];
                temp[1]=A[j];
                while(minHeap.size() >= fixTheSize){
                    BthSamll=minHeap.poll();
                    cnt++;
                }
                System.out.println("count is : " + cnt + " " + B );
                if(cnt==B) {
                    System.out.println(BthSamll[0] + " " + BthSamll[1]);
                }
                minHeap.add(temp);
            }
        }

    }
}
