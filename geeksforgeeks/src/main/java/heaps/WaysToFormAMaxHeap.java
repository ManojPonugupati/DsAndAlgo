package heaps;

import java.util.Arrays;

public class WaysToFormAMaxHeap {
    public static void main(String[] args) {
        int A=11;
        int[] dp = new int[A+1];
        Arrays.fill(dp,-1);
        int mod = 1000000007;
        System.out.println(getWays(A,dp,mod));
        int ncr = nCr(10,2);
        System.out.println(ncr);
    }
    public static int getWays(int A,int[] dp,int mod){
        if(A<=2) return 1;
        if(dp[A] != -1) return dp[A];
         int H= (int) (Math.log(A)/Math.log(2));
         int L = Math.min(A- (int)(Math.pow(2,H)-1),(int) (Math.pow(2,H-1)));
         int R = (A-1) - L;
         int ncr = nCr(A-1,L);
         while(ncr < 0)
             ncr +=mod;
         ncr %= mod;
         int left =getWays(L,dp,mod);
         while(left < 0)
             left +=mod;
         left %=mod;
         int right = getWays(R,dp,mod);
         while(right <0)
             right +=mod;
         right %=mod;
         int lncr = ncr*left;
         while(lncr < 0)
             lncr +=mod;
         lncr %=mod;
         dp[A] = lncr*right;
         while(dp[A] < 0 && dp[A] !=-1)
             dp[A] += mod;
        System.out.println("Just dp" + dp[A] + " " + (dp[A] < 0) );
         dp[A] = dp[A]%mod;
        System.out.println("dp[A] : " + dp[A] + " " + A + " " + L + " " + R +
                 " " + left + " " + right);
         return  dp[A];
    }
    public static int nCr(int n, int k){
        int C[][] = new int[n + 1][k + 1];
        int i, j;

        // Calculate  value of Binomial
        // Coefficient in bottom up manner
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= Math.min(i, k); j++) {
                // Base Cases
                if (j == 0 || j == i)
                    C[i][j] = 1;

                    // Calculate value using
                    // previously stored values
                else
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
            }
        }

        return C[n][k];
    }
 }

