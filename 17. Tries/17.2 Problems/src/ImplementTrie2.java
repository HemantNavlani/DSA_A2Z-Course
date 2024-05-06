public class ImplementTrie2 {
    //https://www.naukri.com/code360/problems/implement-trie_1387095?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_tries_videos

    //import java.util.* ;
    //import java.io.*;
    //     class Node {
    //        Node[] links = new Node[26];
    //        int cntEndsWith = 0;
    //        int cntPrefix = 0;
    //        boolean containsKey(char ch){
    //            return links[ch-'a']!=null;
    //        }
    //        void insert(char ch,Node node){
    //            links[ch-'a'] = node;
    //        }
    //        void increaseEnd(){
    //            cntEndsWith++;
    //        }
    //        void increasePrefix(){
    //            cntPrefix++;
    //        }
    //
    //        void deleteEnd(){
    //            cntEndsWith--;
    //        }
    //        void reducePrefix(){
    //            cntPrefix--;
    //        }
    //        Node get(char ch){
    //            return links[ch-'a'];
    //        }
    //        int getEnd(){
    //            return cntEndsWith;
    //        }
    //        int getPrefix(){
    //            return cntPrefix;
    //        }
    //    }
    //public class Trie {
    //    Node root;
    //    public Trie() {
    //        root = new Node();
    //    }
    //
    //    public void insert(String word) {
    //        Node node = root;
    //        for (int i =0;i<word.length();i++){
    //            if (!node.containsKey(word.charAt(i))) node.insert(word.charAt(i),new Node());
    //            node = node.get(word.charAt(i));
    //            node.increasePrefix();
    //        }
    //        node.increaseEnd();
    //    }
    //
    //    public int countWordsEqualTo(String word) {
    //        Node node = root;
    //        for (int i =0;i<word.length();i++){
    //            if (!node.containsKey(word.charAt(i))) return 0;
    //            node = node.get(word.charAt(i));
    //        }
    //        return node.getEnd();
    //    }
    //
    //    public int countWordsStartingWith(String word) {
    //        Node node = root;
    //        for (int i =0;i<word.length();i++){
    //            if (!node.containsKey(word.charAt(i))) return 0;
    //            node = node.get(word.charAt(i));
    //        }
    //        return node.getPrefix();
    //    }
    //
    //    public void erase(String word) {
    //        Node node = root;
    //        for (int i =0;i<word.length();i++){
    //            if (node.containsKey(word.charAt(i))) {
    //                node = node.get(word.charAt(i));
    //                node.reducePrefix();
    //            }
    //            else return;
    //        }
    //        node.deleteEnd();
    //    }
    //
    //}
}
