package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxDifference {
    public static void main(String[] args) {
        Integer[] ar = {70, 21, 7, 64, 44, 79, 50, 89, 68, 23, 20, 50, 65, 64, 48, 3, 46, 87};
        ArrayList<Integer> A = new ArrayList<>();
        A.addAll(Arrays.asList(ar));
        System.out.println(maxDifference(A,16));
    }
    public static int maxDifference(ArrayList<Integer> A,int B  ){
        System.out.println(A);
        Collections.sort(A);
        System.out.println(A);
        int s1 = 0;
        int s2 = 0;
        int total_sum=0;
        for(int i=0;i<B;i++){
            s1 += A.get(i);
        }
        for(int i=0;i<A.size();i++)
            total_sum += A.get(i);
        s2 =total_sum - s1;
        System.out.println("total sum is : " + total_sum + " s1 is : " + s1  + " s2 is : " + s2);
        return Math.abs(s1-s2);
    }
}
