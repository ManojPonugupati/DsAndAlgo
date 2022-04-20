package arrays;

public class TwoDimensionalSortedMatrix {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int B= 2;
        boolean found=false;
        int i=0,j=A[0].length-1;
        int out=0;
        while(i<A.length && j >= 0 && !found){
            if(A[i][j]==B){
                out=1009*(i+1)+j;
                found=true;
            } else if(A[i][j] < B){
                i++;
            } else j--;
        }
        System.out.println(out);
    }
}
