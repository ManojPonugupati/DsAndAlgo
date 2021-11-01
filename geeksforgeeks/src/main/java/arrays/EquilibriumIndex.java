package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class EquilibriumIndex {
    public static void main(String[] args) {
        //Integer[] arr = {20,17,42,25,32,32,30,32,37,9,2,33,31,17,14,40,9,12,36,21,8,33,6,6,10,37,12,26,21,3};
        Integer[] arr = {-7, 1, 5, 2, -4, 3, 0};
        ArrayList<Integer> ar = new ArrayList<>();
        ar.addAll(Arrays.asList(arr));

        System.out.println(equlibriumIndex(ar));
    }
    public static int equlibriumIndex(ArrayList<Integer> A){
        int total_sum = 0;
        int left_sum=0;
        for(int i=0;i<A.size();i++){
            total_sum += A.get(i);
        }
        System.out.println("total sum is " + total_sum);
        for(int i=0;i<A.size();i++){
            if((total_sum - left_sum - A.get(i)) == 0){
                return i;
            }
            left_sum += A.get(i);
            total_sum -=A.get(i);
        }
        return -1;
    }
}
