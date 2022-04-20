package tries;

import java.util.HashMap;

public class SpellingChecker {
    static class TrieNode{
        HashMap<Character, TrieNode> children;
        boolean isEnd=false;
        public TrieNode(){
            this.children = new HashMap<>();
            this.isEnd=false;
        }
    }
    static class Trie {
        TrieNode root;
        public Trie(){
            this.root = new TrieNode();
        }
        public void insert(String[] A){
            TrieNode curr;
            for(String word : A){
                curr=this.root;
                for(int i=0;i<word.length();i++){
                    if(!curr.children.containsKey(word.charAt(i))){
                        curr.children.put(word.charAt(i),new TrieNode());
                        if(!curr.isEnd)
                            curr.isEnd=false;
                    }
                    curr=curr.children.get(word.charAt(i));
                }
                curr.isEnd=true;
            }
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        String[] A = {  "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg" };
        String[] B = {"a", "b", "ab", "abcd"};
        int[] out = new int[B.length];
        trie.insert(A);
        int cnt=0;
        TrieNode curr = trie.root;
        for(String word:B){
            curr=trie.root;
            for(int i=0;i<word.length();i++){
                if(!curr.children.containsKey(word.charAt(i))){
                    out[cnt]=0;
                    break;
                }
                curr=curr.children.get(word.charAt(i));
            }
            if(curr.isEnd){
                out[cnt]=1;
            } else out[cnt]=0;
            cnt++;
        }
        for(int i=0;i<out.length;i++){
            System.out.println(out[i]);
        }
    }
}
