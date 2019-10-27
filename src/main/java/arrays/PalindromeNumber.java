package arrays;

/*
Given a integer array A[] of n elements. Your task is to complete the function PalinArray
Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.
Input:
The first line of input contains an integer denoting the no of test cases. Then T test cases follow. Each test case contains two lines. The first line of input contains an integer n denoting the size of the arrays.
In the second line are N space separated values of the array A[].
*/

public class PalindromeNumber {
    public static void main(String[] args) {
        int[] arr = {111, 222, 333, 444, 555};
        PalindromeNumber palind = new PalindromeNumber();
        System.out.println(palind.PalinArray(arr, 5));

    }

    int PalinArray(int a[], int n) {

        boolean palin = true;
        int i = 0;
        while (palin && i < n) {

            int k = a[i];
            int elem = 0;
            while (k != 0) {
                elem = elem * 10 + k % 10;
                k = k / 10;
            }
            if (elem != a[i]) {
                palin = false;
            }
            i++;
        }
        if (palin && (i == n)) {
            return 1;
        } else {
            return 0;
        }
    }
}