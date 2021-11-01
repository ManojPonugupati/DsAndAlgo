package arrays;

public class SquareGranites {
    public static void main(String[] args) {
        int A=278;int B=689;int C=74;
        int d = 0;

        if(A<C && B <C){
            System.out.println("before 1");
            d=1;}
         else if (A<C) {
            System.out.println("Before 2");
            d = (int) (Math.ceil(((double) B) / C));
        }
         else if (B<C) {
            System.out.println("before 3");
            d = (int) (Math.ceil(((double) A) / C));
        }
         else {
            System.out.println("Before 4");
            d = (int) ((Math.ceil(((double) A) / C) * Math.ceil(((double) B) / C)));
        }
            System.out.println(d);
    }
}
