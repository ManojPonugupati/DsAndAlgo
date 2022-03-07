package trees;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import static trees.BuildTreeUsingInAnPostOrder.getTree;

public class OddAndEvenLevelDiff {
    public static void main(String[] args) {
        int[] in = {4,2,7,5,1,3,6};
        int[] post = {4,7,5,2,6,3,1};
        TreeNode A = getTree(in,post);
        TreeNode last=A,r=null;
        int level=0;
        Queue<TreeNode> dq = new ArrayDeque<>();
        Map<Integer,Integer> hm = new HashMap<>();
        dq.add(A);
        while(!dq.isEmpty() || r != null) {
            r = dq.poll();
            if (r == null) break;
            if (!hm.containsKey(level % 2))
                hm.put(level, r.val);
             else
                  hm.put(level%2,hm.get(level%2)+r.val);

            if(r.left !=null) dq.add(r.left);
            if(r.right != null) dq.add(r.right);
            if(last == r){
                ++level;
                last=((ArrayDeque<TreeNode>) dq).peekLast();
            }
        }
            System.out.print(hm.get(0) + " " + hm.get(1));
        }
    }
