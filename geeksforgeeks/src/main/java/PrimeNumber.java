public class PrimeNumber {
    public static void main(String[] args) {
        int N=766;
        int test=0;
        if(N == 1)
        {
            System.out.println("No");
        }
        if(N==2 || N == 3){
            System.out.println("Yes");
        }

        for(int i=2;i <= N/2 + 1; i++){
            if(N%i == 0){
                System.out.println("yes");
            }
            test=i;
        }
        if(test > N/2){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
