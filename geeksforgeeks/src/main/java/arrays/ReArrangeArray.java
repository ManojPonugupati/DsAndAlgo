package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReArrangeArray  {

    public static void main(String[] args) {
        Integer[] A = {1,3,0,2};
        ArrayList<Integer> ar = new ArrayList<>();
        ar.addAll(Arrays.asList(A));
        System.out.println(reArrangeArray(ar));
        int n=A.length;
        for(int i=0;i<n;i++){
            A[i]=A[i]+(A[A[i]]%n)*n;
        }
        for(int i=0;i<n;i++)
            A[i]=A[i]/n;
        for(int i=0;i<n;i++){
            System.out.print(A[i] + " ");
        }


    }
    public static ArrayList<Integer> reArrangeArray(ArrayList<Integer> A){
        int sum =0;
        int n=A.size();
        for(int i=0;i<A.size();i++){
            sum = A.get(i) + (A.get(A.get(i))%n)*4;
            A.set(i,sum);
        }
        for(int i=0;i<A.size();i++){
            A.set(i,A.get(i)/n);
        }
     return A;
 }
 }
