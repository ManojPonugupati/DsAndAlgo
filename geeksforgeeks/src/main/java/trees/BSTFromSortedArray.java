package trees;

import static trees.BinaryTreeFromInorderPostOrderArray.printInorder;
import static trees.BinaryTreeFromInorderPostOrderArray.printPostOrder;

public class BSTFromSortedArray {
    public static void main(String[] args) {
        int[] A ={1,2,3,4,5,6,7,8,9};
        TreeNode root = createBST(A,0,A.length-1);
        System.out.println("In order is below");
        printInorder(root);
        System.out.println();
        System.out.println("Post order is below");
        printPostOrder(root);
    }
    public static TreeNode createBST(int[] A, int l, int r){
        if(l>r) return null;
        int mid = (l+r)/2;
        TreeNode root = new TreeNode(A[mid]);
        root.left = createBST(A,l,mid-1);
        root.right = createBST(A,mid+1,r);
        return root;
    }
}
