public class MColoringProblem {
    //Ye abhi nhi kar raha kyunki ye graph ki problem hai aur vo abhi nhi kiya hai
    //ab kar liya hai maine date 6/5/24

    //https://practice.geeksforgeeks.org/problems/m-coloring-problem-1587115620/1#
    //https://www.codingninjas.com/studio/problems/m-coloring-problem_981273?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    
    //recursion lagaya hai aur har possibility check ki hai aur isSafe me ham dekhte hai ki bhai koi adjacent pe same color toh nhi aa raha na agar aa raha hai toh return false 
    /* 
    public class Solution {
    public static String graphColoring(int [][]mat, int m) {
        int n = mat.length;
        int [] color = new int[n];
        if (solver(0,mat,color,m)) return "YES";
        else return "NO";
    }
    static boolean solver(int node, int[][]mat,int[] color,int m){
        if (node==mat.length) return true;
        for (int i =1;i<=m;i++){
            if (isSafe(node,mat,color,i)){
                color[node] = i;
                if(solver(node+1,mat,color,m)) return true;
                color[node]= 0;
            }
        }
        return false;
    }
    static boolean isSafe(int node,int[][]mat,int[]color,int col){
        for (int i =0;i<mat.length;i++){
            if (i!=node && mat[i][node]==1 && color[i] == col) return false;
        }
        return true;
    }
}
    */

}
