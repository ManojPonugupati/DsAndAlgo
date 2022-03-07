package trees;

import static trees.BinaryTreeFromInorderPostOrderArray.*;

public class BuildTreeUsingInAndPreOrder {
    static int pos=0;
    public static void main(String[] args) {
       // int[] in = {4,2,7,5,1,3,6};
       // int[] pre = {1,2,4,5,7,3,6};
        int[] B = {3, 2, 4, 1, 5 };
        int[] A = {1, 2, 3, 4, 5 };
        TreeNode root = getTree(A,B);
        System.out.println();
        printPreOrder(root);
        System.out.println();
        printPostOrder(root);
    }
    private static TreeNode getTree(int[] pre,int[] in){
        int st=0,end =in.length-1,pos=st;
        return createTree(in,pre,st,end,pos);
    }
    private static TreeNode
       createTree(int[] in,int[] pre, int st, int end,int pos){
        if(pos > in.length-1 || st > end ) return null;
         TreeNode root = new TreeNode(pre[pos]);
         int idx = getIndex(in,root.val);
         root.left = createTree(in,pre,st,idx-1,pos+1);
         root.right = createTree(in,pre,idx+1,end,pos+idx-st+1);
         return root;
    }
    private static int getIndex(int[] in,int val){
        int i=0;
        for(;i<in.length;i++){
            if(in[i]==val)
                break;
        }
        return i;
    }
}
