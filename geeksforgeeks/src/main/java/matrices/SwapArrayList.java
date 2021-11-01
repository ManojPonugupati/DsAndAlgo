package matrices;

import java.util.ArrayList;

public class SwapArrayList {
    public void rotateBy90(ArrayList<ArrayList<Integer>> A) {
        int swap = 0;
        int element = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.size(); j++) {
                swap = A.get(i).get(j);
                element = A.get(j).get(i);
                A.get(i).set(j, element);
                A.get(j).set(i, swap);
            }
        }
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A.size() / 2; j++) {
                swap = A.get(i).get(j);
                element = A.get(i).get(A.size() - 1 - j);
                A.get(i).set(j, element);
                A.get(i).set(A.size() - 1 - j, swap);
            }
        }
    }
}
