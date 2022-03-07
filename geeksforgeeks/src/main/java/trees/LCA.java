package trees;

import java.util.HashSet;
import java.util.Stack;

import static trees.BSTFromSortedArray.createBST;

public class LCA {
    static int LCA=-1;
    static boolean nodeFound=false;
    public static void main(String[] args) {
        int[] A ={1,2,3,4,5,6,7,8,9};
        TreeNode root = createBST(A,0,A.length-1);
        System.out.println(getLCABothBAndCExists(root,1,3));
        System.out.println(getLCAOfBST(root,1,3));
       System.out.println(getLCAUsingBackTracking(root,1,3));
    }

    public static int getLCAUsingBackTracking(TreeNode root, int B, int C){
        Stack<Integer> stb = new Stack<>();
        Stack<Integer> stc = new Stack<>();
        nodeFound=false;
        stb=getStack(root,B,stb);
        System.out.println(stb.size());
        if(nodeFound==false) return -1;
        nodeFound=false;
        stc=getStack(root,C,stc);
        HashSet<Integer> hs = new HashSet<>();
        while(stb.size() > 0){
            hs.add(stb.pop());
        }
        System.out.println("size is " + stc.size());
        while(stc.size() > 0){
            if(hs.contains(stc.peek()))
                return stc.peek();
            stc.pop();
        }
        return -1;
    }
    public static Stack<Integer> getStack(TreeNode root,int A,Stack<Integer> stb){
        if(root==null) return stb;
        if(!nodeFound) stb.push(root.val);
        if(root.val==A) nodeFound=true;
        if(nodeFound) return stb;
        getStack(root.left,A,stb);
        getStack(root.right,A,stb);
        if(!nodeFound) stb.pop();
        return stb;
    }

    public static int getLCABothBAndCExists(TreeNode root,int B,int C){
        if(root==null) return -1;
        if(root.val==B || root.val ==C) return root.val;
        int l,r;
        l=getLCABothBAndCExists(root.left,B,C);
        r=getLCABothBAndCExists(root.right,B,C);
        if(l !=-1 &&r != -1)
             return root.val;
        if(r !=-1)
            return r;
        return l;
    }

    public static int getLCAOfBST(TreeNode root, int B, int C){
        if(root==null) return -1;
        if(B < root.val && C < root.val)
            getLCAOfBST(root.left,B,C);
        else if (B> root.val && C > root.val)
            getLCAOfBST(root.right,B,C);
        else
          LCA=root.val;
        return LCA;
    }
}
