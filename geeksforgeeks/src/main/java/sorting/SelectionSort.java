package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr,0,arr.length);
    }
    static void  selectionSort(int[] arr, int i, int n){
        int max; int temp=0;
        for(int j=i; j<n;j++){
            max= arr[0];
            for(int k=i;k<n-j;k++){
                if(max < arr[k]){
                    temp=max;
                    max = arr[k];
                    arr[k] = temp;
                }
            }
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j] + " ");
        }
    }
}