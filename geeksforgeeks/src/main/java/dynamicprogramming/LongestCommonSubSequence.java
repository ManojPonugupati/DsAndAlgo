package dynamicprogramming;

public class LongestCommonSubSequence {
    public static void main(String[] args) {
        String A="ccdbaeeceecabaacebcaebdceaacdcdcbbadcebcaaceaebcdacccaedcbccacedaacdbaaeacdbeedccceeabececcc";
        String B="ebcadedcedbacedbaddccabcddceaedecbbbaedcebecaeaacbdbdbededcbcbdbceeebcbaaceabcbadbcdcdbebdaa";
       // String A ="ab";
       // String B ="da";
        System.out.println(getLCS(A,B));
    }
    public static int getLCS(String A, String B){
        /*char[] ch_A = new char[A.length()+1];
        char[] ch_B = new char[B.length()+1];
        for(int i=0;i<A.length();i++){
            ch_A[i+1]=A.charAt(i);
        }
        ch_A[0]='x';
        for(int i=0;i<B.length();i++){
            ch_B[i+1]=B.charAt(i);
        }
        ch_B[0]='y';*/

        int[][] dp = new int[A.length()+2][B.length()+2];
        int max=0;
        for(int i=0;i<=A.length();i++){
            for(int j=0;j<=B.length();j++){
                if(i==0 || j==0) {
                    dp[i][j] = 0;
                } else if(A.charAt(i-1)==B.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        for(int i=0;i<=A.length()+1;i++){
            for(int j=0;j<=B.length()+1;j++){
                max=Math.max(dp[i][j],max);
            }
        }
        return max;
    }
}
