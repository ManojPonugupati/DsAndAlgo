package dynamicprogramming;

import java.util.Arrays;

public class RegexMatch {
    public static void main(String[] args) {
        String A = "acba";
        String B = "*?b*a*ba*";
       // String A="bca";
       // String B="bb*";
        System.out.println(isMatchingOrNot(A,B));
    }

    public static boolean isMatchingOrNot(final String A, final String B){
        boolean[][] dp = new boolean[A.length()+1][B.length()+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],false);
        }
        dp[0][0]=true;
       for(int i=1;i<dp[0].length;i++){
           if(B.charAt(i-1)=='*' ) {
               dp[0][i] = dp[0][i-1];
           }
       }
       for(int i=1;i<=A.length();i++){
           for(int j=1;j<=B.length();j++){
               if(A.charAt(i-1)==B.charAt(j-1)||B.charAt(j-1)=='?')
                   dp[i][j]=dp[i-1][j-1];
               else if(B.charAt(j-1)=='*')
                   dp[i][j]=dp[i][j-1] || dp[i-1][j];
               else
                   dp[i][j]=false;
           }
       }
        return dp[A.length()][B.length()];
    }
}
