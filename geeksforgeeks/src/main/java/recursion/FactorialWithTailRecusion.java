package recursion;

public class FactorialWithTailRecusion {
    public static void main(String[] args) {
        System.out.println(fact(5,1));
    }
    public static int fact(int num,int val){
        if(num==0){
            return val;
        }
        return fact(num-1,num*val);
    }
}
