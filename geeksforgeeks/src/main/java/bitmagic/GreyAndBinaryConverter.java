package bitmagic;

public class GreyAndBinaryConverter {
    public static void main(String[] args) {
        System.out.println(greyConverter(10));
        System.out.println(greyToBinaryConverter(15));
    }
    public static int greyConverter(int n){
        return n ^(n>>1);
    }
    public static int greyToBinaryConverter(int n){
        int x=n;
        while(x>0){
            n=n^(x>>1);
            x=x>>1;
        }
        return n;
    }
}

