package searching;

import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
       // int[] arr1 = {1,7,10,13,16};
       // int[] arr2 = {2,5, 9, 21, 24, 27, 31};
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i=0;i<T;i++){
            int N = in.nextInt();
            int M = in.nextInt();
            int[] arr1 = new int[N];
            int[] arr2 = new int[M];
            for(int j=0;j<N;j++){
                arr1[j] = in.nextInt();
            }
            for(int j=0;j<M;j++){
                arr2[j] = in.nextInt();
            }
            double d = findMedianOfSortedArrays(arr1,arr2);
            System.out.println((int)Math.floor(d));
        }

    }

    public static double findMedianOfSortedArrays(int[] arr1,int[] arr2){
        if(arr1.length > arr2.length){
            return findMedianOfSortedArrays(arr2,arr1);
        }
        int low = 0;
        int high = arr1.length;
        int arr1_len = arr1.length;
        int arr2_len = arr2.length;


        while(low <= high){

        int partitionX = (low + high)/2;
        int partitionY = (arr1_len + arr2_len + 1)/2 - partitionX;

        int x_left_min = (partitionX == 0) ? Integer.MIN_VALUE : arr1[partitionX -1];
        int x_right_max = (partitionX == arr1_len) ? Integer.MAX_VALUE : arr1[partitionX];

        int y_left_min = (partitionY == 0) ? Integer.MIN_VALUE : arr2[partitionY -1];
        int y_right_max = (partitionY == arr2_len) ? Integer.MAX_VALUE : arr2[partitionY];

        if(x_left_min <= y_right_max && y_left_min <= x_right_max) {

            //below condition is for distinct even and odd elements median

            if ((arr1_len + arr2_len) % 2 == 0) {
                return
                        ((double) Math.max(x_left_min, y_left_min)
                                + Math.min(x_right_max, y_right_max)) / 2;
            } else {
                return Math.max(x_left_min, y_left_min);
            }
        }
             if(x_left_min > y_right_max){
                   high = partitionX -1;
               }
           else {
               low = partitionX + 1;
            }
         }

        throw new IllegalArgumentException("arrays were not sorted");
    }
}
