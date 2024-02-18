public class FloydWarshallAlgorithm {
    //it is a multisource shortest path algorithm and also helps to detect negative cycles as well
//    https://www.codingninjas.com/studio/problems/floyd-warshall_2041979?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
//https://www.geeksforgeeks.org/problems/implementing-floyd-warshall2042/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=implementing-floyd-warshall
//    Note Go via every vertex/node


    //The algorithm is not much intuitive as the other ones. It is more of a brute force, where all combination of paths have been tried to get the shortest paths.
    //Nothing to be panic much on the intuition, it is a simple brute on all paths. Focus on the three for

//    How to detect negative cycles --> kuch nhi bas dekho ki node ka khud se hi distance agar negative hai toh means negative cycle exists
//    for (i=0 to N ){
//    if (cost[i][i] == -ve) {
//    negative cycle exists
//}
//}

//    Read the code it is kind of a brute force approach har ek node par ham kam kar rahe hai

    ///
//    class Solution{
//        public void shortest_distance(int[][] matrix){
//            int n = matrix.length;
//            for (int i = 0;i<n;i++){
//                for (int j=0;j<n;j++){
//                    if (matrix[i][j]==-1) matrix[i][j]=(int)1e9;
//                }
//                matrix[i][i] = 0;
//            }
//
//            for (int k = 0;k<n;k++){
//                for (int i = 0;i<n;i++){
//                    for (int j = 0;j<n;j++){
//                        matrix[i][j] = Math.min(matrix[i][j],matrix[i][k]+matrix[k][j]);
//                    }
//                }
//            }
//            for (int i = 0;i<n;i++){
//                for (int j=0;j<n;j++){
//                    if (matrix[i][j]==(int)1e9) matrix[i][j]=-1;
//                }
//            }
//        }
//    }
}
