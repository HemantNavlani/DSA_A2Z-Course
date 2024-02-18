public class MinimumWaysToReachFromStartToEndByMultiplying {
    //https://www.codingninjas.com/studio/problems/minimum-operations_8360665?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //yaha pe bhi dijkstra hi lgaya hai aur code dekhlo yaar ya video dekh lena striver ki, jo array diya hai usko as a graph use kar liya hai and numbers ki range jo di hai usko poora ek distance array bana diya hai
    //import java.util.*;
    //public class Solution {
    //    static class Pair{
    //        int node;
    //        int dist;
    //        Pair(int node,int dist){
    //            this.node=node;
    //            this.dist=dist;
    //        }
    //    }
    //    public static int minimumOperations(int n, int start, int end, int []a) {
    //        int[] distance = new int[1000];
    //        for (int i = 0;i<1000;i++) distance[i]=Integer.MAX_VALUE;
    //        distance[start] = 0;
    //        Queue<Pair> q = new LinkedList<>();
    //        q.add(new Pair(start,0));
    //        while (q.size()!=0){
    //            Pair p = q.remove();
    //            int node=p.node;
    //            int dist = p.dist;
    //            if (node == end) return distance[node];
    //            for (int it : a){
    //                 int nd = node*it;
    //                 nd%=(int) 1e3;
    //                if (dist+1<distance[nd]){
    //                    distance[nd] = dist+1;
    //                    q.add(new Pair(nd,dist+1));
    //                }
    //            }
    //        }
    //        return -1;
    //    }
    //}
}
