package arrays.AdvancedBatch;

public class RainWaterTapping {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 4};
        System.out.println(rainWaterTapping(A));
    }
    public static int rainWaterTapping(int[] A){
        int[] RMax = new int[A.length+1];
        RMax[A.length] =0;
        for(int i=A.length-1 ;i>=0;i--){
            if(RMax[i+1] < A[i])
                RMax[i]=A[i];
            else RMax[i] = RMax[i+1];
        }
        int L_max = A[0];
        int total_units=0;
        for(int i=0;i<A.length-1;i++){
            total_units += Math.min(L_max,RMax[i])-A[i];
            if(L_max < A[i+1])
                L_max = A[i+1];
        }

        return total_units;
    }
}
