package backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class PalindromesOfAString {
    public static void main(String[] args) {
        String a ="aab";
        ArrayList<ArrayList<String>> out = new ArrayList<>();
        Stack<String> temp = new Stack<>();
        getPalindromes(a,out,temp,0);
        System.out.println(out);
    }
    public static boolean isPalindrom(String a,int l,int r){
        while(l<r){
            if(a.charAt(l)!=a.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
    public static void
        getPalindromes(String a,ArrayList<ArrayList<String>> out,Stack<String> temp,int idx){
        if(idx==a.length()){
            out.add(new ArrayList<>(temp));
        }
        for(int j=idx;j<a.length();++j){
            if(isPalindrom(a,idx,j)){
                temp.push(a.substring(idx,j+1));
                getPalindromes(a,out,temp,j+1);
                temp.pop();
            }
        }
    }
}
