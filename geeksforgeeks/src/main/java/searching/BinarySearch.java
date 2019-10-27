package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33};
        for(int x=-10;x<45;x++)
        System.out.println(x + "index is " + search(arr,arr.length-1,x));
    }
    static int search(int[]arr,int n,int x){
       int mid = n/2;
       int low = 0;
       int high =n;


       while(mid < high && mid >= low)
        {
            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x){
                low = mid +1;
                mid = low + (high -low)/2;
            }else {
                high = mid-1;
                mid = low + (high -low)/2;
            }
        }
       return -1;
    }
}
