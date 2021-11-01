package arrays;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        Integer[] arr = { 4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8 };
        int target=-3;
        List<Integer> list = Arrays.asList(arr);
        List<Integer> listOut = twoSum(list,target);
        for(Integer element : listOut){
            System.out.println("Index :" + element);
        }
    }
    public static ArrayList<Integer> twoSum(final List<Integer> A, int B){
      Map<Integer,Integer> hm = new HashMap<>();
      ArrayList<Integer> returnList = new ArrayList<>();
      int counter=0;
      for(Integer element : A) {
         if (hm.containsKey(B - element)){
             returnList.add(hm.get(B - element));
             returnList.add(++counter);
             break;
         }
         else
         {
             if (!(hm.containsKey(element))) {
                 hm.put(element, ++counter);
             } else
             {
                 ++counter;
             }
         }
      }
      return returnList;
    }
}
