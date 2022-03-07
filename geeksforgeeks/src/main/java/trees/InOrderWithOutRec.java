package trees;

import java.util.Stack;

import static trees.BuildTreeUsingInAnPostOrder.getTree;

public class InOrderWithOutRec {
    public static void main(String[] args) {
        int[] in = {4,2,7,5,1,3,6};
        int[] post = {4,7,5,2,6,3,1};
        TreeNode root = getTree(in,post);
        Stack<TreeNode> stack = new Stack<>();
        System.out.println();
        while(stack.size() > 0 || root != null){
            if(root !=null){
                stack.push(root);
                root = root.left;
            } else {
                System.out.print(stack.peek().val +" ");
                root =stack.peek().right;
                stack.pop();
            }
        }
    }
}
