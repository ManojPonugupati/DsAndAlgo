package recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(3));
        System.out.println(Math.pow(6,2));
    }
    static int fib(int n){
        if(n == 0 ){
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
}
