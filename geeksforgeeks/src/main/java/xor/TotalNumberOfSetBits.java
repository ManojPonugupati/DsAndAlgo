package xor;

public class TotalNumberOfSetBits {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(numSetBits(number));
        int n=64;
        for(int i=n; i>-1;i /=2){
            System.out.println(i);
        }
    }
    public static int numSetBits(int A){
        int counter=0;
        while(A > 0 )
        {
            A = A&(A-1);
            counter++;
        }
        return counter;
    }
}
