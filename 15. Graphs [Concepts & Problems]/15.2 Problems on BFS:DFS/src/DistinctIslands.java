public class DistinctIslands {
//https://www.codingninjas.com/studio/problems/distinct-islands_630460?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //yaha pe hamne kiya vo hai normal dfs ya bfs bas hashset ka use kiya for distinct islands list of strings usme dali hai and fir usme ditinct ke liye set use kiya hai read the code once
    //import java.util.*;
    //public class Solution {
    //	static String toString(int r, int c){
    //		return Integer.toString(r)+" "+Integer.toString(c);
    //	}
    //	static void dfs(int i,int j,int[][] grid,int[][]visited,ArrayList<String> list,int row0, int col0){
    //		visited[i][j] = 1;
    //		list.add(toString(i-row0,j-col0));
    //
    //		if (i-1>=0 && visited[i-1][j]!=1 && grid[i-1][j]==1) dfs(i-1,j,grid,visited,list,row0,col0);
    //		if (j-1>=0 && visited[i][j-1]!=1 && grid[i][j-1]==1) dfs(i,j-1,grid,visited,list,row0,col0);
    //		if (i+1<grid.length && visited[i+1][j]!=1 && grid[i+1][j]==1) dfs(i+1,j,grid,visited,list,row0,col0);
    //		if (j+1<grid[0].length && visited[i][j+1]!=1 && grid[i][j+1]==1) dfs(i,j+1,grid,visited,list,row0,col0);
    //
    //	}
    //	public static int distinctIsland(int [][] grid, int n, int m) {
    //		int [][] visited = new int [n][m];
    //		HashSet<ArrayList<String>> st = new HashSet<>();
    //		for (int i = 0;i<n;i++){
    //			for (int j= 0;j<m;j++){
    //				if (visited[i][j]!=1 && grid[i][j]==1){
    //					ArrayList<String> list = new ArrayList<>();
    //					dfs(i,j,grid,visited,list,i,j);
    //					st.add(list);
    //				}
    //			}
    //		}
    //		// TC -> n*m + (n*m*4)
    //		return st.size();
    //	}
    //}
}
