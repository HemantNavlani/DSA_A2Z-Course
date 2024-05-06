public class MaximumXORofTwoNumbersInAnArray {
    //https://www.naukri.com/code360/problems/maximum-xor_3119012?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/
    //brute force --> TLE
    //class Solution {
    //    public int findMaximumXOR(int[] nums) {
    //        int max = Integer.MIN_VALUE;
    //        int n = nums.length;
    //        for (int i =0;i<n;i++){
    //            for (int j =i;j<n;j++){
    //                max = Math.max(max,nums[i]^nums[j]);
    //            }
    //        }
    //        return max;
    //    }
    //}

    //class Solution {
    //    class Node {
    //        Node links[] = new Node[2];
    //        boolean containsKey(int bit){
    //            return links[bit]!=null;
    //        }
    //        Node get(int bit){
    //            return links[bit];
    //        }
    //        void put(int bit,Node node){
    //            links[bit] = node;
    //        }
    //    }
    //    class Trie{
    //        Node root;
    //        Trie(){
    //            root = new Node();
    //        }
    //        void insert(int num){
    //            Node node = root;
    //            for (int i = 31;i>=0;i--){
    //                int bit = (num>>i) & 1;
    //                if (!node.containsKey(bit)) node.put(bit,new Node());
    //                node = node.get(bit);
    //            }
    //        }
    //        int getMax(int num){
    //            Node node = root;
    //            int max= 0;
    //            for (int i =31;i>=0;i--){
    //                int bit = (num>>i)&1;
    //                if (node.containsKey(1-bit)){
    //                    max = max | (1<<i);
    //                    node = node.get(1-bit);
    //                }
    //                else{
    //                    node = node.get(bit);
    //                }
    //            }
    //            return max;
    //        }
    //    }
    //    public int findMaximumXOR(int[] nums) {
    //        Trie trie = new Trie();
    //        int n = nums.length;
    //        for (int i =0;i<n;i++){
    //            trie.insert(nums[i]);
    //        }
    //        int max = 0;
    //        for (int i = 0;i<n;i++){
    //            max = Math.max(max,trie.getMax(nums[i]));
    //        }
    //
    //        return max;
    //    }
    //}

}
