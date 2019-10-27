package recursion;

public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println(digitalRoot(999999999));
    }
    static int digitalRoot(int n){
        if(n<10){
            return n;
        }
        n=digitalRoot(n/10) + n%10;
        if(n%9==0){
            return 9;
        }else {
            return n%9;
        }
    }
}
