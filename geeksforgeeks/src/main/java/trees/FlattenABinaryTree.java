package trees;

import static trees.BSTFromSortedArray.createBST;

public class FlattenABinaryTree {
    static class TreeNodePair{
        public TreeNodePair(TreeNode head, TreeNode tail) {
            this.head = head;
            this.tail = tail;
        }

        private TreeNode head;
        private TreeNode tail;
    }
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9};
        TreeNode root = createBST(A,0,A.length-1);
        flattenTree(root);
        while(root !=null){
            System.out.print(root.val +" ");
            root = root.right;
        }
    }
    public static TreeNodePair flattenTree(TreeNode root){
         if(root==null)
              return new TreeNodePair(null,null);
          TreeNodePair l,r;
          l=flattenTree(root.left);
          r=flattenTree(root.right);
          root.left=null;
          if(l.head !=null){
              root.right=l.head;
              l.tail.right=r.head;
          } else root.right=r.head;
          return new TreeNodePair(root,
                  (r.tail != null)?r.tail
                  :(l.tail!=null)?l.tail:root);

    }

}
