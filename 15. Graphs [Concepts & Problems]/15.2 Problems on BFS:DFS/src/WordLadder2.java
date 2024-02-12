public class WordLadder2 {//
    //ye solution TLE dega leetcode me but interviews ke liye its fine, karna ye hai ki bfs lagana hai aur queue me list store karte chalna hai read the code aajayega smjhme
    //optimized approach niche likha hai
    //https://www.codingninjas.com/studio/problems/shortest-transition-paths_8391015?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/word-ladder-ii/
    //import java.util.*;
    //
    //public class Solution {
    //    public static List<List< String >> shortestTransitionPaths(String start, String finish, List< String > wordPool) {
    //        List<List<String>> ans = new ArrayList<>();
    //        HashSet<String> st = new HashSet<>();
    //        for(int i=0;i<wordPool.size();i++) st.add(wordPool.get(i));
    //        Queue<ArrayList<String>> q = new LinkedList<>();
    //        ArrayList<String> ls = new ArrayList<>();
    //        ls.add(start);
    //        q.add(ls);
    //        ArrayList<String> used = new ArrayList<>();
    //        used.add(start);
    //        int level = 0;
    //        while (!q.isEmpty()){
    //            ArrayList<String> l = q.remove();
    //            if(l.size()>level){
    //                level++;
    //                for(String it : l) st.remove(it);
    //                while (used.size()!=0) used.remove(used.size()-1);
    //            }
    //
    //            String word = l.get(l.size()-1);
    //
    //            if (word.equals(finish)){
    //                if (ans.size()==0 || ans.get(0).size()==l.size()) ans.add(l);
    //            }
    //            for (int i = 0;i<word.length();i++){
    //                for (char ch = 'a';ch<='z';ch++){
    //                    char[] replaced = word.toCharArray();
    //                    replaced[i] = ch;
    //                    String changed = new String(replaced);
    //                    if (st.contains(changed)){
    //                        l.add(changed);
    //                        q.add(new ArrayList<>(l));
    //                        used.add(changed);
    //                        l.remove(l.size()-1);
    //
    //                    }
    //                }
    //            }
    //        }
    //        return ans;
    //    }
    //}







    //optimized approach
    //yaha 2 steps me kaam karna hai phle ek hashmap banana hai string,levels ka poora bfs karte hue fir ulta dfs lagana hai aur ans bharte jana hai
    //ye solution interviews ke liye nhi hai, dekh lena video striver ki agar smjh na aaye toh




    //class Solution {
    //
    //    void dfs(String word,String beginWord,ArrayList<String> seq,HashMap<String,Integer> mp,List<List<String>>  ans){
    //        if (word.equals(beginWord)){
    //            ArrayList<String> temp = new ArrayList<>(seq);
    //            Collections.reverse(temp);
    //            ans.add(temp);
    //            return;
    //        }
    //        int steps = mp.get(word);
    //        int sz = word.length();
    //        for(int i = 0;i<sz;i++){
    //            for (char ch='a';ch<='z';ch++){
    //                char[] replaced = word.toCharArray();
    //                replaced[i] = ch;
    //                String changed = new String (replaced);
    //                if (mp.containsKey(changed) && mp.get(changed)+1==steps){
    //                    seq.add(changed);
    //                    dfs(changed,beginWord,seq,mp,ans);
    //                    seq.remove(seq.size()-1);
    //                }
    //            }
    //        }
    //
    //
    //    }
    //    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    //        HashMap<String,Integer> mp = new HashMap<>();
    //        List<List<String>> ans = new ArrayList<>();
    //        HashSet<String> st = new HashSet<>();
    //        for (int i = 0;i<wordList.size();i++) st.add(wordList.get(i));
    //        Queue<String> q = new LinkedList<>();
    //        q.add(beginWord);
    //        mp.put(beginWord,1);
    //        st.remove(beginWord);
    //        int sz = beginWord.length();
    //        while (!q.isEmpty()){
    //            String word = q.remove();
    //            int steps = mp.get(word);
    //            if (word.equals(endWord)) break;
    //            for(int i = 0;i<sz;i++){
    //                for (char ch='a';ch<='z';ch++){
    //                    char[] replaced = word.toCharArray();
    //                    replaced[i] = ch;
    //                    String changed = new String (replaced);
    //                    if (st.contains(changed)){
    //                        q.add(changed);
    //                        st.remove(changed);
    //                        mp.put(changed,steps+1);
    //                    }
    //                }
    //            }
    //        }
    //
    //
    //        if (mp.containsKey(endWord)){
    //            ArrayList<String> seq = new ArrayList<>();
    //            seq.add(endWord);
    //            dfs(endWord,beginWord,seq,mp,ans);
    //        }
    //        return ans;
    //    }
    //}
}
