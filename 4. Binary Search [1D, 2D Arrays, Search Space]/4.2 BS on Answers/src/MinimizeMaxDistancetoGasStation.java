//** This is a very rare problem in interviews

//Ye question hai tough ek do baar me hi smjh aayega so dekh liyo baaki kartoh liya hai and optimal approach jyada easy lag raha hai
public class MinimizeMaxDistancetoGasStation {
    //https://www.codingninjas.com/studio/problems/minimise-max-distance_7541449?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTab=0

    //dekho smjh toh kam aaraha but ek bar video dekh raha hoon filhaal

    //ye brute force approach hai jisme har possibility dekhi hai beech me daal daal ke gas stations ko
    //read code once to understand

    //Ye TLE deta hai so we need to optimise this

    //TC is around O(k * N ) so it goes to quadratic so TLE occurs
    //public class Solution {
    //    public static double MinimiseMaxDistance(int []arr, int K){
    //        int n = arr.length;
    //        int [] howMany = new int[n-1];
    //
    //        for (int gasStations = 1;gasStations<=K;gasStations++){
    //            double maxSection = -1;
    //            int maxIdx = -1;
    //            for (int i=0;i<n-1;i++){
    //                double diff = arr[i+1] -arr[i];
    //                double sectionLength = diff/(double)(howMany[i]+1);
    //                if (sectionLength>maxSection){
    //                    maxSection=sectionLength;
    //                    maxIdx=i;
    //                }
    //            }
    //            howMany[maxIdx]++;
    //        }
    //
    //        double maxAns = -1;
    //        for (int i=0;i<n-1;i++){
    //            double diff = (arr[i+1]-arr[i]);
    //            double sectionLength = diff/(double)(howMany[i]+1);
    //            maxAns = Math.max(maxAns,sectionLength);
    //        }
    //        return maxAns;
    //    }
    //}


    //Better approach using heap (priority queue)
    //TC is O (N logN + k Log N)
    //SC is O(N-1)


    //import java.util.PriorityQueue;
    //
    //
    //public class Solution {
    //    public static class Pair {
    //        double first;
    //        int second;
    //        Pair(double f,int s){
    //            first=f;
    //            second=s;
    //        }
    //    }
    //    public static double MinimiseMaxDistance(int []arr, int k){
    //        int n = arr.length;
    //        int [] howMany = new int [n-1];
    //        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.first, a.first));
    //        for (int i =0;i<n-1;i++){
    //            pq.add(new Pair(arr[i+1]-arr[i],i));
    //        }
    //
    //        for (int gasStations = 1;gasStations<=k;gasStations++){
    //            Pair tp = pq.poll();
    //            int sectionIdx = tp.second;
    //
    //            howMany[sectionIdx]++;
    //
    //            double initialDiff = arr[sectionIdx+1] - arr[sectionIdx];
    //            double newSectionLength = initialDiff/(double) (howMany[sectionIdx]+1);
    //
    //            pq.add(new Pair(newSectionLength,sectionIdx));
    //        }
    //        return pq.peek().first;
    //    }
    //}


    //optimal
    //TC O(n logn + N)
    //SC is O(1)
    //public class Solution {
    //    public static int countOfGasStations(int []arr,double dist){
    //        int cnt = 0;
    //        for (int i = 1;i<arr.length;i++){
    //            int numberInBetween = (int)((arr[i]-arr[i-1])/dist);
    //            if ((arr[i]-arr[i-1])/dist == numberInBetween*dist) numberInBetween--;
    //            cnt+=numberInBetween;
    //        }
    //        return cnt;
    //    }
    //    public static double MinimiseMaxDistance(int []arr, int K){
    //        int max = Integer.MIN_VALUE;
    //        for (int i=1;i<arr.length;i++){
    //            max = Math.max(max,arr[i]-arr[i-1]);
    //        }
    //        double st = 0;
    //        double end = max;
    //        double diff = 1e-6;
    //        while (end-st> diff ){
    //            double mid = st+(end-st)/2.0;
    //            int cnt = countOfGasStations(arr,mid);
    //            if (cnt>K) st = mid;
    //            else end = mid;
    //        }
    //        return end;
    //    }
    //}




}

