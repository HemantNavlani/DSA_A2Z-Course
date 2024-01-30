public class Candy {
    //isme phle candy ka array banao aur uspe kam karo
    //phle ek pass lo left to right for left neighbour check karo and fir ek pass right to left for right neighbour check karo
    //this will solve the question just sum the candy array
    //https://www.codingninjas.com/studio/problems/candies_893290?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

    //class Solution {
    //    public int candy(int[] ratings) {
    //        int[] arr = new int [ratings.length];
    //        for (int i = 1;i<arr.length;i++){
    //            if (ratings[i]>ratings[i-1]){
    //                arr[i] = arr[i-1]+1;
    //            }
    //        }
    //        for (int i = arr.length-2;i>=0;i--){
    //            if (ratings[i]>ratings[i+1]){
    //                arr[i]=Math.max(arr[i],arr[i+1]+1);
    //            }
    //        }
    //        int ans = 0;
    //        for (int i = 0;i<arr.length;i++){
    //            ans+=arr[i];
    //        }
    //        ans+=arr.length;
    //        return ans;
    //    }
    //}
}
