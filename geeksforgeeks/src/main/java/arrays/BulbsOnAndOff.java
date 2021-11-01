package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class BulbsOnAndOff {
    public static void main(String[] args) {
        Integer[] arr = {0, 1, 0, 1};
        ArrayList<Integer> ar = new ArrayList<>();
        ar.addAll(Arrays.asList(arr));
        System.out.println(bulbsOnAndOff(ar));
    }
    public static int bulbsOnAndOff(ArrayList<Integer> A){
        int counter=0;
        for(int i=0;i<A.size();i++){
            if((A.get(i) == 0 && counter % 2 ==0) ||
                    (A.get(i) == 1 && counter % 2 ==1))
                counter++;

        }
        return counter;
    }
}
