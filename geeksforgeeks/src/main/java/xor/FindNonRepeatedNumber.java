package xor;

import java.util.Arrays;
import java.util.List;

public class FindNonRepeatedNumber {
    public static void main(String[] args) {
        Integer[] arr = {1,1,2,2,3,3,0,4,4,5,5,6,6};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(singleValue(list));
    }
    public static int singleValue(List<Integer> A){
        int result = 0;
        for(Integer element : A){
            result = result ^ element;
        }
        return result;
    }
}
