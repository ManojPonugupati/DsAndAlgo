package arrays;

public class SubMatrixSumQueries {
    public static void main(String[] args) {
        /*int[][]A = {{5, 17, 100, 11},{0, 0, 2, 8}};
        int[]B={1,1};
        int[]C={1,4};
        int[]D={2,2};
        int[]E={2,4};
*/
        int[][]A = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        int[]B ={1,2};
        int[]C ={1,2};
        int[]D ={2,3};
        int[]E ={2,3};
        int[] F = subMatrixSumQueries(A,B,C,D,E);
        System.out.println("F[0] is : " + F[0] + " F[1] is : " + F[1]);
        System.out.println(1<<5);
    }
    public static int[] subMatrixSumQueries(int[][]A,int[]B,int[]C,int[]D,int[]E){
        int[] out = new int[B.length];
        int m=A.length;
        int n = A[0].length;
        int MOD=1000000007;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                A[i][j] = A[i][j] + MOD;
            }
        }
        int[][] ps = new int[m+1][n+1];
        for(int i=0;i<=m;i++)
            ps[i][0]=0;
        for(int j=0;j<=n;j++)
            ps[0][j]=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                ps[i][j] = ps[i-1][j] + ps[i][j-1] -ps[i-1][j-1] + A[i-1][j-1] + MOD;
                ps[i][j]= ps[i][j]%MOD;
            }
        }
        for(int i=0;i<B.length;i++)
        out[i] = (ps[D[i]][E[i]]-ps[B[i]-1][E[i]]-ps[D[i]][C[i]-1] +MOD + ps[B[i]-1][C[i]-1])%MOD;
        return out;
    }
}
