package greedy;

public class MakeInitNumbsEqual {
    public static void main(String[] args) {
        int[] A ={-1, 3, 4, -3, 3, -1, 2};
        int[] B = new int[2*A.length-1];
        for(int i=0;i<A.length;i++){
            B[i]=A[i];
        }
        for(int i=0;i<A.length-1;i++){
            B[A.length+i]=A[i];
        }
        for(int i=0;i<B.length;i++){
            System.out.print(B[i] + " ");
        }
    }
}
