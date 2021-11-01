package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinDiffPuzzles {
    public static void main(String[] args) {
        //Integer[] arr = {10, 12, 10, 7, 5, 22};
        Integer[] arr = {66, 23, 687, 252, 187, 114, 789, 527, 129, 474, 679, 119, 687, 92, 578, 332, 781, 499, 597, 370, 848, 248, 496, 641, 714, 572, 399, 187, 910, 638, 100, 975, 660, 786, 227, 198, 252, 367, 725};

        //{5,7,10,10,12,22}
        int B=29;
        ArrayList<Integer> ar = new ArrayList<>();
        ar.addAll(Arrays.asList(arr));
        System.out.println(minDiffPuzzles(ar,B));
    }

    public static int minDiffPuzzles(ArrayList<Integer> A,int B){
        System.out.println(A);
         Collections.sort(A);
        System.out.println(A);
         int min = Integer.MAX_VALUE;
         for(int i=0;i<A.size()-B +1;i++){
             if((A.get(B -1 + i) - A.get(i) ) < min){
                 System.out.println(min);
                 min = A.get(i+B-1) - A.get(i);
             }
         }
         return min;
    }
}
