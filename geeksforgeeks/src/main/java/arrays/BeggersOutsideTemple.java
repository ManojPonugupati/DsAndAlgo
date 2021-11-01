package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class BeggersOutsideTemple {
    public static void main(String[] args) {
        Integer[] ar1 ={1, 3, 10};
        Integer[] ar2 = {6, 9, 2};
        Integer[] ar3 = {3, 5, 3};
        Integer[] ar4 = {2, 8, 4};
        Integer[] ar5 = {6, 7, 5};
        ArrayList<Integer> in1 = new ArrayList<>();
        ArrayList<Integer> in2 = new ArrayList<>();
        ArrayList<Integer> in3 = new ArrayList<>();
        ArrayList<Integer> in4 = new ArrayList<>();
        ArrayList<Integer> in5 = new ArrayList<>();
        in1.addAll(Arrays.asList(ar1));
        in2.addAll(Arrays.asList(ar2));
        in3.addAll(Arrays.asList(ar3));
        in4.addAll(Arrays.asList(ar4));
        in5.addAll(Arrays.asList(ar5));
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(in1);
        outer.add(in2);
        outer.add(in3);
        outer.add(in4);
        outer.add(in5);
        System.out.println(solve(outer,10));
    }

    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> B, int A){
         ArrayList<Integer> ar = new ArrayList<>();
         for(int i=0;i<A;i++){
             ar.add(0);
         }
         int start_intdex=0;
         int end_index=0;
         int amount=0;
         for(ArrayList<Integer> list: B){
            start_intdex=list.get(0)-1;
            end_index=list.get(1);
            amount=list.get(2);
            ar.set(start_intdex, ar.get(start_intdex) + amount);
            if(end_index <= A){
                ar.set(end_index,ar.get(end_index) + (-1*Math.abs(amount)));
            }

         }

         int rolling_sum =0;
         for(int i=0;i<A;i++) {
             rolling_sum += ar.get(i);
             ar.set(i,rolling_sum);
         }
         return ar;

    }
}
