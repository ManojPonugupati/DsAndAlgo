package arrays;

public class CircleOfMonsters {
    public static void main(String[] args) {
        int[] A = {7,2,5};
        int[] B = {15,14,3};
        System.out.println(solve(A,B));
    }
    public static int solve(int[] A,int[] B){
        int sizeOfA=A.length;
       long totalNumberOfBulletsNeeded = max(0,A[0]-B[sizeOfA-1]);
     for(int i=1;i<sizeOfA;i++)
     {
         totalNumberOfBulletsNeeded+=max(0,A[i]-B[i-1]);
     }
     long min=totalNumberOfBulletsNeeded-max(0,A[0]-B[sizeOfA-1]) + A[0];
     for(int i=1;i<sizeOfA;i++){
         if(min > (totalNumberOfBulletsNeeded-max(0,A[i]-B[i-1]) + A[i])){
             min= totalNumberOfBulletsNeeded-max(0,A[i]-B[i-1]) + A[i];
         }
     }

        return (int) min%1000000007;
    }
    public static int max(int A,int B){
       return A>B ? A : B;
    }
}

