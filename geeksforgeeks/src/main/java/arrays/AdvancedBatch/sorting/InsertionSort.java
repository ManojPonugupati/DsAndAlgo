package arrays.AdvancedBatch.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] A= {5,1,27,15,4};
        int temp=0;
        for(int i=0;i<A.length;i++)
        System.out.print(A[i] + " ");
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i] > A[j]){
                   temp=A[i];
                   A[i] = A[j];
                   A[j] = temp;
                }
            }
        }
        System.out.println("After");
        for(int i=0;i<A.length;i++)
            System.out.print(A[i] + " ");
    }
}
