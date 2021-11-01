package dynamicprogramming;

public class CoinSumInfinite {
    public static void main(String[] args) {
        int[] A = {1,2,3};
        int B=4;
        System.out.println(getTotalNumberOfWays(A,B));
        System.out.println("iterative");
        System.out.println(getTotalNumberOfWaysIteratiely(A,B));
        System.out.println("distinct ways");
        System.out.println(getTotalDistinctWays(A,B));
    }
    public static int getTotalNumberOfWaysIteratiely(int[]A,int B){
        int[] dp = new int[B+1];
        dp[0]=1;
        for(int i=1;i<=B;i++){
            for(int j=0;j<A.length;j++){
                if(A[j] <=i){
                    dp[i]+=dp[i-A[j]];
                }
            }
        }
        for(int i=0;i<dp.length;i++)
        System.out.print(dp[i] + " ");
        System.out.println();
        return dp[B];
    }
    public static int getTotalDistinctWays(int[] A, int B){
        int[] dp = new int[B+1];
        dp[0]=1;
        for(int j=0;j<A.length;j++){
            for(int i=1;i<=B;i++){
                if(A[j] <=i)
                dp[i] += dp[i-A[j]];
            }
        }
        return dp[B];
    }
    public static int getTotalNumberOfWays(int[] A, int B){
        int[] dp = new int[B+1];
        dp[0]=1;
        for(int i=0;i<dp.length;i++)
            dp[i]=0;
        int N = getWays(A,dp,B);
        System.out.println("ways : " + N);
        return N;
    }
    public static int getWays(int[] A,int[] dp,int B){
       int ans=0;
       if(B==0) return 1;
       if(dp[B] > 0) return 0;
       for(int i=0;i<A.length;i++){
           if(A[i] <=B)
               ans += getWays(A,dp,B-A[i]);
       }
       dp[B]=ans;
       return dp[B];
    }
}
