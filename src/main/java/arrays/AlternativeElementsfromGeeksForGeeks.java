package arrays;

/*You are given an array A of size N. You need to print elements of A in alternate order.

Input Format:
 The first line of input contains T denoting the number of testcases. T testcases follow.
  Each test case contains two lines of input. The first line contains N and the second line contains the elements of the array.
Output Format:
  For each testcase, print the alternate elements of the array(starting from index 0).*/

public class AlternativeElementsfromGeeksForGeeks {
    public static void main(String[] args) {
     int[] arr = {1,2,3,4,5};
     print(arr,5);
    }

    public static void print(int arr[], int n) {
       int i=0;
       while(i<n){
           System.out.print(arr[i] + " ");
           i = i+2;
       }
    }
}
