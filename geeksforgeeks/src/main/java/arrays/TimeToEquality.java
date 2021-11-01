package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TimeToEquality {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Integer[] arr = {1,2,3,4,5,6,7,8};
        ar.addAll(Arrays.asList(arr));
        System.out.println(solve(ar));
    }

    public static int solve(ArrayList<Integer> A){
         int max = findMax(A);
         int timeToEquality = 0;
         for(Integer element : A)
         {
             timeToEquality += max -element;
         }

         return timeToEquality;
    }

    public static int findMax(ArrayList<Integer> A){
        int max = Integer.MIN_VALUE;
        for(Integer element : A){
            if(max < element){
                max=element;
            }
        }
        return max;
    }
}

