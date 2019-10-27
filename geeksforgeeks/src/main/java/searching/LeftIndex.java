package searching;

public class LeftIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,5,6,7};
        int x=-1;
        System.out.println(leftIndex(arr.length,arr,x));
    }
   static int leftIndex(int sizeOfArray,int[] arr, int elementToSearch){
        int low = 0;
        int high = sizeOfArray-1;
        int mid = high/2;
        boolean elem_found = false;
        while(low <= high){
            if (arr[mid] == elementToSearch){
                high = mid-1;
                mid = low + (high - low)/2;
                elem_found=true;
            }else if(arr[mid] < elementToSearch) {
                low = mid + 1;
                mid = low + (high - low) / 2;
            } else {
                high = mid -1;
                mid = low + (high -low)/2;
            }

        }
        if (elem_found){
            return low;
        } else {
            return -1;
        }
   }
}
