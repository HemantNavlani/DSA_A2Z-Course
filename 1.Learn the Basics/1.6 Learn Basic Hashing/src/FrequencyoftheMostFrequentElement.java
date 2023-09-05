import java.lang.reflect.Array;
import java.util.Arrays;

public class FrequencyoftheMostFrequentElement {

    //https://leetcode.com/problems/frequency-of-the-most-frequent-element/description/

    //1838. Frequency of the Most Frequent Element

    //Question simple hai read these notes along with the code for better understanding

    //I checked out the solution from youtube -
    //https://youtu.be/p_RnDTuuhQ0?si=Nmat5HCtV7emehHg



    //dekho aisa hai hamare pass h sirf plus karne ka option toh hum ghata toh skte nhi hai
    //1 4 8 13 hai hamare pass and k = 5

   /*
   ab hamne rakha left and right 0 and ek banaya sum variable jisme array ki phli value dal di idhar vo 1 hai
   left = 0
   right = 0
   sum = nums[0]  // 1
   ans = 0

   ab karna ye hai ki array sorted karna hai fir ab har ek possible window banao har size ki 1,2,3,... ek ek karke
   //phle banai khali ek size ki
   jisme array ka khali ek element tha 1 ab isme dekho ki ye hi max hai aur bina operations kiye hi ham isse max element ke barabar bana diya matlab bana kya diya phle se hi hai
   //theek toh ye ek answer possible hai


   ab aage badhte hai right badao so
   right = 0/1/
   toh window size 2 ka hogaya
   ab isme max hai right most element as array is sorted
   Yaha dekhni hai main cheez ki kya ham jo bhi elements hai other than max element kya hum unko max element ke barabar kar denge K se kam ya barabar operations me agar haan toh ab vo answer hoga kyunki ab iss window ke
   saare elements hi max ke barabar hosakte hai so abhi tak yahi max freq ho jayegi
   aur haan sum me bhi nums[right] add karna tha
   sum += nums[right]

   ab ya toh ham ek ek element pe jaye aur usse max ke barabar kare fir operations count kare fir dekhe ki are ye k se jyada toh nhi hogaye
   iski jagah simple maths lagate hai ki

   (dekho jo sum hai na vo actually current window ka sum hai)
   toh hamne kiya kya ki size of window liya aur usme max element ka multiply kar diya iska matlab ham soch rahe hai ki sare elements window ke max element ke barabar hogaye hai
   aur doosri taraf hamne nikala k + sum
   sum toh window ka sum hai + operations available toh ye hamesha bada ya equal baithna chahiye tabhi toh kam hoga todha socho tandhe dimag se
     if ((right-left+1)*nums[right]<=k+sum) // tabhi toh ye kiya hai
     aisa hai toh humne

     ans update kardena hai agar ye window size ans se bada hai toh
                ans = Math.max(ans,right-left+1);

   aur abhi bhi ye answer ek possible answer hi hai may be window aur badi karne par answer bade so do right ++;

       if ((right-left+1)*nums[right]<=k+sum) agar ye condition nhi satisfy ho rahi matlab window badi ban gayi hai toh change karo window ab left ko aage bada do
       iska matlab hai hamne left ko fix rakhkar sari possible windows bana li hai aur possible ans se ham go through kar chuke hai
       sum bhi dhyan rahe hamesha current window ka hi rahna chahiye

       so do sum-=nums[left]
       then
       so ab do left ++


       fir at the end ans return kar do
   * */

    //class Solution {
    //    public int maxFrequency(int[] nums, int k) {
    //        Arrays.sort(nums);
    //        int left = 0;
    //        int right = 0;
    //        long sum = nums[0];
    //        int ans = 0;
    //
    //        while (right<nums.length){
    //            if ((right-left+1)*nums[right]<=k+sum){
    //                ans = Math.max(ans,right-left+1);
    //                right++;
    //                if (right<nums.length) sum+=nums[right];
    //            }
    //            else {
    //                sum-=nums[left];
    //                left++;
    //            }
    //        }
    //        return ans;
    //    }
    //}


}
