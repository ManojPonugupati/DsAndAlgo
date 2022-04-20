package tries;

import java.util.HashMap;

public class ContactFinder {
        static class TrieNode{
            HashMap<Character,TrieNode> children;
            int cnt;
            TrieNode(){
                children = new HashMap<>();
                this.cnt=0;
            }
        }
        static class Trie{
            TrieNode root;
            Trie(){
                this.root = new TrieNode();
            }
            void insert(String s){
                TrieNode curr = this.root;
                for(int i=0;i<s.length();i++){
                    if(!curr.children.containsKey(s.charAt(i))){
                        curr.children.put(s.charAt(i),new TrieNode());
                    }
                    ++curr.cnt;
                    curr = curr.children.get(s.charAt(i));
                }
            }
            int get(String s){
                TrieNode curr = this.root;
                int out =0;
                for(int i=0;i<s.length();i++){
                    if(!curr.children.containsKey(s.charAt(i))){
                        out=0;
                        break;
                    }
                    else {
                        out = curr.cnt;
                        curr = curr.children.get(s.charAt(i));
                    }
                }
                return out;
            }
        }

    public static void main(String[] args) {
        int[] A  = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        String[] B = {"s", "ss", "sss", "ssss", "sssss", "s", "ss", "sss", "ssss", "sssss", "ssssss"};
        int[] out = solve(A,B);
        for(int i=0;i<out.length;i++){
            System.out.print(out[i] + " ");
        }
    }
        public static int[] solve(int[] A, String[] B) {
            Trie trie = new Trie();
            int out_cnt=0;
            for(int i=0;i<A.length;i++){
                if(A[i]==1)
                    out_cnt++;
            }
            int[] out = new int[out_cnt];
            out_cnt=0;
            for(int i=0;i<A.length;i++){
                if(A[i]==0){
                    trie.insert(B[i]);
                } else{
                    out[out_cnt] = trie.get(B[i]);
                    out_cnt++;
                }
            }
            return out;
        }
    }


