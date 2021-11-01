package arrays.AdvancedBatch;

import java.util.Arrays;

public class MaximumunsorteSubArray {
    public static void main(String[] args) {
        //int[] A = {1, 2, 4, 3, 5, 7, 6};
        int[] A = {4, 15, 4, 4, 15, 18, 20};
        int[] sorted = new int[A.length];
        for(int i=0;i<A.length;i++)
             sorted[i] = A[i];
        Arrays.sort(sorted);

        int[] out = new int[2];
        int left_index=Integer.MIN_VALUE;
        int righ_index =Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++) {
            if (A[i] != sorted[i]) {
                left_index = i;
                break;
            }
        }
        for(int i=A.length-1;i>=0;i--) {
            if (A[i] != sorted[i]) {
                righ_index = i;
                break;
            }
        }

        out[0]=left_index;
        out[1]=righ_index;
        System.out.println(left_index + " " + righ_index);
    }
}
