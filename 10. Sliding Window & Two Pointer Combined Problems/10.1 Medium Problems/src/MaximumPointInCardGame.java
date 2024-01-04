public class MaximumPointInCardGame {
    //isme hame ulta sochna hai ki jo not included vale hai unki window manenge aur bache hue elements ko dekhenge ki sum max hua ki nhi
    //ye bhi algorithm hq ki video se dekha tha fir hua

    //https://www.codingninjas.com/studio/problems/maximum-points-from-cards_8391016?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    //https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

    //class Solution {
    //    public int maxScore(int[] cardPoints, int k) {
    //        int n = cardPoints.length;
    //        int l = 0;
    //        int r = n-1;
    //        int sum = 0;
    //        for (int i = 0;i<k;i++){
    //            sum+=cardPoints[i];
    //        }
    //        l = k;
    //        int ans = sum;
    //        while (l>0 && l<n){
    //            l--;
    //            sum-=cardPoints[l];
    //            sum+=cardPoints[r];
    //            r--;
    //            ans=Math.max(ans,sum);
    //        }
    //        return ans;
    //    }
    //}
}
