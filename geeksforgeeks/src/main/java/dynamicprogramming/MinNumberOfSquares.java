package dynamicprogramming;

public class MinNumberOfSquares {
    public static void main(String[] args) {
        int n=12;
        int[] dp = new int[n+1];
        for(int i=0;i<dp.length;i++)
            dp[i]=-1;
        dp[0]=0;
        System.out.println(getMinNumOfSquares(n,dp));
    }
    public static int getMinNumOfSquares(int A,int[]dp){
        for(int i=1;i<=A;i++){
            dp[i]=i;
            for(int j=1;j*j<=i;j++){
                dp[i] = Math.min(dp[i],dp[i-(j*j)]+1);
            }
        }
        return dp[A];
    }
}
