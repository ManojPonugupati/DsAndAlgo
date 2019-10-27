package arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        leaders(arr,6);
    }
    static void leaders(int[] arr,int n){
        int tmp = Integer.MIN_VALUE;
        ArrayList<Integer> ar = new ArrayList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for(int i=n-1; i>=0; i--){
            if(arr[i] >= tmp){
                ll.addFirst(arr[i]);
                tmp=arr[i];
            }
        }

        ar.addAll(ll);
        for(Integer i:ar){
            System.out.printf(i + " ");
        }
    }
}
