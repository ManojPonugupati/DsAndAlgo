package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
       // Integer[] arr = {10,9,8,7,6,5,4,3,2,1};
        Integer[] arr ={18468, 6335, 26501, 19170, 15725, 11479, 29359, 26963, 24465, 5706, 28146, 23282, 16828, 9962, 492, 2996, 11943, 4828, 5437, 32392, 14605, 3903, 154, 293, 12383, 17422, 18717, 19719, 19896, 5448, 21727, 14772, 11539, 1870, 19913, 25668, 26300, 17036, 9895, 28704, 23812, 31323, 30334, 17674, 4665, 15142, 7712, 28254, 6869, 25548, 27645, 32663, 32758, 20038, 12860, 8724, 9742, 27530, 779, 12317, 3036};
        ArrayList<Integer> ar = new ArrayList<>();
        ar.addAll(Arrays.asList(arr));
        System.out.println(solve(ar));
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A){
        ArrayList<Integer> out_list = new ArrayList<>();
        int prev_min_index=0;
        for(int i=0;i<A.size();i++){
            int swap_temp=0;
            int min_val=A.get(i);
            int min_index = i;
            for(int j=i+1;j<A.size();j++){
                if(min_val > A.get(j)){
                    min_val = A.get(j);
                    min_index =j;
                }
            }
            if(i<A.size()-1) {
                swap_temp = A.get(min_index);
                out_list.add(min_index);
                A.set(min_index, A.get(i));
                A.set(i, swap_temp);
            }

        }
        return out_list;
    }
}
