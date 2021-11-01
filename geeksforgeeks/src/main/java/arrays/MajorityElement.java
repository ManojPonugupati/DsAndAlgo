package arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] A){
        int cme=0;
        int cmeCount=0;
        for(int i=0;i<A.length;i++){
            if(cmeCount == 0) {
                cme = A[i];
                cmeCount++;
            } else  if(cme == A[i])

            {
               cmeCount++;
            } else
            {
                cmeCount--;
            }
        }
        int meCount=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==cme){
                meCount++;
            }
        }
        if(meCount > A.length/2)
            return  cme;
        return -1;
    }
}
