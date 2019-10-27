package bitmagic;

public class CheckSparse {
    public static void main(String[] args) {
        System.out.println(isSparse(3));
    }
    public static boolean isSparse(int n){
        if(n==0){
            return false;
        }
        if((n & (n>>1)) != 0){
            return false;
        }
        else {
            return true;
        }
    }
}
