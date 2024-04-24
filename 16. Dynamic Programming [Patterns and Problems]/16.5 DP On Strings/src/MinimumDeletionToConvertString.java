import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumDeletionToConvertString {
    //https://leetcode.com/problems/delete-operation-for-two-strings/
    //https://www.naukri.com/code360/problems/minimum-number-of-deletions-and-insertions_4244510?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


    //class Solution {
    //    public int minDistance(String word1, String word2) {
    //        return word1.length()+word2.length()-2*longestCommonSubsequence(word1,word2);
    //    }
    //    int longestCommonSubsequence(String text1, String text2) {
    //           int n1 = text1.length();
    //           int n2 = text2.length();
    //           int[]dp = new int[n2+1];
    //           for (int i1 =1;i1<=n1;i1++){
    //               int [] cur = new int[n2+1];
    //               for (int i2=1;i2<=n2;i2++){
    //                   if (text1.charAt(i1-1)==text2.charAt(i2-1)) cur[i2] = 1 + dp[i2-1];
    //                   else cur[i2] =  Math.max(cur[i2-1],dp[i2]);
    //               }
    //               dp = cur;
    //           }
    //           return dp[n2];
    //    }
    //}
            static class Pair{
                String lock;
                int turns;
                Pair (String lock, int turns){
                    this.lock = lock;
                    this.turns = turns;
                }
            }
            static ArrayList<String> children(String lock){
                ArrayList<String> ans = new ArrayList<>();
                for (int i = 0;i<4;i++){
                    char digit = (char)(((lock.charAt(i)-48+1)%10)+48);
                    ans.add(lock.substring(0,i)+digit+lock.substring(i+1));
                    digit = (char)(((lock.charAt(i)-48-1+10)%10)+48);
                    ans.add(lock.substring(0,i)+digit+lock.substring(i+1));
                }
                return ans;
            }
            static int openLock(String[] deadends, String target) {
                HashSet<String> visited = new HashSet<>();
                for (int i = 0;i<deadends.length;i++){
                    visited.add(deadends[i]);
                }
                Queue<Pair> q = new LinkedList<>();
                q.add(new Pair("0000",0));
                while(q.size()!=0){
                    Pair p = q.remove();
                    String lock = p.lock;
                    int turns = p.turns;
                    if (lock.equals(target)) return turns;
                    for (String child : children(lock)){
                        if (!visited.contains(child)){
                            visited.add(child);
                            q.add(new Pair(child,turns+1));
                        }
                    }
                }
                return -1;
        }

    public static void main(String[] args) {
                String[] deadends= {"0201","0101","0102","1212","2002"};

        System.out.println(openLock(deadends,"0202"));
    }
}
