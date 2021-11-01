package arrays.AdvancedBatch;

public class RotateBy90Degrees {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] out = solve(A);
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(out[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] solve(int[][] A){
        int temp=0;
        for(int i=0;i<A.length;i++){
            for(int j=i;j<A[0].length;j++){
                temp=A[i][j];
                A[i][j] = A[j][i];
                A[j][i]=temp;
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length/2;j++){
                temp=A[i][j];
                A[i][j] = A[i][A[0].length-j-1];
                A[i][A[0].length-j-1]=temp;
            }
        }
        return A;
    }
}
