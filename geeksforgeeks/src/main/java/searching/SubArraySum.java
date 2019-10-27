package searching;

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = {135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134};
        int[] arr2 = {1,2,3,7,5};
        int[] arr3 = {5,7,1,2};
        subarraySum(arr3.length,15,arr3);
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
                i++;
                cur_sum += arr[i];
            }

        }
        if (cur_sum == s) {
            System.out.println(++start +  " " + ++i);
        } else {
            System.out.println("-1");
        }
    }
}
