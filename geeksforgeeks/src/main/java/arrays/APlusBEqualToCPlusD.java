package arrays;

import java.util.*;

public class APlusBEqualToCPlusD {
    public static void main(String[] args) {
        //Integer[] arr = {3, 4, 7, 1, 2, 9, 8};
        //Integer[] arr = {9, 5, 4, 9, 3, 6, 8, 7, 1, 2, 8, 7, 2, 9, 7, 1, 3, 9, 7, 8, 1, 0, 5, 5};
        //Integer[] arr = { 1, 3, 3, 3, 3, 2, 2 };
        Integer[] arr = {0, 0, 1, 0, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));
        System.out.println(solve(list));
    }
    public static ArrayList<Integer> solve(ArrayList<Integer> A){
        int summation =Integer.MIN_VALUE;
        ArrayList<Integer> complist = new ArrayList<>();
        ArrayList<Integer> outlist = new ArrayList<>();
        HashMap<Integer,DualElem> hm = new HashMap<>();
        for(Integer i=0;i<A.size();i=i+1){
            for (Integer j=i+1;j<A.size();j++)
            {
                summation = A.get(i) + A.get(j);
            if(hm.containsKey(summation)){
                    DualElem mapping = hm.get(summation);
                    if(mapping.first_index < mapping.next_index
                            && mapping.first_index < i
                            && mapping.next_index != i
                            && mapping.next_index != j && i<j ) {
                        complist.add(mapping.first_index);
                        complist.add(mapping.next_index);
                        complist.add(i);
                        complist.add(j);
          //              return complist;
                    }
                }else
                {
                    hm.put(summation,new DualElem(i,j));
                }
            }
        }
        //return complist;
        boolean init =true;
        for(int i=0;i<complist.size();i=i+4){
            if(init){
                outlist.add(complist.get(i));
                outlist.add(complist.get(i+1));
                outlist.add(complist.get(i+2));
                outlist.add(complist.get(i+3));
                init =false;
            } else if(  outlist.get(0) > complist.get(i)
                || (outlist.get(0) == complist.get(i) && outlist.get(1) > complist.get(i + 1))
                || (outlist.get(0) == complist.get(i) && outlist.get(1) == complist.get(i + 1)
                       && outlist.get(2) > complist.get(i+2))
                || (outlist.get(0) == complist.get(i) && outlist.get(1) == complist.get(i + 1)
                    && outlist.get(2) == complist.get(i+2) && outlist.get(3) > complist.get(i+3))){
                outlist.set(0,complist.get(i));
                outlist.set(1,complist.get(i+1));
                outlist.set(2,complist.get(i+2));
                outlist.set(3,complist.get(i+3));
            }

        }
        return outlist;
    }
}

class DualElem {
    Integer first_index;
    Integer next_index;

    public DualElem(Integer first_index, Integer next_index) {
        this.first_index = first_index;
        this.next_index = next_index;
    }
}



