package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PairsWithGivenXOR {
    public static void main(String[] args) {
        Integer[] ar= {3,6,8,10,15,50};
        int b=5;
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(ar));
        System.out.println(solve(list,b));

     }
     public static int solve(ArrayList<Integer> A,int B){
         HashMap<Integer,Integer> hm = new HashMap<>();
         for(int i=0;i<A.size();i++){
             hm.put(A.get(i)^B,1);
         }
         int counter=0;
         for(int i=0;i<A.size();i++){
             if(hm.containsKey(A.get(i))){
                 counter++;
             }
         }
       return counter/2;
     }
}
