package arrays;

import java.util.ArrayList;

public class NonDecreasingOrder {
    public static void main(String[] args) {
        int A[] = {1, 7, 3, 4, 9};
        int B[][] = {{1,2},{2,4}};
        int[] out = (solve(A,B));
        for(int i=0;i<out.length;i++){
            System.out.print(out[i] + " ");
        }
    }
    public static int[] solve(int[]A, int[][]B){
        int[] out = new int[B.length];
        int[] prefix_bool_array = new int[A.length+1];
        prefix_bool_array[0]=0;
        prefix_bool_array[1] =A[0]>0?1:0;
        for(int i=0;i<A.length-1;i++){

            if(A[i] <= A[i+1]){
                prefix_bool_array[i+2]= prefix_bool_array[i+1] + 1;
            }else
            {
                prefix_bool_array[i+2] = prefix_bool_array[i+1] + 0;
            }
        }
        for(int i=0;i<B.length;i++)
        {
            int l=B[i][0];
            int r = B[i][1];
            out[i] = r-l == prefix_bool_array[r]-prefix_bool_array[l]?1:0;
        }
        return out;
    }
}
