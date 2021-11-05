package dynamicprogramming;

import java.util.Arrays;

public class NDigitNumbers {
    public static void main(String[] args) {
        int A=84;
        int B=82;// output should be 976334682
        int max=Integer.MIN_VALUE;
        int[][] dp = new int[A+1][B+1];
        for(int i=0;i<dp.length;i++)
            Arrays.fill(dp[i],-1);
        System.out.println(getNDigitNumbers(A,B,dp));
    }
    public static int getNDigitNumbers(int A, int B,int[][]dp){
        if(B==0 && A>0) return 0;
        if(B==0) return 1;
        if(A<=0) return 0;
        if(dp[A][B]>-1) return dp[A][B];
        int ans=0;
        for(int i=0;i<=9;i++){
            if(i<=B){
                ans +=getNDigitNumbers(A-1,B-i,dp);
                ans %=1000000007;
            }
        }
        dp[A][B]=ans;
        return dp[A][B];
    }
}
