package trees;

import javafx.util.Pair;

import java.util.*;

public class BinaryTreeFromInorderPostOrderArray {
    public static void main(String[] args) {
        int[] A = {4,2,7,5,1,3,6};
        int[] B = {4,7,5,2,6,3,1};
        boolean isBalanced=true;
        TreeNode root = buildTree(A,B);
        System.out.println("in order trav is : ");
        printInorder(root);
        System.out.println();
        System.out.println("post order is : ");
        printPostOrder(root);
        System.out.println();
        System.out.println("pre order is : ");
        printPreOrder(root);
        System.out.println("level order traversal is : ");
        printLevelOrder(root);
        System.out.println();
        System.out.println("Vertical Order traversal is : ");
        printVerticalOrder(root);
        System.out.println();
        System.out.println("print vertical order using level Order : ");
        printVerticalOrderUsingLevelOrder(root);
        System.out.println();
        //System.out.println("check wheather tree is balanced or not : ");
        //checkHeighIsBalancedOrNot(root,isBalanced);
        checkBinarySearchTreeOrNot(root);
    }
    public static void checkBinarySearchTreeOrNot(TreeNode A){
        boolean isBST=true;
        System.out.println("IS BST before" + isBST);
        getBSTOrNot(A,isBST);
        System.out.println("IS BST After : " + isBST);
    }
    public static Pair<Integer,Integer> getBSTOrNot(TreeNode A,boolean isBST){
        if(A==null) return new Pair(Integer.MIN_VALUE,Integer.MAX_VALUE);
        Pair l = getBSTOrNot(A.left,isBST);
        Pair r = getBSTOrNot(A.right,isBST);
        if((int)l.getKey() > A.val || A.val >= (int) r.getValue()) {
            isBST = false;
            System.out.println("Not a BST");
        }
        return new Pair((Math.max((int) r.getKey(),A.val)),Math.min((int) l.getValue(),A.val));
    }
    public static void printInorder(TreeNode root){
        if(root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " --> ");
        printInorder(root.right);
    }
    public static void printPostOrder(TreeNode root){
        if(root == null) return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.val + " --> ");
    }
    public static void printPreOrder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " --> ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
    public static void printLevelOrder(TreeNode A){
        if(A == null) return;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(A);
        TreeNode r,last;
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        last=A;
        ArrayList<Integer> ar_1d=new ArrayList<>();
           while(!q.isEmpty()){
               r=q.poll();
               if(r.left !=null) q.add(r.left);
               if(r.right != null) q.add(r.right);
               ar_1d.add(r.val);
               if(last == r) {
                   ar.add(ar_1d);
                   ar_1d= new ArrayList<>();
                   last = ((ArrayDeque<TreeNode>) q).peekLast();
               }
           }
        }
    public static void printVerticalOrder(TreeNode A){
        int hd=0;
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        getVerticalOrder(A,hd,map);
        int min=0;
        for(Integer key:map.keySet()){
            if(min > key) min=key;
        }
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        ArrayList<Integer> arr;
        System.out.println();
        while(map.containsKey(min)) {
            ArrayList<Integer> list = map.get(min);
            ar.add(list);
            min++;
        }
        System.out.println(ar);
       }
    public static void getVerticalOrder(TreeNode A, int hd,Map<Integer,ArrayList<Integer>> map){
        ArrayList<Integer> list;
        if(A==null) return;
        if(!map.containsKey(hd)){
            list = new ArrayList<>();
            list.add(A.val);
            map.put(hd,list);
        }
        else
            {
            list = map.get(hd);
            list.add(A.val);
            map.put(hd,list);
        }
        getVerticalOrder(A.left,hd-1,map);
        getVerticalOrder(A.right,hd+1,map);
    }
    public static void printVerticalOrderUsingLevelOrder(TreeNode A){
        if(A == null) return;
        Queue<Pair<TreeNode,Integer>> q = new ArrayDeque<>();
        q.add(new Pair<>(A,0));
        TreeNode r,last;
        last=A;
        int current=0;
        ArrayList<Integer> list;
        Map<Integer,ArrayList<Integer>> map = new HashMap<>();
        Pair<TreeNode,Integer> cur;
        while(!q.isEmpty()){
            cur=q.poll();
            r=cur.getKey();
            current=cur.getValue();
            if(!map.containsKey(current)){
                list = new ArrayList<>();
                list.add(r.val);
                map.put(current,list);
            }
            else
            {
                list = map.get(current);
                list.add(r.val);
                map.put(current,list);
            }
            if(r.left !=null) q.add(new Pair<>(r.left,current-1));
            if(r.right != null) q.add(new Pair<>(r.right,current+1));
            if(last == r) {
                if(((ArrayDeque<Pair<TreeNode, Integer>>) q).peekLast() != null)
                last = ((ArrayDeque<Pair<TreeNode, Integer>>) q).peekLast().getKey();
            }
        }
        int min=0;
        for(Integer key:map.keySet()){
            if(min > key) min=key;
        }
        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        while(map.containsKey(min)) {
            ArrayList<Integer> arr = map.get(min);
            ar.add(arr);
            min++;
        }
        System.out.println("map value is : " + map);
        System.out.println(ar);
    }

    public static TreeNode buildTree(int[] A, int[] B){
        int st=0,end=A.length-1,pos=end;
        return recBuildTree(A,B,st,end,pos);
    }
    public static TreeNode recBuildTree(int[] in,int[] post,int st,int end,int pos){
        if(st>end) return null;
        TreeNode root = new TreeNode(post[pos]);
        int idx=0;
        for(int i=st;i<=end;i++){
            if(in[i]==post[pos]){
                idx=i;
                break;
            }
        }
        root.right = recBuildTree(in,post,idx+1,end,pos-1);
        root.left = recBuildTree(in,post,st,idx-1,pos-1-(end-idx));
        return root;
    }
    public static boolean  checkHeighIsBalancedOrNot(TreeNode A,boolean isBalanced){
        int l,r;
        l = getHeight(A.left);
        r = getHeight(A.right);
        if(Math.abs(l - r) > 1) isBalanced=false;
        checkHeighIsBalancedOrNot(A.left,isBalanced);
        checkHeighIsBalancedOrNot(A.right,isBalanced);
        return isBalanced;
    }
    public static int getHeight(TreeNode A){
        int l,r;
        if(A==null) return -1;
        l= getHeight(A.left);
        r= getHeight(A.right);
        return Math.max(l,r)+1;
    }
}
