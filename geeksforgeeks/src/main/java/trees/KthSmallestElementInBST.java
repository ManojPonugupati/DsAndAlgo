package trees;

import java.util.ArrayList;

import static trees.BSTFromSortedArray.createBST;

public class KthSmallestElementInBST {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,8,9,10,11,12};
        TreeNode root = createBST(A,0,A.length-1);
        int k=9;
        ArrayList<Integer> ar = new ArrayList<>();
        kthSmallest(root,ar);
        System.out.println(ar.get(k-1));
    }
    public static void kthSmallest(TreeNode root,ArrayList<Integer> ar){
        if(root==null) return;
        kthSmallest(root.left,ar);
        ar.add(root.val);
        kthSmallest(root.right,ar);
    }
}
