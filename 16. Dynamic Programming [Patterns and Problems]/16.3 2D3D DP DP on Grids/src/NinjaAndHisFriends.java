public class NinjaAndHisFriends {
    //https://www.naukri.com/code360/problems/chocolate-pickup_3125885?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //import java.util.* ;
    //import java.io.*;
    //public class Solution {
    //	public static int maximumChocolates(int r, int c, int[][] grid) {
    //		int [][][] dp = new int[r][c][c];
    //		for (int i= 0;i<r;i++){
    //			for (int j = 0;j<c;j++){
    //				for (int k = 0;k<c;k++){
    //					dp[i][j][k] = -1;
    //				}
    //			}
    //		}
    //		return solver(0,0,c-1,grid,dp);
    //	}
    //	static int solver(int i,int j1,int j2,int[][] grid,int[][][]dp){
    //		if (j1<0 || j2<0 || j1>=grid[0].length || j2>=grid[0].length) return -1000000;
    //		if (i==grid.length-1){
    //			if (j1==j2) return grid[i][j1];
    //			else return grid[i][j1] + grid[i][j2];
    //		}
    //		if (dp[i][j1][j2]!=-1) return dp[i][j1][j2];
    //		int max = (int) -1e9;
    //		for (int a = -1;a<=1;a++){
    //			for (int b = -1;b<=1;b++){
    //				int value= 0;
    //				if (j1==j2) value = grid[i][j1] ;
    //				else value= grid[i][j1] + grid[i][j2];
    //				value +=solver(i+1,j1+a,j2+b,grid,dp);
    //				max = Math.max(max,value);
    //			}
    //		}
    //		return dp[i][j1][j2] =  max;
    //	}
    //}

    //import java.util.* ;
    //import java.io.*;
    //public class Solution {
    //	public static int maximumChocolates(int r, int c, int[][] grid) {
    //		int [][][] dp = new int[r][c][c];
    //			for (int j = 0;j<c;j++){
    //				for (int k = 0;k<c;k++){
    //					if (j==k) dp[r-1][j][k] = grid[r-1][k];
    //					else dp[r-1][j][k] = grid[r-1][j] + grid[r-1][k];
    //				}
    //			}
    //
    //			for (int i = r-2;i>=0;i--){
    //				for (int j1 = 0;j1<c;j1++){
    //					for (int j2 = 0;j2<c;j2++){
    //						int max = (int) -1e9;
    //						for (int a = -1;a<=1;a++){
    //							for (int b = -1;b<=1;b++){
    //								int value= 0;
    //								if (j1==j2) value = grid[i][j1] ;
    //								else value= grid[i][j1] + grid[i][j2];
    //								if (j1+a>=0 && j1+a<c && j2+b>=0 && j2+b<c) value +=dp[i+1][j1+a][j2+b];
    //								else value += (int)-1e9;
    //								max = Math.max(max,value);
    //							}
    //						}
    //						dp[i][j1][j2] = max;
    //					}
    //				}
    //			}
    //		return dp[0][0][c-1];
    //	}
    //}


    //   import java.util.* ;
    //    import java.io.*;
    //    public class Solution {
    //    	public static int maximumChocolates(int r, int c, int[][] grid) {
    //    		int [][] dp = new int[c][c];
    //    			for (int j = 0;j<c;j++){
    //    				for (int k = 0;k<c;k++){
    //    					if (j==k) dp[j][k] = grid[r-1][k];
    //    					else dp[j][k] = grid[r-1][j] + grid[r-1][k];
    //    				}
    //    			}
    //
    //    			for (int i = r-2;i>=0;i--){
    //						int [][] curr = new int[c][c];
    //    				for (int j1 = 0;j1<c;j1++){
    //    					for (int j2 = 0;j2<c;j2++){
    //    						int max = (int) -1e9;
    //    						for (int a = -1;a<=1;a++){
    //    							for (int b = -1;b<=1;b++){
    //    								int value= 0;
    //    								if (j1==j2) value = grid[i][j1] ;
    //    								else value= grid[i][j1] + grid[i][j2];
    //    								if (j1+a>=0 && j1+a<c && j2+b>=0 && j2+b<c) value +=dp[j1+a][j2+b];
    //    								else value += (int)-1e9;
    //    								max = Math.max(max,value);
    //    							}
    //    						}
    //    						curr[j1][j2] = max;
    //    					}
    //    				}
    //					dp = curr;
    //    			}
    //    		return dp[0][c-1];
    //    	}
    //    }
}
