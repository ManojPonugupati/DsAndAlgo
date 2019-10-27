package searching;

import java.util.Scanner;

public class CountOnlyRepeated {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 1; i <= T; i++) {
            int N = in.nextInt();
            int[] arr = new int[N];
            for (int j = 0; j < N; j++)
                arr[j] = in.nextInt();
            countOnlyRepated(arr, arr.length);
            countOnlyRepatedBinary(arr,arr.length);
        }
    }
    static void countOnlyRepated(int[] arr, int n){
        int count =1; int element=0;
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]){
                element = arr[i];
                count++;
            }else if(count > 1)
                break;
        }
        System.out.println(count + " " + element);
    }
    static void countOnlyRepatedBinary(int[] arr, int n){
        int count =1;int element=0;
        int low=0;
        int high = n-1;
        int mid = high/2;
        if(arr[mid] != mid +1){

        }
    }
}
