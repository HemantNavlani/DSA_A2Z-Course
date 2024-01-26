public class FractionalKnapSack {
    //isme hame per unit ki value ke hissab se array sort karna hai fir kam karna hai aur apna bora bharna hai
 /*https://www.geeksforgeeks.org/problems/fractional-knapsack-1587115620/1
 //https://www.codingninjas.com/studio/problems/fractional-knapsack_975286?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
 *
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/
// class ItemComparator implements Comparator<Item>{
//     public int compare (Item i1,Item i2){
//         double r1 = (double) i1.value/(double) i1.weight;
//         double r2 = (double) i2.value/(double) i2.weight;
//         if (r1<r2) return 1;
//         else if (r1>r2) return -1;
//         else return 0;
//     }
// }
//    class Solution{
//        double fractionalKnapsack(int W, Item arr[], int n) {
//            Arrays.sort(arr,new ItemComparator());
//            int curr = 0;
//            double ans = 0;
//            for (int i = 0;i<arr.length;i++){
//                if (curr+arr[i].weight<=W){
//                    curr+=arr[i].weight;
//                    ans +=arr[i].value;
//                }
//                else {
//                    int rem = W - curr;
//                    ans+= ((double)arr[i].value/(double)arr[i].weight) * (double) rem;
//                    break;
//                }
//            }
//            return ans;
//        }
//    }
//    */
}
