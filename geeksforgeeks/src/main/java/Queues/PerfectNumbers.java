package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectNumbers {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        int A=10;
        q.add("11");
        q.add("22");
        for(int i=1;i<A;i++){
            String s = q.remove();
            String s1= s.substring(0,s.length()/2) + "11" + s.substring(s.length()/2);
            String s2= s.substring(0,s.length()/2) + "22" + s.substring(s.length()/2);
            q.add(s1);
            q.add(s2);
        }
        System.out.println(q.remove());
    }
}
