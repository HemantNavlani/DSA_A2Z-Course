public class PalindromePartitioning {
    //https://www.codingninjas.com/studio/problems/palindrome-partitioning_626181?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //https://leetcode.com/problems/palindrome-partitioning/description/

    //same sa hi hai subsequences type loop bhi lagega aur todha dimag bhi badhte jao string me aur dekho ki palindrome hai ab tak ki substring ki nhi agar hai toh call karo recursion karte raho
    //baki code padho aa jayega smjh me
    //class Solution {
    //    public List<List<String>> partition(String s) {
    //        List<List<String>> ans = new ArrayList<>();
    //        helper (0,s,ans,new ArrayList<String>());
    //        return ans;
    //    }
    //    public void helper (int idx, String s, List<List<String>> ans,List<String> keeper){
    //        if (idx == s.length()){
    //            ans.add(new ArrayList<String>(keeper));
    //            return;
    //        }
    //
    //        for (int i = idx;i<s.length();i++){
    //            if (isPalindrome(s,idx,i)){
    //                keeper.add(s.substring(idx,i+1));
    //                helper(i+1,s,ans,keeper);
    //                keeper.remove(keeper.size()-1);
    //            }
    //        }
    //    }
    //    public boolean isPalindrome (String str,int i,int j){
    //        while (i<=j){
    //            if (str.charAt(i)!=str.charAt(j)) return false;
    //            i++;
    //            j--;
    //        }
    //        return true;
    //    }
    //}
}
