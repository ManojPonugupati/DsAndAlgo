package searching;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,2,3,2,2,3,3,3,3,3,3,3,4,4,5,6,7,8,10,2,2,2,2,2,2,2,2};
        System.out.println(majority(arr));
    }
    static int majority(int[] arr){
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int key=0;
        int value=0;
        for(int i=0;i<arr.length;i++){
            key = arr[i];
            if(hm.containsKey(key)){
                value =hm.get(key) + 1;
                hm.put(key,value);
            }else {
                hm.put(key,1);
            }
        }
        int max_count = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max_count < hm.get(arr[i])){
                max_count = hm.get(arr[i]);
            }
        }
        return max_count;
    }
}
