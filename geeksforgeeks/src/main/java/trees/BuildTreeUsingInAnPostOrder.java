package trees;

public class BuildTreeUsingInAnPostOrder {
    public static void main(String[] args) {
        int[] in = {4,2,7,5,1,3,6};
        int[] post = {4,7,5,2,6,3,1};
        TreeNode root = getTree(in,post);
        System.out.println();
        printInOrder(root);
        System.out.println();
        printPostOrder(root);
    }

    public static TreeNode getTree(int[] in, int[] post){
        int st=0,end=in.length-1,pos=end;
        return createTree(in,post,st,end,pos);
    }
    private static TreeNode
    createTree(int[] in, int[] post, int st,int end,int pos){
        if(st> end) return null;
        TreeNode root = new TreeNode(post[pos]);
        int idx = getIndex(in,post[pos]);
        root.right = createTree(in,post,idx+1,end,pos-1);
        root.left = createTree(in,post,st,idx-1,pos-1-(end-idx));
        return root;
    }
    private static int getIndex(int[] in,int num){
        for(int i=0;i<in.length;i++){
            if(in[i]==num)
                return i;
        }
        return num;
    }
    public static void printInOrder(TreeNode root){
        if(root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
    public static void printPostOrder(TreeNode root){
        if(root == null) return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.val + " ");
    }
}
