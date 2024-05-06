public class ImplementingTrie {
    //https://leetcode.com/problems/implement-trie-prefix-tree/
    //https://www.naukri.com/code360/problems/trie-implementation_1062581?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //class Node {
    //    Node []links = new Node[26];
    //    boolean flag = false;
    //    boolean containsKey(char ch) {
    //        return links[ch-'a'] !=null;
    //    }
    //    void put (Node node, char ch){
    //        links[ch-'a'] = node;
    //    }
    //    Node get (char ch) {
    //        return links[ch-'a'];
    //    }
    //    void setEnd(){
    //        flag = true;
    //    }
    //    boolean isEnd() {
    //        return flag;
    //    }
    //}
    //class Trie {
    //    private Node root;
    //    public Trie() {
    //        root = new Node();
    //    }
    //
    //    //inserts a word to the trie
    //    //tc -> O(word.length());
    //    public void insert(String word) {
    //        Node node = root;
    //        for (int i = 0;i<word.length();i++){
    //            if (!node.containsKey(word.charAt(i))){
    //                node.put(new Node() ,word.charAt(i));
    //            }
    //            //moves to the reference trie
    //            node = node.get(word.charAt(i));
    //        }
    //        node.setEnd();
    //    }
    //        //tc -> O(word.length());
    //    public boolean search(String word) {
    //        Node node = root;
    //        for (int i = 0;i<word.length();i++){
    //            if (!node.containsKey(word.charAt(i))) return false;
    //            node = node.get(word.charAt(i));
    //        }
    //        return node.isEnd();
    //    }
    //
    //        //tc -> O(word.length());
    //    public boolean startsWith(String prefix) {
    //        Node node = root;
    //        for (int i =0;i<prefix.length();i++){
    //            if (!node.containsKey(prefix.charAt(i))) return false;
    //            node = node.get(prefix.charAt(i));
    //        }
    //        return true;
    //    }
    //}
    //
    ///**
    // * Your Trie object will be instantiated and called as such:
    // * Trie obj = new Trie();
    // * obj.insert(word);
    // * boolean param_2 = obj.search(word);
    // * boolean param_3 = obj.startsWith(prefix);
    // */
}
