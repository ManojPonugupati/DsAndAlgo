package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,2,3,4,5};
        sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void sort(int[] arr, int l, int r) {

        if (l < r) {
            int mid = l + (r - l) / 2;
            sort(arr, l, mid);
            sort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }
        static void merge(int[] arr, int beg,int mid, int end){
            int l = mid - beg + 1;
            int r = end - mid;
            int[] left = new int[l];
            int[] right = new int[r];
            for(int i=0;i<l;i++){
                left[i] = arr[beg+ i];
            }
            for(int i=0;i<r;i++){
                right[i] = arr[mid + i + 1];
            }

            int i=0,j=0,k=beg;
            while(i<l && j<r){
                if(left[i]<=right[j]){
                    arr[k]= left[i];
                    i++;
                }else if(left[i] > right[j]){
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }
            while(i<l){
                arr[k] = left[i];
                i++;
                k++;
            }
            while(j<r){
                arr[k]=right[j];
                j++;
                k++;
            }
    }
}
