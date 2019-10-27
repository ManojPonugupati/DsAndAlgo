package searching;

public class MaxIncreasingStep {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {1,2,2,3,4,4};
        System.out.println(maxStep(arr2,arr2.length));
    }
    static int maxStep(int[] arr, int n){
        int sub_array_inc_count=0;
        int sub_array_alt_inc_count=0;
        for(int i=0;i<n-1;i++){
            if(arr[i] < arr[i+1]){
                sub_array_alt_inc_count++ ;
            }else if(sub_array_alt_inc_count > sub_array_inc_count) {
                sub_array_inc_count = sub_array_alt_inc_count;
                sub_array_alt_inc_count = 0;
            }else {
                sub_array_alt_inc_count=0;
            }
        }
        return sub_array_inc_count> sub_array_alt_inc_count ?
                sub_array_inc_count:sub_array_alt_inc_count;
    }
}
