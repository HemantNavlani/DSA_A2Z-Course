public class ExpressionAddOperators {
//hai todha ajeeb sa question todha dekh lena video vagarah ya code se go through karo baaki multiply me dikkat hai bas usse dekhlo kyunki priotity jyada hai uski
    //class Solution {
    //    public List<String> addOperators(String num, int target) {
    //        List<String> ans = new ArrayList<>();
    //        helper (0,num,target,"",ans,0,0);
    //        return ans;
    //    }
    //    public void helper (int idx, String num,int target, String keeper, List<String> ans, long prev, long res){
    //        if (idx>=num.length()){
    //            if (res==target) ans.add(keeper);
    //            return;
    //        }
    //        String st = "";
    //        long currRes = 0;
    //        for (int i = idx;i<num.length();i++){
    //            if (i>idx && num.charAt(idx)=='0') break;
    //            st+=num.charAt(i);
    //            currRes = currRes*10+(num.charAt(i)-'0');
    //            if (idx==0) helper(i+1,num,target,st,ans,currRes,currRes);
    //            else{
    //                helper(i+1,num,target,keeper+"+"+st,ans,currRes,res+currRes);
    //                helper(i+1,num,target,keeper+"-"+st,ans,-currRes,res-currRes);
    //                helper(i+1,num,target,keeper+"*"+st,ans,prev*currRes,res-prev+(prev*currRes));
    //            }
}