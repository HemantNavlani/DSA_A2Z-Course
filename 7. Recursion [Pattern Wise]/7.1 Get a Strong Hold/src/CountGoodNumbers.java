public class CountGoodNumbers {
    //leetcode 1922
    //https://leetcode.com/problems/count-good-numbers/




    //isme ye karna hai hame n as length de rakha hai of the string toh isme todha permutation and combination lagega ki even index pe even digit
    //honi chahiye vo hoti hai 5 -> 0,2,4,6,8 and odd index pe prime hona chahiye so 4 -> 2,3,5,7 isliye 5*4*5... karenge according to
    //number of odd places and evenplaces so vo find kari hai hamne code me dekho n%2 + n/2 for even and n/2 for odd places
    //then apna logn vala hi power function likha hai aur har bar modulo kara hai kyunki n bht badha de rakha hai is chakkar me 10 ki power 15 me

    //class Solution {
    //    public long MOD = 1000000007;
    //
    //    public long pow (long x,long y){
    //        if (y==0) return 1;
    //        long res = pow(x,y/2);
    //        res*=res;
    //
    //        if (y%2==1) return (res*x) % MOD;
    //        else return res % MOD;
    //    }
    //    public int countGoodNumbers(long n) {
    //        long evenPlaces = n/2 + n%2;
    //        long oddPlaces = n/2;
    //        return(int)( pow(5,evenPlaces)*pow(4,oddPlaces) % MOD);
    //    }
    //}
}
