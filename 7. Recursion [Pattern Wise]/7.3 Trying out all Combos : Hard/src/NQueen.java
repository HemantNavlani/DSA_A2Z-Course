public class NQueen {

    //kuch nhi question same sa hi hai jo ab tak kiye hai baki striver ki video dekh lo explanation part
    //baki isSafe me sari 8 direction me check karne ke jarurat hi nhi khali 3 direction dekho enough hai
    //https://leetcode.com/problems/n-queens/
    //https://www.codingninjas.com/studio/problems/n-queens_696453?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //class Solution {
    //    public List<List<String>> solveNQueens(int n) {
    //        List<List<String>> ans = new ArrayList<>();
    //        char[][] board = new char[n][n];
    //        for (int i =0;i<n;i++){
    //            for (int j = 0;j<n;j++){
    //                board[i][j]='.';
    //            }
    //        }
    //        for (int i = 0;i<n;i++){
    //            helper(0,i,ans,board,n);
    //        }
    //        return ans;
    //    }
    //    public void helper (int idx,int col,List<List<String>> ans,char[][]board,int n){
    //        if (idx == n){
    //            List<String> keeper = new ArrayList<>();
    //            for (int i =0;i<n;i++){
    //                String str = "";
    //                for (int j = 0;j<n;j++){
    //                    str+=board[i][j];
    //                }
    //                keeper.add(str);
    //            }
    //            ans.add(keeper);
    //            return;
    //        }
    //        if (col>=n) return;
    //        for (int i = 0;i<n;i++){
    //            if (isSafe(board,i,col)){
    //                board[i][col] = 'Q';
    //                helper(idx+1,col+1,ans,board,n);
    //            }
    //            board[i][col]= '.';
    //        }
    //    }
    //
    //    public boolean isSafe(char[][] board,int a, int b){
    //        int n = board.length;
    //        for (int j = b;j>=0;j--){
    //            if (board[a][j]=='Q') return false;
    //        }
    //
    //        int i = a, j = b;
    //        while (i>=0 && j>=0){
    //            if (board[i][j]=='Q') return false;
    //            i--;
    //            j--;
    //        }
    //        i = a; j = b;
    //        while (i<n && j>=0){
    //            if (board[i][j]=='Q') return false;
    //            i++;
    //            j--;
    //        }
    //        return true;
    //    }
    //}public class NQueen {
    //
    //    //kuch nhi question same sa hi hai jo ab tak kiye hai baki striver ki video dekh lo explanation part
    //    //baki isSafe me sari 8 direction me check karne ke jarurat hi nhi khali 3 direction dekho enough hai
    //    //https://leetcode.com/problems/n-queens/
    //    //https://www.codingninjas.com/studio/problems/n-queens_696453?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //    //class Solution {
    //    //    public List<List<String>> solveNQueens(int n) {
    //    //        List<List<String>> ans = new ArrayList<>();
    //    //        char[][] board = new char[n][n];
    //    //        for (int i =0;i<n;i++){
    //    //            for (int j = 0;j<n;j++){
    //    //                board[i][j]='.';
    //    //            }
    //    //        }
    //    //        for (int i = 0;i<n;i++){
    //    //            helper(0,i,ans,board,n);
    //    //        }
    //    //        return ans;
    //    //    }
    //    //    public void helper (int idx,int col,List<List<String>> ans,char[][]board,int n){
    //    //        if (idx == n){
    //    //            List<String> keeper = new ArrayList<>();
    //    //            for (int i =0;i<n;i++){
    //    //                String str = "";
    //    //                for (int j = 0;j<n;j++){
    //    //                    str+=board[i][j];
    //    //                }
    //    //                keeper.add(str);
    //    //            }
    //    //            ans.add(keeper);
    //    //            return;
    //    //        }
    //    //        if (col>=n) return;
    //    //        for (int i = 0;i<n;i++){
    //    //            if (isSafe(board,i,col)){
    //    //                board[i][col] = 'Q';
    //    //                helper(idx+1,col+1,ans,board,n);
    //    //            }
    //    //            board[i][col]= '.';
    //    //        }
    //    //    }
    //    //
    //    //    public boolean isSafe(char[][] board,int a, int b){
    //    //        int n = board.length;
    //    //        for (int j = b;j>=0;j--){
    //    //            if (board[a][j]=='Q') return false;
    //    //        }
    //    //
    //    //        int i = a, j = b;
    //    //        while (i>=0 && j>=0){
    //    //            if (board[i][j]=='Q') return false;
    //    //            i--;
    //    //            j--;
    //    //        }
    //    //        i = a; j = b;
    //    //        while (i<n && j>=0){
    //    //            if (board[i][j]=='Q') return false;
    //    //            i++;
    //    //            j--;
    //    //        }
    //    //        return true;
    //    //    }
    //    //}
    //}

}
