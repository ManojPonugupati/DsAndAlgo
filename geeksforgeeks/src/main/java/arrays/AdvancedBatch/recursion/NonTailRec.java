package arrays.AdvancedBatch.recursion;

public class NonTailRec {
    public static void main(String[] args) {
        int n=3;
         solve(n);
    }
    public static void solve(int n){
        if(n<=1) return ;
        System.out.println("inside print : " + n);
         solve(2*n/3);
    }
}
