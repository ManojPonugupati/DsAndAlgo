package contest;

public class SumOfBitWiseXOR {
    public static void main(String[] args) {
        int[] A = {2,1,4,6,1,3};
        int swap=0;
        for(int i=0;i<A.length/2;i++) {
            if (A[i] <= A[A.length - 1 - i]) {
                swap = A[i];
                A[i] = A[A.length - 1 - i];
                A[A.length - 1 - i] = swap;
            }
        }
            for(int i=0;i<A.length;i++){
                System.out.print(A[i] + " ");
            }
        System.out.println();
            int sum=0;
            for(int i=0;i<A.length/2;i++){
                System.out.print(A[i] + " " + A[A.length/2+i]);
                sum += A[i]^A[A.length/2+i];
            }
        System.out.println();
        System.out.println("sum is " + sum);
        }
    }
