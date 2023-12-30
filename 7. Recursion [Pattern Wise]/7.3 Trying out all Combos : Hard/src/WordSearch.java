public class WordSearch {
//    /https://leetcode.com/problems/word-search/

    //https://www.codingninjas.com/studio/problems/word-search---l_892986?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //alag hi type ka badiya question hai aur charo direction me call karni hai and yes it include backtracking also
    //class Solution {
    //    public boolean exist(char[][] board, String word) {
    //        for (int i = 0;i<board.length;i++){
    //            for (int j = 0;j<board[0].length;j++){
    //                if (board[i][j]==word.charAt(0)){
    //                    if (helper(0,i,j,board,word)) return true;
    //                }
    //            }
    //        }
    //        return false;
    //    }
    //    public boolean helper(int idx,int i,int j,char[][]board,String word){
    //        if (idx >= word.length()) return true;
    //        if (i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] != word.charAt(idx) || board[i][j]=='.') return false;
    //        board[i][j] = '.';
    //        boolean temp = helper(idx+1,i+1,j,board,word) ||  helper(idx+1,i,j+1,board,word) || helper(idx+1,i-1,j,board,word) || helper(idx+1,i,j-1,board,word);
    //        board[i][j] = word.charAt(idx);
    //        return temp;
    //    }
    //}
}
