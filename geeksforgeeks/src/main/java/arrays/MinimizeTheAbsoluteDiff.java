package arrays;

public class MinimizeTheAbsoluteDiff {
    public static void main(String[] args) {
        int[] a ={1, 4, 5, 8, 10};
        int[] b ={6, 9, 15};
        int[] c ={2, 3, 6, 6 };
        System.out.println(minimizeTheAbsoluteDiff(a,b,c));
    }
    public static int minimizeTheAbsoluteDiff(int[] A, int[] B, int[] C){
        int i=0,j=0,k=0;
        int min_diff=Integer.MAX_VALUE,current_diff,min,max;
        while(i<A.length && j<B.length && k<C.length){
            min = min(A[i],B[j],C[k]);
            max = max(A[i],B[j],C[k]);
            current_diff = max-min;

          if(min_diff > current_diff)
              min_diff=current_diff;
          if(min == A[i] && i<A.length)
              i++;
          if(min == B[j] && j<B.length)
              j++;
          if(min == C[k] && k<C.length)
              k++;

        }
        return min_diff;
    }

    public static int min(int A,int B,int C){
       return Math.min(Math.min(A,B),C);
    }
    public static int max(int A,int B,int C){
        return Math.max(Math.max(A,B),C);
    }
}
