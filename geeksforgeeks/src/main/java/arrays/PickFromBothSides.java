package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class PickFromBothSides {
    public static void main(String[] args) {
        //Integer[] arr = {5, -2, 3 , 1, 2};
        Integer[] arr = {1,2};
        ArrayList<Integer> ar = new ArrayList<>();
        ar.addAll(Arrays.asList(arr));
        System.out.println(solve(ar,1));
    }
    public static int solve(ArrayList<Integer> A,int B){
        int max_sum=0;
        while(B>0){
            for(int i=A.size()-B;i<A.size();i++){
                 max_sum += A.get(i);
            };
            int left_counter=0;
            int rolling_sum =max_sum;
            int max_counter=B;
            while(left_counter < max_counter){
                int cntr = A.size() - B;
                rolling_sum = rolling_sum - A.get(cntr) + A.get(left_counter);
                left_counter++;
                if(rolling_sum > max_sum){
                    max_sum = rolling_sum;
                }
                B--;
            }

        }
        return max_sum;
    }
}
