package searching;

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = {15, 2, 48, 19, 28, 22, 44, 2, 32, 46, 46, 24, 1, 23, 49, 26, 23, 17, 17, 46, 4, 30, 40, 36, 20, 5 };
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {5,7,1,2};
        subarraySum(arr2.length,5 ,arr2);
    }
    static void subarraySum(int n,int s,int[]arr){
        int start=0;int cur_sum=arr[0];
        int end_pos =0;
        int i=0;
        while(i<n){
            if(cur_sum == s){
                break;
            }else if(cur_sum > s){
                cur_sum -=arr[start];
                start++;
            }else {
                ++i;
                cur_sum += arr[i];
            }
        }
        if (cur_sum == s) {
            System.out.println(start +  " " + i);
        } else {
            System.out.println("-1");
        }
    }
}
