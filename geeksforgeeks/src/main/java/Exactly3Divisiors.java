public class Exactly3Divisiors {
    public static void main(String[] args) {
        System.out.println(exactly3Divisors(25));
    }
    public static int exactly3Divisors(int N)
    {
        //Your code here
        if(N <=3){
            return 0;
        }
        int finalCount = 0;
        for(int i=2;i*i <=N;i++){
            if(isPrimeOrNot(i)){
                finalCount++;
            }
        }
        return finalCount + 1;
    }
    public static boolean isPrimeOrNot(int N){
        int test =0;
        for(int i=2;i <= N/2 + 1; i++){
            if(N%i == 0){
                return false;
            }
            test=i;
        }
        if(test > N/2){
            return true;
        } else {
            return false;
        }
    }
}

