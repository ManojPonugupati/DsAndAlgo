package bitmagic;

public class CheckKthBit {
    public static void main(String[] args) {

        checkKthBit(15,2);
        System.out.println(totalSetBits(628832382));
        System.out.println(numSetBits(35));
    }

    public static void checkKthBit(int n,int k){
        if((n & (1<<k)) != 0)
            System.out.println("Yes");
        else
            System.out.printf("No");
    }
    private static int totalSetBits(int A){
        int cnt=0;
        for(int i=0;i<32;i++){
            if((A & (1<<i)) !=0)
                cnt++;
        }
        return cnt;
    }
    private static int numSetBits(int A){
        int cnt=0;
        while (A > 0) {
            A=A&(A-1);
            System.out.println(A);
            cnt++;
        }
        return cnt;
    }

}
