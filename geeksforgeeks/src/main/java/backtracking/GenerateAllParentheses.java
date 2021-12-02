package backtracking;

import java.util.ArrayList;

public class GenerateAllParentheses {
    public static void main(String[] args) {
        int A=3;
        ArrayList<String> out = new ArrayList<>();
        int l=0,r=0;
        String s="";
        generaeAllParentheses(s,out,A,l,r);
        System.out.println(out);
    }
    public static void
    generaeAllParentheses(String s, ArrayList<String> out,int A,int l,int r){
        if(l==r && l==A){
            out.add(s);
            return;
        }

        if (l<A)
            generaeAllParentheses(s+"(",out,A,l+1,r);
        if(r<l)
            generaeAllParentheses(s+")",out,A,l,r+1);
        }
    }

