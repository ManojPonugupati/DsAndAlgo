package searching;

import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {
       // int[] arr = {10,9,8,7,6,5,4,3,2,1};
      // int k=5;
        {
            Scanner in = new Scanner(System.in);
            int T = in.nextInt();
            for (int i = 1; i <= T; i++) {
                int N = in.nextInt();
                int[] arr = new int[N];
                for (int j = 0; j < N; j++)
                    arr[j] = in.nextInt();
                int k=in.nextInt();
            }
        }

    }
    public static int kthSmallest(int[] arr, int low, int high,int k){
        if(k>0 && k-1 <= high){
            int pi = partition(arr,low,high);
            if(pi == k-1)
                return arr[pi];
            if(k - low  <= pi - low) {
                return kthSmallest(arr, low, pi - 1, k);
            }
             else {
                return kthSmallest(arr, pi + 1, high, k);
            }
        }
        return -100;
    }
    public static int partition(int[] arr, int low, int high){
        int N = high - low + 1;
        int index = low + (int) (Math.random() * N);
        int i = low-1;
        swap(arr,high,index);
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,i+1,high);
      return i+1;
    }

    public static void swap(int[] arr,int i,int j){
        int temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
