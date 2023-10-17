public class FindaPeakElement {
    //leetcode 1901

    //https://leetcode.com/problems/find-a-peak-element-ii/description/

    //https://www.codingninjas.com/studio/problems/find-peak-element_7449073?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf


// this is the brute force approach in which we are going and checking each element for being a peak element, in this a small optimization can be that we just go and find the largest number vo bhi shi answer hoga
//TC is around O(N*M)
    //class Solution {
//    public int[] findPeakGrid(int[][] mat) {
//        int n = mat.length;
//            int m = mat[0].length;
//            for (int i=0;i<mat.length;i++){
//                for (int j=0;j<mat[0].length;j++){
//                    if ((j-1<0 || mat[i][j]>mat[i][j-1]) && (j+1>=m || mat[i][j]>mat[i][j+1]) && (i-1<0 || mat[i][j]>mat[i-1][j]) && ( i+1>=n || mat[i][j]>mat[i+1][j])){
//                        return new int[]{i,j};
//                    }
//                }
//            }
//            return new int []{-1,-1};
//        }
//
//}

//optimal approach --> intituition peak element 1 se uthai hai jo BS in 1d arrays me kiya tha humne
//Hamne yaha column wise binary search lagai hai phle jo mid column hai usme se max element dhund ke laye hai kyunki vo ek possible ans ho skta hai fir usse ledt and right wale se compare kiya hai
//agar badha nikla toh vohi answer hai else if agar left vale se chota hua toh end = mid -1 kar denge else st = mid +1

// pahad vala approach lagaya hai ki agar --> is order me hai a b c

// and if a < b< c so peak is ahead for b
// and if a> b> c then peak was behind for b
// and is a< b>c then b  is the peak

    //TC is O(log m * n)

//class Solution {
//    public int maxInCol (int[][] mat,int col){
//        int maxIdx = -1;
//        int max = Integer.MIN_VALUE;
//        for (int i=0;i<mat.length;i++){
//            if (mat[i][col]>max){
//                max = mat[i][col];
//                maxIdx = i;
//            }
//        }
//        return maxIdx;
//    }
//    public int[] findPeakGrid(int[][] mat) {
//        int n = mat.length;
//        int m = mat[0].length;
//
//        int st = 0;
//        int end = m-1;
//
//        while (st<=end){
//            int mid = st+(end-st)/2;
//            int row = maxInCol (mat,mid);
//            int left = mid-1>=0 ? mat[row][mid-1] : -1;
//            int right = mid+1<m ? mat[row][mid+1] : -1;
//
//            if (mat[row][mid]>left && mat[row][mid]>right) return new int []{row,mid};
//            else if (mat[row][mid]<left) end = mid-1;
//            else st = mid+1;
//        }
//        return new int[]{-1,-1};
//    }
}
