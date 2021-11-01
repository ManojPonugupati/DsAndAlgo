package arrays;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        Integer[] arr1 ={1, 2, 2, 1};
        Integer[] arr2 = {2, 3, 1, 2};
        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
        ar1.addAll(Arrays.asList(arr1));
        ar2.addAll(Arrays.asList(arr2));
        List<Integer> outList = solve(ar1,ar2);
        for(Integer element:outList){
            System.out.print(element + " ");
        }
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A,ArrayList<Integer> B)
    {
        ArrayList<Integer> out_ar = new ArrayList<>();
        Map<Integer,Integer> hm = new HashMap<>();
        int counter=0;
        for(Integer element:A)
        {
            if(hm.containsKey(element))
            {
                counter=hm.get(element);
                hm.put(element,++counter);
            } else {
                hm.put(element,1);
            }
        }
        for(Integer element:B){
            if(hm.containsKey(element)){
                counter = hm.get(element);
                if (counter > 0)
                    out_ar.add(element);
                hm.put(element,--counter);
            }
        }
        return out_ar;

    }
}
