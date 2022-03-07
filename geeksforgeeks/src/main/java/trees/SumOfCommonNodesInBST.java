package trees;

import java.util.HashMap;
import java.util.Map;

import static trees.BSTFromSortedArray.createBST;

public class SumOfCommonNodesInBST {
    static Map<Integer,Integer> hm = new HashMap<>();
    static long out = 0L;
    static int mod=1000000007;
    public static void main(String[] args) {
        int[] A ={1,2,3,4,5,6,7,8,9};
        TreeNode root = createBST(A,0,A.length-1);
        putInOrderTraversal(root);
        calInOrderTraversalSum(root);
        System.out.println("out is : " + out);
    }
    public static void putInOrderTraversal(TreeNode root){
        if(root == null) return;
        putInOrderTraversal(root.left);
        hm.put(root.val,root.val);
        putInOrderTraversal(root.right);
    }
    public static void calInOrderTraversalSum(TreeNode root){
        if(root == null) return;
        calInOrderTraversalSum(root.left);
        if(hm.containsKey(root.val))
        {
            out = out + (hm.get(root.val))%mod;
            if(out <0)
                out = (out + mod)%mod;
            out %=1000000007;
        }
        calInOrderTraversalSum(root.right);
    }

}
