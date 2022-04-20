package arrays;

import java.util.Scanner;

public class RotationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        System.out.println("T is " + T);
        int[] A = new int[T];
        for(int i=0;i<T;i++){
            A[i]=sc.nextInt();
        }
        sc.nextLine();
        int B = Integer.valueOf(sc.nextLine());
        for(int i=T-B;i<T;i++){
            System.out.print(A[i] + " ");
        }
        for(int i=0;i<T-B;i++){
            System.out.print(A[i] + " ");
        }
    }
}
