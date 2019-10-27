package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubbleSort(arr,0,arr.length);
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
        for(int k=0;k<n;k++){
            System.out.print(arr[k] + " ");
        }
    }
}
