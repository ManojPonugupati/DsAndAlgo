package recursion;

public class TestRecursion {
    public static void main(String[] args) {
      func(5);
    }
    static void func(int n){
        if(n<1){
            System.out.println("BaseCondition");
        }else {
            System.out.println("Manoj" + n);
            func(n-1);
            System.out.println("Kumar" + n);
        }
    }

}
