package arrays;

import java.util.Scanner;

public class RotatingArrayByNTimes {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        for(int i=0;i<T; i++){
            System.out.println("Number of test cases are  :" + T);
            int size = sc.nextInt();
            System.out.println(size);
            System.out.println("Array size is " + size);
            int[] arr = new int[size];
            for(int j=0;j<size;j++)
            {
                arr[j] = sc.nextInt();
            }
            System.out.println("Input array is :");
            for(int k=0;k<size;k++)
                System.out.print(arr[k] + " ");

            int rotation_size = sc.nextInt();
            System.out.println(rotation_size);
            System.out.println(rotateArray(arr,rotation_size,size-1));

        }

    }
    public static int[] rotateArray(int[] arr, int B,int arr_size){
        int variable_for_swapping=0;
        for(int i=0; i<(arr_size + 1)/2;i++){
            variable_for_swapping = arr[arr_size -i];
            arr[arr_size - i] = arr[i];
            arr[i]=variable_for_swapping;
        }

        for(int i=0; i<B/2;i++){
            variable_for_swapping = arr[B-i-1];
            arr[B -i -1] = arr[i];
            arr[i] = variable_for_swapping;
        }

        for(int i=B;i<arr_size;i++)
        {
            variable_for_swapping = arr[arr_size-1];
            arr[arr_size -1] = arr[i];
            arr[i] = variable_for_swapping;
        }

        return arr;
    }
}
