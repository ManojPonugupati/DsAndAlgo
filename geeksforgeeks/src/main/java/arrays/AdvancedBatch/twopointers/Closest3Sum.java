package arrays.AdvancedBatch.twopointers;

import java.util.Arrays;

public class Closest3Sum {
    public static void main(String[] args) {
        //int[] A ={-1,2,1,-4};
        int[] A = {1,2,3};
        System.out.println(closest3Sum(A,6));
    }

    public static int closest3Sum(int[] A, int B){
        int closestSum=0;
        Arrays.sort(A);
        int nearestSum = Integer.MAX_VALUE;
        for (int i=0;i<A.length-2;i++)
        {
            int j=i+1;
            int k=A.length-1;
            int temp = B-A[i];
            int sum=0;

            while(j<k){
                sum = A[j] + A[k];

                if(nearestSum > Math.abs(temp - sum)) {
                    nearestSum = Math.abs(temp - sum);
                    closestSum = A[i] + A[j] + A[k];
                }
                 if(sum > temp){
                     k--;
                 } else if (sum < temp)
                 {
                     j++;
                 } else
                     break;

            }

            }
        return closestSum;
        }

}
