package hashing;

import java.util.HashSet;

public class IsValidaSudoku {
    public static void main(String[] args) {
        String[] A = {"........4", ".9.7...9.", ".......6.", ".7.......", ".1.......", ".........", ".8.....1.", "3....2..6", ".......7."};
        System.out.println(isValidOrNot(A));
    }
    public static boolean isValidOrNot(String[] A){
       return isvalidRow(A) && isValidColumn(A)
               &&isValidBox(A);
    }

    public static boolean isvalidRow(String[] A){
        HashSet<Integer> st;
        for(int i=0;i<A.length;i++){
            st = new HashSet<>();
            for(int j=0;j<A.length;j++) {
                if (A[i].charAt(j) != '.') {
                    if (st.contains(Integer.valueOf(A[i].charAt(j)))) {
                        return false;
                    } else st.add(Integer.valueOf((A[i].charAt(j))));
                }
            }
        }
        return true;
    }
    public static boolean isValidColumn(String[] A){
        HashSet<Integer> st;
        for(int i=0;i<A.length;i++){
            st = new HashSet<>();
            for(int j=0;j<A.length;j++) {
                if (A[j].charAt(i) != '.') {
                    if (st.contains(Integer.valueOf(A[j].charAt(i)))) {
                        return false;
                    }else st.add(Integer.valueOf((A[j].charAt(i))));
                }
            }
        }
        return true;
    }
    public static boolean isValidBox(String[] A){
        for(int i=3;i<=9;i=i+3)
                if(!isValidBoxInWndow(A,i))
                    return false;
        return true;
    }
    public static boolean isValidBoxInWndow(String[] A, int end) {
        HashSet<Integer> st = new HashSet<>();
        for (int i = 0; i <9; i++) {
            if(i%3==0)
            st = new HashSet<>();
            for (int j = end - 1; j >= end - 3; j--) {
                if (A[i].charAt(j) != '.') {
                    if (st.contains(Integer.valueOf(A[i].charAt(j)))) {
                        return false;
                    }else st.add(Integer.valueOf((A[i].charAt(j))));
                }
            }
        }
        return true;
    }
}
