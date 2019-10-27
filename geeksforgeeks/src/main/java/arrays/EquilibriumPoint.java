package arrays;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {20,17,42,25,32,32,30,32,37,9,2,33,31,17,14,40,9,12,36,21,8,33,6,6,10,37,12,26,21,3};
        System.out.println(equlibrium(arr,30));
    }
    private static int equlibrium(int[] arr, int n){
        int total_sum=0;
        for(int i=0;i<n;i++) {
            total_sum += arr[i];
        }
        int left_sum = 0;
         for(int i=0;i<n;i++){
             if(left_sum == (total_sum - arr[i]))
                 return i+1;
             left_sum += arr[i];
             total_sum -= arr[i];
         }
           return -1;
        }
    }
