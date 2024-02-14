public class AlienDictionary {

    //codingninjas.com/studio/problems/alien-dictionary_630423?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //isme kuch nhi kiya dictionary ki help se hamne a,b,c,d ka ek graph bana liya hai fir order ke liye uska Topological sort kar liya hai

    //ispe ek follow up question ho skta hai ki tell the cases where the order is not possible so agar do strings di hai and these matches and the longer string is coming before in the dictionary (like abcd, abc) then not possible
    //aur agar cyclic dependency aati hai toh not possible example -> abc, bat, ade, this shows a<b<a so not possible here also
    //import java.util.*;
    //public class Solution {
    //    public static String getAlienLanguage(String []dictionary, int k) {
    //        int n = dictionary.length;
    //        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    //        for (int i = 0;i<k;i++) adj.add(new ArrayList<>());
    //        for (int i= 0;i<n-1;i++){
    //            String s1 = dictionary[i];
    //            String s2 = dictionary[i+1];
    //            int len = Math.min(s1.length(),s2.length());
    //            for (int j = 0;j<len;j++){
    //                if (s1.charAt(j)!=s2.charAt(j)){
    //                    adj.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
    //                    break;
    //                }
    //            }
    //        }
    //
    //        int []indegree = new int[k];
    //        for (int i = 0;i<adj.size();i++){
    //            for (int it: adj.get(i)){
    //                indegree[it]++;
    //            }
    //        }
    //        Queue<Integer> q = new LinkedList<>();
    //        for (int i = 0;i<k;i++){
    //            if (indegree[i]==0) q.add(i);
    //        }
    //        String ans = "";
    //        while(!q.isEmpty()){
    //            int node = q.remove();
    //            ans+=(char)(node+'a');
    //
    //            for (int it:adj.get(node)){
    //                indegree[it]--;
    //                if (indegree[it]==0) q.add(it);
    //            }
    //        }
    //        return ans;
    //    }
    //}
}
