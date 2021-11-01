package arrays;

import java.util.ArrayList;

public class AntsMovingOppositeDirection {
    public static void main(String[] args) {
        int A=4;
        ArrayList<Integer> B = new ArrayList<>();
        B.add(1);
     //   B.add(0);
        ArrayList<Integer> C = new ArrayList<>();
  //      C.add(2);
        System.out.println(antsMovingOppositeDirection(A,B,C));

    }

    public static int antsMovingOppositeDirection(int A, ArrayList<Integer>B,ArrayList<Integer>C){
        Integer min = Integer.MAX_VALUE;
        for(int i=0;i<B.size();i++){
            if(A - B.get(i) < min)
                min=A - B.get(i);
        }
        for(int i=0;i<C.size();i++){
            if(C.get(i) < min)
                min=C.get(i);
        }
        return A-min;
    }
}
