package trees;

import java.util.HashSet;

import static trees.BSTFromSortedArray.createBST;

public class BSTTwosSum {
    static boolean foundTwosSum=false;
    public static void main(String[] args) {
        int[] A ={1,2,3,4,5,6,7,8,9};
        TreeNode root = createBST(A,0,A.length-1);
        int B = 17;
        HashSet<Integer> hs = new HashSet<>();
        System.out.println("B is " + B);
        checkTwosSum(root,B,hs);
        System.out.println("B was : " + B);
        System.out.println(foundTwosSum);
    }
    public static void checkTwosSum(TreeNode A, int B, HashSet<Integer> hs){
        if(A==null||foundTwosSum) return;
        checkTwosSum(A.left,B,hs);
        if(hs.contains(Math.abs(A.val)))
            foundTwosSum=true;
        else {
            System.out.println("B " + B + " diff" + " " + (B- A.val) + "A.val " + A.val);
            hs.add(Math.abs(B-A.val));
        }
        checkTwosSum(A.right,B,hs);
    }
}
