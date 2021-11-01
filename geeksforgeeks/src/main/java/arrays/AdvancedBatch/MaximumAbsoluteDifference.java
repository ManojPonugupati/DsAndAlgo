package arrays.AdvancedBatch;

public class MaximumAbsoluteDifference {
    public static void main(String[] args) {
        int[]A ={1,3,-1};
        System.out.println(maximumAbsoluteDifference(A));
    }
    public static int maximumAbsoluteDifference(int[] A){
        int X_max = Integer.MIN_VALUE;
        int X_min = Integer.MAX_VALUE;
        int Y_max = Integer.MIN_VALUE;
        int Y_min = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(X_max < A[i]+i)
                X_max = A[i]+i;
        }
        for(int j=0;j<A.length;j++)
            if(X_min > A[j] + j)
                X_min = A[j] + j;
        for(int i=0;i<A.length;i++)
            if(Y_max < A[i] -i)
                Y_max = A[i] - i;
        for(int j=0;j<A.length;j++)
            if(Y_min > A[j] - j)
                Y_min = A[j] - j;
            X_max = X_max - X_min;
            Y_max = Y_max - Y_min;
            return X_max > Y_max ? X_max:Y_max;
    }
}
