package bitmagic;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerofTwo( 1024));
    }
    public static boolean isPowerofTwo(long n){
        if((n & (n-1)) == 0){
          return true;
        }
        else {
            return false;
        }
    }
}
