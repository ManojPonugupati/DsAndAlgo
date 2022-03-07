package trees;

import static trees.BuildTreeUsingInAnPostOrder.getTree;

public class IdenticalTreesOrNot {
    public static void main(String[] args) {
        int[] in = {4,2,7,5,1,3,6};
        int[] post = {4,7,5,2,6,3,1};
        TreeNode A = getTree(in,post);
        int[] x = {4,2,7,5,1,3,9};
        int[] y = {4,7,5,2,9,3,1};
        TreeNode B = getTree(x,y);
        System.out.println(isIdenticalOrNot(A,B));
    }
    public static boolean isIdenticalOrNot(TreeNode A, TreeNode B){
        if(A==null && B==null) return true;
        if(A==null || B==null) return false;
        return (A.val==B.val && isIdenticalOrNot(A.left,B.left)
                             && isIdenticalOrNot(A.right,B.right));
    }
}
