package hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ColorfulOrNot {
    public static void main(String[] args) {
        int A = 236;
        ArrayList<Integer> ar = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        while(A>0){
            int e = A%10;
            A=A/10;
            ar.add(e);
            hs.add(e);
        }
        Collections.reverse(ar);
        for(int i=0;i<ar.size();i++){
            for(int j=i+1;j<ar.size();j++){
                if(hs.contains(ar.get(i)*ar.get(j)))
                    System.out.println("Not colorful");
            }
        }
        System.out.println("Colorful");
    }
}
