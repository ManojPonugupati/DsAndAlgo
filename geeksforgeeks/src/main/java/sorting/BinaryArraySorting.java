package sorting;

public class BinaryArraySorting {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,1,1,1,0,0,0,1,1,1};
        quickselect(arr,arr.length);
    }
    public static void quickselect(int[] arr, int size){
        int pivot =1;
        int j=-1;
        int swat_temp=0;
        for(int i=0;i<size;i++){
            if(arr[i] < pivot){
                j++;
                swat_temp = arr[i];
                arr[i] = arr[j];
                arr[j] = swat_temp;
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
