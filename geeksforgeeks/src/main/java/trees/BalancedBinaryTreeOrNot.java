package trees;

import static trees.BuildTreeUsingInAnPostOrder.getTree;

public class BalancedBinaryTreeOrNot {
    public static boolean isBalanced=true;
    public static void main(String[] args) {
        int[] in = {4,2,7,5,1,3,6};
        int[] post = {4,7,5,2,6,3,1};
        TreeNode root = getTree(in,post);
        System.out.println("height is " + checkIsBalanced(root) +
                " is balanced or not : " + isBalanced);
    }
    private static int checkIsBalanced(TreeNode root){
        if(root == null) return  -1;
        int l= checkIsBalanced(root.left);
        int r = checkIsBalanced(root.right);
        if(Math.abs(l-r)>1) isBalanced=false;
        return Math.max(l,r)+1;
    }
}
