package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SlidingWindowMax {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        ArrayList<Integer> ar = new ArrayList<>();
        ar.addAll(Arrays.asList(arr));
        System.out.println(slidingWindowMax(ar,3));
    }

    public static ArrayList<Integer> slidingWindowMax(ArrayList<Integer>A,int B){
       int window_max = Integer.MIN_VALUE;
       ArrayList<Integer> ar = new ArrayList<>();
       for(int i=0;i<B;i++){
           if(window_max < A.get(i)){
               window_max=A.get(i);
           }
       }
       ar.add(window_max);
       for(int i=1;i<A.size()-2;i++){
           if(window_max < A.get(i+2)){
               window_max = A.get(i);
           }
       }
       return ar;
    }
}
