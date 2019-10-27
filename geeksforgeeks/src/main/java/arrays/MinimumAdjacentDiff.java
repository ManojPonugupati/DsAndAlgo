package arrays;

public class MinimumAdjacentDiff {
    public static void main(String[] args) {
       int[] ar = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(minAdj(ar,7));
    }
    public static int minAdj(int[] arr,int n){
     int min = Integer.MAX_VALUE;
     for(int i=0;i<n-1;i++){
         if(Math.abs(arr[i] - arr[i+1]) < min){
             min = Math.abs(arr[i] - arr[i+1]);
         }
     }
     if(Math.abs(arr[n-1] - arr[0]) < min){
         min = Math.abs(arr[n-1] - arr[0]);
     }
     return min;
    }
}
