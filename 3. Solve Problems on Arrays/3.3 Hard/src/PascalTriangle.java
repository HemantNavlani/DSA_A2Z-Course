public class PascalTriangle {
    //leetcode 118

    //https://leetcode.com/problems/pascals-triangle/submissions/1065053631/


    //https://www.codingninjas.com/studio/problems/print-pascal-s-triangle_6917910?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    //Dekho pascal triangle ka formula rahta hai ki  (r-1)C(c-1) . r-> row number c -> column number C combination (according to one based indexing  of r and c) so we can go on each index and then find the number according to the formula.
    //The above is the only approach
    //
    //In basic approach we can do this and for every place we can call the find_nCr everytime
    //We can only optimise this part of finding nCr by some sort of tricks and techniques .
    //class Solution {
    //
    //    public long  findNcR(int n, int r){
    //        long ans=1;
    //        for (int i=0;i<r;i++){
    //            ans*=n-i;
    //            ans/=i+1;
    //        }
    //        return ans;
    //    }
    //    public List<List<Integer>> generate(int numRows) {
    //        List<List<Integer>> ans = new ArrayList<>();
    //        for (int i=0;i<numRows;i++){
    //            List<Integer> l = new ArrayList<>();
    //            for(int j=0;j<i+1;j++){
    //                l.add((int)findNcR(i,j));
    //            }
    //            ans.add(l);
    //        }
    //        return ans;
    //    }
    //}
    //
    //
    //
    //This is optimal approach 0(n^2) me hogaya kaam
    //class Solution {
    //    public List<List<Integer>> generate(int numRows) {
    //       List<List<Integer>> ans = new ArrayList<>();
    //            for (int i=1;i<=numRows;i++){
    //                List<Integer> l = new ArrayList<>();
    //                long a = 1;
    //                for (int j=1;j<i+1;j++){
    //                    l.add((int)a);
    //                    a*=i-j;
    //                    a/=j;
    //                }
    //                ans.add(l);
    //            }
    //            return ans;
    //    }
    //}
}


