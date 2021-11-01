package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SortByColor {

    public static void main(String[] args) {
        Integer [] arr = {0, 1, 2, 0, 1, 2};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listOut = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
         listOut=sortColor(list);
        System.out.println(listOut);
    }

    public static ArrayList<Integer> sortColor(ArrayList<Integer> A){
        int zeros_counter=0;
        int ones_counter=0;
        int twos_couner=0;
        ArrayList<Integer> ar = new ArrayList<>();
        for(Integer element : A){
            if(element ==0 ){
                zeros_counter++;
            } else if(element == 1)
            {
                ones_counter++;
            }else {
                twos_couner++;
            }
        }
        for(int i=0;i<zeros_counter;i++)
            ar.add(0);
        for(int i=0;i<ones_counter;i++)
            ar.add(1);
        for(int i=0;i<twos_couner;i++)
            ar.add(2);
        return ar;

    }
}
