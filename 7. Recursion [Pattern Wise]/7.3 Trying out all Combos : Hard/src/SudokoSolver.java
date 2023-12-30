public class SudokoSolver {
    //leetcode 37
    //https://www.codingninjas.com/studio/problems/sudoku-solver_8416969?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//https://leetcode.com/problems/sudoku-solver/

    //isme bas loop chalao dekho jaha dot hai vaha pe fill karo num from 1 to 9 and dekho ho pa rahe hai kya if yes toh doing recursive calls if this recursion call return true than badiya return true otherwise backtrack and vapas dot .  lagate jao
    // fir bas agar end tak pahuch paye toh bas return true your answer is ready
    //class Solution {
    //    public void solveSudoku(char[][] board) {
    //        helper (board);
    //    }
    //    public boolean helper (char[][] board){
    //        for (int i = 0;i<board.length;i++){
    //            for (int j = 0;j<board.length;j++){
    //                if (board[i][j]=='.'){
    //                    for (int n = 1;n<=9;n++){
    //                        if (isValid(board,i,j,n)){
    //                            board[i][j]=(char)(n+48);
    //                            if (helper(board)) return true;
    //                            else board[i][j]='.';
    //                        }
    //                    }
    //                        return false;
    //                }
    //            }
    //        }
    //        return true;
    //    }
    //    public boolean isValid (char[][] board,int x, int y,int num){
    //        for (int i = 0;i<board.length;i++){
    //            if ((board[i][y]-48)==num) return false;
    //        }
    //        for (int j = 0;j<board.length;j++){
    //            if((board[x][j]-48)==num) return false;
    //        }
    //        int row = x/3*3;
    //        int col = y/3*3;
    //        for (int i = row;i<row+3;i++){
    //            for (int j = col;j<col+3;j++){
    //                if ((board[i][j]-48)==num) return false;
    //            }
    //        }
    //        return true;
    //    }
    //}
}
