package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class KthSmallestNumber {
    public static void main(String[] args) {
        Integer[] arr = {10, 7, 8, 9, 1, 5 };
        ArrayList<Integer> ar = new ArrayList<>();
        ar.addAll(Arrays.asList(arr));
        System.out.println(kthSmalestElement(arr,0,arr.length-1,1));
        System.out.println("After");
    }

    public static int kthSmalestElement(Integer[] A,int l,int h,int K){
        if(K < 0 || K > A.length){
            return -10;
        }
        if(l<h){
            int position = partion(A,l,h);
            if(position == K-1)
            {
                    return  A[position];
            }
            System.out.println();
            System.out.println("position is : " + position + " calling params " + " l is : " + l + " Position -1 is: "
                           + (position-1) + " Position +1 is :  " + (position + 1) );
            if(position > K-1)
             return kthSmalestElement(A,l,position-1,K);
             return kthSmalestElement(A,position+1,h, K);
        }
         if(K==A.length){
             return A[K-1];
         }
         if(K==1){
             return A[0];
         }
        return -1;
    }

    public static int partion(Integer[] A, int l,int h){
        int i=l;int r=h;
        System.out.println("params received : " + " l is : " + l + " h is : " + h  + " A[r] is : " + A[r]);
        for(int k=0;k<A.length;k++) {
            System.out.print(A[k] + " ");
        }
        System.out.println("Array is the one ");
        int pivot = A[r];
        int swap_temp=0;
        for(int j=l;j<=r-1;j++){
            if(A[j] <= pivot ){
                swap_temp = A[j];
                A[j] = A[i];
                A[i] = swap_temp;
                i++;
            }
        }
        swap_temp =A[i];
        A[i]= A[r];
        A[r] = swap_temp;
        for(int k=0;k<A.length;k++) {
            System.out.print(A[k] + " ");
        }
        System.out.println();
        System.out.println("params sending back : " + i);
        return i;

    }
}

// i=0;j=0;
//7, 10, 4, 3, 20, 15
//i=1;j=1;
//7,10,4,3,20,15
//7,10,4,3,15,20
//3,4.7,10,15,20

