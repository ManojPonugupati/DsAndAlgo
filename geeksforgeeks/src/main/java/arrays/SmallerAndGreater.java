package arrays;

import java.util.Arrays;

public class SmallerAndGreater {
    public static void main(String[] args) {
        int[] A =  {913, 440, 865, 72, 612, 445, 101, 994, 356, 91, 461, 930, 583, 448, 543, 170, 333, 107, 425, 73, 172, 416, 899, 826, 659, 561, 314, 25, 110};
        int cnt=0;
        int max=Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i] <min)
                min=A[i];
            if(A[i] > max)
                max=A[i];
        }
        System.out.println(max + " " + min);
        for(int i=0;i<A.length;i++){
            if(( A[i] > min )&& (A[i] < max)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
