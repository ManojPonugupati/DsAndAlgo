package trees;

import static trees.BuildTreeUsingInAnPostOrder.*;

public class RecoverABST {
    static TreeNode first=null,
            prev=null,
            e1=null,
            e2=null,
            tentative_e1=null;
    public static void main(String[] args) {
        //int[] in = {2,5,20,10,8};
        //int[] post = {2,20,5,8,10};
        int[] in = {2,3,1};
        int[] post = {2,1,3};
        TreeNode root = getTree(in,post);
        recoverBST(root);
        System.out.println(e1.val + " "  +  " " + tentative_e1.val);
    }
    public static void recoverBST(TreeNode root){
        if(root==null)
            return;
        recoverBST(root.left);
        if(first==null){
            first=root;
        }else if(prev.val > root.val && e1 == null){
            e1=prev;
        } else if(prev.val > root.val && e1 != null)
            e2=root;
        if(e1 ==prev || tentative_e1==null)
        tentative_e1=root;
        prev=root;
        recoverBST(root.right);
    }
}
