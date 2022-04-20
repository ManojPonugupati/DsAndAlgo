package tries;

import java.util.HashMap;

public class UnixPrefix {
   static class TrieNode{
       HashMap<Character,TrieNode> children;
       int cnt=0;
       public TrieNode(){
           this.children = new HashMap<>();
           this.cnt=0;
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
                }
                ++curr.cnt;
                curr=curr.children.get(word.charAt(i));
               }
           }
       }
   }

    public static void main(String[] args) {
       String[] A = {"zebra", "dog", "duck", "dove"};
       Trie trie = new Trie();
       trie.insert(A);
       String[] out = new String[A.length];
       TrieNode curr;
       int cnt=0;
       for(String word:A){
           curr=trie.root;
           StringBuffer sb= new StringBuffer();
           for(int i=0;i<=word.length();i++){
               if(curr.cnt==1 || curr.cnt==0 ){
                 out[cnt]=sb.toString();
                 cnt++;
                 sb= new StringBuffer();
                 break;
               } else
               {
                   sb.append(word.charAt(i));
                   curr=curr.children.get(word.charAt(i));
               }
           }
       }
       for(int i=0;i<out.length;i++){
           System.out.print(out[i] + " ");
       }
    }
}
