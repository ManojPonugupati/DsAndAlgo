package hashing;

import java.util.Arrays;

public class PermutationsOfAinB {
    public static void main(String[] args) {
        String A = "ppecqae";
        String B = "oqpoqdcaeocccaqbodccepqcqpapeqcqadqepoecpqeaedacepqpec";
        int[] a = new int[26];
        int[] b = new int[26];
        Arrays.fill(a,0);
        Arrays.fill(b,0);
        int count=0,out_cnt=0;
        for(int i=0;i<A.length();i++){
            a[A.charAt(i)-'a']+=1;
            b[B.charAt(i)-'a']+=1;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<=b[i] || a[i]==0)
                ++count;
        }
        System.out.println("count : " + count);
        if(count==26) {
            ++out_cnt;
        }
        System.out.println("count is :  " + count);
        for(int i=A.length();i<B.length();i++){
            System.out.println("Char is " + B.charAt(i-A.length()) + " index : " + (i-A.length())  + " count is : " + count);
            if(a[B.charAt(i-A.length())-'a']==b[B.charAt(i-A.length()) -'a'])
                --count;
            b[B.charAt(i-A.length())-'a']-=1;
            b[B.charAt(i)-'a'] +=1;
            if(a[B.charAt(i)-'a'] == b[B.charAt(i)-'a'])
                ++count;
            if(count==26) {
                ++out_cnt;
            }
        }
        System.out.println(out_cnt);
    }
}
