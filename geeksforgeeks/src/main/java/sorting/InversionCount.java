package sorting;

public class InversionCount {
    public static void main(String[] args) {
      int[] arr = {2,4,1,3,5};
        System.out.println(inversionCount(arr,0, arr.length-1));
    }
    public static int inversionCount(int[] arr,int low, int high){
       int count =0;
        if(low < high) {
            int mid = low + (high - low) / 2;
          // Count for left sub array
            count += inversionCount(arr, low, mid);
          // count fot right sub array
            count += inversionCount(arr, mid + 1, high);
          // total inversion count
            count += mergeCount(arr, low, mid, high);

        }
        return count;
    }
    static int mergeCount(int[] arr, int low, int mid, int high){
         return 1;
    }
}
