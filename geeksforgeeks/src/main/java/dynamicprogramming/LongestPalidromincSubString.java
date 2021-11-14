package dynamicprogramming;

public class LongestPalidromincSubString {
    public static void main(String[] args) {
        String A="aaaabbbbbbbaa";
        System.out.println(getLPSS(A));
    }
    public static int getLPSS(String A) {
        boolean[][] dp = new boolean[A.length()][A.length()];
        int max = 2;
        int start =0;
        for (int i = 0; i < dp.length; i++) {
            dp[i][i] = true;
        }
        for (int i = 0; i < dp.length - 1; i++) {
            if (A.charAt(i) == A.charAt(i + 1)) {
                dp[i][i + 1] = true;
            } else dp[i][i + 1] = false;
        }
        for (int i = 2; i<dp.length;i++){
            for(int j=0;i+j<dp.length;j++){
                if(A.charAt(j) == A.charAt(i+j) && dp[j+1][i+j-1])
                {
                    dp[j][i+j]=true;
                    max=i+1;
                    start =j;
                }else
                    dp[j][i+j]=false;
            }
        }
        System.out.println(A.substring(start,start+max));
            return max;
    }

    }

