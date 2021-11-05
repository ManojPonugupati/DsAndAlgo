package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class OddEvenSubSequence {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        Integer[] arr = { 12, 10, 28, 37, 43, 40, 14, 12, 48};
        ar.addAll(Arrays.asList(arr));
        System.out.println(solve(ar));
    }
    public static int solve(ArrayList<Integer> A){
        Boolean first_element = true;
        Boolean expecting_even =false;
        int counter_var =0;
        for(Integer elem : A) {
            System.out.print(elem + " ");
        }
        System.out.println();
        for(Integer element:A){
            if(first_element){
                if(element % 2 == 1)
                {
                    expecting_even=true;
                    ++counter_var;
                } else {
                    expecting_even=false;
                    ++counter_var;
                }
            }
            if(expecting_even && (!first_element)){
                if(element %2 == 0) {
                    ++counter_var;
                    expecting_even = false;
                }
            } else
                if(element %2 == 1 && (!first_element)){
                    ++counter_var;
                    expecting_even=true;
                }
                first_element=false;
        }
      return counter_var;
    }
}
