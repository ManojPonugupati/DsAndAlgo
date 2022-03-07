package trees;

import java.util.*;

import static trees.BuildTreeUsingInAnPostOrder.getTree;

public class LeftViewOfATree {
    public static int level=0;
    public static void main(String[] args) {
       // int[] in = {4,2,7,5,1,3,6};
       // int[] post = {4,7,5,2,6,3,1};
        int[] in = {15,1,2};
        int[] post = {15,2,1};
        TreeNode root = getTree(in,post);
        printLeftView(root);
    }
    public static void printLeftView(TreeNode A){
        TreeNode last=A,r=null;
        Queue<TreeNode> dq = new ArrayDeque<>();
        Map<Integer,Integer> hm = new HashMap<>();
        dq.add(A);
        while(!dq.isEmpty() || r != null){
            r=dq.poll();
            if(r==null) break;
            if(!hm.containsKey(level))
                hm.put(level,r.val);
            if(r.left !=null) dq.add(r.left);
            if(r.right != null) dq.add(r.right);
            if(last == r){
                ++level;
                last=((ArrayDeque<TreeNode>) dq).peekLast();
            }
        }
        int i=0;
        while(hm.containsKey(i)){
            System.out.print(hm.get(i) + " ");
            i++;
        }
    }
}

