//public class SetMatrixZeros {
//    //leetcode 73
//    //https://leetcode.com/problems/set-matrix-zeroes/description/
//
//    //https://www.codingninjas.com/studio/problems/zero-matrix_1171153?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=1
//    //Brute me ye hai ki ham jaha bhi zero dikhe us poori row and column me hum -1 mark karke aa jaye except that point jaha zero mila tha fir end me jaha jaha -1 hai vaha zero karke aa jaye
//
////Better approach --
//yaha hum alag arrays banayenge usme store karenge ki kaunsi row ya column ko zero rakhna h fir kardenge unhe zero jake
//class Solution {
//    public void setZeroes(int[][] matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        boolean [] row = new boolean [m];
//        boolean [] col = new boolean [n];
//        for(int i=0;i<m;i++){
//            for (int j=0;j<n;j++){
//                if (matrix[i][j]==0) {
//                    row[i]=true;
//                    col[j]=true;
//                }
//            }
//        }
//
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if (row[i] || col[j]) {
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//    }
//}
//
//
////Optimal approach - yaha hamne ussi array me row 0 col 0 ko hi rakh liya hai extra space ke liye hence extra space is reduced.
//class Solution {
//    public void setZeroes(int[][] matrix) {
//        int m = matrix.length;
//        int n = matrix[0].length;
//        int col0 = matrix[0][0];
//        for(int i=0;i<m;i++){
//            for (int j=0;j<n;j++){
//                if (matrix[i][j]==0) {
//                    matrix[i][0] = 0;
//                    if (j!=0){
//                        matrix[0][j] = 0;
//                    }
//                    else{
//                        col0 = 0;
//                    }
//                }
//            }
//        }
//
//        for (int i=1;i<m;i++){
//            for (int j=1;j<n;j++){
//                if (matrix[i][j]!=0){
//                if (matrix[i][0] == 0 || matrix[0][j]==0){
//                    matrix[i][j]=0;
//                }
//                }
//            }
//        }
//        if (matrix[0][0]==0){
//            for (int j=0;j<n;j++){
//                matrix[0][j] = 0;
//            }
//        }
//
//        if (col0==0){
//            for (int i=0;i<m;i++){
//                matrix[i][0] = 0;
//            }
//        }
//    }
//}
//                }
//            }
//        }
//        if (matrix[0][0]==0){
//            for (int j=0;j<m;j++){
//                matrix[0][j] = 0;
//            }
//        }
//
//        if (col0==0){
//            for (int i=0;i<m;i++){
//                matrix[i][0] = 0;
//            }
//        }
//    }
//}