public class LongestStringwithAllPrefixes {
    //https://www.naukri.com/code360/problems/complete-string_2687860?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_tries_videos&leftPanelTabValue=SUBMISSION
//hai smjhne vala ek bar read karo code aa jayega
    //import java.util.* ;
    //import java.io.*;
    //
    //class Solution {
    //
    //static class Node{
    //  Node[] links = new Node[26];
    //  boolean flag;
    //
    //  boolean containsKey(char ch){
    //    return links[ch-'a']!=null;
    //  }
    //  Node get (char ch){
    //    return links[ch-'a'];
    //  }
    //  void put (char ch,Node node){
    //    links[ch-'a'] = node;
    //  }
    //  void setEnd(){
    //    flag = true;
    //  }
    //  boolean isEnd(){
    //    return flag;
    //  }
    //}
    //static class Trie{
    //  Node root;
    //  Trie(){
    //    root = new Node();
    //  }
    //
    //  void insert (String word){
    //    Node node = root;
    //    for (int i = 0;i<word.length();i++){
    //      if (!node.containsKey(word.charAt(i))) node.put(word.charAt(i),new Node());
    //      node = node.get(word.charAt(i));
    //    }
    //    node.setEnd();
    //  }
    //
    //  boolean checkIfPrefixExists(String word){
    //    boolean flag = true;
    //    Node node = root;
    //    for (int i =0;i<word.length();i++){
    //      if (!node.containsKey(word.charAt(i))) return false;
    //      node = node.get(word.charAt(i));
    //      if (!node.isEnd()) return false;
    //    }
    //    return true;
    //  }
    //}
    //  public static String completeString(int n, String[] a) {
    //    Trie trie = new Trie();
    //    for (int i =0;i<a.length;i++){
    //      trie.insert(a[i]);
    //    }
    //      String longest = "";
    //      for (int i =0;i<a.length;i++){
    //        if (trie.checkIfPrefixExists(a[i])){
    //          if (a[i].length()>longest.length()) longest=a[i];
    //          else if (a[i].length()==longest.length() && a[i].compareTo(longest)<0) longest = a[i];
    //        }
    //      }
    //      if (longest.equals("")) return "None";
    //      return longest;
    //  }
    //}
}
