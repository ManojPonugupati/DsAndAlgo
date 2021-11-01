package arrays.mock;

public class SmallestSubArrayWithMaxAndMin {
    public static void main(String[] args) {
        int[] A = {2,2,2};
        int max =Integer.MIN_VALUE;
        int max_index =-1;
        int min_index =-1;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++)
        {
            if(max < A[i]){
                max=A[i];
            }
            if(min > A[i]){
                min = A[i];
            }

        }
        System.out.println("max , min are : " + max + " : " + min);
        int min_diff=Integer.MAX_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i] == max)
                max_index=i;
            if(A[i] == min)
                min_index=i;
            if(min_index != -1 && max_index != -1)
                if(min_diff > Math.abs(max_index - min_index))
                    min_diff = Math.abs(max_index - min_index);
        }
        System.out.println("indexes  : " + max_index +  " " + min_index);
        System.out.println(min_diff + 1 );
    }
}
