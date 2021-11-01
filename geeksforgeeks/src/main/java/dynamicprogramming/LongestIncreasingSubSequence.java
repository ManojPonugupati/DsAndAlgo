package dynamicprogramming;

public class LongestIncreasingSubSequence {
    public static void main(String[] args) {
        int[] A = {5, 6, 3, 7, 9};
        System.out.println(getLISLength(A));
        System.out.println(getLIS(A));
    }
    public static int getLISLength(int[] A){
       int[] LLIS = new int[A.length];
       for(int i=0;i<A.length;i++) {
           LLIS[i] = 1;
       }
       for(int i=1;i<A.length;i++){
             int max_llis =0;
           for(int j=i-1;j>=0;j--){
               if(A[j] < A[i])
                    max_llis = Math.max(max_llis,LLIS[j]);
           }
           LLIS[i] +=max_llis;
       }
       int max_llis=0;
       for(int i=0;i<LLIS.length;i++)
           max_llis = Math.max(max_llis,LLIS[i]);
       return max_llis;
    }
    public static int[] getLIS(int[] A){
        int[][] LLIS = new int[2][A.length];
        for(int i=0;i<A.length;i++) {
            LLIS[0][i] =1 ;
            LLIS[1][i]=A[i];
        }
        for(int i=1;i<A.length;i++){
            int max_llis =0;
            for(int j=i-1;j>=0;j--){
                if(A[j] < A[i])
                    max_llis = Math.max(max_llis,LLIS[0][j]);
            }
            LLIS[0][i] +=max_llis;
        }
        int max_llis=0;
        int max_idx=-1;
        for(int i=0;i<A.length;i++) {
            max_llis = Math.max(max_llis, LLIS[0][i]);
            if(max_llis==LLIS[0][i])
                max_idx=i;
        }
        int[] out = new int[max_llis];
        out[max_llis-1] = A[max_idx];
        max_llis--;
        for(int i=max_idx;i>=0 && max_llis>0;i--){
            if(LLIS[0][i]==max_llis && LLIS[1][i] < A[max_idx])
            {
                out[max_llis-1]=A[i];
                max_idx=i;
                max_llis--;
            }
        }
          return out;
    }
}
