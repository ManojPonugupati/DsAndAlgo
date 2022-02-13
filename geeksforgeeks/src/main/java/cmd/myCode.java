package cmd;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class myCode {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s = new Scanner(System.in);
        String[] in = s.nextLine().split(",");
        int num1 = Integer.valueOf(s.nextLine());
        int num2 = Integer.valueOf(s.nextLine());
        int num = Math.abs(num2-num1);
        int len = getMaxCharLength(in[0]);
        StringBuffer sb = new StringBuffer();
        for(int i=1;i<in.length;i++){
           sb.append(in[i].charAt(len%in[i].length()));
            len = getMaxCharLength(in[i]);
        }
        String temp = sb.toString();
        System.out.println(distinctSubstring(temp, num));
    }
    public static int getMaxCharLength(String s){
        int char_size = 26;
        int len = s.length();
        int count[] = new int[char_size];
        Arrays.fill(count,0);
        for (int i=0; i<len; i++)
            count[s.charAt(i)-97]++;
        int max =-1;
        for(int i=0;i<char_size;i++){
            if(count[i] > max){
                max=count[i];
            }
        }
        return max;
    }
    public static int distinctSubstring(String str, int num)
    {
        Set<String> result = new HashSet<String>();

        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if(j-i >= num)
                 result.add(str.substring(i, j));
            }
        }
        // Return size of the HashSet
        return result.size();
    }
}
