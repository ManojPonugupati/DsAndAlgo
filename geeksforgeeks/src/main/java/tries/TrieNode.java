package tries;

import java.util.HashMap;

public class TrieNode {
    HashMap<Integer, TrieNode> children;
    int cnt;
    public TrieNode() {
        this.children = new HashMap<>();
        this.cnt=0;
    }
}
