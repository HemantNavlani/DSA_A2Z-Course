public class TrappingRainwatwr {
    //https://www.interviewbit.com/problems/nearest-smaller-element/

    //https://codingninjas.com/studio/problems/trapping-rain-water_630519?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

    //iss approach me toh easy hai hamne ek premax name ka array banaya hai aur doosra ek hamne sufmax ka jisme hamne
    //current element ke left ya right me jo bhi max element hai usko liya aur uss hissab se current idx ka pani nikala aur sab add kar diya
    // O(N) time laga and O(N) hi space laga
    //class Solution {
    //    public int trap(int[] height) {
    //        int n = height.length;
    //        int[] preMax = new int[n];
    //        int[] sufMax = new int[n];
    //
    //        preMax[0] = height[0];
    //        for (int i = 1;i<n;i++){
    //            if (height[i]>preMax[i-1]) preMax[i]=height[i];
    //            else preMax[i] = preMax[i-1];
    //        }
    //
    //        sufMax[n-1] = height[n-1];
    //        for (int i = n-2;i>=0;i--){
    //            if(height[i]>sufMax[i+1]) sufMax[i] = height[i];
    //            else sufMax[i] = sufMax[i+1];
    //        }
    //        int ans = 0;
    //        for (int i = 0;i<n;i++){
    //            int add = sufMax[i]<preMax[i] ? sufMax[i] : preMax[i];
    //            ans+=add-height[i];
    //        }
    //        return ans;
    //    }
    //}


    //better approach yaha ham 2 pointer approach laga ke space bacha skte hai

    //class Solution {
    //    public int trap(int[] height) {
    //        int res = 0;
    //        int n = height.length;
    //        int l = 0;
    //        int r = n-1;
    //        int lmax = 0;
    //        int rmax = 0;
    //        while (l<=r){
    //            if (height[l]<=height[r]){
    //                if (height[l]>=lmax) lmax = height[l];
    //                else res += lmax-height[l];
    //                l++;
    //            }
    //            else{
    //                if (height[r]>=rmax) rmax = height[r];
    //                else res += rmax-height[r];
    //                r--;
    //            }
    //        }
    //        return res;
    //    }
    //}
}
