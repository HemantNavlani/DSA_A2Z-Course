public class RatInAMaze {
    //kuch nhi word search jaise hai usse bhi todha easy hi hai

    //https://www.codingninjas.com/studio/problems/rat-in-a-maze-_8842357?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
    //import java.util.*;
    //public class Solution {
    //    public static List<String> ratMaze(int [][]mat) {
    //        int n = mat.length;
    //        List<String> ans = new ArrayList<>();
    //        if (mat[n-1][n-1]==0){
    //            return ans;
    //        }
    //        helper(0,0,ans,"",mat,n);
    //        return ans;
    //    }
    //    public static void helper(int i,int j, List<String> ans, String keeper,int[][] mat,int n){
    //
    //        if (i==n-1 && j==n-1){
    //            ans.add(keeper);
    //            return;
    //        }
    //        if (i<0 || j<0 || i>=n || j>=n || mat[i][j]==0 || mat[i][j]==-1) return;
    //        mat[i][j]=-1;
    //        helper(i+1,j,ans,keeper+='D',mat,n);
    //        keeper = keeper.substring(0,keeper.length()-1);
    //        helper(i,j+1,ans,keeper+='R',mat,n);
    //        keeper = keeper.substring(0,keeper.length()-1);
    //        helper(i-1,j,ans,keeper+='U',mat,n);
    //        keeper = keeper.substring(0,keeper.length()-1);
    //        helper(i,j-1,ans,keeper+='L',mat,n);
    //        mat[i][j]=1;
    //    }
    //}

}
