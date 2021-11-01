package arrays.AdvancedBatch;

public class VerylargePower {
    public static void main(String[] args) {
        int A=2;
        int B=27;
        int MOD=1000000007;
        int POWER = 1;
        for(int i=1;i<B;i++)
            POWER = (POWER*(i%MOD))%MOD;
    }
}
