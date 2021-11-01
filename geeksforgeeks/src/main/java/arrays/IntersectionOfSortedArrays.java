package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfSortedArrays {
    public static void main(String[] args) {
        Integer[] A = {1, 2, 3, 3, 4, 5 ,6};
        Integer[] B = {3,3,5};
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        ar.addAll(Arrays.asList(A));
        arr.addAll(Arrays.asList(B));
        System.out.println(intersect(ar,arr));
    }
    public static ArrayList<Integer> intersect(List<Integer> A, List<Integer>B){
           int i=0;
           int j=0;
           ArrayList<Integer> out = new ArrayList<>();
           while(j<B.size() && i<A.size()){
               if(A.get(i).equals(B.get(j))){
                   out.add(A.get(i));
                   i++;
                   j++;
               }else if(A.get(i) < B.get(j))
                   i++;
               else if(A.get(i) > B.get(j))
                   j++;
           }
           return out;
    }
}
