package trees;


import java.util.Stack;

import static trees.BuildTreeUsingInAnPostOrder.getTree;

public class PostOrderWithoutRec {
    public static void main(String[] args) {
        int[] in = {4, 2, 7, 5, 1, 3, 6};
        int[] post = {4, 7, 5, 2, 6, 3, 1};
        TreeNode root = getTree(in, post);
        System.out.println();
        printUsingTwoStacks(root);
    }
        public static void printUsingTwoStacks(TreeNode root){
            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();
            s1.push(root);
            while (s1.size()>0) {
                s2.add(s1.pop());
                if (s2.peek().left != null)
                    s1.push(s2.peek().left);
                if (s2.peek().right != null)
                    s1.push(s2.peek().right);
            }
            while (s2.size() > 0){
                System.out.print(s2.pop().val + " ");
            }
        }
    }

