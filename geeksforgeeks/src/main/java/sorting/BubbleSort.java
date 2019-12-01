package sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
      //  int[] arr = {5,4,3,2,1};
        Scanner sc = new Scanner(System.in);
        int TEST_CASES = sc.nextInt();
        for(int i=0;i<TEST_CASES;i++){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int j=0; j<size; j++){
                arr[j] = sc.nextInt();
            }
            bubbleSort(arr,0,arr.length);
        }
    }
    static void bubbleSort(int[] arr,int i, int n){
        boolean swapped;
        int temp=0;
        for(int k=i;k<n;k++){
            swapped = false;
            for(int j=i;j<n-1;j++){
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j]=arr[j + 1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        for(int k=0;k<n-1;k++){
            System.out.print(arr[k] + " ");
        }
        for(int k=n-1;k<n;k++){
            System.out.print(arr[k]);
        }
    }
}
