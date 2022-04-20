package greedy;

public class AnotherCoinProblem {
    public static void main(String[] args) {
        int A=35;
        int out=0;
        while(A>4) {
            int x = (int) (Math.log(A) / Math.log(5));
            ++out;
            A -= (int) Math.pow(5, x);
            System.out.println(A);
        }
        System.out.println(out+A);
    }
}
