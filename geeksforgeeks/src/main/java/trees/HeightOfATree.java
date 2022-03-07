package trees;

import static trees.BuildTreeUsingInAnPostOrder.getTree;

public class HeightOfATree {
    static int diameter=Integer.MIN_VALUE;
    public static void main(String[] args) {
        int[] B = {3, 2, 4, 1, 5 };
        int[] A = {1, 2, 3, 4, 5 };
        TreeNode root = getTree(A,B);
        System.out.println(getHeight(root));
        System.out.println(diameter);
    }
    public static int getHeight(TreeNode root){
        if(root == null) return -1;
        int l= getHeight(root.left);
        int r = getHeight(root.right);
        diameter = Math.max(diameter,l+r+2);
        return Math.max(l,r) + 1;
    }
}
