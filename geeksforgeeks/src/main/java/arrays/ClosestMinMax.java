package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestMinMax {
    public static void main(String[] args) {
        Integer[] arr = { 343, 291, 963, 165, 152 };
                //{1, 9, 1, 9, 9, 0, 1, 2, 3,0};
        ArrayList<Integer> ar = new ArrayList<>();
        ar.addAll(Arrays.asList(arr));
        System.out.println(solve(ar));
    }

    public static int solve(ArrayList<Integer> A) {
        int min_val = Integer.MAX_VALUE;
        int max_val = Integer.MIN_VALUE;
        int left_max_index  = -1;
        int right_max_index = -1;
        int ans=Integer.MAX_VALUE;
        for (Integer element : A) {
            if (element < min_val) {
                min_val = element;
            }
            if (element > max_val) {
                max_val = element;
            }
        }
        for(int i=0;i<A.size();i++){
            if(A.get(i).equals(max_val)){
               left_max_index = i;
            }
            if(A.get(i).equals(min_val) && left_max_index != -1) {
                if (ans > Math.abs(i - left_max_index)) {
                    ans = Math.abs(i - left_max_index);

                }

            }
        }
        for(int i=A.size()-1;i>=0;i--){
            if(A.get(i).equals(max_val)){
                right_max_index=i;
            }
            if(A.get(i).equals(min_val) && right_max_index !=-1){
               if(ans > Math.abs(right_max_index - i)){
                   ans = Math.abs(right_max_index - i);
               }
            }
        }
        return ++ans;
    }
}
