package trees;

import java.util.ArrayList;
import java.util.HashSet;

import static trees.BSTFromSortedArray.createBST;

public class IsEqualTreePartitionPossible {
    static boolean isPossible=false;
    public static void main(String[] args) {
        int[] A ={1,2,3,4,5,6,7,8,10};
        TreeNode root = createBST(A,0,A.length-1);
        HashSet<Integer> hs = new HashSet<>();
        int total_sum=0;
        total_sum=getInOrder(root);
        boolean proceed =true;
        if(total_sum%2==1)
        {
            System.out.println("Not Possible");
            proceed=false;
        }

        hs.add(total_sum%2);
        if(proceed)
        canBePartitioned(root,hs);
    }
    public static void canBePartitioned(TreeNode root,HashSet<Integer> hs){
        if(root==null) return;
        if(hs.contains(getInOrder(root))) isPossible=true;
        canBePartitioned(root.left,hs);
        canBePartitioned(root.right,hs);
    }
    public static int getInOrder(TreeNode root) {
        if(root == null) return 0;
        int sum = root.val + getInOrder(root.left) + getInOrder(root.right);
        return sum;
    }
}
