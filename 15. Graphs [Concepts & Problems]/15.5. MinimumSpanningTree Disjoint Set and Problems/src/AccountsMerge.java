public class AccountsMerge {
    //https://leetcode.com/problems/accounts-merge/
    //https://www.codingninjas.com/studio/problems/accounts-merge_1089558?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

//    Hai todha tedha question concepts basic vohi hai //
    //phle hame ek hashmap banana hai usme mails store karte jana hai aur uski hi help se hame disjoint set aur parent list ko fill karte chalna hai main kam ye hi hai see code once
    // fir hame uski hi help se usko merge karna hai and fir step 3 me toh mainly desired form me answer return karne ke liye mehnat karni hai
//    see the code once to get better understanding
    //class Solution {
    //    class DisjointSet{
    //        ArrayList<Integer> parent = new ArrayList<>();
    //        ArrayList<Integer> size = new ArrayList<>();
    //        DisjointSet(int n){
    //            for (int i = 0;i<=n;i++){
    //                parent.add(i);
    //                size.add(1);
    //            }
    //        }
    //        int findUltPar (int node){
    //            if (node == parent.get(node)) return node;
    //            int ultP = findUltPar(parent.get(node));
    //            parent.set(node,ultP);
    //            return parent.get(node);
    //        }
    //        void unionBySize(int u, int v){
    //            int ultU = findUltPar(u);
    //            int ultV = findUltPar(v);
    //            if (ultU == ultV) return;
    //            if (size.get(ultU)<size.get(ultV)){
    //                parent.set(ultU,ultV);
    //                size.set(ultV,size.get(ultU)+size.get(ultV));
    //            }
    //            else{
    //                parent.set(ultV,ultU);
    //                size.set(ultU,size.get(ultU)+size.get(ultV));
    //            }
    //        }
    //    }
    //    public List<List<String>> accountsMerge(List<List<String>> accounts) {
    //        // step 1 connecting the nodes, making the disjoint set and setting up the ultimate parents
    //        int n = accounts.size();
    //        DisjointSet ds = new DisjointSet(n);
    //        HashMap<String,Integer> mapMailNode = new HashMap<>();
    //        for (int i = 0;i<n;i++){
    //            for (int j = 1;j<accounts.get(i).size();j++){
    //                String str = accounts.get(i).get(j);
    //                if (!mapMailNode.containsKey(str)) mapMailNode.put(str,i);
    //                else ds.unionBySize(i,mapMailNode.get(str));
    //            }
    //        }
    //        //step 2 merging the mails according to their disjoint set and ultimate parent
    //        ArrayList<String>[] mergedMail = new ArrayList[n];
    //        for (int i = 0;i<n;i++) mergedMail[i] = new ArrayList<>();
    //
    //        for (String str :mapMailNode.keySet()){
    //            int node  = ds.findUltPar(mapMailNode.get(str));
    //            mergedMail[node].add(str);
    //        }
    //
    //        // step 3 Merging them to return the final answer
    //        List<List<String>> ans = new ArrayList<>();
    //        for (int i = 0;i<n;i++){
    //            if (mergedMail[i].size()==0) continue;
    //            Collections.sort(mergedMail[i]);
    //            ArrayList<String> temp = new ArrayList<>();
    //            temp.add(accounts.get(i).get(0));
    //            for (String str : mergedMail[i]){
    //                temp.add(str);
    //            }
    //            ans.add(temp);
    //        }
    //        return ans;
    //    }
    //}
}
