import java.util.*;

public class MaximumSumCombinations {

    //mast question hai logic easy hai but bahut sari cheeze likhni thi read the code you will get it
    //sorty karlo aur piche se uthao pairs aur heap me dalo aur index bhi store karao heap me bhi and set me bhi aur check kaor agar set me nhi hai toh aage badho iske liye kuch customn classses and uske comparator and funnction bhi likhne pade 
    //public class Solution {
    //    class Triplet{
    //        int sum;
    //        int x;
    //        int y;
    //        Triplet(int sum,int x, int y){
    //            this.sum = sum;
    //            this.x = x;
    //            this.y = y;
    //        }
    //    }
    //    class Pair{
    //        int x;
    //        int y;
    //        Pair(int x, int y){
    //            this.x = x;
    //            this.y = y;
    //        }
    //        public boolean equals(Object o) {
    //        if (this == o) return true;
    //        if (o == null || getClass() != o.getClass()) return false;
    //        Pair pair = (Pair) o;
    //        return (x == pair.x && y == pair.y);
    //    }
    //
    //    public int hashCode() {
    //        return Objects.hash(x, y);
    //    }
    //    }
    //    class TripletComparator implements Comparator<Triplet>{
    //        public int compare(Triplet t1,Triplet t2){
    //            return -1*Integer.compare(t1.sum,t2.sum);
    //        }
    //    }
    //    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, int C) {
    //        Collections.sort(A);
    //        Collections.sort(B);
    //        ArrayList<Integer> ans = new ArrayList<>();
    //        PriorityQueue<Triplet> pq = new PriorityQueue<>(new TripletComparator());
    //        HashSet<Pair> st = new HashSet<>();
    //        int a = A.get(A.size()-1);
    //        int b = B.get(B.size()-1);
    //        pq.add(new Triplet(a+b,A.size()-1,B.size()-1));
    //        st.add(new Pair (A.size()-1,B.size()-1));
    //        while (C>0){
    //            Triplet t = pq.remove();
    //            int sum = t.sum;
    //            int i = t.x;
    //            int j = t.y;
    //            ans.add(sum);
    //            if (!st.contains(new Pair(i-1,j))){
    //                pq.add(new Triplet(A.get(i-1)+B.get(j),i-1,j));
    //                st.add(new Pair(i-1,j));
    //            }
    //            if (!st.contains(new Pair(i,j-1))){
    //                pq.add(new Triplet(A.get(i)+B.get(j-1),i,j-1));
    //                st.add(new Pair(i,j-1));
    //            }
    //            C--;
    //        }
    //        return ans;
    //    }
    //}
}