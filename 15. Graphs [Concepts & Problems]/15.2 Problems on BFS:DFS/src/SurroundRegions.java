public class SurroundRegions {
    // a set of zeros which is connected to a boundary cannot be converted to X

    //start form the zeros touched with boundary and mark them that they will not be converted

    //convert the remaining O's

    //From boundary find O's and  traverse and mark all O's connected to it

    //https://leetcode.com/problems/surrounded-regions/
    //https://www.codingninjas.com/studio/problems/replace-%E2%80%98o%E2%80%99-with-%E2%80%98x%E2%80%99_630517?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //class Solution {
    //    void dfs(int x,int y,char[][] board,int[][]visited){
    //        visited[x][y]=1;
    //        if (x-1>=0 && visited[x-1][y]==0 && board[x-1][y]=='O'){
    //            dfs(x-1,y,board,visited);
    //        }
    //        if (y-1>=0 && visited[x][y-1]==0 && board[x][y-1]=='O'){
    //            dfs(x,y-1,board,visited);
    //        }
    //        if (x+1<board.length && visited[x+1][y]==0 && board[x+1][y]=='O'){
    //            dfs(x+1,y,board,visited);
    //        }
    //        if (y+1<board[0].length && visited[x][y+1]==0 && board[x][y+1]=='O'){
    //            dfs(x,y+1,board,visited);
    //        }
    //    }
    //    public void solve(char[][] board) {
    //        int m = board.length;
    //        int n = board[0].length;
    //        int[][] visited = new int[m][n];
    //        for (int i = 0;i<n;i++){
    //            if (board[0][i]=='O'){
    //                dfs(0,i,board,visited);
    //            }
    //        }
    //        for (int i = 0;i<m;i++){
    //            if (board[i][0]=='O'){
    //                dfs(i,0,board,visited);
    //            }
    //        }
    //        for (int i = 0;i<n;i++){
    //            if (board[m-1][i]=='O'){
    //                dfs(m-1,i,board,visited);
    //            }
    //        }
    //        for (int i = 0;i<m;i++){
    //            if (board[i][n-1]=='O'){
    //                dfs(i,n-1,board,visited);
    //            }
    //        }
    //
    //        for (int i = 0;i<board.length;i++){
    //            for (int j = 0;j<board[0].length;j++){
    //                if (board[i][j]=='O'){
    //                    if (visited[i][j]==0){
    //                        board[i][j]='X';
    //                    }
    //                }
    //            }
    //        }
    //    }
    //}

}
