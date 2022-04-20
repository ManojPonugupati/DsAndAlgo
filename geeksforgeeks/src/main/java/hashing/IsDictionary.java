package hashing;

import java.util.HashMap;

public class IsDictionary {
    public static void main(String[] args) {
        String[] A = {"hello", "scaler", "interviewbit"};
        String B = "adhbcfegskjlponmirqtxwuvzy";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<B.length();i++){
            hm.put(B.charAt(i),i);
        }
        for(int i=0;i<A.length-1;i++){
            boolean check =true;
            int j=0;
            while(j<A[i].length() && j < A[i+1].length()){
                if(hm.get(A[i].charAt(j)) > hm.get(A[i+1].charAt(j))) {
                    System.out.println(0 + "hi " + hm.get(A[i].charAt(j)) +
                           "Hey " + hm.get(A[i+1].charAt(j)));
                    break;
                }
                else if(hm.get(A[i].charAt(j)) == hm.get(A[i+1].charAt(j))){
                    if(j == A[i+1].length()-1 && j < A[i].length()-1) {
                        System.out.println(0);
                        break;
                    }
                } else break;
                ++j;
            }
        }
        System.out.println(1);
    }
}
