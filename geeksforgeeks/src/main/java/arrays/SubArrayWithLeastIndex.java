package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithLeastIndex {
    public static void main(String[] args) {
        Integer[] arr = {18, 11, 16, 19, 11, 9, 8, 15, 3, 10, 9, 20, 1, 19};
        int B=1;
        ArrayList<Integer> ar = new ArrayList<>();
        ar.addAll(Arrays.asList(arr));
        System.out.println(subArrayWithLeastIndex(ar,B));
    }

    public  static int subArrayWithLeastIndex(ArrayList<Integer> A, int B){
        int min_sum =0;
        int min_sum_first_index=0;
        for(int i=0;i<B;i++){
            min_sum += A.get(i);
        }
        int diff_sum = min_sum;
        for(int i=1;i<A.size()-B+1;i++){
            diff_sum = diff_sum - A.get(i - 1) + A.get(i + B - 1);
            if(diff_sum < min_sum) {
                min_sum = diff_sum;
                min_sum_first_index = i;
            }
        }
            return min_sum_first_index;
    }

}
