package dynamicprogramming;

import java.util.Arrays;

public class LongestPalindromicSubSequence {
    public static void main(String[] args) {
        String A = "abcdedcbadabc";
        int[][] dp = new int[A.length()+1][A.length()+1];
        for(int i=0;i<dp.length;i++)
            Arrays.fill(dp[i],0);
        System.out.println(getLengthLPS(A,dp,0,A.length()-1));

    }
    public static int getLengthLPS(String A,int[][] dp,int i,int j){
        if(i==j) return 1;
        if(i>j) return 0;
        if(dp[i][j]>0) return dp[i][j];
        if(A.charAt(i) == A.charAt(j))
            dp[i][j]=2+getLengthLPS(A,dp,i+1,j-1);
        if(A.charAt(i) != A.charAt(j))
            dp[i][j] = Math.max(getLengthLPS(A,dp,i+1,j),getLengthLPS(A,dp,i,j-1));
        return dp[i][j];
    }
}
