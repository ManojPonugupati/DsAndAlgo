package tries;

public class MaxXOROfAnArray {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        Trie trie = new Trie();
        trie.insert(ar);
        TrieNode curr ;
        int max=0;
        for(int num:ar){
            curr = trie.root;
            int localSum=0;
            for(int i=31;i>=0;i--){
                int bit = 1-(num >> i) & 1;
                if(curr.children.containsKey(bit)) {
                    localSum |= (1<<i);
                    curr =  curr.children.get(bit);
                } else curr = curr.children.get(1-bit);
            }
            max = Math.max(localSum,max);
        }
        System.out.println(max);
    }
}
