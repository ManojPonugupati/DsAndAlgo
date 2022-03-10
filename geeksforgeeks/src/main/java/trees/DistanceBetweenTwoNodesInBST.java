package trees;

import static trees.BSTFromSortedArray.createBST;
import static trees.LCA.getLCAOfBST;

public class DistanceBetweenTwoNodesInBST {
    public static void main(String[] args) {
        int[] A ={1,2,3,4,5,6,7,8,9};
        TreeNode root = createBST(A,0,A.length-1);
        System.out.println(getDistance(root,3,9));
    }
    public static int getDistance(TreeNode A, int B,int C){
        TreeNode root = A;
         TreeNode LCA = getBSTsLCA(A,B,C);
         TreeNode tmp_lca=LCA;
         int cnt=0;
         while(tmp_lca.val != B){
             if(tmp_lca.val <B){
                 tmp_lca=tmp_lca.right;
             } else tmp_lca=tmp_lca.left;
             cnt++;
         }
         tmp_lca=LCA;
        while(tmp_lca.val != C){
            if(tmp_lca.val <C){
                tmp_lca=tmp_lca.right;
            } else tmp_lca=tmp_lca.left;
            cnt++;
        }
        return cnt;
    }
    public static TreeNode getBSTsLCA(TreeNode A, int B, int C){
        TreeNode root = A;
        boolean bstFound=false;
        while(!bstFound) {
            if (B > root.val && C > root.val) {
                root = root.right;
            } else if (B < root.val && C < root.val)
                root = root.left;
            else bstFound = true;
        }
        return root;
    }
}
