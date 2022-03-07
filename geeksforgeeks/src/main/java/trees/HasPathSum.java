package trees;

import static trees.BuildTreeUsingInAnPostOrder.getTree;

public class HasPathSum {
    static boolean foundPathSum=false;

    public static void main(String[] args) {
        int[] in = {200,1000};
        int[] post = {200,1000};
        TreeNode root = getTree(in,post);
        int B= 1000;
        int sum=0;
        checkHasPathSum(root,B,sum);
        if(foundPathSum)
            System.out.println("found the sum");
        else
            System.out.println("Not found sum");
    }
    public static void checkHasPathSum(TreeNode root,int B,int sum){
        if(root==null) return;
        sum += root.val;
        if(root.left==null && root.right == null && sum == B) {
            foundPathSum = true;
            System.out.println("sum is " + sum);
        }

        checkHasPathSum(root.left,B,sum);
        if(root.right != null)
        checkHasPathSum(root.right,B,sum);
    }
}
