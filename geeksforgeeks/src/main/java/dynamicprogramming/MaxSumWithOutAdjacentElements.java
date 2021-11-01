package dynamicprogramming;

public class MaxSumWithOutAdjacentElements {
    public static void main(String[] args) {
        int[][] A = {{16, 5, 54, 55, 36, 82, 61, 77, 66, 61},
                     {31, 30, 36, 70, 9, 37, 1, 11, 68, 14}};
        for(int i=0;i<A[0].length;i++){
            A[0][i]=Math.max(A[0][i],A[1][i]);
        }
        int incl = A[0][0];
        int excl = 0;
        int excl_new;

        //incl = excl + A[0][i]
        //excl = max(incl,excl);
        for(int i=0;i<A[0].length;i++)
            System.out.print(A[0][i] + " ");
        System.out.println();
        for(int i=1;i<A[0].length;i++){
            excl_new = (incl > excl) ? incl : excl;
            incl = excl + A[0][i];
            excl = excl_new;
         }
        System.out.println();
        System.out.println("Max sum is " + ((incl > excl) ? incl : excl));
    }
}
