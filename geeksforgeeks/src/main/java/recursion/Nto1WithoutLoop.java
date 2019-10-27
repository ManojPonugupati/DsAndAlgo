package recursion;

public class Nto1WithoutLoop {
    public static void main(String[] args) {
        printOutput(10);
    }
    public static void printOutput(int n){
        if(n < 2){
            System.out.println(n);
        }else{
            printOutput(n-1);
            System.out.println(n);
        }
    }
}
