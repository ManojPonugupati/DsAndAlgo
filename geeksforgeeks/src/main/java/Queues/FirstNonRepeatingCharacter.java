package Queues;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String A = "xxikrwmjvsvckfrqxnibkcasompsuyuogauacjrr";
        Map<Character,Integer> hm = new HashMap<>();
        StringBuffer sb= new StringBuffer();
        Queue<Character> q= new LinkedList<>();

        for(int i=0;i<A.length();i++){
            if(hm.containsKey(A.charAt(i))){
                int cnt = hm.get(A.charAt(i));
                hm.put(A.charAt(i),++cnt);
            }else {
                hm.put(A.charAt(i),1);
                q.add(A.charAt(i));
            }
            while(!q.isEmpty() && hm.get(q.peek())>1)
                q.remove();
            if(q.isEmpty())
                sb.append('#');
            else sb.append(q.peek());
        }
        System.out.println(sb.toString());
    }
}
