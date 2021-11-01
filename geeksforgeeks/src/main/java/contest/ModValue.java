package contest;

public class ModValue {
    public static void main(String[] args) {
        int[] A = {3,4,5};
        int B=47;
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum = sum+A[i];
        }
        System.out.println(sum);
        int square_sum=0;
        for(int i=0;i<A.length;i++){
            square_sum = square_sum + (A[i] *A[i]);
        }
        if(B==((sum*sum) - square_sum)/2){
            System.out.println("Matching");
        }
    }
}
