package dynamicprogramming;

public class UniquepathsInAGrid {
    public static void main(String[] args) {
     /*   A = [
        [0, 0, 0]
        [0, 1, 0]
        [0, 0, 0]
        Number of Unique paths from [0][0] to [2][2] is 2
     ]*/

    /* A = [
        [0, 0, 0]
        [1, 1, 1]
        [0, 0, 0]
        Number of Unique paths here are 0
     ]*/

    int[][] A = {{0,0,0,0},{0,1,0,0},{0,0,0,0}};
    //int[][] A = {{0,0,0},{1,1,1},{0,0,0}};
        System.out.println(getUniquePaths(A));
    }
    public static int getUniquePaths(int[][] A) {
        int[][] dp = new int[A.length][A[0].length];
        //fill the first column
        boolean flag = false;
        for (int i = 0; i <A.length; i++) {
            if (A[i][0] == 1 || flag) {
                flag = true;
                dp[i][0] = 0;
            } else {
                dp[i][0] = 1;
            }
        }
        //fill the first row
        flag=false;
        for(int i=0;i<A[0].length;i++){
            if (A[0][i] == 1 || flag) {
                flag = true;
                dp[0][i] = 0;
            } else {
                dp[0][i] = 1;
            }
        }
        for(int i=1;i<A.length;i++){
            for(int j=1;j<A[0].length;j++){
                if(A[i][j]==1){
                    dp[i][j]=0;
                }else {
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[A.length-1][A[0].length-1];
    }
}
