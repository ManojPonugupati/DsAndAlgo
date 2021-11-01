package simple;

import java.math.BigInteger;

public class PowerOfANum {
    public static void main(String[] args) {
        int  A= -1;
        int  B= -2147483648;
        int sign=(((A<0) && (B<0)) || ((A>0)&&(B>0)))? 1:-1;
        long a = Math.abs((long)A);
        long b = Math.abs((long)B);
        System.out.println(Math.abs((long)B));
        System.out.println("A is : " + A  + " B is : " + B +
                " a is : " + a + " b is : " + b);
        long temp=0;
                long quotient =0;
        for(int i=31;i>=0;--i){
           if(temp + (a<<i) <= b)
           {

               temp += a<<i;
               quotient |= (1L<<i);
               System.out.println("I value is " + i + " value is " + (a<<i) +
                       " temp value is : " + temp + " quotient is : " + quotient);
           }
        }
        System.out.println("B/A is : " + (int) B/A);
        int out;
        if (sign == -1)
            out  = (int) (-quotient);
         else out = (int) quotient;
        System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
    }
}
