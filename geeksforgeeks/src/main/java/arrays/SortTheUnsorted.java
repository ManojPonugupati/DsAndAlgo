package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortTheUnsorted {
    public static void main(String[] args) {
        //Integer[] arr = {0, 1, 15, 25, 6, 7, 30, 40, 50};
        Integer[] arr = {-146316343, 179840175, 760528516 };
        ArrayList<Integer> ar = new ArrayList<>();
        ar.addAll(Arrays.asList(arr));
        System.out.println(sortTheUnsorted(ar));
    }

    public static int sortTheUnsorted(ArrayList<Integer> A){
        ArrayList<Integer> list = new ArrayList<>(A);
        int start_index=0;
        int end_index=0;
        Collections.sort(list);
        for(int i=0;i<A.size();i++){
            if(A.get(i) != list.get(i)) {
                start_index = i;
                break;
            }
        }

        for (int i=A.size()-1;i>=0;i--){
            if(A.get(i) != list.get(i)) {
                end_index = i;
                break;
            }
        }
        if(start_index == end_index)
            return 0;
        return (end_index - start_index + 1);
    }
}
