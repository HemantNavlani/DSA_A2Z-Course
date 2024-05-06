public class NumberofDistinctSubstringsinaString {
    //https://www.naukri.com/code360/problems/count-distinct-substrings_985292?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_tries_videos

    //see the code to get it or see the video
    //import java.util.ArrayList;
    //
    //public class Solution {
    //
    //	static class Node{
    //		Node[] links = new Node[26];
    //		boolean containsKey(char ch){
    //			return (links[ch-'a']!=null);
    //		}
    //		Node get(char ch){
    //			return links[ch-'a'];
    //		}
    //		void put (char ch,Node node){
    //			links[ch-'a'] = node;
    //		}
    //	}
    //	public static int countDistinctSubstrings(String s) {
    //		Node root = new Node();
    //		int cnt = 0;
    //		for (int i =0;i<s.length();i++){
    //			Node node = root;
    //			for (int j = i;j<s.length();j++){
    //				if (!node.containsKey(s.charAt(j))) {
    //					node.put(s.charAt(j),new Node());
    //					cnt++;
    //				}
    //				node = node.get(s.charAt(j));
    //			}
    //		}
    //		return cnt+1;
    //	}
    //}
}
