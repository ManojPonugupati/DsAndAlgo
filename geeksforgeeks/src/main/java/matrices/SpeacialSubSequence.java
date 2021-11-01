package matrices;

import static java.lang.Math.pow;

public class SpeacialSubSequence {
    public static void main(String[] args) {
        String A = "ABCGAG";
        double num = pow(10,9)+7;
        System.out.println(solve(A));
    }

    public static int solve(String A){
        int MOD = 1000000007;
        char[] ar = new char[A.length()];
        for(int i=0;i<A.length();i++){
            ar[i]=A.charAt(i);
        }
        System.out.println(MOD);
        int A_COUNTER=0;
        int ret_val=0;
        for(int i=0;i<A.length();i++){
            if(ar[i]=='A')
                A_COUNTER++;
            if(ar[i]=='G'){
                ret_val +=A_COUNTER;
            }
        }
        return ret_val%MOD;
    }
}
