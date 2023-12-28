import java.util.ArrayList;

public class LearnAllPatternsofSubsequences {
    //https://www.codingninjas.com/studio/problems/more-subsequence_8842355?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //import java.util.*;
    //public class Solution {
    //    public static String moreSubsequence(int n, int m, String a, String b) {
    //        HashSet<Character> setA = new HashSet<>();
    //        HashSet<Character> setB = new HashSet<>();
    //        for (int i = 0;i<a.length();i++){
    //            setA.add(a.charAt(i));
    //        }
    //        for (int i = 0;i<b.length();i++){
    //            setB.add(b.charAt(i));
    //
    //        }
    //
    //        if (setA.size()==setB.size()){
    //            if (n<m) return b;
    //            else return a;
    //        }
    //        else if (setA.size()<setB.size()){
    //            return b;
    //        }
    //        else return a;
    //    }
    //}
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l.add(1);
        l2.add(1);
        System.out.println(l.equals(l2));
    }
}
