package trees;

import utils.MinMaxPair;

import static trees.BuildTreeUsingInAnPostOrder.*;

public class IsBSTOrNot {
    static boolean isBST=true;
    public static void main(String[] args) {
        int[] in = {2,5,6,7,12,10,20,22};
        int[] post = {2,6,12,7,5,22,20,10};
        TreeNode root = getTree(in,post);
        MinMaxPair pair = checkIsBSTOrNot(root);
        System.out.println("Is BST or Not : " + isBST);
        printInOrder(root);
        System.out.println();
        printPostOrder(root);
    }
   public static MinMaxPair checkIsBSTOrNot(TreeNode root){
       MinMaxPair l,r;
        if(root==null)
           return new MinMaxPair(Integer.MIN_VALUE,Integer.MAX_VALUE);
         l = checkIsBSTOrNot(root.left);
         r = checkIsBSTOrNot(root.right);
        if(l.getMax() > root.val || root.val >= r.getMin())
            isBST=false;
        return new MinMaxPair(Math.max(root.val,r.getMax()),
                Math.min(root.val,l.getMin()));
   }

}
