package recursion;

public class NthFibonacciSum {
    public static void main(String[] args) {
        System.out.println(nthFibonacciSum(10));
    }

    public static int nthFibonacciSum(int n){
        if(n==0 || n==1)
            return 1;
            return nthFibonacciSum(n-1) + nthFibonacciSum(n-2);
    }
}
