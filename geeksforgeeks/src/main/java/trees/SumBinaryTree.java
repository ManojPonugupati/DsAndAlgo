package trees;

import static trees.BuildTreeUsingInAnPostOrder.getTree;

public class SumBinaryTree {
    static boolean isSumBinaryTree=true;
    public static void main(String[] args) {
        int[] in = {1,4,3,13,5};
        int[] post = {1,3,4,5,13};
        TreeNode root = getTree(in,post);
        getIsSumBinaryTree(root);
        System.out.println(isSumBinaryTree);
    }
    public static TreeNode getIsSumBinaryTree(TreeNode root){
        if(root==null) return null;
        TreeNode l = getIsSumBinaryTree(root.left);
        TreeNode r = getIsSumBinaryTree(root.right);
        if(l != null && r != null) {
            if (root.val != l.val + r.val) {
                isSumBinaryTree = false;
            }
        } else if(l !=null && l.val != root.val )
              isSumBinaryTree=false;
          else if (r != null && r.val !=root.val)
              isSumBinaryTree=false;
        if((l !=null || r !=null) && isSumBinaryTree)
            root.val = 2*(root.val);
          return root;
    }
}
