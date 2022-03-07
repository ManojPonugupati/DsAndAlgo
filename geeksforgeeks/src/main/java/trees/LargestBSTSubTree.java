package trees;

import static trees.BSTFromSortedArray.createBST;

public class LargestBSTSubTree {
    static int maxSubTreeSize=-1;
    static class MaxMin {
        int max;
        int min;
        int size;
        int l_size;
        int r_size;
        boolean flag;
        public MaxMin(int max, int min,int size,
                      int l_size,int r_size,boolean flag){
            this.max=max;
            this.min=min;
            this.size=size;
            this.l_size = l_size;
            this.r_size=r_size;
            this.flag = flag;
        }
        public int getMax(){
            return this.max;
        }
        public int getMin(){
            return this.min;
        }
        public int getSize(){
            return this.size;
        }
        public int getL_size(){
            return  this.l_size;
        }
        public int getR_size(){
            return this.r_size;
        }
        public boolean getFlag(){
            return this.flag;
        }
    }

    public static void main(String[] args) {
        int[] A ={1,2,3,4,5,6,7,8,9};
        TreeNode root = createBST(A,0,A.length-1);
        System.out.println(solve(root));
    }
    public static int solve(TreeNode A) {
        if(A==null) return 0;
        int maxSub=1;
        MaxMin pair =  getMaxSubTreeSize(A);
        return pair.size;
    }
    public static MaxMin getMaxSubTreeSize(TreeNode root){
        if(root == null) return new MaxMin(Integer.MIN_VALUE,Integer.MAX_VALUE,
                0,0,0,true);
        MaxMin l,r;
        l= getMaxSubTreeSize(root.left);
        r= getMaxSubTreeSize(root.right);
        MaxMin m = new MaxMin(Integer.MIN_VALUE,Integer.MAX_VALUE,
                0,0,0,true);
        if((int)l.getMax() >= root.val || root.val > r.getMin() ||
          !(l.getFlag() && r.getFlag())){
            m.size = Math.max(l.size,r.size);
            m.flag = false;
            m.max = Math.max(root.val,r.getMax());
            m.min = Math.min(root.val,l.getMin());
        } else {
            m.max = Math.max(root.val, r.getMax());
            m.min = Math.min(root.val, l.getMin());
            m.size = l.size + r.size + 1;
            ++l.size;
            ++r.size;
        }
        return m;
    }
}
