package dynamicprogramming;

public class EditDistance {
    public static void main(String[] args) {
        String A ="abcdefghi";
        String B="abcdi";
        System.out.println(getEditDistance(A,B));
    }
    public static int getEditDistance(String A, String B){
        int[][] dp = new int[A.length()+1][B.length()+1];
        for(int i=0;i<=A.length();i++){
            for(int j=0;j<=B.length();j++){
                if(i==0) dp[i][j]=j;
                else if(j==0) dp[i][j]=i;
                else if(A.charAt(i-1)==B.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j] = 1 + Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1]);
            }
        }
        return dp[A.length()][B.length()];
    }
}
