public class MaximumXORWithanElementFromArray {
    //pichle se bht same hai todha logic hai add on usko dekh lena aur kar lena
        //https://www.naukri.com/code360/problems/maximum-xor-with-an-element-from-array_1382020?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
        //https://leetcode.com/problems/maximum-xor-with-an-element-from-array/description/

        //class Solution {
        //       class Node {
        //           Node links[] = new Node[2];
        //           boolean containsKey(int bit){
        //               return links[bit]!=null;
        //           }
        //           Node get(int bit){
        //               return links[bit];
        //           }
        //           void put(int bit,Node node){
        //               links[bit] = node;
        //           }
        //       }
        //       class Trie{
        //           Node root;
        //           Trie(){
        //               root = new Node();
        //           }
        //           void insert(int num){
        //               Node node = root;
        //               for (int i = 31;i>=0;i--){
        //                   int bit = (num>>i) & 1;
        //                   if (!node.containsKey(bit)) node.put(bit,new Node());
        //                   node = node.get(bit);
        //               }
        //           }
        //           int getMax(int num){
        //               Node node = root;
        //               int max= 0;
        //               for (int i =31;i>=0;i--){
        //                   int bit = (num>>i)&1;
        //                   if (node.containsKey(1-bit)){
        //                       max = max | (1<<i);
        //                       node = node.get(1-bit);
        //                   }
        //                   else{
        //                       node = node.get(bit);
        //                   }
        //               }
        //               return max;
        //           }
        //       }
        //    public int[] maximizeXor(int[] nums, int[][] queries) {
        //        Arrays.sort(nums);
        //        ArrayList<ArrayList<Integer>> offlineQueries = new ArrayList<ArrayList<Integer>>();
        //        int m = queries.length;
        //        for (int i = 0;i<m;i++){
        //            ArrayList<Integer> temp = new ArrayList<Integer>();
        //            temp.add(queries[i][1]);
        //            temp.add(queries[i][0]);
        //            temp.add(i);
        //            offlineQueries.add(temp);
        //        }
        //        Collections.sort(offlineQueries,new Comparator<ArrayList<Integer>>(){
        //            public int compare(ArrayList<Integer> a,ArrayList<Integer> b){
        //                return a.get(0).compareTo(b.get(0));
        //            }
        //        });
        //        int idx = 0;
        //        int n = nums.length;
        //        Trie trie = new Trie();
        //        int[] ans = new int[m];
        //        for (int i = 0;i<m;i++) ans[i]=-1;
        //
        //        for (int i =0;i<m;i++){
        //            while (idx<n && nums[idx]<=offlineQueries.get(i).get(0)){
        //                trie.insert(nums[idx]);
        //                idx++;
        //            }
        //            int queryIdx = offlineQueries.get(i).get(2);
        //            if (idx!=0) ans[queryIdx]=trie.getMax(offlineQueries.get(i).get(1));
        //            else ans[queryIdx]=-1;
        //        }
        //        return ans;
        //    }
        //}
    
}
