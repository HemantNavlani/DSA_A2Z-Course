public class LRUPageReplacement {
    //simple hai gfg ka article dekha tha aur solve kara tha read the code you will get it
    //https://www.geeksforgeeks.org/problems/page-faults-in-lru5603/1
    //class Solution{
    //    static int pageFaults(int N, int C, int pages[]){
    //        HashSet<Integer> st = new HashSet<>(C);
    //        HashMap<Integer,Integer> mp = new HashMap<>();
    //        int faults = 0;
    //
    //        for (int i = 0;i<N;i++){
    //            if (st.size()<C){
    //                if (!st.contains(pages[i])){
    //                    st.add(pages[i]);
    //                    faults++;
    //                }
    //                mp.put(pages[i],i);
    //            }
    //            else{
    //                if (!st.contains(pages[i])){
    //                    int min = Integer.MAX_VALUE;
    //                    int val = 0;
    //                    for (int a : mp.keySet()){
    //                        if (mp.get(a)<min){
    //                            min = mp.get(a);
    //                            val=a;
    //                        }
    //                    }
    //                    st.remove(val);
    //                    st.add(pages[i]);
    //                    mp.remove(val);
    //                    faults++;
    //                }
    //                mp.put(pages[i],i);
    //            }
    //        }
    //        return faults;
    //    }
    //}
}
