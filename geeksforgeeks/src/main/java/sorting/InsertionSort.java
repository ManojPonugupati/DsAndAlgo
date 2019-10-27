package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] arr2 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr3 = {411, 575, 686, 364, 887, 183};
        insertionSort(arr3,arr3.length);
    }
    static void insertionSort(int[] arr,int n){
        int max; int temp=0;
        for(int j=1; j<n;j++){
             max = arr[j];
            for(int k=j-1;k>=0;k--){
                if(max < arr[k]){
                    temp=arr[k + 1];
                    arr[k + 1] = arr[k];
                    arr[k] = temp;
                } else {
                    break;
                }
            }
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j] + " ");
        }
    }
}
