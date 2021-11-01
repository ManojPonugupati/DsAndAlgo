package contest;

import javafx.scene.effect.Blend;

public class ReplaceNumbers {
    public static void main(String[] args) {
        int[] A ={2,2,5,1};
        int[][] B = {{2,4},{5,2},{2,4}};
        System.out.println(B.length + " " + B[0].length);
        for(int i=0;i< B.length;i++){
            for(int j=0;j<A.length;j++){
                if(A[j] == B[i][0])
                    A[j] = B[i][1];
            }
        }
        for(int i=0;i<A.length;i++){
            System.out.print(A[i] + " ");
        }
        System.out.println("Manoj");
        System.out.println(Math.floor(3/2));
    }
}
