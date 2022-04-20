package tries;

public class Trie {
    TrieNode root;
    public Trie(){
        this.root = new TrieNode();
    }
    public void insert(int[] A){
        for(int num:A) {
            TrieNode curr = this.root;
            for (int i = 31; i >= 0; i--) {
                int curBit = (num >> i) & 1;
                if(!curr.children.containsKey(curBit)){
                    curr.children.put(curBit,new TrieNode());
                }
                curr= curr.children.get(curBit);
            }
        }
    }

}
