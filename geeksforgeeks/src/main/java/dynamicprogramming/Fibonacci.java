package dynamicprogramming;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ar = new int[num];
        for(int i=0;i<ar.length;i++)
            ar[i]=-1;
        System.out.println(getNthFibNumber(num-1,ar));
    }
    public static int getNthFibNumber(int num,int[] ar){
        if(num <2) return num;
        if(ar[num] != -1) return ar[num];
        ar[num] = getNthFibNumber(num-1,ar) + getNthFibNumber(num-2,ar);
        return ar[num];
    }
}
