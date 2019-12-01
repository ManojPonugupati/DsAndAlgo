package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.printf(arr[i] + " ");
        }
    }
    static void quickSort(int[] arr,int low, int high){
        if(low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }
    static int partition(int[] arr,int low,int high){
        int N = high - low + 1;
        int index = low +(int) (Math.random()*N);
        int i=low-1;
        int pivot = arr[index];
        int swap_temp=0;

        swap_temp = arr[high];
        arr[high] = arr[index];
        arr[index] = swap_temp;

        for(int j=low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                swap_temp = arr[i];
                arr[i]= arr[j];
                arr[j] = swap_temp;
            }
        }
        swap_temp = arr[i+1];
        arr[i+1]= arr[high];
        arr[high] = swap_temp;

        return i+1;
    }
}
