package trees;

import java.util.ArrayDeque;
import java.util.Queue;

import static trees.BuildTreeUsingInAnPostOrder.getTree;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        int[] in = {4,2,7,5,1,3,6};
        int[] post = {4,7,5,2,6,3,1};
        TreeNode root = getTree(in,post);
        printLevelOrder(root);
    }
    private static void printLevelOrder(TreeNode A){
        Queue<TreeNode>  dq = new ArrayDeque<>();
        dq.add(A);
        TreeNode r=null;
        TreeNode last =A;
        while(r != null || dq.size()>0){
            r = dq.poll();
            if(r==null) return;
            if(r.left != null) dq.add(r.left);
            if(r.right !=null) dq.add(r.right);
            System.out.print(r.val+ " ");
            if(last == r){
                System.out.println();
                last = ((ArrayDeque<TreeNode>) dq).peekLast();
            }
        }
    }
}
