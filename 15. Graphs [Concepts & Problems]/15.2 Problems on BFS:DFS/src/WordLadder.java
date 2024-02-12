public class WordLadder {
    //https://www.codingninjas.com/studio/problems/word-ladder_1102319?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //https://leetcode.com/problems/word-ladder/

    //read the code you will get it level order hi lagaya hai ek ek word ko check kiya hai tough nhi hai vaise itni
    //// TC is N * word Length * 26
    //class Solution {
    //    class Pair {
    //        String word;
    //        int len;
    //        Pair (String word,int len){
    //            this.word = word;
    //            this.len = len;
    //        }
    //    }
    //    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    //        HashSet<String> st = new HashSet<>();
    //        for(int i = 0;i<wordList.size();i++) st.add(wordList.get(i));
    //        Queue<Pair> q = new LinkedList<>();
    //        q.add(new Pair(beginWord,1));
    //        st.remove(beginWord);
    //        while (q.size()!=0){
    //            Pair p = q.remove();
    //            String word = p.word;
    //            int len = p.len;
    //            if (word.equals(endWord)) return len;
    //            for (int i = 0;i<word.length();i++){
    //                char original = word.charAt(i);
    //                for (char ch = 'a';ch<='z';ch++){
    //                    char[] replacedArray = word.toCharArray();
    //                    replacedArray[i]=ch;
    //                    String replacedWord = new String(replacedArray);
    //                    if (st.contains(replacedWord)){
    //                        st.remove(replacedWord);
    //                        q.add(new Pair(replacedWord,len+1));
    //                    }
    //                }
    //            }
    //        }
    //        return 0;
    //    }
    //}
}
