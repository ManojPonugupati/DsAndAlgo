package greedy;

import java.util.Arrays;
import java.util.Comparator;

/*There are N jobs to be done but you can do only one job at a time.

Given an array A denoting the start time of the jobs

and an array B denoting the finish time of the jobs.

Your aim is to select jobs in such a way

so that you can finish maximum number of jobs.

Return the maximum number of jobs you can finish.*/
public class MaxNumberOfJobs {
    static class Pair {
        int startTime;
        int finishTime;
        public Pair (int startTime, int finishTime){
            this.startTime=startTime;
            this.finishTime = finishTime;
        }
    }

    public static void main(String[] args) {
     int[] A = {3, 13, 7, 7, 10, 3};
     int[] B = {6, 15, 9, 8, 16, 11};
     Pair[] p = new Pair[A.length];
     for(int i=0;i<A.length;i++){
         p[i]= new Pair(A[i],B[i]);
     }
     Comparator<Pair> comp = Comparator.comparing(a->a.finishTime);
     Arrays.sort(p,comp);
     for(int i=0;i<p.length;i++){
         System.out.println("sorted : " + p[i].startTime + " " + p[i].finishTime);
     }
     int out=1;
     int cnt=0;
     for(int i=1;i<p.length;i++){
         if(p[cnt].finishTime <=p[i].startTime){
             cnt=i;
             out++;
         }
     }
        System.out.println(out);
    }
}
