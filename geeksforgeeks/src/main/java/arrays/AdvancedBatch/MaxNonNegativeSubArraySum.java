package arrays.AdvancedBatch;

public class MaxNonNegativeSubArraySum {
    public static void main(String[] args) {
        int[] A = {1967513926, 1540383426, -1303455736, -521595368 };
        int[] out = maxSet(A);
        for(int i=0;i<out.length;i++)
            System.out.print(out[i] + " ");
    }
    public static int[] maxSet(int[] A){
        long max_sum_so_far=Integer.MIN_VALUE;
        long max_sum_ending_here=0;
        int start_index=0;
        int end_index =0;
        int max_index_so_far=0;
        int max_start_index=0;
        boolean start_index_initted=true;
        for(int i=0;i<A.length;i++) {
            if (A[i] >= 0) {
                max_sum_ending_here += A[i];
                if (start_index_initted) {
                    start_index = i;
                }
                end_index++;
                start_index_initted = false;

            } else {
                if (max_sum_so_far < max_sum_ending_here) {
                    max_sum_so_far = max_sum_ending_here;
                    max_start_index = start_index;
                    max_index_so_far = start_index + end_index;
                    start_index = 0;
                    end_index = 0;
                    max_sum_ending_here = 0;
                    start_index_initted = true;
                } else if (max_sum_so_far == max_sum_ending_here && (max_index_so_far - max_start_index)
                        < end_index ) {
                    max_index_so_far = start_index + end_index;
                    max_start_index = start_index;
                    max_sum_ending_here = 0;
                    start_index = 0;
                    end_index = 0;
                    start_index_initted = true;
                }
            }
        }
            if(max_sum_so_far < max_sum_ending_here){
                max_sum_so_far = max_sum_ending_here;
                max_start_index=start_index;
                max_index_so_far = start_index+end_index;
                start_index=0; end_index=0;max_sum_ending_here=0;
                start_index_initted=true;
            }

            else if(max_sum_so_far == max_sum_ending_here && (max_index_so_far - max_start_index)
                    < end_index)
            {
                max_index_so_far=start_index+end_index;
                max_start_index=start_index;
                max_sum_ending_here=0;
                start_index=0;
                end_index=0;
                start_index_initted=true;
            }
        int[] out = new int[max_index_so_far-max_start_index];
        for(int i=max_start_index,j=0;i<max_index_so_far;i++,j++){
            out[j] =A[i];
        }
        return out;
    }
}
