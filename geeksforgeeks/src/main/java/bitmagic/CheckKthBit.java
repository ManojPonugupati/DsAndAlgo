package bitmagic;

public class CheckKthBit {
    public static void main(String[] args) {
        checkKthBit(15,2);
    }
    public static void checkKthBit(int n,int k){
        if((n & (1<<k)) != 0)
            System.out.println("Yes");
        else
            System.out.printf("No");

    }
}
