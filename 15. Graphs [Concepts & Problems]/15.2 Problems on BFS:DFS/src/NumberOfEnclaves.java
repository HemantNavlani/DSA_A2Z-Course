public class NumberOfEnclaves {
//    same as surround regions
    //https://www.codingninjas.com/studio/problems/matrix-traps_8365440?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //https://leetcode.com/problems/number-of-enclaves/submissions/1167006424/

    //by bfs  niche dfs vala bhi hai but coding ninjas pe dfs fully accept nhi hua tha
    //class Solution {
    //    class Pair{
    //        int x;
    //        int y;
    //        Pair(int x,int y){
    //            this.x=x;
    //            this.y=y;
    //        }
    //    }
    //    public int numEnclaves(int[][] grid) {
    //        int m=grid.length;
    //        int n = grid[0].length;
    //        Queue<Pair> q = new LinkedList<>();
    //        int [][]visited = new int[m][n];
    //        for (int i = 0;i<m;i++){
    //            for (int j= 0;j<n;j++){
    //                if (i==0 || j== 0 || i==m-1 || j==n-1){
    //                    if (grid[i][j]==1){
    //                    q.add(new Pair(i,j));
    //                    visited[i][j]=1;
    //                    }
    //                }
    //            }
    //        }
    //        while (q.size()!=0){
    //            Pair p = q.remove();
    //            int x = p.x;
    //            int y = p.y;
    //
    //            if(x-1>=0 && visited[x-1][y]==0 && grid[x-1][y]==1){
    //                visited[x-1][y]=1;
    //                q.add(new Pair(x-1,y));
    //            }
    //            if(y-1>=0 && visited[x][y-1]==0 && grid[x][y-1]==1){
    //                visited[x][y-1]=1;
    //                q.add(new Pair(x,y-1));
    //            }
    //            if(x+1<m && visited[x+1][y]==0 && grid[x+1][y]==1){
    //                visited[x+1][y]=1;
    //                q.add(new Pair(x+1,y));
    //            }
    //            if(y+1<n && visited[x][y+1]==0 && grid[x][y+1]==1){
    //                visited[x][y+1]=1;
    //                q.add(new Pair(x,y+1));
    //            }
    //        }
    //        int ans = 0;
    //        for (int i = 0;i<m;i++){
    //            for (int j = 0;j<n;j++){
    //                if (grid[i][j]==1 && visited[i][j]==0) ans++;
    //            }
    //        }
    //        return ans;
    //    }
    //}
    //class Solution {
    //    void dfs(int x,int y,int[][]grid ,int[][]visited){
    //        visited[x][y]=1;
    //
    //        if ( x-1>=0 && visited[x-1][y]==0 && grid[x-1][y]==1){
    //            dfs(x-1,y,grid,visited);
    //        }
    //        if ( y-1>=0 && visited[x][y-1]==0 && grid[x][y-1]==1){
    //            dfs(x,y-1,grid,visited);
    //        }
    //        if ( x+1<grid.length && visited[x+1][y]==0 && grid[x+1][y]==1){
    //            dfs(x+1,y,grid,visited);
    //        }
    //        if  ( y+1<grid[0].length && visited[x][y+1]==0 && grid[x][y+1]==1){
    //            dfs(x,y+1,grid,visited);
    //        }
    //    }
    //    public int numEnclaves(int[][] grid) {
    //        int m = grid.length;
    //        int n = grid[0].length;
    //        int[][] visited = new int[m][n];
    //        for (int i = 0;i<n;i++){
    //            if (visited[0][i]==0 && grid[0][i]==1){
    //                dfs(0,i,grid,visited);
    //            }
    //        }
    //        for (int i = 0;i<m;i++){
    //            if (visited[i][0]==0 && grid[i][0]==1){
    //                dfs(i,0,grid,visited);
    //            }
    //        }
    //        for (int i =0 ;i<n;i++){
    //            if (visited[m-1][i]==0 && grid[m-1][i]==1){
    //                dfs(m-1,i,grid,visited);
    //            }
    //        }
    //        for (int i = 0;i<m;i++){
    //            if (visited[i][n-1]==0 && grid[i][n-1]==1){
    //                dfs(i,n-1,grid,visited);
    //            }
    //        }
    //        int ans = 0;
    //        for (int i=0;i<m;i++){
    //            for (int j = 0;j<n;j++){
    //                if (grid[i][j]==1 && visited[i][j]==0) ans++;
    //            }
    //        }
    //        return ans;
    //    }
    //}

}
