public class LargestOddNumberinString {

    //Brute force done but TLE as we are applying O(N*N)
   //class Solution {
        //    public String largestOddNumber(String num) {
        //        int check = num.charAt(num.length()-1) - 48;
        //        if (check %2==1) return num;
        //        String ans ="";
        //        int n = num.length();
        //        int maxLen = Integer.MIN_VALUE;
        //        for (int i = 0;i<n;i++){
        //            String str = "";
        //            for (int j=i;j<n;j++){
        //                str += num.charAt(j);
        //                int endDigit = str.charAt(str.length()-1)-48;
        //                if (str.length()>maxLen && endDigit%2==1){
        //                    ans = str;
        //                    maxLen = str.length();
        //                }
        //            }
        //        }
        //        return ans;
        //    }
        //}

        //optimal O(N)  apprach isme hamne bas yahi dekha hai ki bhai jaha odd number aa raha hai vaha tak ki poori string can be a probabale answer
        //class Solution {
        //    public String largestOddNumber(String num) {
        //        for (int i=num.length()-1;i>=0;i--){
        //            if ((num.charAt(i)-48) % 2 == 1) {
        //                return num.substring(0,i+1);
        //            }
        //        }
        //        return "";
        //    }
        //}

}
