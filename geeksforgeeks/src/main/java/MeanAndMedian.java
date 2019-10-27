import java.util.Arrays;

public class MeanAndMedian {
    public static void main(String[] args) {
       int[] ar = {2,3,4,8};
    }

    public static int median(int A[], int N) {

        Arrays.sort(A);
        if (A.length % 2 == 0) {
            return (A[A.length / 2 - 1] + A[A.length / 2]) / 2;
        } else {
            return A[A.length / 2];
        }
    }


        public static int mean( int A[], int N)
        {
            //Your code here
            int sum = 0;
            for (int i = 0; i < A.length; i++) {
                sum = sum + A[i];
            }
            return sum / A.length;

        }
    }
