package arrays.AdvancedBatch;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] A = {5,4,3,2,1};
        Arrays.sort(A);
        int temp=0;
        for(int i=1;i<A.length;i+=2){
            temp=A[i-1];
            A[i-1]=A[i];
            A[i]=temp;
        }
    }
}
